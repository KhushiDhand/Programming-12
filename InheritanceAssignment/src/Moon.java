public class Moon {
    private Planet planet;
    private boolean atmosphere;
    private int orbitTime;
    private String designation;

    public Moon(Planet planet, boolean atmosphere, int orbitTime, String designation) {
        this.planet = planet;
        this.atmosphere = atmosphere;
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public Planet getPlanet() {
        return planet;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

   @Override
    public boolean equals(Object obj) {
        if(obj instanceof Moon){
            Moon other = (Moon) obj;
            if(this.designation == other.designation){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Planet: " + planet + "  Atmosphere: " + atmosphere + "  Orbit Time: " + orbitTime +
                "  Designation: " + designation;
    }







}
