package mariangelamarasciuolo.menupizze.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Pizze {
    private String name;
    private int calorie;
    private double price;

    private final String ingr1 = "Tomato";
    private final String ingr2 = "Cheese";
    private List<Topping> toppings = new ArrayList<>();
}
