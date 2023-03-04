create schema hibernate;
use hibernate;
-- Client1 changes KHADRI-3
create table college(collegeid int,collegename varchar(30));
select * from college;

-- Client2 changes KHADRI-1
create table employee(empId int,empName varchar(12),salary double(8,2));
select * from employee;
-- Client1 bug fix changes KHADRI-1-BUG-1
alter table employee rename column salary to empSalary;
