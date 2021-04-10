--
-- PostgreSQL database dump
--

-- Dumped from database version 13.2
-- Dumped by pg_dump version 13.2

-- Started on 2021-04-03 12:25:14

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2980 (class 1262 OID 16395)
-- Name: student; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE student WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_India.1252';


ALTER DATABASE student OWNER TO postgres;

\connect student

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 6 (class 2615 OID 16396)
-- Name: student; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA student;


ALTER SCHEMA student OWNER TO postgres;

-- Completed on 2021-04-03 12:25:15

--
-- PostgreSQL database dump complete
--

