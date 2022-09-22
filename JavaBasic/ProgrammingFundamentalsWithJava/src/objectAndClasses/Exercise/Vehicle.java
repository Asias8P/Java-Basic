package objectAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Vehicle {

    private String typeOfVehicle;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String typeOfVehicle, String model, String color, int horsePower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n", getTypeOfVehicle(), getModel(), getColor(), getHorsePower());
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Vehicle> listOfVehicles = new ArrayList<>();
        String line = in.nextLine();
        double avgCar = 0;
        double avgTruck = 0;
        int counterCar = 0;
        int counterTruck = 0;
        int totalPowerCar = 0;
        int totalPowerTruck = 0;
        while (!line.equals("End")) {

            String type = line.split(" ")[0];
            String model = line.split(" ")[1];
            String color = line.split(" ")[2];
            int horsePower = Integer.parseInt(line.split(" ")[3]);


            if (type.equals("truck")) {
                type = "Truck";
                counterTruck++;
                totalPowerTruck += horsePower;
            } else if (type.equals("car")) {
                type = "Car";
                counterCar++;
                totalPowerCar += horsePower;
            }

            Vehicle objVehicle = new Vehicle(type, model, color, horsePower);
            listOfVehicles.add(objVehicle);


            line = in.nextLine();


        }

        String printMod = in.nextLine();
        while (!printMod.equals("Close the Catalogue")) {

            String finalPrintMod = printMod;
            List<Vehicle> filteredList = listOfVehicles.stream().filter(e -> e.getModel().equals(finalPrintMod)).collect(Collectors.toList());
            for (Vehicle v : filteredList) {
                System.out.print(v.toString());
            }
            printMod = in.nextLine();

        }


        avgCar = totalPowerCar * 1.00 / counterCar;
        avgTruck = totalPowerTruck * 1.00 / counterTruck;


        if (counterCar == 0) {
            avgCar = 0;
        }
        if (counterTruck == 0) {
            avgTruck = 0;
        }


        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCar);
        System.out.printf("Trucks have average horsepower of: %.2f.", avgTruck);

    }
}
