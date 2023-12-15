package entities;

import lombok.*;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Car implements Transport {
    private String name;
    private Float price;
    private Float enginePower;


    @Override
    public String getInfo() {
        return null;
    }
}
