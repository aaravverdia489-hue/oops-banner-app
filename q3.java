public class Main {
    public static void main(String[] args) {

        String line1 = "*  *   ***   ***   *** ";
        String line2 = "*  *  *   *  *  *  *   *";
        String line3 = "*  *  *   *  *  *  *   *";
        String line4 = "*  *  *   *  ***   *** ";
        String line5 = "*  *  *   *  *     *  ";
        String line6 = "*  *  *   *  *     *   ";
        String line7 = " **     ***   *      *** ";

        String result = String.join("\n",
                line1, line2, line3, line4,
                line5, line6, line7);

        System.out.println(result);
    }
}