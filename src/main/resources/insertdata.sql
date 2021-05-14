
INSERT INTO companies
    VALUES(1, 'A46103834','Mercadona S.L', 'C/Valencia 46', 'Valencia','01123456742'),
          (2, 'B94582732','Bar almería', 'C/Manacor 102', 'Palma','0912438763'),
          (3, 'C77891122','Hotel Ses Roses', 'C/Josep Mª Quadrado', 'Soller','0099182736');

insert into people values('90080074A', 1970, 'Tofol', 'Bestard', 'Garcia', 600900394, 'tofol@garcia.com');
insert into people values('90080074B', 1980, 'Pep', 'Rossello', 'Gabriel', 699800200, 'pep@rossello.com');
insert into people values('90080074C', 1990, 'Bernat', 'Metge', 'Tudó', 722245904, 'bernat@metge.com');
insert into people values('90080074D', 1999, 'aitor', 'colom', 'cabot', 644559023, 'aitor@colom.com');
insert into employees values (default, '90080074A', '28/10000000/16', '2ª Fontanero','1', 'A',1612.52,'2020-10-01');
insert into employees values (default, '90080074B', '29/10000000/17', 'Socorrista','2', 'B',1612.52,'2010-10-01');
insert into employees values (default, '90080074C', '30/10000000/18', 'Mozo de almacém','3', 'C',1612.52,'2000-01-01');
insert into employees values (default, '90080074D', '31/10000000/19', 'Peón de catering','4', 'A',1612.52,'2005-05-01');

insert into payrolls values(default,1,'A46103834', 'Mercadona', 'C/Valencia 46', 'Valencia', '01123456742', 1, 'Tofol', 'Bestard', 'Garcia', '90080074A', '28/100000/16', '2ª Fontanero',
                            '1', 3, '2020-11-30', '2020-11-01', 700, 1400, 'complemento1', 'complemento2', 'complemento3', 10,200,300,40,500,'indemn1','indemn2','indemn3',50,100,150,100,
                            40,50,40,30,40,50,60,70,80,10,100,200,300,400,500,600,700,200,400,40,50,50,50,50,50,50,50,50,50,50);
/*
INSERT INTO payrolls(company_id, cif, company_name, company_address, city, ccc, employee_id, employee_name, employee_second_name, employee_last_name, nif, naf,
                     job_position, retributive_group, establishment_category, start_date, end_date, datediff, base_salary, complement_1_name,
                     complement_2_name, complement_3_name, complement_1_import, complement_2_import, complement_3_import, complementary_hours_import,
                     ss_prestations_or_indemnizations, indemnization_1_name, indemnization_2_name, indemnization_3_name,  indemnization_1_import, indemnization_2_import,
                     indemnization_3_import, other_indemnizations, other_salary_perceptions, extraordinary_gratifications_import, especie_salary_import,
                     major_force_extra_hours_import, major_force_extra_hours_deduction, other_extra_hours_deduction, other_extra_hours_import, irpf_percent, total_aportations,
                     anticipations, especie_products_value,  other_deductions, total_deductions,
                     net_salary, common_contingencies_percent, unemployement_percent, professional_formation_percent, major_force_extra_hours_percent, other_extra_hours_percent,
                     common_contingencies_deduction, professional_formation_deduction, irpf_deduction, brute_salary)*/