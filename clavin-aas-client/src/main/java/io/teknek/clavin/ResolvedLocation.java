package io.teknek.clavin;

public class ResolvedLocation {
  private Geoname geoname;
  
  public ResolvedLocation(){
    
  }

  public Geoname getGeoname() {
    return geoname;
  }

  public void setGeoname(Geoname geoname) {
    this.geoname = geoname;
  }

  @Override
  public String toString() {
    return "ResolvedLocation [geoname=" + geoname + "]";
  }
  
}
