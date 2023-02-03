public class Syntax {
    public static void main(String[] args) {
        int myFavoriteNumber = 900;
        System.out.println(myFavoriteNumber);
        long myPreciseFavoriteNumber = myFavoriteNumber;
        System.out.println(myPreciseFavoriteNumber);
        String myString = "I am a string";
//        int notString = (int) myString; //doesnt work because you cannot cast a string into a int
//        long myNumber;
//        System.out.println(myNumber); lines 9 and 10 doesnt work because long has to have a value to initiate it
        long myNumber = 123L;
        System.out.println(myNumber);
    }
}
