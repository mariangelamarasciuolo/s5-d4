package mariangelamarasciuolo.menupizze.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bevande {
    private String name;
    private int calories;
    private double price;
}
