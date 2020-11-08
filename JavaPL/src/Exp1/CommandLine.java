
class CommandLine {

    public static void main(String a[]) {
        if (a.length > 0) {
            for (String val : a) {
                System.out.println(val);
            }
        } else {
            System.out.println("no command line args");
        }
    }
}
