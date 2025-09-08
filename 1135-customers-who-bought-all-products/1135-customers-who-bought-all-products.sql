select distinct customer_id from(
select * ,dense_rank() over(partition by customer_id order by product_key) as "rank" from customer) s where s.rank=(select count(*) from product);