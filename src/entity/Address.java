package entity;

import java.util.UUID;

public class Address {
    private UUID id;
    private String home;
    private String street;
    private District district;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", home='" + home + '\'' +
                ", street='" + street + '\'' +
                ", district=" + district +
                '}';
    }

    public Address() {
    }

    public Address(UUID id, String home, String street, District district) {
        this.id = id;
        this.home = home;
        this.street = street;
        this.district = district;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
