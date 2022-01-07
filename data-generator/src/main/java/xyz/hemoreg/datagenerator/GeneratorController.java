package xyz.hemoreg.datagenerator;

import org.springframework.web.bind.annotation.*;
import xyz.hemoreg.datagenerator.dto.ClientDTO;
import xyz.hemoreg.datagenerator.dto.ProductDTO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/generate")
public class GeneratorController {

    @GetMapping("/products/{quantite}")
    public void genererSetProduits(@PathVariable("quantite") int quantite) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("/data/product-data.sql", true));
        generateAndWriteProducts(quantite, writer);
        writer.close();
    }

    @GetMapping("/clients/{quantite}")
    public void genererSetClients(@PathVariable("quantite") int quantite) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("/data/client-data.sql", true));
        generateAndWriteClients(quantite, writer);
        writer.close();
    }

    @GetMapping("/fullscript/{quantite}")
    public void genererFullscript(@PathVariable("quantite") int quantite) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("/data/data.sql", true));
        generateAndWriteClients(quantite, writer);
        writer.append("\n");
        generateAndWriteProducts(quantite, writer);
        writer.close();
    }

    private void generateAndWriteClients(int quantite, BufferedWriter writer) throws IOException {
        List<Long> generatedClientIds = new ArrayList<>();
        writer.append("insert into client (id, age, email, name, adresse) values ");
        for (int i = 0; i < quantite; i++) {

            ClientDTO clientDTO;
            do {
                clientDTO = GeneratorUtil.generateClient();
            } while (generatedClientIds.contains(clientDTO.getId()));
            generatedClientIds.add(clientDTO.getId());
            writer.append(clientDTO.toString());

            if (i != quantite-1) {
                writer.append(",");
            }
        }
        writer.append(";");
    }

    private void generateAndWriteProducts(int quantite, BufferedWriter writer) throws IOException {
        List<Long> generatedIds = new ArrayList<>();

        writer.append("insert into product (id, name, price, model) values ");
        for (int i = 0; i < quantite; i++) {

            ProductDTO productDTO;
            do {
                productDTO = GeneratorUtil.generateProduct();
            } while (generatedIds.contains(productDTO.getId()));
            generatedIds.add(productDTO.getId());
            writer.append(productDTO.toString());

            if (i != quantite-1) {
                writer.append(",");
            }
        }
        writer.append(";");
    }
}
