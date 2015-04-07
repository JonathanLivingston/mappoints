CREATE ROLE mpoints LOGIN
ENCRYPTED PASSWORD 'md5f6c885bd104f943acf92ae2f8328cce1'
NOSUPERUSER INHERIT NOCREATEDB NOCREATEROLE NOREPLICATION;

CREATE DATABASE mpoints
  WITH OWNER = mpoints
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Russian_Russia.1251'
       LC_CTYPE = 'Russian_Russia.1251'
       CONNECTION LIMIT = -1;

CREATE TABLE placemark
(
     id serial NOT NULL,
     latitude real,
     longitude real,
     hint character varying(255),
     baloon character varying(255),
     address character varying(1024),
     CONSTRAINT placemark_pkey PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE placemark
OWNER TO mpoints;