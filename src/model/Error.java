package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Error implements IError{

    private int idError;
    private int idArea;
    private String nameError;
    public static ArrayList<Error> errorList = getError();
    public Error() {
    }
    public Error(int idError, int idArea, String nameError) {
        this.idError = idError;
        this.idArea = idArea;
        this.nameError = nameError;
    }
    public static ArrayList<Error> getError() {
        ArrayList<Error> errorList = new ArrayList<Error>();

        errorList.add(new Error(1, 1, "Datos fiscales incompletos"));
        errorList.add(new Error(2, 1, "Error por equivalencia"));
        errorList.add(new Error(3, 2, "Enlace caido"));
        errorList.add(new Error(4, 2, "Archivo no generado"));
        errorList.add(new Error(5, 3, "Archivo no se transfiere automaticamente"));
        errorList.add(new Error(6, 3, "Servidor Apagado"));
        return errorList;
    }
    @Override
    public Error SelectError(int idArea) {
        Error errorResult = new Error();
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true){
            System.out.println("Select generated error");
            for (Error error : errorList){
                if (error.idArea == idArea){
                    System.out.println(error.getIdError() + ". " + error.getNameError());
                }
            }
            if (scanner.hasNextInt()){
                option = scanner.nextInt();
                boolean validOption = false;
                for (Error error : errorList){
                    if (error.idError == option && error.idArea == idArea){
                        validOption = true;
                        errorResult = error;
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
        return errorResult;
    }

    public int getIdError() {
        return idError;
    }

    public String getNameError() {
        return nameError;
    }
}
