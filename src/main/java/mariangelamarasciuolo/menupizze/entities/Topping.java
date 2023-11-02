package mariangelamarasciuolo.menupizze.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
public class Topping {
    private String name;
    private int calorie;
    private double price;
}
