import java.util.Scanner;

public class Mian extends Checkin {


    private int ID;

    public Mian(String FName, String SName, int RegNo, String Checkin, int RoomNo, int Numofpersons,int ID ) {
        super(FName, SName, RegNo, Checkin, RoomNo, Numofpersons);
        this.ID=ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name ");
        String FName = input.next();

        System.out.println("Enter second name ");
        String SName = input.next();

        System.out.println("Enter Registration Number ");
        int RegNo = input.nextInt();

        System.out.println("Enter Checkin date ");
        String Checkin = input.next();

        System.out.println("Enter Room number ");
        int RoomNo = input.nextInt();

        System.out.println("Enter number of people ");
        int Numofpersons = input.nextInt();

        System.out.println("Enter ID ");
        int ID = input.nextInt();

        Mian main1 = new Mian(FName, SName, RegNo, Checkin, RoomNo, Numofpersons,ID );

        // Use the getter methods to access the values entered by the user
        System.out.println("First name: " + main1.getFName());
        System.out.println("Last name: " + main1.getSName());
        System.out.println("Registration Number: " + main1.getRegNo());
        System.out.println("Checkin date: " + main1.getCheckin());
        System.out.println("Room number: " + main1.getRoomNo());
        System.out.println("Number of people: " + main1.getNumofpersons());
        System.out.println("ID: " + main1.getID());


    }
}
