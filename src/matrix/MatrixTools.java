package matrix;

import java.util.Arrays;

public class MatrixTools {
    /*
    The method generates and initializes a two-dimensional Array (matrix)
    of the type int [] []. The elements of the generated matrix should be
    initialized with chance figures between 1 and 10. Use for this Java to
    API function Math. random ().
    */
    public static int [] [] createMatrix(int m, int n) {

        int firstIndex,secondIndex;
        int[][] matrix;
        int max;

         /*
        zero in the mistake case, i. e. with inadmissible
        values of m or N
         */
        if (m < 1 || n < 1) return null;

        firstIndex = 0;
        secondIndex = 0;
        matrix = new int[m][n];
        max = 10;

        /*
        initialized Array (matrix) of the dimension m×n
        */
        for(int j = 0; j<m; j++) {
            matrix[j][firstIndex] = (int)(Math.random()*max+1);
            for(int i = 0; i<n; i++) {
                matrix[secondIndex][i] = (int)(Math.random()*max+1);
            }
            firstIndex++;
            secondIndex++;
        }
        return matrix;
    }

    /*
    The method should spend the handed over matrix in suitable form
    on the command line. The parametre is to be checked for zero
    references and to spend a space with appearance.
     */
    public static void printMatrix(int[][] m) {

        int column;
        int line;
        int secondIndex = 0;
        /*
        The parametre is to be checked for zero
        references and to spend a space with appearance.
        */
        if (m == null) return;
        for (int[] row : m) if (row == null) return;

        line = m.length;
        column = m[0].length;

        for ( int i = 0; i < line; i++ ) {
            for ( int j = 0; j < column; j++ ){
                System.out.print(m[secondIndex][j] + " ");
            }
            secondIndex++;
            System.out.println();
        }

    }

    /*
    The method has to do the transposed of the matrix
    handed over as a parametre calculate and return.
     */
    public static int[][] getTransposedMatrix(int[][] m) {

        int column;
        int line;
        /*
        the parametre matrix m is to be checked for zero
        references and the rectangle condition^1
        ⇒ with appearance is to be returned to zero
         */
        if (m == null) return null;
        for (int[] row : m) if (row == null) return null;

        line = m.length;
        column = m[0].length;

        for (int[] temp : m) {
            if (temp.length != column) return null;
        }

        int tmatrix[][] = new int[column][line];
        for (int i = 0; i < line; i++ ) {
            for (int j = 0; j < column; j++) {
                tmatrix[j][i] = m[i][j];
            }
        }
        return tmatrix;
    }

    /*
    The method isSymmetric () should check
    the handed over matrix for symmetry.
     */
    public static boolean isSymmetric(int[][] m) {

        int tempRowLength;
        /*
        if matrix does not fulfil m squarely, or rectangle condition 1 not,
        back gift worth = 0
         */
        if (m == null) return false;
        for (int[] row : m) if (row == null) return false;

        tempRowLength = m[0].length;
        /*
        true if symmetrically (rectangle condition1 fullly),
        otherwise false
         */
        for (int[] row : m) if (row.length != tempRowLength) return false;

        return Arrays.deepEquals(m, getTransposedMatrix(m));
    }

    /*
    The method should calculate the track of
    the matrix handed over as a parametre and return.
     */
    public static int matrixSpur(int[][] matrix) {
        int column;
        int line;
        int sum;

        /*
        if matrix does not fulfil m squarely,
        or rectangle-condition^ not, back gift
        worth = 0
         */
        if (matrix == null) return 0;
        for (int[] row : matrix) if (row == null) return 0;

        line = matrix.length;
        column = matrix[0].length;
        sum = 0;

        if (line != column) return 0;

        for (int[] temp : matrix)if (temp.length != column) return 0;

        for(int i=0; i<line; i++) sum += matrix[i][i];

        return sum;
    }

    /*
    The method should multiply both handed over matrixes
    and return the result matrix.
     */
    public static int[][] matrixMul(int[][] a, int[][] b) {

        int [][] mulmatrix;
        int linea;
        int columna;
        int columnb;
        /*
        in case of not multipliable matrixes, return value zero
         */
        if (a == null || b == null) return null;

        for (int[] row : a) if (row == null) return null;

        for (int[] row : b) if (row == null) return null;

        if(b.length != a[0].length) return null;
        else {
             linea = a.length;
             columna = a[0].length;
             columnb = b[0].length;

            mulmatrix = new int[linea][columnb];
            for (int i = 0; i < linea; i++) {
                for (int j = 0; j < columnb; j++) {
                    mulmatrix[i][j] = 0;
                    for (int k = 0; k < columna; k++) mulmatrix[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return mulmatrix;
    }
}  
	
