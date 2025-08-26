select employee_id from (select employee_id from employees where employee_id not in (
    SELECT employee_id FROM salaries
)
union
select employee_id from salaries where employee_id not in (
    Select employee_id from employees
)
) as temp order by employee_id ;
