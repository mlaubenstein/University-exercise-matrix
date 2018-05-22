package exception;

public class InvalidMatrixException extends Exception {

    private static final String errMsg="Matrix is not valid";

    public InvalidMatrixException()
    {
        super(errMsg+"!");
    }

    public InvalidMatrixException(String str)
    {
        super(errMsg+" because "+ str);
    }
}
