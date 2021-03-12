import java.util.ArrayList;

public class VehicleShowroom {
    private int VisitorCount;
    private ArrayList<Vehicle> VehicleList;

    VehicleShowroom(){
        VisitorCount = 30;
        VehicleList = new ArrayList<Vehicle>();
    }

    public void AddVehicle(Vehicle v){
        if(v instanceof SportsVehicle){
            VisitorCount += 20;
        }
        VehicleList.add(v);
    }

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

    public ArrayList<Vehicle> GetVehicles(){
        return VehicleList;
    }

    public int getVisitorCount() {
        return VisitorCount;
    }
}
