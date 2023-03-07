import java.awt.*;

public class Client extends Checkin{

    private int ID;

    public Client(String FName, String SName, int RegNo, String Checkin, int RoomNo, int Numofpersons,int ID ){
        super(FName, SName, RegNo, Checkin, RoomNo, Numofpersons);
        this.ID=ID;
    }


    public void ShowClientDetails(){
        System.out.println("The id is : " + ID );
    }
}
