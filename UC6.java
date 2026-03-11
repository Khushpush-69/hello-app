public class UC6 {

    // Static method for O
    public static String[] buildO() {
        return new String[]{
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        };
    }

    // Static method for P
    public static String[] buildP() {
        return new String[]{
            "*****  ",
            "*    * ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Static method for S
    public static String[] buildS() {
        return new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[][] banner = {
            buildO(),
            buildO(),
            buildP(),
            buildS()
        };

        // Print banner row by row
        for (int i = 0; i < banner[0].length; i++) {
            for (int j = 0; j < banner.length; j++) {
                System.out.print(banner[j][i] + "  ");
            }
            System.out.println();
        }
    }
}