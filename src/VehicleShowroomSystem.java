import java.util.ArrayList;
import java.util.Scanner;

public class VehicleShowroomSystem {
    public static void main(String[] args){
        final int CAR_CAPACITY = 50;
        VehicleShowroom myShowroom = new VehicleShowroom(CAR_CAPACITY);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to your vehicle showroom system!");

        while (true){
            int option;

            //Select an operation for the showroom system
            do{
                System.out.println("For each of the following operations, please press the corresponding number");
                System.out.println("1. Add a vehicle");
                System.out.println("2. Remove a vehicle");
                System.out.println("3. View list of vehicles and number of visitors");
                System.out.println("4. Exit");
                option = Integer.parseInt(sc.nextLine());
            }while((option < 1) || (option > 4));

            if(option == 4){
                break;
            }
            else{
                //Perform any one of the three operations on the showroom system
                int CarOption, ModelNumber, EnginePower, TireSize;
                switch (option){
                    case 1:
                        //Select a vehicle type and enter the common details
                        System.out.println("Select the kind of vehicle: (1) Normal, (2) Sports, (3) Heavy");
                        CarOption = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter the model number: ");
                        ModelNumber = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter the engine power: ");
                        EnginePower = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter the tire size: ");
                        TireSize = Integer.parseInt(sc.nextLine());
                        switch (CarOption){
                            case 1:
                                //Enter the engine type information for common vehicle and add common vehicle
                                String EngineType;
                                System.out.print("Enter the engine type: ");
                                EngineType = sc.nextLine();
                                Vehicle v = new Vehicle(ModelNumber, EngineType, EnginePower, TireSize);
                                boolean is_added = myShowroom.AddVehicle(v);
                                if(is_added){
                                    System.out.println("Car added successfully!");
                                }
                                else{
                                    System.out.println("Maximum showroom capacity reached!");
                                }
                                break;
                            case 2:
                                //Enter the turbo information for sport vehicle and add sport vehicle
                                int Turbo;
                                System.out.print("Enter the turbo value: ");
                                Turbo = Integer.parseInt(sc.nextLine());
                                Vehicle v_sport = new SportsVehicle(ModelNumber, EnginePower, TireSize, Turbo);
                                boolean is_added_sport = myShowroom.AddVehicle(v_sport);
                                if(is_added_sport){
                                    System.out.println("Car added successfully!");
                                }
                                else{
                                    System.out.println("Maximum showroom capacity reached!");
                                }
                                break;
                            case 3:
                                //Enter the turbo information for heavy vehicle and add heavy vehicle
                                int Weight;
                                System.out.print("Enter the weight: ");
                                Weight = Integer.parseInt(sc.nextLine());
                                Vehicle v_heavy = new HeavyVehicle(ModelNumber, EnginePower, TireSize, Weight);
                                boolean is_added_heavy = myShowroom.AddVehicle(v_heavy);
                                if(is_added_heavy){
                                    System.out.println("Car added successfully!");
                                }
                                else{
                                    System.out.println("Maximum showroom capacity reached!");
                                }
                                break;
                        }
                        break;
                    case 2:
                        //Enter model number of vehicle and delete vehicle with that model number
                        System.out.print("Enter the vehicle's model number: ");
                        int ModelNumberRemove = Integer.parseInt(sc.nextLine());
                        boolean is_removed = myShowroom.RemoveVehicle(ModelNumberRemove);
                        if(is_removed){
                            System.out.println("Vehicle successfully removed");
                        }
                        else{
                            System.out.println("Sorry, vehicle not found!");
                        }
                        break;
                    case 3:
                        //Display information on all cars along with expected number of visitors
                        ArrayList<Vehicle> VehicleList = myShowroom.GetVehicles();
                        for(int i = 0; i < VehicleList.size(); i++){
                            System.out.println("Car " + (i + 1) + ":");
                            System.out.println("Model Number: " + VehicleList.get(i).getModelNumber());
                            System.out.println("Engine Type: " + VehicleList.get(i).getEngineType());
                            System.out.println("Engine Power: " + VehicleList.get(i).getEnginePower());
                            System.out.println("Tire Size: " + VehicleList.get(i).getTireSize());
                            if(VehicleList.get(i) instanceof SportsVehicle){
                                System.out.println("Turbo: " + ((SportsVehicle) VehicleList.get(i)).getTurbo());
                            }
                            else if(VehicleList.get(i) instanceof HeavyVehicle){
                                System.out.println("Weight: " + ((HeavyVehicle) VehicleList.get(i)).getWeight());
                            }
                        }
                        System.out.println("Total number of expected visitors: " + myShowroom.getVisitorCount());
                        break;
                }
            }
        }
    }
}
