create table if not exists childs
(
    id        serial primary key,
    name      varchar(200) not null,
    birthday  date         not null,
    mother_id integer,
    father_id integer,
    constraint fk_mother_id foreign key (mother_id) references parents (id),
    constraint fk_father_id foreign key (father_id) references parents (id)
);
