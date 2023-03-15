package model;

import java.util.Scanner;

public class Shops implements IShop{

    String [][] dataShops = {{"0", "0"}};

    String [][] shops = IShop.SHOPS;
    String shopName;
    int dataServer;

    public String [][] SelectShop(String selectedBrand) {

        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("Select store");
            for (String[] shop : shops) {
                String idShop = shop[1];
                if (idShop.equals(selectedBrand)) {
                    System.out.println(shop[0] + ". " + shop[2]);
                }
            }
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                boolean validOption = false;
                for (String[] shop : shops) {
                    if (shop[1].equals(selectedBrand) && shop[0].equals(Integer.toString(option))) {
                        validOption = true;
                        dataShops[0][0] = shop[0];
                        dataShops[0][1] = shop[2];
                        break;
                    }
                }
                if (validOption) {
                    break;
                } else {
                    System.out.println("Error: You must enter a valid number\n");
                }
            } else {
                System.out.println("Error: You must enter an integer number\n");
                scanner.next();
            }
        }
        return dataShops;
        }
    }


