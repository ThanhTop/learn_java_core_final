public class Main {
    public static void main(String[] args) {
        int a = 10;
        Integer b = new Integer(10);
        int e = 10;
//        System.out.println(a.equals(b));
//        String c = new String("abc");
//        String d = new String("abc");
//        String e = "abc";
        System.out.println(a == b);

        String c = "abc";
        String d = new String("abc");
        String f = new String("abc");
        System.out.println(c == f);
    }
}
