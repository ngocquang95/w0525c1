package ss4_condition;

public class Main4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        // Tìm giá trị max
//        int max;
//        if(a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
        int max = a > b ? a : b;

        System.out.println("Max: " + max);
    }
}
