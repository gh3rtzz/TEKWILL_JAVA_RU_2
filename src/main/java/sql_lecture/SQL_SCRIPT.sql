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

----------- Lecture 3. Relational DB, Joins, Indexing

select *
from employee_info ei;

truncate employee_info;

create table employee_address(
                                 id serial primary key,
                                 country text not null,
                                 city text not null,
                                 address_line_1 text not null,
                                 address_line_2 text,
                                 zip_code text,
                                 fk_employee int,
                                 constraint employee_fk
                                     foreign key (fk_employee)
                                         references employee_info(employee_id)
);

select *
from employee_info ei;

select *
from employee_address;

insert into employee_address (country, city, address_line_1, fk_employee)
values
    ('RO', 'Bucharest', 'str. Parlamentului 33', 8),
    ('NL', 'Amsterdam', 'str. Highsociety 123', 9);

select *
from employee_info ei
         left join employee_address ea
                   on ei.employee_id = ea.fk_employee;

alter table employee_address rename column id to address_id;

create table departments(
                            department_id serial primary key,
                            name text not null,
                            description text
);

insert into departments (name, description)
values
    ('Software engineering', 'Everything software related is happening here'),
    ('Hardware engineering', 'Creating motherboards and other cool stuff happens here'),
    ('Accounting', 'Salary related and other important stuff is here'),
    ('HR', 'Human resources planning is happening here');

select *
from departments;

create table employee_department(
                                    employee_department_id serial primary key,
                                    fk_employee int references employee_info(employee_id),
                                    fk_department int references departments(department_id)
);

select *
from employee_department;

select *
from employee_info ei;

insert into employee_department (fk_employee, fk_department)
values
    (7, 1),
    (8, 2),
    (9, 3),
    (10, 4);

--- Multiple joins

select *
from employee_info ei
         inner join employee_department ed
                    on ei.employee_id = ed.fk_employee
         inner join departments d
                    on ed.fk_department = d.department_id;


create table customer(
                         customer_id serial primary key,
                         name text,
                         fiscal_code text
);

create table department_customer(
                                    department_customer_id serial primary key,
                                    fk_department int references departments(department_id),
                                    fk_customer int references customer(customer_id)
);

select *
from customer;

insert into customer (name, fiscal_code)
values
    ('Apple Inc.', '128976123'),
    ('Alphabet LLC', '123892374'),
    ('Tekwill Academy SRL', '8912876391'),
    ('Cloudflare LLC', '129087123');

insert into department_customer (fk_department, fk_customer)
values
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4);

select * from departments;

select *
from employee_info ei
         inner join employee_department ed on ei.employee_id = ed.fk_employee
         inner join departments d on ed.fk_department = d.department_id
         inner join department_customer dc on d.department_id = dc.fk_department
         inner join customer c on dc.fk_customer = c.customer_id;


select *
from employee_info ei
         inner join employee_department ed on ei.employee_id = ed.fk_employee
         inner join departments d on ed.fk_department = d.department_id
         inner join department_customer dc on d.department_id = dc.fk_department
         inner join customer c on dc.fk_customer = c.customer_id;



select ei.name, d.name
from customer c
         inner join department_customer dc on c.customer_id = dc.fk_customer
         inner join departments d on dc.fk_department = d.department_id
         inner join employee_department ed on d.department_id = ed.fk_department
         inner join employee_info ei on ed.fk_employee = ei.employee_id;




