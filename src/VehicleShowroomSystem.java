import java.util.ArrayList;
import java.util.Scanner;

public class VehicleShowroomSystem {
    public static void main(String[] args){
        VehicleShowroom myShowroom = new VehicleShowroom();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to your vehicle showroom system!");

        while (true){
            int option;
            do{
                System.out.println("For each of the following operations, please press the corresponding number");
                System.out.println("1. Add a vehicle");
                System.out.println("2. Remove a vehicle");
                System.out.println("3. View list of vehicles and number of visitors");
                System.out.println("4. Exit");
                option = sc.nextInt();
            }while((option < 1) || (option > 4));

            if(option == 4){
                break;
            }
            else{
                int CarOption, ModelNumber, EnginePower, TireSize;
                switch (option){
                    case 1:
                        System.out.println("Select the kind of vehicle: (1) Normal, (2) Sports, (3) Heavy");
                        CarOption = sc.nextInt();
                        System.out.print("Enter the model number: ");
                        ModelNumber = sc.nextInt();
                        System.out.print("Enter the engine power: ");
                        EnginePower = sc.nextInt();
                        System.out.print("Enter the tire size: ");
                        TireSize = sc.nextInt();
                        switch (CarOption){
                            case 1:
                                String EngineType;
                                System.out.print("Enter the engine type: ");
                                EngineType = sc.nextLine();
                                Vehicle v = new Vehicle(ModelNumber, EngineType, EnginePower, TireSize);
                                myShowroom.AddVehicle(v);
                                break;
                            case 2:
                                int Turbo;
                                System.out.print("Enter the turbo value: ");
                                Turbo = sc.nextInt();
                                Vehicle v_sport = new SportsVehicle(ModelNumber, EnginePower, TireSize, Turbo);
                                myShowroom.AddVehicle(v_sport);
                                break;
                            case 3:
                                int Weight;
                                System.out.print("Enter the weight: ");
                                Weight = sc.nextInt();
                                Vehicle v_heavy = new HeavyVehicle(ModelNumber, EnginePower, TireSize, Weight);
                                myShowroom.AddVehicle(v_heavy);
                                break;
                        }
                        break;
                    case 2:
                        System.out.print("Enter the vehicle's model number: ");
                        int ModelNumberRemove = sc.nextInt();
                        boolean is_removed = myShowroom.RemoveVehicle(ModelNumberRemove);
                        if(is_removed){
                            System.out.println("Vehicle successfully removed");
                        }
                        else{
                            System.out.println("Sorry, vehicle not found!");
                        }
                        break;
                    case 3:
                        ArrayList<Vehicle> VehicleList = myShowroom.GetVehicles();
                        for(int i = 1; i <= VehicleList.size(); i++){
                            System.out.println("Car " + i + ":");
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
