select d.name as department,l.name as employee ,l.salary as salary
from
(select *,dense_rank() over(partition by departmentId order by salary desc) as "rank" from employee) l left join department d on l.departmentId=d.id where l.rank<=3;
