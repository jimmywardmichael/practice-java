public class ControlFlowExercisesLec {
    public static void main(String[] args) {
        int caseSwitch = 3;
        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }
//        int i = 0;
//        while(i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }
//        for(int a = 0; a < 10; a += 1){
//            System.out.println("i is " + a);
//        }
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        //end of for loop
        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }
    }
}

