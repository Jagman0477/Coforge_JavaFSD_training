-- STORED FUNCTIONS
	use db567;
    
    delimiter //
    create function addition(a int, b int) returns int
    deterministic
    begin
		return a+b;
    end; 
    //
    
    drop table test1;
    
    create table test1(a int, b int);
    insert into test1 values(2,5),(3,8),(23,69),(1234,657890),(-12,-89);
    
    select *,addition(a,b) from test1;
    
-- STORED PROCEDURES

	select * from book;

    delimiter //
    create procedure book_info()
		begin
        select avg(cost), min(cost), max(cost) from book;
        end;
        //
        
		call book_info();
            
	delimiter //
    create procedure book_info1(isbn1 int)
		begin
        select * from book where isbn = isbn1;
        end;
        //
        
		call book_info1(90043);
        
-- USING OUT PROCEDURE
	delimiter //
    create procedure book_info2(isbn1 int, out bname1 varchar(20), out btype1 varchar(20))
    begin
    select bname, btype into bname1, btype1 from book where  isbn = isbn1;
    end;
    //
    
    call book_info2(90043, @bn, @bcost);
	select @bn, @bcost;