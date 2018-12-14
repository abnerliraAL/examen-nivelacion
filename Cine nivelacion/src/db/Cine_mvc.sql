CREATE DATABASE Cine_mvc;

USE Cine_mvc;

CREATE TABLE Peliculas( 
    id_Pelicula integer NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    Genero varchar(50) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO Peliculas (nombre, Genero) VALUES 
('el aro','Terror'), 
('spiderman','Accion'),
('busqueda implacable','Accion'),
('el planeta del tesoro','caricaturas'),
('hombre al agua','Comedia');

SELECT * FROM Peliculas;

CREATE USER 'user_mvc'@'localhost' IDENTIFIED BY 'pass_mvc.2018';
GRANT ALL PRIVILEGES ON Cine_mvc.* TO 'user_mvc'@'localhost';
FLUSH PRIVILEGES;
