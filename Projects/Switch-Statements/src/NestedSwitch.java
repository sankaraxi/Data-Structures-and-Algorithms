import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();
//        switch (empID){
//            case 1:
//                System.out.println("Sankar Gnanasekar");
//                break;
//            case 2:
//                System.out.println("Sankar K G");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "AI":
//                        System.out.println("AI&DS Department");
//                }break;
//            default:
//                System.out.println("Invalid Employee ID");
//        }
        switch (empID) {
            case 1 -> System.out.println("Sankar Gnanasekar");
            case 2 -> {
                System.out.println("Sankar K G");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "AI" -> System.out.println("AI&DS Department");
                }
            }
            default -> System.out.println("Invalid Employee ID");
        }
    }
}
