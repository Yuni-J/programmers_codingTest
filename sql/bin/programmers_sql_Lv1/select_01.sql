/* 특정 형질을 가지는 대장균 찾기 */

Select count(*) as count
From ECOLI_DATA
Where (GENOTYPE & 2) = 0  
AND (GENOTYPE & 5) > 0;