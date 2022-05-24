create table if not exists tutors
(
    id         serial primary key,
    name       varchar(200) not null,
    start_date date         not null
);
