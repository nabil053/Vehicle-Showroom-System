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

    public void setModelNumber(int modelNumber) {
        ModelNumber = modelNumber;
    }

    public String getEngineType() {
        return EngineType;
    }

    public void setEngineType(String engineType) {
        EngineType = engineType;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int enginePower) {
        EnginePower = enginePower;
    }

    public int getTireSize() {
        return TireSize;
    }

    public void setTireSize(int tireSize) {
        TireSize = tireSize;
    }
}
