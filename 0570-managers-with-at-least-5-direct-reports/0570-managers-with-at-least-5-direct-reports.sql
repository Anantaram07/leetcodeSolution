# Write your MySQL query statement below
select name
from Employee
where id in
(select managerId 
from Employee
Group by managerId
Having count(managerId)>=5)