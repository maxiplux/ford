package service;

import model.Part;

import java.util.List;
import java.util.Optional;

public interface ServicesPart {

    public Optional<Part> add(String brand,String model, int year);

    public Optional<Part> remove(Long id);

    public List<Part> Search(String brand, String Model);
    public List<Part> getall();

    public Optional<Part> Search(Long year);

    void destroy();
}
