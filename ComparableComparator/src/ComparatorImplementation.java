import java.util.Comparator;

public class ComparatorImplementation implements Comparator<Company> {
    @Override
    public int compare(Company company1, Company company2) {

        if (company1.getpE() > company2.getpE()) {
            return 1;
        }
        return -1;
    }
}
