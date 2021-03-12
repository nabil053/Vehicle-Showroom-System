import java.util.ArrayList;

public class VehicleShowroom {
    private int VisitorCount;
    private int CarCapacity;
    private int CarCount;
    private ArrayList<Vehicle> VehicleList;

    VehicleShowroom(int CarCapacity){
        this.CarCapacity = CarCapacity;
        CarCount = 0;
        VisitorCount = 30;
        VehicleList = new ArrayList<Vehicle>();
    }

    //Add a vehicle to the showroom, as long as the showroom capacity isn't exceeded
    public boolean AddVehicle(Vehicle v){
        boolean added_car = false;
        if(CarCount < CarCapacity){
            if(v instanceof SportsVehicle){
                VisitorCount += 20;
            }
            VehicleList.add(v);
            added_car = true;
            CarCount++;
        }
        return added_car;
    }

    //Remove a car from the showroom if it is present in the showroom
    public boolean RemoveVehicle(int ModelNumber){
        int size = VehicleList.size();
        boolean found_model = false;
        for(int i = 0; i < size; i++){
            if(VehicleList.get(i).getModelNumber() == ModelNumber){
                if(VehicleList.get(i) instanceof SportsVehicle){
                    VisitorCount -= 20;
                }
                VehicleList.remove(i);
                found_model = true;
                break;
            }
        }
        return found_model;
    }

    //Return the list of vehicles
    public ArrayList<Vehicle> GetVehicles(){
        return VehicleList;
    }

    //Return the number of visitors
    public int getVisitorCount() {
        return VisitorCount;
    }
}
