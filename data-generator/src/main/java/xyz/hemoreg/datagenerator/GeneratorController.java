package xyz.hemoreg.datagenerator;

import org.springframework.web.bind.annotation.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@RestController
@RequestMapping(path = "/generate")
public class GeneratorController {

    @GetMapping("/products/{quantite}")
    public void genererSetProduits(@PathVariable("quantite") int quantite) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("product-data.sql", true));

        writer.append("insert into product (id, name, price) values ");
        for (int i = 0; i < quantite; i++) {
            writer.append(GeneratorUtil.generateProduct());
            if (i != quantite-1) {
                writer.append(",");
            }
        }
        writer.append(";");

        writer.close();
    }

    @GetMapping("/clients/{quantite}")
    public void genererSetClients(@PathVariable("quantite") int quantite) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("client-data.sql", true));

        writer.append("insert into client (id, age, email, name) values ");
        for (int i = 0; i < quantite; i++) {
            writer.append(GeneratorUtil.generateClient());
            if (i != quantite-1) {
                writer.append(",");
            }
        }
        writer.append(";");

        writer.close();
    }
}
