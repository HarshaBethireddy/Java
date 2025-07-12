package CommandLineArg;

public class ReverseArgs {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder(args[0]);
        System.out.println(res.reverse().toString());
    }
}
