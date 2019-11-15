package RandomMethods;

// Method take given array and make columns with two-dimension array by given values
// Each value in a row is single stripe
// Return the number of stripes created by given array

class CountStripes
{
    public int countStripes(int[] array) {
        int maxValueOfTable = findMaxValueOfArray(array);
        int[][] matrix = createMatrixOfValues(array, maxValueOfTable);

        return countBeltsInMatrix(array, maxValueOfTable, matrix);
    }

    private int countBeltsInMatrix(int[] A, int maxValueOfTable, int[][] matrix) {
        int countBelts = 0;
        for (int i = 0; i < maxValueOfTable; i++) {
            countBelts += countBeltsInRow(A, matrix, i);
        }

        return countBelts;
    }

    private int countBeltsInRow(int[] array, int[][] matrix, int i) {
        int countBelts = 0;
        boolean wasBelt = false;
        for (int j = 0; j < array.length; j++) {
            if (matrix[j][i] == 1 && !wasBelt) {
                countBelts++;
                wasBelt = true;
            } else if (wasBelt && matrix[j][i] == 0) {
                wasBelt = false;
            }
        }
        return countBelts;
    }

    private int[][] createMatrixOfValues(int[] array, int maxValueOfTable) {
        int[][] matrix = new int[array.length][maxValueOfTable];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    private int findMaxValueOfArray(int[] array) {
        int maxValueOfTable = 0;
        for (int num : array) {
            if (num > maxValueOfTable) {
                maxValueOfTable = num;
            }
        }
        return maxValueOfTable;
    }
}

