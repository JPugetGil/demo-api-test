package xyz.hemoreg.datagenerator;

import com.github.javafaker.Faker;
import xyz.hemoreg.datagenerator.dto.ClientDTO;
import xyz.hemoreg.datagenerator.dto.ProductDTO;

public class GeneratorUtil {
    static ProductDTO generateProduct() {
        Faker faker = new Faker();

        long generatedId = faker.number().randomNumber();
        String generatedName = faker.funnyName().name().replace("'", "");
        double generatedPrice = faker.number().randomDouble(10, 1, 10 ^ 9);
        String generatedModel = faker.animal().name().replace("'", "");

        return new ProductDTO(generatedId, generatedName, generatedPrice, generatedModel);
    }

    static ClientDTO generateClient() {
        Faker faker = new Faker();

        long generatedId = faker.number().randomNumber();
        String generatedName = faker.name().fullName().replace("'", "");
        String generatedEmail = faker.name().firstName().replace("'", "") + '@' + faker.name().lastName().replace("'", "") + ".test";
        int generatedAge = faker.number().numberBetween(1, 120);
        String generatedAddress = faker.address().fullAddress().replace("'", "");

        return new ClientDTO(generatedId, generatedName, generatedEmail, generatedAge, generatedAddress);
    }
}
