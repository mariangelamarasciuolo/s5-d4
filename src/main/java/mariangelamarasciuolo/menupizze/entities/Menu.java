package mariangelamarasciuolo.menupizze.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class Menu {
    private List<Pizze> pizze;
    private List<Topping> toppings;
    private List<Bevande> bevande;

}
