public class Company implements Comparable<Company> {
    private String name;
    private double marketCap;
    private double pE;

    public Company(String name, double marketCap, double pE) {
        this.name = name;
        this.marketCap = marketCap;
        this.pE = pE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public double getpE() {
        return pE;
    }

    public void setpE(double pE) {
        this.pE = pE;
    }

    @Override
    public int compareTo(Company company) {
        if (this.getMarketCap() < company.getMarketCap()) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", marketCap=" + marketCap +
                ", pE=" + pE +
                '}';
    }
}
