package dto.vehicles;

public enum EngineType {
    OIL(1),
    HYBRID(2),
    ELECTRIC(3);

    private int code;

    EngineType(int code){
        this.code=code;
    }
}
