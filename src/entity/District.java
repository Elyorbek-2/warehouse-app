package entity;

public class District {
    private Integer id;
    private Region region;

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", region=" + region +
                '}';
    }

    public District() {
    }

    public District(Integer id, Region region) {
        this.id = id;
        this.region = region;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
