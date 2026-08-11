--liquibase formatted sql

--changeset salpa:1
CREATE TABLE users(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(128),
    email VARCHAR(128) UNIQUE
);

--changeset salpa:2
CREATE TABLE item_request(
    id BIGSERIAL PRIMARY KEY,
    description TEXT,
    requestor BIGINT REFERENCES users(id),
    created TIMESTAMP
);

--changeset salpa:3
CREATE TABLE items(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(128),
    description TEXT,
    available BOOLEAN,
    owner BIGINT REFERENCES users(id),
    request BIGINT REFERENCES item_request(id)
);

--changeset salpa:4
CREATE TABLE booking(
    id BIGSERIAL PRIMARY KEY,
    start TIMESTAMP,
    "end" TIMESTAMP,
    item BIGINT REFERENCES items(id),
    booker BIGINT REFERENCES users(id),
    status VARCHAR(40)
);