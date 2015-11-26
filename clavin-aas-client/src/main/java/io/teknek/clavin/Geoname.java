package io.teknek.clavin;

public class Geoname {
  private String name;

  private Geoname parent;

  private Double latitude;

  private Double longitude;

  private String primaryCountryCode;

  private String primaryCountry;

  public Geoname() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Geoname getParent() {
    return parent;
  }

  public void setParent(Geoname parent) {
    this.parent = parent;
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public String getPrimaryCountryCode() {
    return primaryCountryCode;
  }

  public void setPrimaryCountryCode(String primaryCountryCode) {
    this.primaryCountryCode = primaryCountryCode;
  }

  public String getPrimaryCountry() {
    return primaryCountry;
  }

  public void setPrimaryCountry(String primaryCountry) {
    this.primaryCountry = primaryCountry;
  }

  @Override
  public String toString() {
    return "Geoname [name=" + name + ", parent=" + parent + ", latitude=" + latitude
            + ", longitude=" + longitude + ", primaryCountryCode=" + primaryCountryCode
            + ", primaryCountry=" + primaryCountry + "]";
  }

}
