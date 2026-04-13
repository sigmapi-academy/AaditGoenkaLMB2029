package Aggregation;

/**
 * Write a description of class Name here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Name {
    private String fName, mName, sName;

    public Name() {

    }

    /**
     * @param fName
     * @param mName
     * @param sName
     */
    public Name(String fName, String mName, String sName) {
        super();
        this.fName = fName;
        this.mName = mName;
        this.sName = sName;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the mName
     */
    public String getmName() {
        return mName;
    }

    /**
     * @param mName the mName to set
     */
    public void setmName(String mName) {
        this.mName = mName;
    }

    /**
     * @return the sName
     */
    public String getsName() {
        return sName;
    }

    /**
     * @param sName the sName to set
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Name [fName=" + fName + ", mName=" + mName + ", sName=" + sName + "]";
    }
}
