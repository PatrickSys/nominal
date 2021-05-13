



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
CREATE TABLE IF NOT EXISTS retributive_groups
(
	id SET('1','2','3','4','5','6')  PRIMARY KEY NOT NULL
);

/* categoría establecimiento A B C*/
CREATE TABLE IF NOT EXISTS establishment_categories
(

	id SET('A','B','C') PRIMARY KEY NOT NULL
);

CREATE TABLE IF NOT EXISTS employees
(
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




CREATE TABLE IF NOT EXISTS conventions
(
	id VARCHAR(50) PRIMARY KEY NOT NULL
);



CREATE TABLE IF NOT EXISTS base_salaries
(
	id INT AUTO_INCREMENT PRIMARY KEY,
    convention_id VARCHAR(50),
    FOREIGN KEY (convention_id) REFERENCES conventions(id),
	retributive_group SET('1','2','3','4','5','6'),
FOREIGN KEY (retributive_GROUP) REFERENCES retributive_groups(id),
	establishment_category SET('A','B','C'),
	FOREIGN KEY(establishment_category) REFERENCES establishment_categories(id),
	base_salary double

);



CREATE TABLE IF NOT EXISTS payrolls
(
	id INT AUTO_INCREMENT PRIMARY KEY,
	company_cif VARCHAR(9),
	company_name VARCHAR(80),
	company_address VARCHAR(100),
	city VARCHAR(40),
	CCC VARCHAR(11),
	employee_id INT NOT NULL,
	FOREIGN KEY (employee_id) REFERENCES employees(id),
	employee_name VARCHAR(30),
	NIF VARCHAR(9),
	NAF VARCHAR(12),
	retributive_group SET('1','2','3','4','5','6'),
	FOREIGN KEY (retributive_group) REFERENCES retributive_groups(id),
	establishment_category INT,
	start_date DATE NOT NULL,
	end_date  DATE NOT NULL,
	datediff int,
	base_salary double,
	complements_id int,
	FOREIGN KEY (complements_id) REFERENCES complements(id),
	ss_prestations_or_indemnitzations double,
	other_indemnitzations double,
	other_salary_perceptions double,
	common_contingencies double,
	unemployement double,
	professional_formation double,
	major_force_extra_hours_deductions double,
	other_extra_hours_deductions double,
	irpf double,
	total_aportations double,
	anticipations double,
	especie_products_value double,
	other_deductions double,
	total_deductions double,
	net_salary double
);

CREATE TABLE  IF NOT EXISTS  companies
(
    id      INT AUTO_INCREMENT PRIMARY KEY,
    cif     VARCHAR(11),
    ccc     VARCHAR(11),
    name    VARCHAR(40),
    address VARCHAR(50),
    city    VARCHAR(40)
);


CREATE TABLE IF NOT EXISTS complements
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    complement_name VARCHAR(80),
    complement_import double
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

