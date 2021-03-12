public class SportsVehicle extends Vehicle{
    private int Turbo;

    public SportsVehicle(int ModelNumber, int EnginePower, int TireSize, int Turbo) {
        super(ModelNumber, "Oil", EnginePower, TireSize);
        this.Turbo = Turbo;
    }

    public int getTurbo() {
        return Turbo;
    }
}
