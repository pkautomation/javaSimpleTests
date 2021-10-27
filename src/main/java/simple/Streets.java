package simple;

public class Streets {
    static String[] streets = { "1 st Street", "2 nd Street", "3 rd Street", "4 th Street"};

    public static String rideTo(int pos) {
        try {
            return streets[pos] + "is";
        } catch (ArrayIndexOutOfBoundsException abe) {
            System.out.print("not");
            return "";
        } finally {
            System.out.print("in our neighbourhood");
        }
    }

    public static void main(String[] arg) {
        System.out.println(Streets.rideTo(4));
    }
}

