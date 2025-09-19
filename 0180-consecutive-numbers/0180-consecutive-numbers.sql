select distinct num as ConsecutiveNums from (
select *,lag(lag1) over() as lag2 from(
select *,lag(num) over() as "lag1" from Logs)s) k
where num=lag1 and num=lag2;