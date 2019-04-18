package service.imp;

import model.Part;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.imp.PartRepositoryImpl;
import service.ServicesPart;

public class ServicesPartImpTest {


    private ServicesPart services;


    @Before
    public void setUp() throws Exception {

        this.services = new ServicesPartImp(new PartRepositoryImpl());


    }

    @After
    public void tearDown() throws Exception {
        // was necesary reset dependecy using this method
        // but we can mock using mockito
        this.services.destroy();


    }

    @Test
    public void add() {
        /// AAA Patter
        String maker = "Ford";
        services.add(maker, "Fiesta", 2019);
        Assert.assertEquals(1, services.getall().size());


    }

    @Test
    public void remove() {
        /// AAA Patter
        String maker = "Ford";
        Part part = services.add(maker, "Fiesta", 2019).get();


        services.remove(part.getId());
        Assert.assertEquals(0, services.getall().size());
    }

    @Test
    public void searchById() {
        /// AAA Patter

        String maker = "Ford";
        Part part = services.add(maker, "Fiesta", 2019).get();
        Assert.assertEquals(part, services.Search(part.getId()).get());
    }

    @Test
    public void getall() {


        String maker = "Ford";

        services.add(maker, "Fiesta", 2019);
        services.add(maker, "Fiesta", 2017);
        services.add(maker, "Fiesta", 2020);
        Assert.assertEquals(3, services.getall().size());

    }

    @Test
    public void searchByMakerAndModel() {

        String maker = "Ford";
        Part part = services.add(maker, "Fiesta", 2019).get();
        Assert.assertEquals(1, services.Search(maker, "Fiesta").size());

    }
}