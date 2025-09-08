select user_id,trial_avg_duration,paid_avg_duration from (SELECT
  user_id,
  Round(AVG(CASE WHEN activity_type = 'free_trial' THEN activity_duration END),2) AS trial_avg_duration,
  Round(AVG(CASE WHEN activity_type = 'paid' THEN activity_duration END),2) AS paid_avg_duration
FROM useractivity
GROUP BY user_id)s where trial_avg_duration is not null and paid_avg_duration is not null;
