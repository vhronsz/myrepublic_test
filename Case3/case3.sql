-- Select all column from each individual table
SELECT * from user;
SELECT * from alamat;
SELECT * from cluster;

-- Select User joined with cluster column
select * from user u join cluster c on u.cluster_id = c.cid;
