import javax.sound.midi.SysexMessage;

public class matrixTest
{
    public static void main(String[] args)
    {
        double[][] mat1 = new double[4][3];
        mat1[0][0] = 5; mat1[0][1] = 3; mat1[0][2] = 2;
        mat1[1][0] = 7; mat1[1][1] = 4; mat1[1][2] = 1;
        mat1[2][0] = 9; mat1[2][1] = 6; mat1[2][2] = 8;
        mat1[3][0] = 12; mat1[3][1] = 7; mat1[3][2] = 10;

        System.out.println(matrix.sumMajorDiagonal(mat1));
        System.out.println(matrix.sumMinorDiagonal(mat1));
        double[][] mat2 = matrix.transpose(mat1);
        toString(mat2);
    }

    public static void toString(double[][] matrix)
    {
        for (int r = 0; r < matrix.length; r++)
        {
            for (int c = 0; c < matrix[0].length; c++)
            {
                System.out.print(matrix[r][c] + ", ");
            }
            System.out.println();
        }
    }
}
