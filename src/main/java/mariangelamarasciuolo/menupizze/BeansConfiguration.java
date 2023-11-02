package mariangelamarasciuolo.menupizze;

import mariangelamarasciuolo.menupizze.entities.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeansConfiguration {

    @Bean
    Topping getCheese() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    Topping getHam() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    Topping getOnions() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean
    Topping getPineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean
    Topping getSalami() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean
    Pizze getMargherita() {
        return new Pizze("Pizza Margherita", 1104, 4.99, new ArrayList<>());
    }

    @Bean
    Pizze getHawaiianPizza() {
        List<Topping> ingr = new ArrayList<Topping>();
        ingr.add(getPineapple());
        ingr.add(getCheese());
        ingr.add(getHam());
        return new Pizze("Pizza Hawaiian", 1024, 6.49, ingr);
    }

    @Bean
    Pizze getSalamiPizza() {
        List<Topping> ingr = new ArrayList<Topping>();
        ingr.add(getSalami());
        ingr.add(getCheese());
        return new Pizze("Pizza Salami", 1160, 5.99, ingr);
    }


    @Bean
    Bevande getLemonade() {
        return new Bevande("Lemonade (0.33l)", 128, 1.29);
    }

    @Bean
    Bevande getWater() {
        return new Bevande("Water (0.5l)", 0, 1.29);
    }

    @Bean
    Bevande getWine() {
        return new Bevande("Wine (0.75l), 13%", 607, 7.49);
    }

    @Bean
    void menu() {
        System.out.println("*****PIZZE*****");
        List<Pizze> listaPizze = new ArrayList<>();
        listaPizze.add(getMargherita());
        listaPizze.add(getHawaiianPizza());
        listaPizze.add(getSalamiPizza());
        System.out.println(listaPizze);

        System.out.println("*****TOPPINGS*****");
        List<Topping> listaToppings = new ArrayList<>();
        listaToppings.add(getCheese());
        listaToppings.add(getHam());
        listaToppings.add(getSalami());
        listaToppings.add(getPineapple());
        listaToppings.add(getOnions());
        System.out.println(listaToppings);

        System.out.println("*****BEVANDE*****");
        List<Bevande> listaBevande = new ArrayList<>();
        listaBevande.add(getLemonade());
        listaBevande.add(getWater());
        listaBevande.add(getWine());
        System.out.println(listaBevande);
    }

    @Bean
    Tavolo getTavolo(@Value("${costo.coperto}") double costoCoperto) {
        return new Tavolo(5, 4, costoCoperto, StatoTavolo.OCCUPATO);
    }

    @Bean
    Ordine getOrdine(@Value("${costo.coperto}") double costoCoperto) {
        List<Pizze> pizze = new ArrayList<>();
        pizze.add(getSalamiPizza());
        pizze.add(getSalamiPizza());
        pizze.add(getMargherita());
        pizze.add(getMargherita());

        List<Bevande> bevande = new ArrayList<>();
        bevande.add(getLemonade());
        bevande.add(getLemonade());
        bevande.add(getWater());
        bevande.add(getWater());

        return new Ordine(pizze, bevande, 4, costoCoperto, StatoOrdine.INCORSO, 1, LocalDateTime.now());
    }

}
