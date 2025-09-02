-- WITH cta AS (
--     SELECT 
--         s.user_id,
--         COALESCE(t.timeout_count, 0) AS timeout_count,
--         COALESCE(c.confirmed_count, 0) AS confirmed_count
--     FROM signups s
--     LEFT JOIN (
--         SELECT 
--             user_id,
--             COUNT(*) AS timeout_count
--         FROM confirmations
--         WHERE action = 'timeout'
--         GROUP BY user_id
--     ) t ON s.user_id = t.user_id
--     LEFT JOIN (
--         SELECT 
--             user_id,
--             COUNT(*) AS confirmed_count
--         FROM confirmations
--         WHERE action = 'confirmed'
--         GROUP BY user_id
--     ) c ON s.user_id = c.user_id
-- )
-- SELECT 
--     user_id,
--     ROUND(
--         CASE 
--             WHEN confirmed_count = 0 THEN 0  -- avoid division by zero
--             ELSE (timeout_count * 1.0 / confirmed_count)
--         END, 2
--     ) AS confirmation_rate
-- FROM cta;



# Write your MySQL query statement below
select s.user_id, round(avg(if(c.action="confirmed",1,0)),2) as confirmation_rate
from Signups as s left join Confirmations as c on s.user_id= c.user_id group by user_id;


