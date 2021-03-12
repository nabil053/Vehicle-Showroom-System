public class HeavyVehicle extends Vehicle{
    private int Weight;

    public HeavyVehicle(int ModelNumber, int EnginePower, int TireSize, int Weight) {
        super(ModelNumber, "Diesel", EnginePower, TireSize);
        this.Weight = Weight;
    }

    public int getWeight() {
        return Weight;
    }
}
