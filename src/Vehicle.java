public class Vehicle {
    private int ModelNumber;
    private String EngineType;
    private int EnginePower;
    private int TireSize;

    public Vehicle(int ModelNumber, String EngineType, int EnginePower, int TireSize) {
        this.ModelNumber = ModelNumber;
        this.EngineType = EngineType;
        this.EnginePower = EnginePower;
        this.TireSize = TireSize;
    }

    public int getModelNumber() {
        return ModelNumber;
    }

    public String getEngineType() {
        return EngineType;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public int getTireSize() {
        return TireSize;
    }
}
