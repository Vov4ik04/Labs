package entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarDecorator implements Transport {

    private Car car;

    @Override
    public String getName() {
        return car.getName();
    }

    @Override
    public void setName(String name) {
        car.setName(name);
    }

    @Override
    public Float getPrice() {
        return car.getPrice();
    }

    @Override
    public void setPrice(Float price) {
        car.setPrice(price);
    }

    @Override
    public Float getEnginePower() {
        return car.getEnginePower();
    }

    @Override
    public void setEnginePower(Float enginePower) {
        car.setEnginePower(enginePower);
    }

    @Override
    public String getInfo() {
        return car.toString();
    }


}
