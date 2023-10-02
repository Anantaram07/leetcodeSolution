# Write your MySQL query statement below
SELECT MAX(tmp.num) as num

FROM 
(SELECT num, 
 COUNT(num) as _count 
 FROM MyNumbers 
 GROUP BY num) as tmp
 
WHERE _count = 1