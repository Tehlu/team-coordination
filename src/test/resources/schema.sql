CREATE SEQUENCE IF NOT EXISTS participant_seq;

CREATE TABLE IF NOT EXISTS participant (

participantid BIGINT NOT NULL DEFAULT nextval('participant_seq') PRIMARY KEY,
name VARCHAR(100) NOT NULL,
start_date DATE NOT NULL,
end_date DATE NOT NULL
);
