CREATE DATABASE sena_db;

USE sena_db;

CREATE TABLE student (
	idStudent INT(11) NOT NULL AUTO_INCREMENT,
    nameStudent VARCHAR(100) NOT NULL,
    lastNameStudent VARCHAR(100) NOT NULL,
    phoneNumber VARCHAR(10) NOT NULL,
    email VARCHAR(255) NOT NULL,
    PRIMARY KEY (idStudent)
) Engine = InnoDB DEFAULT CHARSET utf8mb4;

INSERT INTO student (nameStudent, lastNameStudent, phoneNumber, email) VALUES
('William', 'Peña', '3003531769', 'waamirdev@gmail.com'),
('Juan', 'Ceferino', '3009090909', 'ceferino63@gmail.com'),
('Daniela', 'Gamboa', '3112233343', 'danielaGam@gmail.com');

SELECT * FROM student ORDER BY idStudent DESC;