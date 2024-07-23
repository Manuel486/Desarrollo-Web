
-- CREATE TABLE IF NOT EXISTS PRODUCT(
--     id        INTEGER PRIMARY KEY,
--     name     VARCHAR(100) NOT NULL,
--     status      BOOLEAN NOT NULL
-- );
-- Crear tabla para Category
CREATE TABLE IF NOT EXISTS CATEGORY (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    description TEXT
);

-- Crear tabla para Product
CREATE TABLE IF NOT EXISTS PRODUCT (
    id INTEGER PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    status BOOLEAN NOT NULL,
    category_id INTEGER,
    FOREIGN KEY (category_id) REFERENCES Category(id)
);