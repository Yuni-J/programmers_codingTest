/* 잡은 물고기의 평균 길이 구하기 */

SELECT ROUND(
    AVG(CASE
            WHEN LENGTH IS NULL THEN 10
            ELSE LENGTH
            END), 2) AS AVERAGE_LENGTH
FROM FISH_INFO
