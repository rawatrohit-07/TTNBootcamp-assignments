package org.example;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.RealMatrix;

public class Math {

    public static void printEigenValues() {
        double[][] data = {
                {4, 1},
                {1, 3}
        };

        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition eigen = new EigenDecomposition(matrix);

        System.out.println("Eigenvalue 1: " + eigen.getRealEigenvalue(0));
        System.out.println("Eigenvalue 2: " + eigen.getRealEigenvalue(1));
    }
}
