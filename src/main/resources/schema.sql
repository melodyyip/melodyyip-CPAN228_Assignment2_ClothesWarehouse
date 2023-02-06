create table if not exists cloth (
  id identity,
  name varchar(50) not null,
  brand varchar(50) not null,
  yearofcreation int not null,
  price double not null
);