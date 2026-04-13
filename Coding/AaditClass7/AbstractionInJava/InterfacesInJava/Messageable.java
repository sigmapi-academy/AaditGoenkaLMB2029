package AbstractionInJava.InterfacesInJava;


/**
 * Write a description of interface DisplayableMessage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Messageable
{
    void msg();
    
    //Nested interface
    interface PrintableMessage{
        void msg();
        void printMsg();
    }
}