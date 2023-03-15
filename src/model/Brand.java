package model;

import java.util.Scanner;

public class Brand implements IBrand{
    private String[][] dataBrand =  {{"0", "0"}};

    String[][] brands = IBrand.BRANDS;

    @Override
    public String[][] SelectBrand(String selectedCountry) {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("Seleccione la marca");
            for (String[] brand : brands) {
                String idCountry = brand[1];
                if (idCountry.equals(selectedCountry)){
                    System.out.println(brand[0] + ". " + brand[3]);
                }
            }

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                boolean validOption = false;
                for (String[] brand : brands) {
                    if (brand[1].equals(selectedCountry) && brand[0].equals(Integer.toString(option))) {
                        validOption = true;
                        dataBrand[0][0] = brand[0];
                        dataBrand[0][1] = brand[2];
                        break;
                    }
                }
                if (validOption) {
                    break;
                } else {
                    System.out.println("Error: debe ingresar un número válido");
                }
            } else {
                System.out.println("Error: debe ingresar un número entero");
                scanner.next();
            }
        }

        return dataBrand;
    }
}
