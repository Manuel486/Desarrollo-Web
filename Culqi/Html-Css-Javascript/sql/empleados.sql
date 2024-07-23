
-- 1. Lista el primer apellido de todos los empleados.
SELECT apellido1 FROM empleado;

-- 2. Lista el primer apellido de los empleados eliminando los apellidos que estén repetidos.
SELECT DISTINCT(apellido1) FROM empleado;

-- 3. Lista todas las columnas de la tabla empleado.
SELECT * FROM empleado;

-- 4. Lista el nombre y los apellidos de todos los empleados.
SELECT nombre, apellido1, apellido2 FROM empleado;

-- 5. Lista el código de los departamentos de los empleados que aparecen en la tabla empleado.
SELECT codigo FROM empleado;

-- 6. Lista el código de los departamentos de los empleados que aparecen en la tabla empleado, eliminando los códigos que aparecen 
-- repetidos.
SELECT DISTINCT codigo_departamento FROM empleado;

-- 7. Lista el nombre y apellidos de los empleados en una única columna.
SELECT CONCAT(nombre, ' ', apellido1, ' ', IFNULL(apellido2,'')) AS 'Nombre Completo' FROM empleado

-- 8. Lista el nombre y apellidos de los empleados en una única columna, convirtiendo todos los caracteres en mayúscula.
SELECT UPPER(CONCAT(nombre, ' ', apellido1, ' ', IFNULL(apellido2,''))) AS 'Nombre Completo' FROM empleado

-- 9. Lista el nombre y apellidos de los empleados en una única columna, convirtiendo todos los caracteres en minúscula.
SELECT LOWER(CONCAT(nombre, ' ', apellido1, ' ', IFNULL(apellido2,''))) AS 'Nombre Completo' FROM empleado

-- 10. Lista el código de los empleados junto al nif, pero el nif deberá aparecer en dos columnas, una mostrará únicamente 
-- los dígitos del nif y la otra la letra.
SELECT e.codigo, LEFT(e.nif, 8) AS 'Dígitos', RIGHT(e.nif, 1) AS 'Letra'FROM empleado e

-- 11. Lista el nombre de cada departamento y el valor del presupuesto actual del que dispone. 
-- Para calcular este dato tendrá que restar al valor del presupuesto inicial (columna presupuesto) 
-- los gastos que se han generado (columna gastos). Tenga en cuenta que en algunos casos pueden existir 
-- valores negativos. Utilice un alias apropiado para la nueva columna que está calculando.
SELECT d.nombre, (d.presupuesto - d.gastos) AS 'Presupuesto actual'
FROM departamento d

-- 12. Lista el nombre de los departamentos y el valor del presupuesto actual ordenado de forma ascendente.
SELECT d.nombre, (d.presupuesto - d.gastos) AS 'Presupuesto'
FROM departamento d
ORDER BY Presupuesto ASC;

-- 13. Lista el nombre de todos los departamentos ordenados de forma ascendente.
SELECT d.nombre FROM departamento d ORDER BY d.nombre ASC;

-- 14. Lista el nombre de todos los departamentos ordenados de forma descendente.
SELECT d.nombre FROM departamento d ORDER BY d.nombre DESC;

-- 15. Lista los apellidos y el nombre de todos los empleados, ordenados de forma 
-- alfabética teniendo en cuenta en primer lugar sus apellidos y luego su nombre.
SELECT e.nombre, e.apellido1, e.apellido2 FROM empleado e ORDER BY 2 ASC, 3 ASC, 1 ASC;

-- 16. Devuelve una lista con el nombre y el presupuesto, de los 3 departamentos que tienen mayor presupuesto.
SELECT d.nombre, d.presupuesto FROM departamento ORDER BY 2 DESC LIMIT 3;

-- 17. Devuelve una lista con el nombre y el presupuesto, de los 3 departamentos que tienen menor presupuesto.
SELECT d.nombre, d.presupuesto FROM departamento ORDER BY 2 ASC LIMIT 3;

-- 18. Devuelve una lista con el nombre y el gasto, de los 2 departamentos que tienen mayor gasto.
SELECT d.nombre, d.gastos
FROM departamento d
ORDER BY 2 DESC
LIMIT 2

-- 19. Devuelve una lista con el nombre y el gasto, de los 2 departamentos que tienen menor gasto.
SELECT d.nombre, d.gastos
FROM departamento d
ORDER BY 2 ASC
LIMIT 2

-- 20. Devuelve una lista con 5 filas a partir de la tercera fila de la tabla empleado. 
-- La tercera fila se debe incluir en la respuesta. La respuesta debe incluir todas las columnas de la tabla empleado.


-- 21. Devuelve una lista con el nombre de los departamentos y el presupuesto, de aquellos que tienen un 
-- presupuesto mayor o igual a 150000 euros.
SELECT d.nombre, d.presupuesto FROM departamento WHERE d.presupuesto >= 150000

-- 22. Devuelve una lista con el nombre de los departamentos y el gasto, de aquellos que tienen menos de 5000 euros de gastos.
SELECT d.nombre, d.gastos
FROM departamento d
WHERE d.gastos < 5000

-- 23. Devuelve una lista con el nombre de los departamentos y el presupuesto, de aquellos que tienen un presupuesto 
-- entre 100000 y 200000 euros. Sin utilizar el operador BETWEEN.
SELECT d.nombre, d.presupuesto FROM departamento WHERE d.presupuesto>100000 AND d.presupuesto<200000;

-- 24. Devuelve una lista con el nombre de los departamentos que no tienen un presupuesto entre 
-- 100000 y 200000 euros. Sin utilizar el operador BETWEEN.
SELECT d.nombre, d.presupuesto FROM departamento WHERE d.presupuesto<100000 OR d.presupuesto>200000;

-- 25. Devuelve una lista con el nombre de los departamentos que tienen un presupuesto entre 
-- 100000 y 200000 euros. Utilizando el operador BETWEEN.
SELECT d.nombre FROM departamento d WHERE d.presupuesto BETWEEN 100000 AND 200000;

-- 26. Devuelve una lista con el nombre de los departamentos que no tienen un presupuesto entre 100000 y 200000 euros.
--  Utilizando el operador BETWEEN.
SELECT d.nombre FROM departamento d WHERE d.presupuesto NOT BETWEEN 100000 AND 200000;


-- 27. Devuelve una lista con el nombre de los departamentos, gastos y presupuesto, de aquellos 
-- departamentos donde los gastos sean mayores que el presupuesto del que disponen.
SELECT d.nombre, d.gastos, d.presupuesto
FROM departamento d
WHERE d.gastos > d.presupuesto

-- 28. Devuelve una lista con el nombre de los departamentos, gastos y presupuesto, de aquellos departamentos donde los gastos sean menores que el presupuesto del que disponen.
SELECT d.nombre, d.gastos, d.presupuesto
FROM departamento d
WHERE d.gastos < d.presupuesto

-- 29. Devuelve una lista con el nombre de los departamentos, gastos y presupuesto, de aquellos departamentos donde los gastos sean iguales al presupuesto del que disponen.
SELECT d.nombre, d.gastos, d.presupuesto
FROM departamento d
WHERE d.gastos = d.presupuesto

-- 30. Lista todos los datos de los empleados cuyo segundo apellido sea NULL.
SELECT * 
FROM empleado e
WHERE e.apellido2 IS NULL 

-- 31. Lista todos los datos de los empleados cuyo segundo apellido no sea NULL.
SELECT * 
FROM empleado e
WHERE e.apellido2 IS NOT NULL 

-- 32. Lista todos los datos de los empleados cuyo segundo apellido sea López.
SELECT * 
FROM empleado e
WHERE e.apellido2 = 'López'

-- 33. Lista todos los datos de los empleados cuyo segundo apellido sea Díaz o Moreno. Sin utilizar el operador IN.
SELECT * 
FROM empleado e
WHERE e.apellido2 = 'Díaz' OR e.apellido2 = 'Moreno'

-- 34. Lista todos los datos de los empleados cuyo segundo apellido sea Díaz o Moreno. Utilizando el operador IN.
SELECT * 
FROM empleado e
WHERE e.apellido2 IN ('Díaz', 'Moreno')

-- 35. Lista los nombres, apellidos y nif de los empleados que trabajan en el departamento 3.
SELECT e.nombre, e.apellido1, e.apellido2, e.nif
FROM empleado e
WHERE e.codigo_departamento = 3

-- 36. Lista los nombres, apellidos y nif de los empleados que trabajan en los departamentos 2, 4 o 5.
SELECT e.nombre, e.apellido1, e.apellido2, e.nif
FROM empleado e
WHERE e.codigo_departamento IN (2, 4, 5)


-- Consultas multitabla (Composición interna)

-- 1. Devuelve un listado con los empleados y los datos de los departamentos donde trabaja cada uno.
SELECT * FROM empleado e INNER JOIN departamento d ON e.codigo_departamento = d.codigo;

-- 2. Devuelve un listado con los empleados y los datos de los departamentos donde trabaja cada uno. 
-- Ordena el resultado, en primer lugar por el nombre del departamento (en orden alfabético) y en 
-- segundo lugar por los apellidos y el nombre de los empleados.
SELECT e.nombre, e.apellido1, e.apellido2, e.nif, d.nombre, d.presupuesto, d.gastos
FROM empleado e INNER JOIN departamento d ON e.codigo_departamento = d.codigo
ORDER BY d.nombre ASC, e.apellido1 ASC, e.apellido2 ASC, e.nombre ASC

-- 3. Devuelve un listado con el código y el nombre del departamento, solamente de aquellos departamentos que tienen empleados.
SELECT DISTINCT d.codigo, d.nombre
FROM departamento d INNER JOIN empleado e ON d.codigo = e.codigo_departamento

-- 4. Devuelve un listado con el código, el nombre del departamento y el valor del presupuesto actual 
-- del que dispone, solamente de aquellos departamentos que tienen empleados. El valor del presupuesto 
-- actual lo puede calcular restando al valor del presupuesto inicial (columna presupuesto) el valor de los 
-- gastos que ha generado (columna gastos).
SELECT DISTINCT d.codigo, d.nombre, (d.presupuesto - d.gastos) AS Presupuesto
FROM departamento d INNER JOIN empleado e ON d.codigo = e.codigo_departamento

-- 5. Devuelve el nombre del departamento donde trabaja el empleado que tiene el nif 38382980M.
SELECT d.nombre FROM departamento d INNER JOIN empleado e ON d.codigo = e.codigo_departamento WHERE e.nif = "38382980M"

-- 6. Devuelve el nombre del departamento donde trabaja el empleado Pepe Ruiz Santana.
SELECT d.nombre
FROM departamento d INNER JOIN empleado e ON d.codigo = e.codigo_departamento
WHERE e.nombre = 'Pepe' AND e.apellido1 = 'Ruíz' AND e.apellido2 = 'Santana'

-- 7. Devuelve un listado con los datos de los empleados que trabajan en el departamento de I+D. Ordena el resultado alfabéticamente.
SELECT e.* FROM empleado e INNER JOIN departamento d ON e.codigo_departamento = d.codigo WHERE d.nombre = "I+D";

-- 8. Devuelve un listado con los datos de los empleados que trabajan en el departamento de Sistemas, 
-- Contabilidad o I+D. Ordena el resultado alfabéticamente.
SELECT e.nombre, e.apellido1, e.apellido2, e.nif
FROM departamento d INNER JOIN empleado e ON d.codigo = e.codigo_departamento
WHERE d.nombre IN ('Sistemas', 'Contabilidad', 'I+D')
ORDER BY 2 ASC, 3 ASC, 1 ASC

-- 9. Devuelve una lista con el nombre de los empleados que tienen los departamentos que no tienen 
-- un presupuesto entre 100000 y 200000 euros.

-- 10. Devuelve un listado con el nombre de los departamentos donde existe algún empleado cuyo segundo apellido sea NULL. Tenga en cuenta que no debe mostrar nombres de departamentos que estén repetidos.

-- Consultas multitabla (Composición externa)

-- 11. Devuelve un listado con todos los empleados junto con los datos de los departamentos donde trabajan. Este listado también debe incluir los empleados que no tienen ningún departamento asociado.

-- 12. Devuelve un listado donde sólo aparezcan aquellos empleados que no tienen ningún departamento asociado.

-- 13. Devuelve un listado donde sólo aparezcan aquellos departamentos que no tienen ningún empleado asociado.

-- 14. Devuelve un listado con todos los empleados junto con los datos de los departamentos donde trabajan. El listado debe incluir los empleados que no tienen ningún departamento asociado y los departamentos que no tienen ningún empleado asociado. Ordene el listado alfabéticamente por el nombre del departamento.

-- 15. Devuelve un listado con los empleados que no tienen ningún departamento asociado y los departamentos que no tienen ningún empleado asociado. Ordene el listado alfabéticamente por el nombre del departamento.

-- Consultas resúmen

-- 16. Calcula la suma del presupuesto de todos los departamentos.

-- 17. Calcula la media del presupuesto de todos los departamentos.

-- 18. Calcula el valor mínimo del presupuesto de todos los departamentos.

-- 19. Calcula el nombre del departamento y el presupuesto que tiene asignado, del departamento con menor presupuesto.

-- 20. Calcula el valor máximo del presupuesto de todos los departamentos.

-- 21. Calcula el nombre del departamento y el presupuesto que tiene asignado, del departamento con mayor presupuesto.

-- 22. Calcula el número total de empleados que hay en la tabla empleado.

-- 23. Calcula el número de empleados que no tienen NULL en su segundo apellido.

-- 24. Calcula el número de empleados que hay en cada departamento. Tienes que devolver dos columnas, una con el nombre del departamento y otra con el número de empleados que tiene asignados.

-- 25. Calcula el nombre de los departamentos que tienen más de 2 empleados. El resultado debe tener dos columnas, una con el nombre del departamento y otra con el número de empleados que tiene asignados.

-- 26. Calcula el número de empleados que trabajan en cada uno de los departamentos. El resultado de esta consulta también tiene que incluir aquellos departamentos que no tienen ningún empleado asociado.

-- 27. Calcula el número de empleados que trabajan en cada unos de los departamentos que tienen un presupuesto mayor a 200000 euros.

-- Subconsultas

-- 28. Devuelve un listado con todos los empleados que tiene el departamento de Sistemas. (Sin utilizar INNER JOIN).

-- 29. Devuelve el nombre del departamento con mayor presupuesto y la cantidad que tiene asignada.

-- 30. Devuelve el nombre del departamento con menor presupuesto y la cantidad que tiene asignada.

-- 31. Devuelve los nombres de los departamentos que tienen empleados asociados. (Utilizando ALL o ANY).

-- 32. Devuelve los nombres de los departamentos que no tienen empleados asociados. (Utilizando ALL o ANY).

-- 33. Devuelve los nombres de los departamentos que tienen empleados asociados. (Utilizando IN o NOT IN).

-- 34. Devuelve los nombres de los departamentos que no tienen empleados asociados. (Utilizando IN o NOT IN).

-- 35. Devuelve los nombres de los departamentos que tienen empleados asociados. (Utilizando EXISTS o NOT EXISTS).

-- 36. Devuelve los nombres de los departamentos que no tienen empleados asociados. (Utilizando EXISTS o NOT EXISTS).