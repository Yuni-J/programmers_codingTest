/* 대장균의 크기에 따라 분류하기 2 */

SELECT 
    ID
    , CASE SIZE
        WHEN 1 THEN 'CRITICAL'
        WHEN 2 THEN 'HIGH'
        WHEN 3 THEN 'MEDIUM'
        WHEN 4 THEN 'LOW'
    END AS COLONY_NAME
FROM (SELECT 
        ID
        , NTILE(4) OVER (ORDER BY SIZE_OF_COLONY DESC) AS SIZE
      FROM ECOLI_DATA) AS ECOLI_DATA 
ORDER BY ID;


/* NTILE(N) : 순위를 기반으로 데이터를 N개의 그룹으로 나누는 윈도우 함수 */