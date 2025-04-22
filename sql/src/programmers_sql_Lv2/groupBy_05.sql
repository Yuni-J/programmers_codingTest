/* 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기 */

SELECT CAR_TYPE, COUNT(*) AS CARS
FROM CAR_RENTAL_COMPANY_CAR 
WHERE OPTIONS REGEXP '통풍시트|열선시트|가죽시트'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE;

/* REGEXP 
	정규 표현식을 활용하여 문자열 패턴을 검색하는 데 활용
	기본 연산자보다 복잡한 문자열 조건 가능 
 */