package service.imp;

import model.Part;
import repository.PartRepository;
import repository.imp.PartRepositoryImpl;
import service.ServicesPart;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

public class ServicesPartImp implements ServicesPart {


    private PartRepository repository ;

    public ServicesPartImp()
    {
        repository = new PartRepositoryImpl();
    }

    // Dependency injection patter
    public ServicesPartImp(PartRepository repository)
    {
        this.repository = repository;
    }


    @Override
    public Optional<Part> add(String brand, String model, int year) {
        return repository.add(brand,model,year);
    }

    @Override
    public Optional<Part> remove(Long id) {
        return this.repository.remove(id);
    }


    @Override
    public List<Part> Search(String brand, String model) {
        return this.repository.Search(brand,model);
    }


    @Override
    public List<Part> getall() {
        return this.repository.getall();
    }


    @Override
    public Optional<Part> Search(Long id) {

        return this.repository.Search(id);

    }

    @Override
    public void destroy() {
        this.repository.destroy();

    }
}
