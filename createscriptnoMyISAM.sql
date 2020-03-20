DROP TABLE IF EXISTS post;
DROP TABLE IF EXISTS post_type;
DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS query;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS experience;
DROP TABLE IF EXISTS higher_degree;
DROP TABLE IF EXISTS profile_skill;
DROP TABLE IF EXISTS skill;
DROP TABLE IF EXISTS profile;	
DROP TABLE IF EXISTS degree;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS role;

CREATE  TABLE IF NOT EXISTS role   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    name   VARCHAR(255) NOT NULL ,
  PRIMARY KEY (  id  ) )
  ;

CREATE  TABLE IF NOT EXISTS skill   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    description   VARCHAR(255) NULL DEFAULT NULL ,
    name   VARCHAR(255) NOT NULL ,
  PRIMARY KEY (  id  ) )
  ;

CREATE  TABLE IF NOT EXISTS  post_type   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    name   VARCHAR(255) NOT NULL ,
  PRIMARY KEY (  id  ) )
  ;

CREATE  TABLE IF NOT EXISTS department   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    name   VARCHAR(255) NOT NULL ,
  PRIMARY KEY (  id  ) )
  ;


CREATE  TABLE IF NOT EXISTS degree   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    department_id   BIGINT(20) NOT NULL ,
    name   VARCHAR(255) NOT NULL ,
  PRIMARY KEY (  id  ) ,
   FOREIGN KEY(department_id) references department(id))
  ;

CREATE  TABLE IF NOT EXISTS profile   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    address   VARCHAR(255) NOT NULL ,
    batch   VARCHAR(255) NOT NULL ,
    degree_id   BIGINT(20) NOT NULL ,
    designation   VARCHAR(255) NULL DEFAULT NULL ,
    gender   VARCHAR(255) NOT NULL ,
    PRIMARY KEY (  id  ) ,
   FOREIGN KEY(degree_id) references degree(id) )
  ;

CREATE  TABLE IF NOT EXISTS higher_degree   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    degree_name   VARCHAR(255) NULL DEFAULT NULL ,
    university_name   VARCHAR(255) NULL DEFAULT NULL ,
    profile_id   BIGINT(20) NOT NULL ,
  PRIMARY KEY (  id  ) ,
   FOREIGN KEY(profile_id) references profile(id) )
  ;

CREATE  TABLE IF NOT EXISTS experience   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    company_name   VARCHAR(255) NOT NULL ,
    current   BIT(1) NOT NULL ,
    end   DATETIME NULL DEFAULT NULL ,
    start   DATETIME NOT NULL ,
    profile_id   BIGINT(20) NOT NULL ,
  PRIMARY KEY (  id  ) ,
  FOREIGN KEY(profile_id) references profile(id) )
  ;

CREATE  TABLE IF NOT EXISTS project   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    name   VARCHAR(255) NOT NULL ,
    number_of_members   INT(11) NOT NULL ,
    profile_id   BIGINT(20) NOT NULL ,
    short_description   VARCHAR(255) NULL DEFAULT NULL ,
  PRIMARY KEY (  id  ) ,
  FOREIGN KEY(profile_id) references profile(id) )
  ;

CREATE  TABLE IF NOT EXISTS profile_skills   (
    skill_id   BIGINT(20) NOT NULL ,
    profile_id   BIGINT(20) NOT NULL ,
  PRIMARY KEY (  profile_id  ,   skill_id  ) ,
 FOREIGN KEY(profile_id) references profile(id),
  FOREIGN KEY(skill_id) references skill(id) )
  ;

CREATE  TABLE IF NOT EXISTS user   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    emailid   VARCHAR(255) NOT NULL ,
    name   VARCHAR(255) NOT NULL ,
    password   VARCHAR(255) NOT NULL ,
    phonenumber   VARCHAR(255) NOT NULL ,
    profile_id   BIGINT(20) NULL DEFAULT NULL ,
    role_id   BIGINT(20) NOT NULL ,
    username   VARCHAR(255) NOT NULL ,
  PRIMARY KEY (  id  ) ,
  FOREIGN KEY(profile_id) references profile(id),
  FOREIGN KEY(role_id) references role(id) )
  ;

CREATE  TABLE IF NOT EXISTS query   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    content   VARCHAR(255) NOT NULL ,
    date   DATETIME NOT NULL ,
    parent_id   BIGINT(20) NULL DEFAULT NULL ,
    user_id   BIGINT(20) NOT NULL ,
  PRIMARY KEY (  id  ) ,
  FOREIGN KEY(user_id) references user(id),
  FOREIGN KEY(parent_id) references query(id) )
  ;

CREATE  TABLE IF NOT EXISTS event   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    date   DATETIME NOT NULL ,
    description   VARCHAR(255) NULL DEFAULT NULL ,
    invitation   VARCHAR(255) NOT NULL ,
    name   VARCHAR(255) NOT NULL ,
    organiser_id   BIGINT(20) NOT NULL ,
  PRIMARY KEY (  id  ) ,
   FOREIGN KEY(organiser_id) references user(id) )
  ;

CREATE  TABLE IF NOT EXISTS  post   (
    id   BIGINT(20) NOT NULL AUTO_INCREMENT ,
    content   VARCHAR(255) NOT NULL ,
    date   DATETIME NOT NULL ,
    type_id   BIGINT(20) NOT NULL ,
    user_id   BIGINT(20) NOT NULL ,
  PRIMARY KEY (  id  ) ,
   FOREIGN KEY(type_id) references post_type(id),
  FOREIGN KEY(user_id) references user(id) )
  ;







