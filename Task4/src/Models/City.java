package Models;

public class City {
    private int cid;
    private String name;
    private String countryCode;
    private String district;
    private int population;

    public City(int cid, String name, String countryCode, String district, int population) {
        this.cid = cid;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(cid + " " + name + "\n");
        sb.append("\t Country: " + countryCode + "\n");
        sb.append("\t District: " + district + "\n");
        sb.append("\t Population: " + population + "\n");
        return sb.toString();
    }
}
