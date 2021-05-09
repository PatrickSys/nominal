package com.nominal.app.queries;

import java.sql.SQLException;
import java.util.*;

/************************************************************************
 Made by        Nominal team
 Date           08/05/2021
 Package        com.nominal.app
 Description:
 ************************************************************************/
public class FolQueries extends Queries {


    protected FolQueries() throws Exception {
    }

    public static void main(String[] args) throws Exception {
        FolQueries FolQueries = new FolQueries();
        FolQueries.insertFolData();


    }


    public void insertFolData() throws Exception {

        List<List<String>> allRetributionGroups = getAllRetributionGroups();
        List<List<String>> allEstablishmentCategories = getAllCategories();
        List<String> monthlyPayment = getMonthlyPayment();

        //insertConvention();
        //insertEstablishmentCategories();
        //insertEstablishment_types(allEstablishmentCategories);
        //insertRetributiveGroups(allRetributionGroups);
        //insertJobPositions(allRetributionGroups);
        insertBaseSalaries( allEstablishmentCategories, allRetributionGroups);



    }

    public List<List<String>> getAllRetributionGroups(){
        String[] firstRetributionLevel = {"Jefe de recepción", "Monta discos", "Primer conserje", "Jefe de operaciones de catering", "Jefe de cocina", "Jefe de personal de catering", "Jefe de comedor", "Jefe de compras de catering", "Contable general", "Jefe de administración de catering", "Primer encargado de mostrador", "Jefe de mantenimiento de catering", "Primer jefe de sala", "Jefe de supervisores de catering", "Encargado general pisos y limpieza", "Encargado de mantenimiento y servicios"};
        String[] secondRetributionLevel = {"Jefe de bar", "Mayordomo de pisos", "Segundo jefe de cocina", "Segundo Jefe de Recepción", "Segundo jefe de comedor", "Interventor", "Jefe repostería", "Supervisor de catering", "Segundo jefe de sala", "Jefe de Sala de catering", "Segundo encargado de mostrador", "Jefe de repostería de catering", "Encargado de seccion pisos y limpieza", "Segundo jefe de cocina de catering", "Jefe administrativo", "Segundo encargado de mantenimiento y servicios"};
        String[] thirdRetributionLevel = {"Jefe de partida", "Cajero", "Jefe de sector Contable", "Segundo jefe de bar", "Encargado de economato", "Dependiente de primera", "Conserje de noche", "Segundo conserje", "Encargado de economato catering", "Recepcionista", "Encargado sala limpieza catering", "Oficial administrativo de 1ª", "Jefe de equipo de catering", "Manocorrentista", "Oficial 1ª administrativo de catering", "Encargado de lencería de catering", "Especialista en dietética y nutrición en catering", "Relaciones  publicas"};
        String[] fourthRetributionLevel = {"Encargado de lenceria y lavanderia", "Electricista", "Cocinero", "Pintor", "Planchista", "Tapicero", "Cafetero", "Panadero", "Oficial repostero", "Animador y monitor", "Dependiente", "2ª Camarero bar", "Camarero de sala", "Camarero comedor", "Cocinero de catering", "Camarero sala de fiestas", "Preparador de catering", "Oficial administrativo", "2ª Fontanero", "Oficial de repostería de catering", "Mecánico-calefactor", "Oficial de mantenimiento de catering", "Conductor", "Conductor de catering", "Jardinero", "Mecánico de catering", "Albañil", "Oficial administrativo 2ª catering", "Carpintero", "Camarero de pisos"};
        String[] fifthRetributionLevel = {"Ayudante de planchista", "Auxiliar administrativo caja o contabilidad", "Ayudante de cocina", "Ayudante de preparación catering", "Ayudante de reposteria", "Ayudante de economato", "Telefonista", "Ayudante de economato catering", "Facturista", "Ayudante de cocina catering", "Taquillero", "Ayudante de repostería catering", "Ayudante recepción o conserjería", "Ayudante de jefe de equipo catering", "Ayudante de sala o mostrador", "Auxiliar administrativo catering", "Ayudante de comedor o bar", "Lavandero de catering", "Bodeguero"};
        String[] sixthRetributionLevel = {"Portero de coches", "Vigilante de noche", "Portero recibidor de sala de fiestas", "Portero de servicio", "Guardarropa Mozo de equipajes", "Peón", "Niñero", "Pinche", "Piscinero", "Fregador", "Mozo de habitaciones", "Marmitón", "Lencero", "Ayudante de cafetín", "Lavandero", "Calefactor", "Costurero", "Ayudante de mecánico", "Planchador", "Ayudante de tapicero", "Limpiador Ayudante de jardinero", "Botones", "Ayudante de albañil", "Ascensorista", "Ayudante de fontanero", "Guarda exterior de catering", "Ayudante de carpintero", "Limpiador o fregador de catering", "Ayudante de electricista", "Pinche de catering", "Ayudante de pintor", "Peón de catering", "Mozo de almacén", "Socorrista"};
        String[][] retributionLevels = {firstRetributionLevel, secondRetributionLevel, thirdRetributionLevel, fourthRetributionLevel, fifthRetributionLevel, sixthRetributionLevel};

        List<String> firstRetribLevel = Arrays.asList(firstRetributionLevel);
        List<String> secondRetribLevel = Arrays.asList(secondRetributionLevel);
        List<String> thirdRetribLevel = Arrays.asList(thirdRetributionLevel);
        List<String> fourthRetribLevel = Arrays.asList(fourthRetributionLevel);
        List<String> fifthRetriblevel = Arrays.asList(fifthRetributionLevel);
        List<String> sixthRetribLevel = Arrays.asList(sixthRetributionLevel);
        List<List<String>> allRetrib = new ArrayList<>();
        allRetrib.add(firstRetribLevel);
        allRetrib.add(secondRetribLevel);
        allRetrib.add(thirdRetribLevel);
        allRetrib.add(fourthRetribLevel);
        allRetrib.add(fifthRetriblevel);
        allRetrib.add(sixthRetribLevel);
        return allRetrib;
    }

    private List<List<String>> getAllCategories(){
        String[] aCategory = {"Hotel de 4 y 5 estrellas", "Café bar especial A y B", "Hotel residencia de 4 estrellas", "Bar americano", "Hotel apartamentos de 4 estrellas", "Sala de fiestas y Discoteca lujo", "1ª Apartamento  extrahotelero lujo", "Motel de 4 estrellas", "Restaurante de 4 y 5 tenedores", "Salón de té", "Hotel rural"};
        String[] bCategory = {"Hotel de 3 y 2 estrellas", "Cafetería de 2 y 3 tazas", "Hotel residencia de 3 y 2 estrellas", "Bar de 2ª y 1ª", "Hotel apartamentos de 3 y 2 estrellas", "Sala de fiestas y discoteca", "2ª Apartamento extrahoteleros de 1ª y 2ª", "Catering y Colectividades", "Residencia apartamentos de 3 y 2 estrellas", "Lavandería hotelera centralizada", "Hostal residencia de 3 estrellas", "Casino de segunda y tercera", "Hostal de 3 estrellas", "Pizzería", "Motel de 3 y 2 estrellas", "Tablao flamencos", "Ciudad de vacaciones 3 y 2 estrellas", "Granja", "Pensión de 3 estrellas", "Barbacoa", "Restaurante de 3 y 2 tenedores", "Establecimiento turístico de interior"};
        String[] cCategory = {"Hotel de 1 estrella", "Restaurante de 1 tenedor", "Hotel residencia de 1 estrella", "Cafetería de 1 taza", "Hotel apartamentos de 1 estrella", "Bar de 3ª y 4ª", "Apartamento extrahotelero de 3ª", "Taberna y Bodegón", "Residencia apartamentos de 1 estrella", "Casa de comida", "Hostal de 2 y 1 estrellas", "Taberna que sirven comidas", "Motel de 1 estrella", "Heladería", "Pensión de 2 y 1 estrellas", "Sala de fiestas y Discoteca de 3ª", "Fonda y Casa de huéspedes", "Salón de baile", "Ciudad de vacaciones de 1 estrella", "Agroturismo", "Viviendas turísticas vacacionales"};
        String[][] categoryLevels = {aCategory, bCategory, cCategory};

        List<String> aCat = Arrays.asList(aCategory);
        List<String> bCat = Arrays.asList(bCategory);
        List<String> cCAT = Arrays.asList(cCategory);
        List<List<String>> allCat = new ArrayList<>();

        allCat.add(aCat);
        allCat.add(bCat);
        allCat.add(cCAT);
        return allCat;
    }

    private List<String> getMonthlyPayment(){
        String[] eurosMes = {"1931.83", "1791.11", "1667.78", "1549.34", "1435.67", "1349.57", "1905.14", "1772.65", "1640.63", "1516.24", "1421.85", "1349.57", "1874.49", "1743.25", "1612.52", "1500.46", "1414.45", "1349.57"};
        return Arrays.asList(eurosMes);
    }

    private void insertRetributiveGroups(List<List<String>> allRetributionGroups) throws SQLException {
        int index = 1;
        for(List<String> retributionGroup : allRetributionGroups){
                String sql = "insert into retributive_groups VALUES ('" + index + "')";
            System.err.println(sql);
                executeQuery(sql);

            index++;
        }
    }
    /**
     * Add retributve_groups
     */
    private void insertJobPositions(List<List<String>> allRetrib) throws SQLException {
        int index = 1;

        for (List retributionLevel : allRetrib) {

            for (Object job : retributionLevel) {
                String sql = "insert into job_positions VALUES (default, \"" + job + "\",'" + index + "')";
                executeQuery(sql);
            }
            index++;
        }
    }

    /**
     * Add base_salaries
     */
    //TODO fix this
    private void insertBaseSalaries( List<List<String>> allCategories, List<List<String>> retributiveGroup) throws SQLException {
        char[] catLetters = {'A','B','C'};
        List<String> monthlypayment = getMonthlyPayment();
        int thisindex = 0;
        for(int i = 0; i < allCategories.size(); i++){


            for (List<String> group : retributiveGroup){

                    String sql ="insert into base_salaries values(default, 1, '" + (retributiveGroup.indexOf(group)+1)  + "', '" + catLetters[i] + "', " + monthlypayment.get(thisindex) + ")";
                    executeQuery(sql);


                thisindex++;
            }
        }
        }


    /**
     * Add establishment_categories
     */
    private void insertEstablishmentCategories() throws SQLException {


        String addCategoeries = "insert into establishment_categories VALUES('A'), ('B'), ('C')";
        executeQuery(addCategoeries);
    }

    /**
     * Add convention
     */
    private void insertConvention() throws SQLException {



        String convention = "insert into conventions VALUES(default, \"8612062018\") ";
        String idConvention = "select * from conventions where boe_number = \"8612062018\" ";
        executeQuery(convention);
        System.err.println((executeQuery(idConvention)));

    }
    /**
     * Add establishment_types referenced to establishment categories
     */
    private void insertEstablishment_types(List<List<String>> allCat) throws SQLException {
        char[] catLetters = {'A','B','C'};
        int charindex = 0;
        for (List catLevel: allCat){

            for (Object level : catLevel){
                String sql = "insert into establishment_types VALUES (default, \"" + level + "\", '" + catLetters[charindex] +   "')";
                executeQuery(sql);
            }
            charindex++;
        }
    }






}
