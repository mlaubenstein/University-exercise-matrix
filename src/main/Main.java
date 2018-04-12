package main;

import matrix.MatrixTools;

public class Main {

        public static void main(String[] args) {

            int array[][] = MatrixTools.createMatrix(1,4);

            System.out.println("Matrix:");
            MatrixTools.printMatrix(array);
            System.out.println("");

            System.out.println("Transposed Matrix:");
            MatrixTools.printMatrix(MatrixTools.getTransposedMatrix(array));
            System.out.println ( "" );

            System.out.println("Spurmatrix:");
            System.out.println(MatrixTools.matrixSpur(array));
            System.out.println ( "" );

           /*
           System.out.println ( "Symetric:" );
           System.out.println ( MatrixTools.isSymmetric ( array ) );
           System.out.println ( "" );
            */

            /*
            System.out.println ( "MulMatrix:" );
            System.out.println ( MatrixTools.matrixMul ( array,array ) );
            System.out.println ( "" );
            */




        }

    }



