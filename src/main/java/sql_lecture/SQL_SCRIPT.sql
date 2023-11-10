create table employee_info(
                              employee_id serial primary key,
                              name text not null,
                              surname text not null,
                              age int not null
);

select *
from employee_info;

insert into employee_info (name, surname, age)
values
    ('Alex', 'Soloviov', 30),
    ('Anatolie', 'Popov', 40);

insert into employee_info (name, surname)
values
    ('Dumitru', 'Ciobanu');

insert into employee_info (name, surname, age)
values ('Serghei', 'Artiomov', 21);

select name
from employee_info;

-- In order to delete a table you need to use the following statement

drop table employee_info;

-- Transaction example

begin transaction;

drop table employee_info;

rollback;

-- Use where clause

select *
from employee_info
where name = 'Alex';

select *
from employee_info
where surname = 'Popov';

-- Where and 'or' queries

select *
from employee_info ei
where name = 'Serghei'
   or age >= 40;

-- Where and 'and' queries

select * from employee_info ei
where name = 'Alex'
  and age = 20;

---- LECTURE 2

select *
from employee_info;

-- Update all "Alex" names to "Alexandr"

update employee_info
set name = 'Alexandr'
where name = 'Alex';

update employee_info
set name = 'Alexandr'
where age = 20;

begin transaction;

update employee_info
set surname = 'Test';

select *
from employee_info ei;

rollback

-- Delete all Alexandrs from the table

begin transaction;

delete from employee_info
where name = 'Alexandr';

select *
from employee_info ei;

rollback;

begin transaction;

delete from employee_info;

select *
from employee_info ei;

rollback;

-- Truncate table

begin transaction;

truncate table employee_info;

insert into employee_info (name, surname, age)
values ('test', 'test', 30);

select *
from employee_info ei;

rollback;

-- Alter table

-- add weight column

alter table employee_info
    add column weight int;

-- drop weight column

alter table employee_info
drop column weight;

-- rename weight column

alter table employee_info
    rename column weight to weight_new_name;

select *
from employee_info ei;

-- change column type

alter table employee_info
alter column weight_new_name type text;

-- SQL in clause

select *
from employee_info ei
where name in ('Anatolie', 'Serghei');

-- SQL between clause

select *
from employee_info ei
where age between 20 and 30
   or age between 25 and 50;

select *
from employee_info
where age >= 20
  and age <= 30;

-- Distinct keyword

-- In this case nothing will change because the id column is a
-- primary key which is unique by it's nature
select distinct *
from employee_info;

-- But when we query only the name which is a text
-- distinct keyword will bring unqiue records

select distinct name
from employee_info;

-- Order by clause

-- It's not mandatory to provide ascending keyword to order by clause
-- Because order by sorts ascending by default
select *
from employee_info ei
order by age asc;

-- But it's mandatory to provide DESC keyword when you want to flip the sorting method

select *
from employee_info ei
order by age desc;

-- Wildcards

select *
from employee_info ei
where name like 'A%';

select *
from employee_info ei
where name like 'A_';

select *
from employee_info ei
where name like 'A%r';

select *
from employee_info ei
where name like 'A%n%r';

select *
from employee_info ei
where name like '_%A%_'

-- wildcard to match a character within a bound of characters

select *
from employee_info ei
where name like 'A%X%'
   or name like 'A%T%';

-- Aggregate functions

alter table employee_info
    add column weight int;

update employee_info
set weight = 90
where employee_id = 2;

-- count() max() min() sum() avg()

-- Count all employees

select count(employee_id)
from employee_info ei;

-- Find max weight in all employees
select max(weight)
from employee_info;

-- Find min weight in all employees
select min(weight)
from employee_info;

-- Find the sum of all weights
select sum(weight)
from employee_info ei;

-- Find average weight of all employees
select avg(weight)
from employee_info ei;

-- Find the employee with the biggest weight
select max(weight)
from employee_info ei
group by name;

select count(name) as name_count, name as employee_name
from employee_info ei
group by name;

-- Find max weight in all employees

select max(weight) as maximum_weight
from employee_info ei;






