use db567;
create table book(
	isbn int, 
    bname varchar(50),
    btype varchar(20),
    cost float,
    PRIMARY KEY(isbn)
);
insert into book values
	(90001, 'The hound of the baskerville', 'Thriller', 560.75),
    (90043, 'Castlevania', 'Fiction', 780.00),
    (90065, 'The book of Venice', 'Fiction', 350),
    (80976, 'Don Quixote', 'History', 1250.90);
    insert into book values
	(90041, 'Song of ice and fire', 'Fiction', 2300),
    (94567, 'Da vinci code', 'Fiction', 700),
    (90235, 'Harry Potter and the Deathly Hallows', 'Fiction', 4400.67),
    (80926, 'The Lord of the Rings', 'History', 3600);
    
select * from book;
select count(btype), btype, sum(cost), min(cost), max(cost) from book group by btype;
select count(btype), btype, sum(cost), min(cost), max(cost) from book group by btype having btype='fiction';
select count(btype), btype, sum(cost), min(cost), max(cost) from book group by btype having count(btype)>1;




create table product (prd_id int PRIMARY KEY, pname varchar(20), cost float);
create table orders (order_id int PRIMARY KEY, qty varchar(20), order_date float);
insert into product values(
	9, 'Pineapple', 150
);
insert into product value
	(1, 'Book', 570),
    (2, 'Burger', 70),
    (3, 'Water bottle', 230),
    (4, 'Broom', 60),
    (5, 'Ice tea', 130),
    (6, 'Tennis racket', 2500),
    (7, 'Laptop bag', 550),
    (8, 'Bullet proof vest', 1700);
    
insert into orders value
	(401, 3, current_date(), 2),
    (402, 5, current_date(), 1),
    (403, 2, current_date(), 3),
    (404, 1, current_date(), 4),
    (405, 5, current_date(), 5),
    (406, 2, current_date(), 6),
    (407, 2, current_date(), 7),
    (408, 1, current_date(), 8);
    
-- Cartesian product
	-- 	set A = {a,b}
	-- 	set B = {c,d}
    -- 	AxB = {a,c}, {a,d}, {b,c}, {b, d}
    
    select * from orders, product; -- Cartesian product of product and orders table
    
select * from product where exists (select prd_id from orders); -- Exists operator checks if values are present or not
select * from product where not exists (select prd_id from orders);
select * from product where exists (select prd_id from orders where cost between 300 and 900);
-- ANY and ALL CONDITIONS
	select * from product where cost < all(select avg(cost) from product);  
	select * from product where prd_id > any(select prd_id from orders where qty>5 or prd_id = 2);
    select prd_id from orders where qty>2;
	select * from product where prd_id > all(select prd_id from orders where qty>2);
        
-- JOINS

	-- INNER JOIN/EQUI JOIN -> gives intersection
	select * from product, orders where orders.prd_id = product.prd_id; -- old syntax
	select product.pname, product.prd_id, product.cost, orders.order_id, orders.qty, orders.order_date
		from orders inner join product on orders.prd_id = product.prd_id; -- new syntax
	select p.prd_id, p.pname, p.cost, o.order_id, o.qty, o.order_date from orders o
		inner join product p where p.prd_id = o.prd_id; -- ansi sql
        
	select * from product where prd_id in (select prd_id from orders); -- Sub query
    
	-- LEFT JOIN -> gives intersection and all the data from left table
	select p.prd_id, p.pname, p.cost, o.order_id, o.qty, o.order_date from product p
		left join orders o on p.prd_id = o.prd_id;
        
	-- RIGHT JOIN -> gives intersection and all the data from right table
	select p.prd_id, p.pname, p.cost, o.order_id, o.qty, o.order_date from orders o
		right join product p on p.prd_id = o.prd_id;

	-- SELF JOIN -> gives comparison of various columns from same table with different values
	select * from orders where qty = prd_id and prd_id = 5;
    select o.order_id, o.qty, m.prd_id, m.order_id from orders o, orders m where o.qty = m.prd_id;
    
    create table bank_employees (
		id int PRIMARY KEY,
        name varchar(50),
        salary float,
        manager_id int
    );
    insert into bank_employees values
    (1,'Manas Malhotra', 30000, 3),
    (2,'Sanjay Dewgan', 20000, 1),
    (3,'Akshay Dutt', 25000, 2),
    (4,'Manish Pandey', 56000, 5),
    (5,'Jawahar Lal', 70000, 4);
    
    select concat(e1.name, ' is the manager of ', e2.name) from bank_employees e1, bank_employees e2 where e1.id = e2.manager_id; -- Concat
    
-- Sub Query/Query in Query

	select * from bank_employees; -- This +
	select max(salary) from bank_employees; -- This
	select * from bank_employees where salary = (select max(salary) from bank_employees); -- Sub Query