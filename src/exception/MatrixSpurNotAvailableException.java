package exception;

public class MatrixSpurNotAvailableException extends Exception{

    private static final String errMsg="Spur not avaible";

    public MatrixSpurNotAvailableException()
    {
        super(errMsg+"!");
    }

    public MatrixSpurNotAvailableException(String str)
    {
        super(errMsg+" because "+ str);
    }
}
