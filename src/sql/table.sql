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

-- Client changes KHADRI-3-BUG-1
create table college(clgId int,clgRegNumber varchar(30),clgName varchar(30),clgStrenth int,clgAddress varchar(30),clgTown varchar(30),clgCity varchar(30),clgState varchar(30),clgAnnualReturns double(15,2),clgOfficeStaff int,clgTeachingStaff int);
select * from college;