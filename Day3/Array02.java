package Day3;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2},{3,4},{5,6}};
        System.out.println(Arrays.deepToString(a));
          //[[1, 2], [3, 4], [5, 6]]


                  for (int i = 0; i < a.length; i++) {
                      for (int j = 0; j < a[i].length; j++) {
                          System.out.println(a[i][j]);
                         //                1
                         //                2
                         //                3
                         //                4
                         //                5
                         //                6
            }

        }
    }
}
