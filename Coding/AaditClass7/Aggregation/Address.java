package Aggregation;

/**
 * Write a description of class Address here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Address {
    private String streetName, pincode, state, cityOrVillage;
    private String houseNameOrBuildingName;
    public Address(){} //default constructor
    /**
     * @param streetName
     * @param pincode
     * @param state
     * @param cityOrVillage
     * @param houseNameOrBuildingName
     */
    public Address(String streetName, String pincode, String state, String cityOrVillage,
    String houseNameOrBuildingName) {
        super();
        this.streetName = streetName;
        this.pincode = pincode;
        this.state = state;
        this.cityOrVillage = cityOrVillage;
        this.houseNameOrBuildingName = houseNameOrBuildingName;
    }

    /**
     * @return the streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName the streetName to set
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * @return the pincode
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * @param pincode the pincode to set
     */
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the cityOrVillage
     */
    public String getCityOrVillage() {
        return cityOrVillage;
    }

    /**
     * @param cityOrVillage the cityOrVillage to set
     */
    public void setCityOrVillage(String cityOrVillage) {
        this.cityOrVillage = cityOrVillage;
    }

    /**
     * @return the houseNameOrBuildingName
     */
    public String getHouseNameOrBuildingName() {
        return houseNameOrBuildingName;
    }

    /**
     * @param houseNameOrBuildingName the houseNameOrBuildingName to set
     */
    public void setHouseNameOrBuildingName(String houseNameOrBuildingName) {
        this.houseNameOrBuildingName = houseNameOrBuildingName;
    }

    @Override
    public String toString() {
        return "Address [streetName=" + streetName + ","
        + " pincode=" + pincode + ", state=" + state +
        ", cityOrVillage=" + cityOrVillage + 
        ", houseNameOrBuildingName=" + houseNameOrBuildingName + "]";
    }	
}
