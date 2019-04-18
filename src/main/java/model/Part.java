package model;

import java.util.Objects;

public final class Part {
    private final  Long id;

    private final Brand brand;// Make
    private final String model;
    private final  Integer year;


    public Part(Long id, Brand brand, String model, Integer year) {
        this.id = id;
        this.model=model;
        this.brand = brand;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public Brand getBrand() {
        return brand;
    }

    public Integer getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Part)) return false;
        Part part = (Part) o;
        return Objects.equals(getId(), part.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", brand=" + brand +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
