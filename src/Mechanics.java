import java.util.ArrayList;
import java.util.List;
public class Mechanics {
    private final String name;
    private final String company;

    public Mechanics(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }


    public String getCompany() {
        return company;
    }

    public void maintenance () {
        System.out.println(getName() + " проводит техобслуживание");
    }
    public void carRepairs () {
        System.out.println(getName() + " чинит машину");
    }

    @Override
    public String toString() {
        return "механик " + name;
    }
}
