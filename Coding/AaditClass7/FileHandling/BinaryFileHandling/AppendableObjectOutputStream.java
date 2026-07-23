package FileHandling.BinaryFileHandling;
import java.io.*;


/**
 * Write a description of class AppendableObjectOutputStream here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppendableObjectOutputStream extends ObjectOutputStream
{
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    
    @Override
    protected void writeStreamHeader() throws IOException{
        reset(); //Do not write a new header
    }
}