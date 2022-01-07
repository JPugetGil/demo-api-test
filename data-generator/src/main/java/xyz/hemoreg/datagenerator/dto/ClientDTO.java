package xyz.hemoreg.datagenerator.dto;

public class ClientDTO {
    private long id;
    private String name;
    private String email;
    private int age;
    private String adresse;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() { return adresse; }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ClientDTO(long id, String name, String email, int age, String adresse) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "(" + id + ',' + age + ",'" + email + "','" + name + "','" + adresse + "')";
    }
}
