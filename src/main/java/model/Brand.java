package model;

public class Brand {
    private Long id;
    private String name;

    private Brand() {
    }


    public Brand(Long id, String name) {

        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
