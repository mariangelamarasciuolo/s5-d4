package mariangelamarasciuolo.menupizze;

import lombok.extern.slf4j.Slf4j;
import mariangelamarasciuolo.menupizze.entities.Ordine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyPizzaRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenupizzeApplication.class);
        System.out.println(ctx.getBean("menu"));
        Ordine ordine = (Ordine) ctx.getBean("getOrdine");
        System.out.println(ordine);
        System.out.println(ordine.totaleOrdine());
    }
}
