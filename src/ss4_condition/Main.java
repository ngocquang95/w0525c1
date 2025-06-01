package ss4_condition;

public class Main {
    public static void main(String[] args) {
        /*
        Điểm < 4: Rớt môn
        Điểm >= 4: Qua môn
         */


        double score = 5;

        if (score < 4) {
            System.out.println("Rớt môn!");
        } else {
            System.out.println("Qua môn!");
        }

        System.out.println("Chương trình kết thúc");
    }
}
