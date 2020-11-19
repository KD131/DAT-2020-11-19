import Persistent.CityManager;

public class Main {
    public static void main(String[] args) {
        CityManager cm = new CityManager();

        // counts all cities in database and prints
        cm.countCities();

        // prints cities with population above 5 million and adds to list.
        cm.cities5Mil();

        // prints contents of said list.
        cm.printCities();
    }
}
