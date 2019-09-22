-- auto-generated definition
create table user
(
  user_id         varchar(255)     not null
    primary key,
  type            int             null
  comment '1是计票员 2是管理员',
  party_count_num int default '0' null,
  group_count_num int default '0' null
) charset = utf8;

create table vote_config(
    id int primary key,
    conference_name varchar(255),
    vote_name varchar(255),
    candicatenumber int,
    electnumber int
)charset = utf8;


create table party_candidate(
    id int primary key auto_increment,
    party_candidate_name varchar(255) not null  ,
    votes_number int default 0,
    votes_against_number int default 0,
    votes_abandon_number int default 0
) charset = utf8;

 create table group_candidate(
    id int primary key auto_increment,
    group_candidate_name varchar(255) not null  ,
    votes_against_number int default 0,
    votes_abandon_number int default 0,
    votes_number int default 0
) charset = utf8;

-- auto-generated definition
create table vote_number
(
  id int default -1 primary key ,
  party_num   int default 0 not null,
  group_num int default 0 null
) charset = utf8;


