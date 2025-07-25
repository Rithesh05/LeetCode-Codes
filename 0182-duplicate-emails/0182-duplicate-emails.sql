SELECT email 
FROM (
  SELECT COUNT(*) AS count, email 
  FROM person 
  GROUP BY email
) AS counts
WHERE count > 1;
