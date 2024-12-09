-- Select all column from each individual table
SELECT * from user;
SELECT * from alamat;
SELECT * from cluster;

select * from user u join cluster c on u.cluster_id = c.cid;
