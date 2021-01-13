import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company tesla = new Company("Tesla", 805.18, 1682.99);
        Company amazon = new Company("Amazon", 1570, 91.39);
        Company apple = new Company("Apple", 2170, 39.32);
        Company toyota = new Company("Toyota", 246.9, 15.65);

        List<Company> companies = new ArrayList<>() {
            {
                add(tesla);
                add(amazon);
                add(apple);
                add(toyota);
            }
        };

        Collections.sort(companies);
        System.out.println("Companies sorted by market cap. Biggest market cap goes first.");
        System.out.println(companies);

        Comparator<Company> companyComparator = new ComparatorImplementation();

        Collections.sort(companies, companyComparator);
        System.out.println("Companies sorted by p/E ratio. Lowest p/E goes first.");
        System.out.println(companies);


    }
}
