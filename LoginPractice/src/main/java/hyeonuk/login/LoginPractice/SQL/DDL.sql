create table member (
    userid varchar(50) not null primary key,
    passwd varchar(50) not null,
    name varchar(50) not null,
    email varchar(50)
);

commit;