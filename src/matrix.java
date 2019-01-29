public class matrix
{
    public static double sumMajorDiagonal(double[][] matrix)
    {
        if (matrix.length != matrix[0].length)
        {
            return Integer.MIN_VALUE;
        }

        else
        {
            double sum = 0;
            for (int i = 0; i < matrix.length; i++)
            {
                sum += matrix[i][i];
            }

            return sum;
        }
    }

    public static double sumMinorDiagonal(double[][] matrix)
    {
        if (matrix.length != matrix[0].length)
        {
            return Integer.MIN_VALUE;
        }

        else
        {
            double sum = 0;

            int c = matrix[0].length;
            for (int r = 0; r < matrix.length; r++)
            {
                c--;
                sum += matrix[r][c];
            }

            return sum;
        }
    }

    public static double[][] transpose(double[][] matrix)
    {
        double[][] newMatrix = new double[matrix[0].length][matrix.length];

        for (int r = 0; r < matrix.length; r++)
        {
            for (int c = 0; c < matrix[0].length; c++)
            {
                newMatrix[c][r] = matrix[r][c];
            }
        }

        return newMatrix;
    }

    //public static boolean isMatrix(double[][] matrix)
    {

    }
}
