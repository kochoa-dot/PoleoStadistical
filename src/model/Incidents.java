package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Incidents {
    public Date date;
    public String countryName;
    public String brandName;
    public String shopName;
    public String areaName;
    public String managerName;
    public String errorName;

    public Incidents() {
    }

    public Incidents(Date date, String s, String s1, String s2, String areaName, String manager, String nameError) {
        this.date = date;
        this.countryName = s;
        this.brandName = s1;
        this.shopName = s2;
        this.areaName = areaName;
        this.managerName = manager;
        this.errorName = nameError;
    }

    public static ArrayList<Incidents> createIncidents() {
        ArrayList<Incidents> incidentsList = new ArrayList<Incidents>();
        Scanner scanner = new Scanner(System.in);
        String option;
        boolean newIncident = true;
        while (newIncident) {
            model.Country country = new Country();
            String[][] selectedCountry = country.SelectCountry();
            model.Brand brand = new Brand();
            String[][] selectedBrand = brand.SelectBrand(selectedCountry[0][0]);
            model.Shops shops = new Shops();
            String[][] selectedShop = shops.SelectShop(selectedBrand[0][0]);
            model.Areas areas = new Areas();
            Areas selectedArea = areas.SelectArea();
            model.Error error = new Error();
            Error selectedError = error.SelectError(selectedArea.getIdArea());

            incidentsList.add(new Incidents(new Date(), selectedCountry[0][1], selectedBrand[0][1], selectedShop[0][1], selectedArea.getAreaName(), selectedArea.getManager(), selectedError.getNameError()));

            System.out.println("Desea agregar otro incidente? Y/n");
            option = scanner.next().toUpperCase();
            if (option.equals("Y")) {
                newIncident = true;
            } else if (option.equals("N")) {
                newIncident = false;
            } else {
                System.out.println("Opción inválida. Por favor ingrese Y o N.");
            }
        }
        return incidentsList;
    }
    public void printIncidents(ArrayList<Incidents> incidentList){
        System.out.printf("%-12s%-12s%-12s%-12s%-12s%-18s%-12s\n", "Fecha", "Country", "Brand", "Shop", "Area", "Manager", "Error");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (Incidents incident: incidentList) {
            System.out.printf("%-12s%-12s%-12s%-12s%-12s%-18s%-12s\n",
                    dateFormat.format(incident.date),
                    incident.countryName,
                    incident.brandName,
                    incident.shopName,
                    incident.areaName,
                    incident.managerName,
                    incident.errorName);
        }
    }
}
