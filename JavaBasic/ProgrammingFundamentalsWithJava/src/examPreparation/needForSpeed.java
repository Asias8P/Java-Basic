package examPreparation;

import java.util.*;

public class needForSpeed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());


        Map<String,List<Integer>> carsMap = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String [] cars = in.nextLine().split("\\|");
            String car = cars[0];
            int mileage = Integer.parseInt(cars[1]);
            int fuel =Integer.parseInt(cars[2]);

            carsMap.put(car,new ArrayList<>());
            carsMap.get(car).add(mileage);
            carsMap.get(car).add(fuel);
        }

        String command = in.nextLine();


        while (!command.equals("Stop")){

            //"Drive : {car} : {distance} : {fuel}":
            if(command.contains("Drive")){
                String car=command.split(" : ")[1];
                int distance = Integer.parseInt(command.split(" : ")[2]);
                int fuel =Integer.parseInt(command.split(" : ")[3]);


                List<Integer>carDrive=carsMap.get(car);
                int mileageDrive = carDrive.get(0);
                int fuelDrive = carDrive.get(1);

                if(fuelDrive>=fuel){
                    fuelDrive= fuelDrive-fuel;
                    mileageDrive=mileageDrive+distance;
                   carDrive.set(0,mileageDrive);
                   carDrive.set(1,fuelDrive);

                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,fuel);
                }
                else {
                    System.out.println("Not enough fuel to make that ride");
                }
                if(mileageDrive>=100000){
                    carsMap.remove(car);
                    System.out.printf("Time to sell the %s!%n",car);
                }

            }
            if(command.contains("Refuel")){
               // "Refuel : {car} : {fuel}":
                String car = command.split(" : ")[1];
                int fuelTofill = Integer.parseInt(command.split(" : ")[2]);
                List<Integer>list = carsMap.get(car);
                int currentFuelInTheTank= list.get(1);

                if(currentFuelInTheTank+fuelTofill>75){
                    int filledLitres =75-currentFuelInTheTank;
//                    if(filledLitres<=0){
//                        filledLitres=0;
//                    }
                    currentFuelInTheTank=75;
                    list.set(1,currentFuelInTheTank);
                    System.out.printf("%s refueled with %d liters%n",car,filledLitres);

                }
                else {
                     currentFuelInTheTank=currentFuelInTheTank+fuelTofill;
                    list.set(1,currentFuelInTheTank);
                    System.out.printf("%s refueled with %d liters%n",car,fuelTofill);
                }
            }

            //"Revert : {car} : {kilometers}":
            if(command.contains("Revert")){
                String car = command.split(" : ")[1];
                int kilometers = Integer.parseInt(command.split(" : ")[2]);
                List<Integer>list = carsMap.get(car);
                int mileage = list.get(0);

                mileage = mileage-kilometers;
                if(mileage<10000){
                    mileage=10000;
                }
                else {
                    System.out.printf("%s mileage decreased by %d kilometers%n",car,kilometers);
                }
                list.set(0,mileage);
            }
            command= in.nextLine();
        }
        //"{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
        carsMap.entrySet().forEach(car->
                System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                        car.getKey(),car.getValue().get(0),car.getValue().get(1)));
    }
}
