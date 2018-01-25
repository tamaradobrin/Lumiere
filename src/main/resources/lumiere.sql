create table if not exists student
(
	id serial not null
		constraint student_pkey
			primary key,
	name varchar(40) not null,
	projectid integer
)
;

create unique index if not exists student_id_uindex
	on student (id)
;

create table if not exists project
(
	id serial not null
		constraint project_pkey
			primary key,
	name varchar(40) not null,
	quota integer
)
;

create unique index if not exists project_id_uindex
	on project (id)
;

alter table student
	add constraint project_fk
		foreign key (projectid) references project
;

create table if not exists preference
(
	studentid integer not null
		constraint student_fk
			references student
				on update cascade on delete cascade,
	projectid integer not null
		constraint project_fk
			references project
				on update cascade on delete cascade,
	rank integer not null
)
;

create unique index if not exists student_project_rank_unique_index
	on preference (studentid, projectid, rank)
;