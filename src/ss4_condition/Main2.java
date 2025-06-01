package ss4_condition;

public class Main2 {
    public static void main(String[] args) {
        /*
        Điểm < 4: Rớt môn
        Điểm >= 4 và điểm < 6: Trung bình
        Điểm >= 6 và điểm < 8: Khá
        Điểm >= 8 và điểm <= 10: Giỏi
         */
        // Cách 1: Thiếu nhi
//        double score = 5;
//
//        if (score < 4) {
//            System.out.println("Rớt môn!");
//        }
//
//        if (score >= 4 && score < 6) {
//            System.out.println("Trung bình!");
//        }
//
//        if (score >= 6 && score < 8) {
//            System.out.println("Khá!");
//        }
//
//        if (score >= 8 && score <= 10) {
//            System.out.println("Giỏi!");
//        }

        // Cách 2
//        double score = 5;
//
//        if (score < 4) {
//            System.out.println("Rớt môn!");
//        } else if (score >= 4 && score < 6) {
//            System.out.println("Trung bình!");
//        } else if (score >= 6 && score < 8) {
//            System.out.println("Khá!");
//        } else if (score >= 8 && score <= 10) {
//            System.out.println("Giỏi!");
//        }
//        System.out.println("Chương trình kết thúc");

        // Cách 3
        double score = 11; // Kiểm tra điểm hợp lệ

        if(score < 0 || score > 10) {
            System.out.println("Điểm không hợp lệ, xin kiểm tra lại!");
        } else if (score < 4) {
            System.out.println("Rớt môn!");
        } else if (score < 6) {
            System.out.println("Trung bình!");
        } else if (score < 8) {
            System.out.println("Khá!");
        } else {
            System.out.println("Giỏi!");
        }
        System.out.println("Chương trình kết thúc");
    }
}
