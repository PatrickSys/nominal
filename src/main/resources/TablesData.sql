



CREATE TABLE IF NOT EXISTS people(
	dni CHAR(9) PRIMARY KEY NOT NULL,
    	yob YEAR NOT NULL,
      	name VARCHAR(15) NOT  NULL,
    	second_name VARCHAR(20) NOT NULL,
    	last_name VARCHAR(20),
    	phone INT NOT NULL,
   	email VARCHAR (35) NOT NULL
);
/* nivel retributivo 1 - 6 */
CREATE TABLE IF NOT EXISTS retributive_groups(
	id SET('1','2','3','4','5','6')  PRIMARY KEY NOT NULL
);

/* categoría establecimiento A B C*/
CREATE TABLE IF NOT EXISTS establishment_categories(

	id SET('A','B','C') PRIMARY KEY NOT NULL
);

CREATE TABLE IF NOT EXISTS employees(
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
dni CHAR(9) NOT NULL UNIQUE,
FOREIGN KEY (dni) REFERENCES people(dni) ON UPDATE CASCADE ON DELETE CASCADE,
naf VARCHAR (20) UNIQUE,
job_position VARCHAR(80),
retributive_group SET('1','2','3','4','5','6') NOT NULL,
FOREIGN KEY (retributive_group) REFERENCES retributive_groups(id),
establishment_category SET('A','B','C'),
FOREIGN KEY (establishment_category) REFERENCES establishment_categories(id),
hire_date DATE NOT NULL
);




CREATE TABLE IF NOT EXISTS conventions(
	id VARCHAR(50) PRIMARY KEY NOT NULL
);



CREATE TABLE IF NOT EXISTS base_salaries(
	id INT AUTO_INCREMENT PRIMARY KEY,
    convention_id VARCHAR(50),
    FOREIGN KEY (convention_id) REFERENCES conventions(id),
	retributive_group SET('1','2','3','4','5','6'),
FOREIGN KEY (retributive_GROUP) REFERENCES retributive_groups(id),
	establishment_category SET('A','B','C'),
	FOREIGN KEY(establishment_category) REFERENCES establishment_categories(id),
	base_salary double

);



CREATE TABLE IF NOT EXISTS payrolls(
	id INT AUTO_INCREMENT PRIMARY KEY,
	employee_id INT NOT NULL,
	FOREIGN KEY (employee_id) REFERENCES employees(id) ON UPDATE CASCADE ON DELETE CASCADE,
	period_start DATE NOT NULL,
	period_end  DATE NOT NULL
);


CREATE TABLE IF NOT EXISTS job_positions(
	id INT AUTO_INCREMENT PRIMARY KEY,
	retributive_group SET('1','2','3','4','5','6') NOT NULL,
	FOREIGN KEY (retributive_group) REFERENCES retributive_groups(id),
	job_position_name VARCHAR(80) UNIQUE
);

CREATE TABLE IF NOT EXISTS establishment_types(
    id INT AUTO_INCREMENT PRIMARY KEY,
    establishment_category SET('A','B','C'),
    FOREIGN KEY (establishment_category) REFERENCES establishment_categories(id),
    establishment_type VARCHAR(70)
)

