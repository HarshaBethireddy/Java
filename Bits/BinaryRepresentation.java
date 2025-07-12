package Bits;

public class BinaryRepresentation {

    static void getBinaryRepresentation(int num){
        for(int i=32; i>=0; i--){
            System.out.print( (num >> i) & 1);
        }
    }
    public static void main(String[] args) {
        int num = 4;
        getBinaryRepresentation(num);
    }
}
