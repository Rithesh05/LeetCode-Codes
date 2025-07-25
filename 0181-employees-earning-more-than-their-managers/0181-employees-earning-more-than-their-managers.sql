select f.name as Employee from employee f join employee s on f.managerId=s.id and s.salary < f.salary;
