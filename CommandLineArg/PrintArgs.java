package CommandLineArg;

public class PrintArgs {
    public static void main(String[] args) {
        System.out.println("No Of Arguments... " + args.length);
        for(String s : args)
            System.out.println(s);
    }
}
