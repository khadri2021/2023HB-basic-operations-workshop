--Client1 changes
-- drop table college;
create table college(collegeid int,collegename varchar(30));
select * from college;

--Client2 changes
create table employee(empId int,empName varchar(12),salary double(8,2));
select * from employee;