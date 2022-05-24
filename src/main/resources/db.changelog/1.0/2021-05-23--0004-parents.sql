create table if not exists parents
(
    id    serial primary key,
    name  varchar(200) not null,
    phone varchar(20)  not null
);
