CREATE DATABASE biblioteca_project2 CHARACTER SET utf8 COLLATE utf8_general_ci;

USE biblioteca_project2;

CREATE TABLE Editorial (
  idEditorial CHAR(5) PRIMARY KEY,
  nombre VARCHAR(60),
  direccion VARCHAR(100),
  telefono VARCHAR(12),
  email VARCHAR(100),
  ruc VARCHAR(15)
);

CREATE TABLE Libro (
  idLibro CHAR(5) PRIMARY KEY,
  titulo VARCHAR(50),
  autor VARCHAR(100),
  idEditorial CHAR(5),
  stock INT,
  estado VARCHAR(10) NOT NULL CHECK (estado IN ('Disponible', 'Agotado')),
  FOREIGN KEY (idEditorial) REFERENCES Editorial(idEditorial)
);

CREATE TABLE Alumno (
  idAlumno CHAR(5) PRIMARY KEY,
  nombre VARCHAR(100),
  apellido VARCHAR(100),
  direccion VARCHAR(100),
  telefono VARCHAR(12),
  email VARCHAR(100),
  dni VARCHAR(8) UNIQUE
);

CREATE TABLE Prestamo (
  idPrestamo CHAR(5) PRIMARY KEY,
  fecPre DATE,
  fecDev DATE,
  estado VARCHAR(10) NOT NULL CHECK (estado IN ('Prestado', 'Devuelto'))
);

CREATE TABLE DetallePrestamo (
  idPrestamo CHAR(5),
  idLibro CHAR(5),
  idAlumno CHAR(5),
  FOREIGN KEY (idPrestamo) REFERENCES Prestamo(idPrestamo),
  FOREIGN KEY (idLibro) REFERENCES Libro(idLibro),
  FOREIGN KEY (idAlumno) REFERENCES Alumno(idAlumno)
);

CREATE TABLE Empleado (
  idEmpleado CHAR(5) PRIMARY KEY,
  nombre VARCHAR(100),
  apellido VARCHAR(100),
  direccion VARCHAR(100),
  telefono VARCHAR(12),
  email VARCHAR(100),
  dni VARCHAR(8) UNIQUE,
  clave VARCHAR(15)
);

CREATE TABLE CompraLibro (
  idCompra CHAR(5) PRIMARY KEY,
  idLibro CHAR(5),
  idEditorial CHAR(5),
  idEmpleado CHAR(5),
  fecCompra DATE,
  precio DECIMAL(10,2),
  cantidad INT,
  FOREIGN KEY (idLibro) REFERENCES Libro(idLibro),
  FOREIGN KEY (idEditorial) REFERENCES Editorial(idEditorial),
  FOREIGN KEY (idEmpleado) REFERENCES Empleado(idEmpleado)
);


DELIMITER //
CREATE PROCEDURE SP_MostrarPrestamos()
BEGIN
    SELECT p.idPrestamo, l.titulo, CONCAT(a.nombre, ' ', a.apellido) AS alumno, p.fecPre, p.fecDev, p.estado
    FROM Prestamo p
    INNER JOIN DetallePrestamo dp ON p.idPrestamo = dp.idPrestamo
    INNER JOIN Alumno a ON dp.idAlumno = a.idAlumno
    INNER JOIN Libro l ON dp.idLibro = l.idLibro
    ORDER BY p.idPrestamo;
END //
DELIMITER ;
CALL SP_MostrarPrestamos();

DELIMITER //
CREATE PROCEDURE SP_MostrarPrestamo(IN p_idPrestamo CHAR(5))
BEGIN
    SELECT p.idPrestamo, l.titulo, CONCAT(a.nombre, ' ', a.apellido) AS alumno, p.fecPre, p.fecDev, p.estado
    FROM Prestamo p
    INNER JOIN DetallePrestamo dp ON p.idPrestamo = dp.idPrestamo
    INNER JOIN Alumno a ON dp.idAlumno = a.idAlumno
    INNER JOIN Libro l ON dp.idLibro = l.idLibro
    WHERE p.idPrestamo = p_idPrestamo
    ORDER BY p.idPrestamo;
END //
DELIMITER ;
CALL SP_MostrarPrestamo('PRE01');

DELIMITER //
CREATE PROCEDURE SP_AgregarPrestamo(
  IN p_idPrestamo CHAR(5),
  IN p_fecPre DATE,
  IN p_fecDev DATE,
  IN p_estado VARCHAR(10),
  IN p_idLibro CHAR(5),
  IN p_idAlumno CHAR(5)
)
BEGIN
  -- Insertar el préstamo en la tabla Prestamo
  INSERT INTO Prestamo (idPrestamo, fecPre, fecDev, estado)
  VALUES (p_idPrestamo, p_fecPre, p_fecDev, p_estado);
  -- Insertar el detalle del préstamo en la tabla DetallePrestamo
  INSERT INTO DetallePrestamo (idPrestamo, idLibro, idAlumno)
  VALUES (p_idPrestamo, p_idLibro, p_idAlumno);
  -- Actualizar el stock del libro si el estado es "Prestado"
  IF p_estado = 'Prestado' THEN
    UPDATE Libro
    SET stock = stock - 1
    WHERE idLibro = p_idLibro;
  END IF;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE SP_ActualizarPrestamo(
  IN p_idPrestamo CHAR(5),
  IN p_fecPre DATE,
  IN p_fecDev DATE,
  IN p_estado VARCHAR(10),
  IN p_idLibro CHAR(5),
  IN p_idAlumno CHAR(5)
)
BEGIN
  -- Actualizar el préstamo en la tabla Prestamo
  UPDATE Prestamo
  SET
    fecPre = p_fecPre,
    fecDev = p_fecDev,
    estado = p_estado
  WHERE idPrestamo = p_idPrestamo;
  -- Actualizar el detalle del préstamo en la tabla DetallePrestamo
  UPDATE DetallePrestamo
  SET
    idLibro = p_idLibro,
    idAlumno = p_idAlumno
  WHERE idPrestamo = p_idPrestamo;
  -- Aumentar el stock del libro si el estado es "Devuelto"
  IF p_estado = 'Devuelto' THEN
    UPDATE Libro
    SET stock = stock + 1
    WHERE idLibro = p_idLibro;
  END IF;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE SP_EliminarPrestamo(IN p_idPrestamo CHAR(5))
BEGIN
  -- Eliminar los registros relacionados en DetallePrestamo
  DELETE FROM DetallePrestamo WHERE idPrestamo = p_idPrestamo;
  -- Eliminar el préstamo de la tabla Prestamo
  DELETE FROM Prestamo WHERE idPrestamo = p_idPrestamo;
END //
DELIMITER ;
CALL SP_EliminarPrestamo('PR002');



DELIMITER //
CREATE PROCEDURE SP_ObtenerDetallesCompra()
BEGIN
  SELECT c.idCompra, l.titulo, e.nombre AS editorial, emp.nombre AS empleado, c.fecCompra, c.precio, c.cantidad
  FROM CompraLibro c
  INNER JOIN Libro l ON c.idLibro = l.idLibro
  INNER JOIN Editorial e ON c.idEditorial = e.idEditorial
  INNER JOIN Empleado emp ON c.idEmpleado = emp.idEmpleado
  ORDER BY c.idCompra;
END //
DELIMITER ;
CALL SP_ObtenerDetallesCompra();

DELIMITER //
CREATE PROCEDURE SP_MostrarCompra(IN p_compra_id CHAR(5))
BEGIN
  SELECT c.idCompra, l.titulo, e.nombre AS editorial, emp.nombre AS empleado, c.fecCompra, c.precio, c.cantidad
  FROM CompraLibro c
  INNER JOIN Libro l ON c.idLibro = l.idLibro
  INNER JOIN Editorial e ON c.idEditorial = e.idEditorial
  INNER JOIN Empleado emp ON c.idEmpleado = emp.idEmpleado
  WHERE c.idCompra = p_compra_id;
END //
DELIMITER ;
CALL SP_MostrarCompra('COM01');

DELIMITER //
CREATE PROCEDURE SP_MostrarLibros()
BEGIN
    SELECT l.idLibro, l.titulo, l.autor, e.nombre AS editorial, l.stock, l.estado
    FROM Libro l
    INNER JOIN Editorial e ON l.idEditorial = e.idEditorial
    ORDER BY l.idLibro;
END //
DELIMITER ;
CALL SP_MostrarLibros();








select * from libro;
select * from alumno;
select * from prestamo;
select * from empleado;
select * from detalleprestamo;

DELETE FROM prestamo WHERE idPrestamo = 'PR002';


CALL SP_MostrarPrestamos();
CALL SP_MostrarPrestamo('PR001');
CALL SP_AgregarPrestamo('PR001', '2023-06-28', '2023-07-05', 'Prestado', 'LI001', 'AL001');
CALL SP_AgregarPrestamo('PR001', '2023-06-28', '2023-07-05', 'Prestado', 'LIB001', 'ALU001');
CALL SP_ActualizarPrestamo('PRE001', '2023-06-28', '2023-07-05', 'Devuelto', 'LIB001', 'ALU001');
CALL SP_MostrarPrestamos();
CALL SP_ObtenerDetallesCompra();
CALL SP_MostrarCompra('COM01');
CALL SP_MostrarLibros();
CALL SP_ObtenerDetallesCompra();

-- DELETE FROM Prestamo WHERE idPrestamo = 'PR001';

DELIMITER //
CREATE PROCEDURE SP_AgregarCompra(
  IN p_idCompra CHAR(5),
  IN p_idLibro CHAR(5),
  IN p_idEditorial CHAR(5),
  IN p_idEmpleado CHAR(5),
  IN p_fecCompra DATE,
  IN p_precio DECIMAL(10, 2),
  IN p_cantidad INT
)
BEGIN
  -- Insertar la compra en la tabla CompraLibro
  INSERT INTO CompraLibro (idCompra, idLibro, idEditorial, idEmpleado, fecCompra, precio, cantidad)
  VALUES (p_idCompra, p_idLibro, p_idEditorial, p_idEmpleado, p_fecCompra, p_precio, p_cantidad);
  -- Incrementar la cantidad en el stock del libro
  UPDATE Libro
  SET stock = stock + p_cantidad
  WHERE idLibro = p_idLibro;
END //
DELIMITER ;



DELIMITER //
CREATE PROCEDURE SP_ActualizarCompra(
  IN p_idCompra CHAR(5),
  IN p_idLibro CHAR(5),
  IN p_idEditorial CHAR(5),
  IN p_idEmpleado CHAR(5),
  IN p_fecCompra DATE,
  IN p_precio DECIMAL(10, 2),
  IN p_cantidad INT
)
BEGIN
  -- Actualizar la compra en la tabla CompraLibro
  UPDATE CompraLibro
  SET
    idLibro = IF(LENGTH(p_idLibro) > 0, p_idLibro, idLibro),
    idEditorial = IF(LENGTH(p_idEditorial) > 0, p_idEditorial, idEditorial),
    idEmpleado = IF(LENGTH(p_idEmpleado) > 0, p_idEmpleado, idEmpleado),
    fecCompra = p_fecCompra,
    precio = p_precio,
    cantidad = p_cantidad
  WHERE idCompra = p_idCompra;
END //
DELIMITER ;












select * from CompraLibro;
DELETE FROM CompraLibro WHERE idCompra IS NULL OR idCompra = 'CO002';

CALL SP_ActualizarCompra('CO002', 'LI003', 'ED001', 'EM002', '2023-06-29', 89.99, 4);

CALL SP_AgregarCompra('CO003', 'LI002', 'ED002', 'EM001', '2023-06-28', 79.99, 5);
CALL SP_ObtenerDetallesCompra();


