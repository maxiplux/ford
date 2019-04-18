package repository.db;

import model.Brand;
import model.Part;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SingletonDatabase {

    private static List<Brand> brands =
            new ArrayList<Brand>(Arrays.asList(
                    new Brand(1l,"Ford"),
                    new Brand(2l,"Volvo"),
                    new Brand(2l,"Jaguar")
            ));


    private static List<Part> parts = new ArrayList<Part>();

    public  List<Brand> getBrands()
    {
        return  this.brands;
    }

    public  List<Part> getParts()
    {
        return  this.parts;
    }

    public  Optional<Part> addPart(Brand brand,String model, int year)
    {
        int size = this.getParts().size();
        Part part=new Part( (long) size+1, brand,model,year);
        this.getParts().add(part);
        return  Optional.of(part);
    }


    public Optional<Brand> getBrands(Long id)
    {
        return  this.getBrands().stream().filter(brand-> brand.getId().equals(id) ).findAny();
    }

    public List<Part> getParts(Long id)
    {
        return  this.getParts().stream().filter(part-> part.getId().equals(id) ).collect(Collectors.toList());
    }

    public Optional<Part> remove(Long id)
    {
        Optional<Part> partElement= this.getParts().stream().filter(part -> part.getId().equals(id)).findFirst();
        this.getParts().remove(new Part(id,null,null,null));
        return partElement;
    }

    public void destroy(){
        this.dbIsntance = null;
        this.parts = new ArrayList<Part>();

    }



    public static SingletonDatabase getInstance(){



        if (dbIsntance == null)
        {

            dbIsntance=  new SingletonDatabase();
        }
        return dbIsntance;
    }

    private SingletonDatabase() {

    }

    private static SingletonDatabase dbIsntance;

}
