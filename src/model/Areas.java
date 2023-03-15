package model;

import java.util.Scanner;
import java.util.ArrayList;

public class Areas implements IAreas{
    private int idArea;
    private String areaName;
    private String manager;
    public static ArrayList<Areas> areasList = getAreas();


    public Areas() {
    }

    public Areas(int idArea, String areaName, String manager) {
        this.idArea = idArea;
        this.areaName = areaName;
        this.manager = manager;
    }
    public static ArrayList<Areas> getAreas(){
        ArrayList<Areas> areasList = new ArrayList<Areas>();

        areasList.add(new Areas(1, "Operaciones", "Monica Bandera"));
        areasList.add(new Areas(2, "Monitoreo", "Guillermo Dominguez"));
        areasList.add(new Areas(3, "Soporte", "Carlos Iglesias"));

        return areasList;
    }

    public Areas SelectArea(){
        Areas areaResult = new Areas();
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true){
            System.out.println("Select the incident area");
            for (Areas area : areasList) {
                System.out.println(area.idArea + ". " + area.areaName);
            }

            if (scanner.hasNextInt()){
                option = scanner.nextInt();
                boolean validOption = false;
                for (Areas area : areasList){
                    if (area.idArea == option){
                        validOption = true;
                        areaResult = area;
                        break;
                    }
                }
                if (validOption){
                    break;
                } else {
                    System.out.println("Error: You must enter a valid number\n");
                }
            } else {
                System.out.println("Error: You must enter an integer number\n");
                scanner.next();
            }
        }
        return areaResult;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
