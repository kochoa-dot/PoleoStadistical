import model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Incidents> incidentsList = Incidents.createIncidents();
        Incidents incidentsFinal = new Incidents();
        incidentsFinal.printIncidents(incidentsList);
    }
}