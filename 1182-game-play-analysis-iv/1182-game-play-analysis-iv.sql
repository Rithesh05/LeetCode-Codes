SELECT round(AVG(CASE WHEN DATEDIFF(lead_date, event_date) = 1 THEN 1 ELSE 0 END),2) AS fraction
FROM (
    SELECT *,
           LEAD(event_date) OVER (PARTITION BY player_id ORDER BY event_date) AS lead_date,
           ROW_NUMBER() OVER (PARTITION BY player_id ORDER BY event_date) AS "rank"
    FROM Activity
) s
WHERE s.rank = 1;
