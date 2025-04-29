/* 대장균들의 자식의 수 구하기 */

SELECT 
    E.ID
    , COUNT(D.ID) AS CHILD_COUNT
FROM ECOLI_DATA AS E
LEFT JOIN ECOLI_DATA AS D
    ON E.ID = D.PARENT_ID
GROUP BY ID
ORDER BY ID;

/* COUNT(E.ID) : 항상 부모의 행 수를 반환 (부모 자체를 나타내기 때문에 NULL이 있을 수 없음 - NULL을 고려X) 
 * COUNT(D.ID) : 자식이 있는 부모에 대해서만, 자식의 수를 반환 (NULL을 고려함)
 */
 