package model;

import java.util.Scanner;

public class Country implements ICountry{

    String[][] countries = ICountry.COUNTRIES;
    private String[][] dataCountry = {{"0", "0"}};
    public String [][] SelectCountry(){
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("Seleccione el país de la incidencia");
            System.out.println("1. El Salvador");
            System.out.println("2. Guatemala");
            System.out.println("3. Costa Rica");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option >= 1 && option <= 3) {
                    break;
                } else {
                    System.out.println("Error: debe ingresar un número entre 1 y 3");
                }
            } else {
                System.out.println("Error: debe ingresar un número entero");
                scanner.next();
            }
        }
        for (String[] country : countries) {
            String idCountry = country[0];
            if (country[0].equals(String.valueOf(option))){
                dataCountry[0][0] = country[0];
                dataCountry[0][1] = country[1];
                break;
            }
        }
        return dataCountry;
    }
}
