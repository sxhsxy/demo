DROP TABLE sys_user;
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
	PRIMARY KEY (id)
);


/* Create Tables */

