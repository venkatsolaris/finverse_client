-- liquibase formatted sql

-- changeset liquibase:1
create table user(
id int primary key auto_increment,
username varchar(50) not null unique,
email varchar(50) not null unique,
name varchar(100),
date_of_birth date,
location varchar(50),
privacy_acceptance boolean not null,
terms_acceptance boolean not null,
created_date timestamp default current_timestamp,
updated_date timestamp default current_timestamp on update current_timestamp)

-- changeset liquibase:2

Create table terms_of_agreement
id int primary key auto_increment,
agreement_text text not null,
created_date timestamp default current_timestamp
updated_date timestamp default current_timestamp on update current_timestamp)


-- changeset liquibase:3
Create table privacy_policy(
id int primary key auto_increment,
policy_text text not null,
created_date timestamp default current_timestamp,
updated_date timestamp default current_timestamp on update current_timestamp)


