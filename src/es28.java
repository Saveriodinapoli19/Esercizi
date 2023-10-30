public class es28 {
        public static void main (String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6}
            };
            System.out.println("prima matrice:");
           matrice3(matrix);
            int[][] matrice1 = matrice2(matrix);

            System.out.println("matrice finale:");
            matrice3(matrice1);
        }
        public static int[][] matrice2(int[][] matrix) {
            int y = matrix.length;
            int x = matrix[0].length;
            int[][] matrice1 = new int[x][y];

            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    matrice1[j][i] = matrix[i][j];
                }
            }
            return matrice1;
        }
        public static void matrice3(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

