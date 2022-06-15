CREATE TABLE IF NOT EXISTS client (
    id int PRIMARY KEY,
    age int,
    email VARCHAR(255),
    `name` VARCHAR(255),
    adresse VARCHAR(255)
);


CREATE TABLE IF NOT EXISTS product (
    id int PRIMARY KEY,
    `name` VARCHAR(255),
    price double,
    model VARCHAR(255)
);