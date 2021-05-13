



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



drop table payrolls;

CREATE TABLE IF NOT EXISTS payrolls
(
	id INT AUTO_INCREMENT PRIMARY KEY,
	company_id INT,
	FOREIGN KEY  (company_id) REFERENCES companies(id),
	cif VARCHAR(9),
	company_name VARCHAR(80),
	company_address VARCHAR(100),
	city VARCHAR(40),
	ccc VARCHAR(11),
	employee_id INT NOT NULL,
	FOREIGN KEY (employee_id) REFERENCES employees(id),
	employee_name VARCHAR(30),
    employee_second_name VARCHAR(30),
    employee_last_name VARCHAR(30),
	nif VARCHAR(9),
	naf VARCHAR(12),
    job_position VARCHAR (40),
	retributive_group SET('1','2','3','4','5','6'),
	FOREIGN KEY (retributive_group) REFERENCES retributive_groups(id),
	establishment_category INT,
	start_date DATE NOT NULL,
	end_date  DATE NOT NULL,
	datediff int,
	base_salary double,
    complement_1_name VARCHAR(40),
    complement_2_name VARCHAR(40),
    complement_3_name VARCHAR(40),
    complement_1_import double,
    complement_2_import double,
    complement_3_import double,
    complementary_hours_import double,
	ss_prestations_or_indemnizations double,
    indemnization_1_name varchar(40),
    indemnization_2_name varchar(40),
    indemnization_3_name varchar(40),
    indemnization_1_import double,
    indemnization_2_import double,
    indemnization_3_import double,
	other_indemnizations double,
	other_salary_perceptions double,
	common_contingencies double,
	unemployement double,
	professional_formation double,
    extraordinary_gratifications_import double,
    especie_salary_import double,
    major_force_extra_hours_import double,
	major_force_extra_hours_deductions double,
	other_extra_hours_deductions double,
    other_extra_hours_import  double,
	irpf double,
	total_aportations double,
	anticipations double,
	especie_products_value double,
	other_deductions double,
	total_deductions double,
	net_salary double,
    common_contingencies_percent double,
    unemployement_percent double,
    professional_formation_percent double,
    major_force_extra_hours_percent double,
    other_extra_hours_percent double,
    irpf_percent double,
    common_contingencies_deduction double,
    unemployement_deduction double,
    professional_formation_deduction double,
    major_force_extra_hours_deduction double,
    other_extra_hours_deduction double,
    irpf_deduction double,
    brute_salary double
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
