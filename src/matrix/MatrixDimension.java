package matrix;

import exception.*;

public class MatrixDimension {

    private int width;
    private int height;

    //The constructor public MatrixDimension (int [] [] matrix) should check the content of the
    //transferred variable matrix to a mathematically correct matrix. If the check does not detect
    //any errors, the dimensions width (number of columns) and height (number of rows) of the
    //matrix should be stored in the variables width and height.
    public MatrixDimension (int[][] matrix)
            throws  exception.InvalidMatrixException,
                    exception.MatrixNotInitializedException
    {
        //MatrixNotInitializedException: The matrix itself or a row is not initialized (null)
        if(matrix==null)
        {
            throw new MatrixNotInitializedException();
        }
        //Invalid Matrix Exception: A row has no columns, the matrix is ​​not rectangular,
        //that is, not all rows contain the same number of columns, or the matrix has no rows.
        if(matrix.length==0)
        {
            throw new InvalidMatrixException();
        }
        //MatrixNotInitializedException: The matrix itself or a row is not initialized (null)
        for (int[] aMatrix : matrix) {
            if (aMatrix == null) {
                throw new MatrixNotInitializedException ();
            }
        }
        //Invalid Matrix Exception: A row has no columns, the matrix is ​​not rectangular,
        //that is, not all rows contain the same number of columns, or the matrix has no rows.
        for(int i=1; i<matrix.length; i++)
        {
            if(matrix[i].length!=matrix[i-1].length)
                throw new InvalidMatrixException();
        }

        height = matrix.length;
        width  = matrix[0].length;
    }
    //The class should contain the attributes private int width and private int height.
    //Read access to the variables by other classes is through the public getter methods
    //int getWidth () and int getHeight ().
    public int getWidth(){
        return  width;
    }
    public int getHeight(){
        return  height;
    }
}
