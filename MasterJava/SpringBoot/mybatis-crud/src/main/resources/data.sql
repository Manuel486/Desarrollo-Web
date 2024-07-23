-- Eliminar datos de la tabla Product primero
DELETE FROM Product;

-- Truncar la tabla Category
DELETE FROM Category;

-- Insertar datos en la tabla Category
INSERT INTO Category (id, name, description) VALUES
                                                 (1, 'Electrónicos', 'Productos electrónicos de consumo'),
                                                 (2, 'Ropa', 'Prendas de vestir y accesorios'),
                                                 (3, 'Hogar', 'Productos para el hogar y decoración'),
                                                 (4, 'Juguetes', 'Juguetes y juegos para niños'),
                                                 (5, 'Electrodomésticos', 'Electrodomésticos para el hogar'),
                                                 (6, 'Deportes', 'Artículos deportivos y equipos'),
                                                 (7, 'Libros', 'Libros de diversos géneros'),
                                                 (8, 'Alimentos', 'Productos alimenticios y bebidas'),
                                                 (9, 'Salud y Belleza', 'Productos relacionados con la salud y la belleza'),
                                                 (10, 'Automóviles', 'Accesorios y repuestos para automóviles');

-- Insertar datos en la tabla Product
INSERT INTO Product (id, name, status, category_id) VALUES
                                                        (1, 'Smartphone', true, 1),
                                                        (2, 'Camiseta', true, 2),
                                                        (3, 'Mesa de centro', true, 3),
                                                        (4, 'Muñeca', true, 4),
                                                        (5, 'Refrigerador', true, 5),
                                                        (6, 'Balón de fútbol', true, 6),
                                                        (7, 'El gran Gatsby', true, 7),
                                                        (8, 'Arroz', true, 8),
                                                        (9, 'Crema hidratante', true, 9),
                                                        (10, 'Filtro de aire', true, 10);
