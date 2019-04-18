import service.ServicesPart;
import service.imp.ServicesPartImp;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World!");


        ServicesPart services = new ServicesPartImp();

        String maker = "Ford";

        services.add(maker, "Fiesta", 2019);
        services.add(maker, "Fiesta", 2017);
        services.add(maker, "Fiesta", 2020);

        services.getall().forEach(System.out::println);


    }
}
