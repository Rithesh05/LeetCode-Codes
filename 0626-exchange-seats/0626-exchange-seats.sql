SELECT l.id,
       CASE 
            WHEN MOD(l.id, 2) = 0 THEN r.prev_student
            WHEN l.next_student IS NULL THEN l.student
            WHEN MOD(l.id, 2) != 0 THEN l.next_student
       END AS student
FROM (
    SELECT id,
           student,
           LEAD(student) OVER(ORDER BY id) AS next_student
    FROM seat
) l
JOIN (
    SELECT id,
           student,
           LAG(student) OVER(ORDER BY id) AS prev_student
    FROM seat
) r
ON l.id = r.id;
