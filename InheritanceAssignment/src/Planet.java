import java.util.ArrayList;
import java.util.List;

public class Planet {
    private int orbitTime;
    private ArrayList<Moon> moons;
    private String designation;

    public Planet() {
        this.orbitTime = orbitTime;
        this.moons = moons;
        this.designation = designation;
    }

    public Planet(int orbitTime, String designation) {
        this.orbitTime = orbitTime;
        this.moons = moons;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void addMoon(Moon obj){
        this.moons.add(obj);
    }

    public List<Moon> getMoons() {
        return moons;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof GasPlanet){
            GasPlanet other = (GasPlanet) obj;
            if(this.designation == other.getDesignation()){
                return true;
            }
        }
        else if(obj instanceof RockPlanet){
            RockPlanet other = (RockPlanet) obj;
            if(this.designation == other.getDesignation()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Orbit: " + orbitTime + "  Designation: " + designation;
    }








}
