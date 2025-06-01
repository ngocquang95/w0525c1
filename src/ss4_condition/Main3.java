package ss4_condition;

public class Main3 {
    public static void main(String[] args) {
        // day = 2 => Thứ 2
        // day = 3 => Thứ 3
        // day = 4 => Thứ 4
        int day = 3;

        switch (day) {
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break; // Thoát khỏi khối switch
            case 4:
                System.out.println("Thứ 4");
                break;
            case 5:
                System.out.println("Thứ 5");
                break;
            case 6:
                System.out.println("Thứ 6");
                break;
            default:
                System.out.println("Cuối tuần");
        }

        switch (day) {
            case 2 -> System.out.println("Thứ 2");
            case 3 -> System.out.println("Thứ 3");
            // Thoát khỏi khối switch
            case 4 -> System.out.println("Thứ 4");
            case 5 -> System.out.println("Thứ 5");
            case 6 -> System.out.println("Thứ 6");
            default -> System.out.println("Cuối tuần");
        }
    }
}
