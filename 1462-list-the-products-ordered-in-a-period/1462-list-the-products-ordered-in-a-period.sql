# Write your MySQL query statement below
with rt as (select product_id,sum(unit) as unit from orders where order_date  between "2020-02-01" and "2020-02-29" group by product_id)
select p.product_name,r.unit
from  products p left join rt r on p.product_id=r.product_id where r.unit>=100;