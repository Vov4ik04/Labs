package entities;

public interface Transport {
    String getName();
    void setName(String name);
    Float getPrice();
    void setPrice(Float price);
    Float getEnginePower();
    void setEnginePower(Float enginePower);

    String getInfo();
}
