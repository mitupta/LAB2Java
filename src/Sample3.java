public class Sample3 {
    public static void main(String[] args) {
        int[][][] array = {{{1}, {1, 2, 3}}, {{1, 2}, {2}}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {

                    //System.out.println("i= " + i + " j= " + j + " k= " + k);
                    System.out.print("[" + i + "]");
                    System.out.print("[" + j + "]");
                    System.out.print("[" + k + "]");
                    System.out.print("->");
                    System.out.print(array[i][j][k] + "\n");

                }

            }
        }
    }
}





