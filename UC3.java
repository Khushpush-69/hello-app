public class UC3 {
    public static void main(String[] args) {

        // Using String.join(" ", ...) for each banner line
        System.out.println(String.join(" ", " * ", "  * ", "     *** ", "   *** "));
        System.out.println(String.join(" ", "*   ", "    * ", "   *      ", "*    "));
        System.out.println(String.join(" ", "*   ", "    *  ", "  *      ", "*    "));
        System.out.println(String.join(" ", "*   ", "    *  ", "  ** ", "     ** "));
        System.out.println(String.join(" ", "*   ", "    *  ", "  *      ", "     **  "));
        System.out.println(String.join(" ", "*   ", "    * ", "   *      ", "     **   "));
        System.out.println(String.join(" ", " * ", "  *  ", "    *", "      ** "));
    }
}
