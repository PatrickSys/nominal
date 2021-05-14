
INSERT INTO companies
    VALUES(1, 'A46103834','Mercadona S.L', 'C/Valencia 46', 'Valencia','01123456742'),
          (2, 'B94582732','Bar almería', 'C/Manacor 102', 'Palma','0912438763'),
          (3, 'C77891122','Hotel Ses Roses', 'C/Josep Mª Quadrado', 'Soller','0099182736');

insert into people values('90080074A', 1970, 'Tofol', 'Bestard', 'Garcia', 600900394, 'tofol@garcia.com');
insert into people values('90080074B', 1980, 'Pep', 'Rossello', 'Gabriel', 699800200, 'pep@rossello.com');
insert into people values('90080074C', 1990, 'Bernat', 'Metge', 'Tudó', 722245904, 'bernat@metge.com');
insert into people values('90080074D', 1999, 'aitor', 'colom', 'cabot', 644559023, 'aitor@colom.com');
insert into employees values (default, '90080074A', '28/10000000/16', '2ª Fontanero','1', 'A',default,'2020-10-01');
insert into employees values (default, '90080074B', '29/10000000/17', 'Socorrista','2', 'B',default,'2010-10-01');
insert into employees values (default, '90080074C', '30/10000000/18', 'Mozo de almacém','3', 'C',default,'2000-01-01');
insert into employees values (default, '90080074D', '31/10000000/19', 'Peón de catering','4', 'A',default,'2005-05-01');

insert into payrolls values(default,1,'A46103834', 'Mercadona', 'C/Valencia 46', 'Valencia', '01123456742', 1, 'Tofol', 'Bestard', 'Garcia', '90080074A', '28/100000/16', '2ª Fontanero',
                            '1', 3, '2020-11-30', '2020-11-01', 700, 1400, 'complemento1', 'complemento2', 'complemento3', 10,200,300,40,500,'indemn1','indemn2','indemn3',50,100,150,100,
                            40,50,40,30,40,50,60,70,80,10,100,200,300,400,500,600,700,200,400,40,50,50,50,50,50,50,50,50,50,50);
