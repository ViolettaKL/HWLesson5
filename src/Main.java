import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Task 1
        Scanner month = new Scanner(System.in);
        System.out.println("Enter month number: " );
        int monthNumber = month.nextInt();

        String autumn = "Autumn";
        String winter = "Winter";
        String spring = "Spring";
        String summer = "Summer";

        if (monthNumber <= 2 || monthNumber == 12) {
            System.out.println(winter);
            }
            else if (monthNumber >= 3 & monthNumber <= 5 ) {
                System.out.println(spring);
            } else if (monthNumber >= 6 & monthNumber <= 8) {
                System.out.println(summer);
            } else if(monthNumber >= 9 & monthNumber <= 11 ){
                System.out.println(autumn);
            } else {
            System.out.println("Invalid month number");
            }


        // Task 2
        String[] MusicArtists;
        MusicArtists = new String[5];
        MusicArtists[0] = "Hollywood Undead";
        MusicArtists[1] = "Gabriel Saban";
        MusicArtists[2] = "Deftones";
        MusicArtists[3] = "Bring Me The Horizon";
        MusicArtists[4] = "Three Days Grace";

        //Task 3

        int[] myArray = new int[3];
        int[] myFirstArray = {1,2};
        int[] mySecondArray = {3,4};
        int[] myThirdArray = {5,6};

        System.out.println(myFirstArray[0] +" "+ myFirstArray[1]);
        System.out.println(mySecondArray[0] +" "+ mySecondArray[1]);
        System.out.println(myThirdArray[0] +" "+ myThirdArray[1]);

        //Task 4
//
        Phone phone1 = new Phone("111111", "Honor", 67.7);
        Phone phone2 = new Phone("222222", "Apple", 72.4);

        phone1.getModelPhone();
        phone2.getModelPhone();

        phone1.CallPhoneNumber();
    }
}