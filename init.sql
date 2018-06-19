-- auto-generated definition
create table user
(
  user_id         varchar(16)     not null
    primary key,
  password        varchar(64)     not null,
  type            int             null
  comment '1是计票员 2是管理员',
  party_count_num int default '0' null,
  group_count_num int default '0' null
)
  charset = utf8;



create table party_candidate(
  party_candidate_name varchar(16) not null primary key ,
  votes_number int default 0
) charset = utf8;

create table group_candidate(
  group_candidate_name varchar(16) not null primary key ,
  votes_number int default 0
) charset = utf8;