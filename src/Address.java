public class Address {
    public String province;
    public String district;
    public String commune;
    public int houseNumber;

    public Address() {
    }

    public Address(String province, String district, String commune, int houseNumber) {
        this.province = province;
        this.district = district;
        this.commune = commune;
        this.houseNumber = houseNumber;
    }
}
