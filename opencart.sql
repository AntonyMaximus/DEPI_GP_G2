use opencart_db;
select * from oc_customer;
select * from oc_order;
select * from oc_cart;
SELECT * FROM oc_customer ORDER BY customer_id DESC LIMIT 1;
SELECT last_login FROM oc_customer WHERE email='antony.s.raouf@mail.com';