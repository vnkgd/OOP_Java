package Workers;
import Company.Vacancy;


public interface Observer {

    boolean receiveOffer(Vacancy vacancy);

    public String getName();

    public double getMinSalary();

    public int getGRADE();

}