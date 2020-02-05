package id.ac.poliban.mi.maya.customlistview;

public class Country {
    private String flag;
    private String countryName;
    private String countryDetails;

    public Country(String flag, String countryName, String countryDetails) {
        this.flag = flag;
        this.countryName = countryName;
        this.countryDetails = countryDetails;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryDetails() {
        return countryDetails;
    }

    public void setCountryDetails(String countryDetails) {
        this.countryDetails = countryDetails;
    }

    @Override
    public String toString() {
        return String.format("%30s", getCountryName());
    }
}
