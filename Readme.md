1. Lista el nombre de todos los productos que hay en la tabla producto.

```jsx
SELECT  nombre FROM producto
```

2. Lista los nombres y los precios de todos los productos de la tabla producto.

```jsx
SELECT nombre, precio FROM producto
```

3. Lista todas las columnas de la tabla producto.

```jsx
SELECT codigo, nombre, precio, codigo_fabricante FROM producto
```

4. Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD).

```jsx
SELECT nombre. ROUND(CAST(precio as numeric) * 1.19, 2) as EUR,  precio as USD FROM producto
```

5. Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD). Utiliza los siguientes alias para las columnas: nombre de producto, euros, dólares.

```jsx
SELECT nombre as nombre_de_producto, ROUND(CAST(precio as numeric) * 1.19, 2) as euros,  precio as dòlares FROM producto
```

6. Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los nombres a mayúscula.

```jsx
SELECT UPPER(nombre), precio FROM producto
```

7. Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los nombres a minúscula.

```jsx
SELECT LOWER(nombre), precio FROM producto
```

8. Lista el nombre de todos los fabricantes en una columna, y en otra columna obtenga en mayúsculas los dos primeros caracteres del nombre del fabricante.

```jsx
SELECT nombre, LEFT(UPPER(nombre), 2) FROM fabricante
```

9. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.

```jsx
SELECT nombre, ROUND(CAST(precio as numeric), 2) FROM producto
```

10. Lista los nombres y los precios de todos los productos de la tabla productotruncando el valor del precio para mostrarlo sin ninguna cifra decimal.

```jsx
SELECT nombre, ROUND(CAST(precio as numeric), 2) FROM producto
```

11. Lista el identificador de los fabricantes que tienen productos en la tabla producto.

```jsx
SELECT f.codigo, f.nombre
FROM fabricante as f, producto as p
WHERE p.codigo_fabricante is NOT NULL
```

12. Lista el identificador de los fabricantes que tienen productos en la tabla producto, eliminando los identificadores que aparecen repetidos.

```jsx
SELECT DISTINCT f.codigo, f.nombre
FROM fabricante as f, producto as p
WHERE p.codigo_fabricante is NOT NULL
```

13. Lista los nombres de los fabricantes ordenados de forma ascendente.

```jsx
SELECT nombre FROM fabricante ORDER BY nombre ASC
```

14. Lista los nombres de los fabricantes ordenados de forma descendente.

```jsx
SELECT nombre FROM fabricante ORDER BY nombre DESC
```

15. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.

```jsx
SELECT nombre, precio FROM producto ORDER BY nombre ASC,  precio DESC
```

16. Devuelve una lista con las 5 primeras filas de la tabla fabricante.

```jsx
SELECT codigo, nombre FROM fabricante LIMIT 5
```

17. Devuelve una lista con 2 filas a partir de la cuarta fila de la tabla fabricante. La cuarta fila también se debe incluir en la respuesta.

```jsx
SELECT codigo, nombre FROM fabricante LIMIT 2 OFFSET 2
```

18. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT

```jsx
SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1
```

19. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)

```jsx
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1
```

20. Lista el nombre de todos los productos del fabricante cuyo identificador de fabricante es igual a 2.

```jsx
SELECT nombre
FROM producto
WHERE codigo_fabricante = 2
```

21. Lista el nombre de los productos que tienen un precio menor o igual a 120€.

```jsx
SELECT nombre, precio FROM producto WHERE precio <= 120
```

22. Lista el nombre de los productos que tienen un precio mayor o igual a 400€.

```jsx
SELECT nombre, precio FROM producto WHERE precio >= 400
```

23. Lista el nombre de los productos que no tienen un precio mayor o igual a 400€.

```jsx
SELECT nombre, precio FROM producto WHERE precio >= 400
```

24. Lista todos los productos que tengan un precio entre 80€ y 300€. Sin utilizar el operador BETWEEN.

```jsx
SELECT nombre
FROM producto
WHERE precio >= 80 AND precio <= 300;
```

25. Lista todos los productos que tengan un precio entre 60€ y 200€. Utilizando el operador BETWEEN.

```jsx
SELECT nombre
FROM producto
WHERE precio BETWEEN 60 AND 200;
```

26. Lista todos los productos que tengan un precio mayor que 200€ y que el identificador de fabricante sea igual a 6.

```jsx
SELECT nombre
FROM producto
WHERE precio > 200 AND codigo_fabricante = 6;
```

27. Lista todos los productos donde el identificador de fabricante sea 1, 3 o 5. Sin utilizar el operador IN.

```jsx
SELECT nombre, codigo_fabricante
FROM producto
WHERE codigo_fabricante = 1 OR codigo_fabricante = 3 OR codigo_fabricante = 5;
```

28. Lista todos los productos donde el identificador de fabricante sea 1, 3 o 5. Utilizando el operador IN.

```jsx
SELECT nombre, codigo_fabricante
FROM producto
WHERE codigo_fabricante IN (1, 3, 5);
```

29. Lista el nombre y el precio de los productos en céntimos (Habrá que multiplicar por 100 el valor del precio). Cree un alias para la columna que contiene el precio que se llame céntimos.

```jsx
SELECT nombre, precio * 100 AS centimos
FROM producto;
```

30. Lista los nombres de los fabricantes cuyo nombre empiece por la letra S.

```jsx
SELECT nombre
FROM fabricante
WHERE nombre LIKE 'S%';
```

31. Lista los nombres de los fabricantes cuyo nombre termine por la vocal e.

```jsx
SELECT nombre
FROM fabricante
WHERE nombre LIKE '%e';
```

32. Lista los nombres de los fabricantes cuyo nombre contenga el carácter w.

```jsx
SELECT nombre
FROM fabricante
WHERE nombre LIKE '%w%';
```

33. Lista los nombres de los fabricantes cuyo nombre sea de 4 caracteres.

```jsx
SELECT nombre
FROM fabricante
WHERE LENGTH(nombre) = 4;
```

34. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.

```jsx
SELECT nombre
FROM producto
WHERE nombre LIKE '%Portátil%';
```

35. Devuelve una lista con el nombre de todos los productos que contienen la cadena Monitor en el nombre y tienen un precio inferior a 215 €.

```jsx
SELECT nombre
FROM producto
WHERE nombre LIKE '%Monitor%' AND precio < 215;
```

36. Lista el nombre y el precio de todos los productos que tengan un precio mayor o igual a 180€. Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente).

```jsx
SELECT nombre, precio
FROM producto
WHERE precio >= 180
ORDER BY precio DESC, nombre ASC;
```