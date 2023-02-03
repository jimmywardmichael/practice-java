public class ControlFlowExercises {
    public static int main(String[] args) {
        int i = 5;
        while(i <= 15){
            System.out.println(i);
            i++;
        }
        int count = 2;
        while(count <= 100){
           return count++;
        }
        return i;
    }
}
