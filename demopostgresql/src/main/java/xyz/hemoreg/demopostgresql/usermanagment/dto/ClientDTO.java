package xyz.hemoreg.demopostgresql.usermanagment.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {
    private int id;
    private String name;
    private String email;
    private int age;

    public ClientDTO(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
