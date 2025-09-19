select id as id from(
select *,lag(recorddate) over() as nextday,lag(temperature) over() as nexttemp from weather order by recordDate)s where datediff(recordDate,nextday)=1 and nexttemp<temperature;