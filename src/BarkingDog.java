public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
        if(barking != true) {
            System.out.println("the dog is not barking");
        } else if ((barking = true) && ((hourOfTheDay >= 0 && hourOfTheDay < 8) || (hourOfTheDay > 22 && hourOfTheDay < 24)))  {
            System.out.println("We need to wake up");
        } else {
            System.out.println("We are already up!");
        }
        return false;
    }
}
