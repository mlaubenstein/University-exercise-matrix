package exception;

public class MatricesNotMultipliableException extends Exception {

    private static final String errMsg="Matrices are not multipliable ";

    public MatricesNotMultipliableException()
    {
        super(errMsg+"!");
    }

    public MatricesNotMultipliableException(String str)
    {
        super(errMsg+" because "+ str);
    }
}
