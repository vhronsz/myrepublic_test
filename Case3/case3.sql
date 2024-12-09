create database myrepublic_test;
use myrepublic_test;

CREATE TABLE user (
  cid int, nama text, domisili text, umur int, cluster_id int
);

CREATE TABLE alamat (
  cid int, alamat text
);

CREATE TABLE cluster (
  cid int, alamat text
);

insert into user (cid, nama, domisili, umur, cluster_id) values 
(10001,'andi','Jakarta',23,2),
(10002,'budi','Bandung',32,4),
(10003,'bejo','Jakarta',22,2),
(10004,'ijib','Bogor',25,1),
(10005,'lala','Depok',28,5);
  
INSERT INTO user VALUES (10001,'andi','Jakarta',23,2);
INSERT INTO user VALUES (10002,'budi','Bandung',32,4);
INSERT INTO user VALUES (10003,'bejo','Jakarta',22,2);
INSERT INTO user VALUES (10004,'ijib','Bogor',25,1);
INSERT INTO user VALUES (10005,'lala','Depok',28,5);

INSERT INTO alamat VALUES (10001, "Jln. Buntu 11");
INSERT INTO alamat VALUES (10002, "Jln. Panjang 1");
INSERT INTO alamat VALUES (10003, "Jln. Kelinci 5");
INSERT INTO alamat VALUES (10004, "Jln. Kecing gg Kelinci 1");
INSERT INTO alamat VALUES (10005, "BSD RAYA");

INSERT INTO cluster VALUES (1, "Cluster Visalia");
INSERT INTO cluster VALUES (2, "Cluster Bellwood");
INSERT INTO cluster VALUES (3, "Cluster Coatesville");
INSERT INTO cluster VALUES (4, "Cluster Inne");
INSERT INTO cluster VALUES (5, "Cluster Lama");