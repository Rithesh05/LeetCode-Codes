-- SELECT * 
-- FROM (
--     SELECT e.employee_id, e.name, s.salary
--     FROM employees e
--     LEFT JOIN salaries s ON e.employee_id = s.employee_id
    
--     UNION
    
--     SELECT e.employee_id, e.name, s.salary
--     FROM employees e
--     RIGHT JOIN salaries s ON e.employee_id = s.employee_id
-- ) AS temp;


select employee_id from (select employee_id from employees where employee_id not in (
    SELECT employee_id FROM salaries
)
union
select employee_id from salaries where employee_id not in (
    Select employee_id from employees
)
) as temp order by employee_id ;
