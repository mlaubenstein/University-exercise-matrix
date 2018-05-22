package exception;

public class MatrixNotInitializedException extends Exception {

    private static final String errMsg="Matrix is not initialized";

    public MatrixNotInitializedException()
    {
        super(errMsg+"!");
    }

    public MatrixNotInitializedException(String str)
    {
        super(errMsg+" because "+ str);
    }
}
