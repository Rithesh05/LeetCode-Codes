SELECT a.name, b.bonus 
FROM employee a 
left JOIN bonus b 
ON a.empId = b.empId 
WHERE b.bonus < 1000 or b.bonus is null;
