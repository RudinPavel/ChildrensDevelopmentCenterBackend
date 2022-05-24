create table if not exists elective_enrollments
(
    id          serial primary key,
    child_id    integer,
    elective_id integer,
    constraint fk_child_id foreign key (child_id) references childs (id),
    constraint fk_elective_id foreign key (elective_id) references electives (id)
);
