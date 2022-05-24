create table if not exists electives
(
    id       serial primary key,
    name     varchar(200) not null,
    place    varchar(200) not null,
    time     varchar(200) not null,
    date     date         not null,
    tutor_id integer,
    constraint fk_tutor_id foreign key (tutor_id) references tutors (id),
    direction_id integer,
    constraint fk_direction_id foreign key (direction_id) references directions (id)
);
