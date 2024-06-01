package OOP;

public class CountryPractise {
    public static void main(String[] args) {
        // VYTVORTE 2 ZEME, VYPISTE, KTERÁ MA VÍC OBYVATEL
        CountryPractise a = new CountryPractise("Australia",7741220.00, 18886000, "AUS");
        CountryPractise c = new CountryPractise("Canada", 1998500.00,239500000,"CA");
        if (a.population > c.population){
            System.out.println(a.name);
        }else{
            System.out.println(c.name);
        }

    }


        private String name;
        private double area;
        private int population;
        private String countryCode;

        public CountryPractise(String name, double area, int population, String countryCode) {
            this.name = name;
            this.area = area;
            this.population = population;
            this.countryCode = countryCode;
        }
        public String getName() {
            return name;
        }
        public double getArea() {
            return area;
        }
        public int getPopulation() {
            return population;
        }
        public String getCountryCode() {
            return countryCode;
        }
        public void setArea(double area) {
            if (area < 0) {
                System.out.println("Neni mozne");
                return;
            }
            this.area = area;
        }
        public void setPopulation(int population) {
            if (population < 0) {
                System.out.println("Neni mozne");
                return;
            }
            this.population = population;
        }
        public void setCountryCode(String countryCode) {
            if (countryCode.length() > 3) {
                System.out.println("Zkratka je moc dlouha");
                return;
            }
            this.countryCode = countryCode;
        }

}
