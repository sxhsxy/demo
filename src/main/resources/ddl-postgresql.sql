DROP TABLE sys_user;
DROP TABLE department;

/* Create Tables */

CREATE TABLE department
(
	id serial NOT NULL,
	name varchar(20) NOT NULL,
	constraint pk_department primary key (id)
);
CREATE TABLE sys_user
(
	id serial NOT NULL,
	login_name varchar(100) NOT NULL,
	password varchar(100) NOT NULL,
	name varchar(100) NOT NULL,
	gender char(1),
	email varchar(200),
	phone varchar(200),
	mobile varchar(200),
	remarks varchar(255),
	department_id int,
	PRIMARY KEY (id),
	constraint fk_dapartment foreign key (department_id) references department(id)
);

/* Insert records */

Insert into department ( id, name )
values ( nextval('department_id_seq'), '科技教育科');

Insert into department ( id, name )
values ( nextval('department_id_seq'), '人事科');

Insert into department ( id, name )
values ( nextval('department_id_seq'), '财务科');

Insert into department ( name )
values ( '办公室');

Insert into sys_user (login_name, password, name, department_id)
values ('xxx', '123456', '沈小虎', 1);