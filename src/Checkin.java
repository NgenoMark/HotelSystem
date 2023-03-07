public class Checkin {
    private String FName;
    private String SName;
    private int RegNo;
    private String Checkin;
    private  int RoomNo;
    private  int Numofpersons;


    public Checkin(String FName, String SName, int RegNo, String Checkin, int RoomNo, int Numofpersons){
        this.FName = FName;
        this.SName=SName;
        this.RegNo=RegNo;
        this.Checkin=Checkin;
        this.RoomNo=RoomNo;
        this.Numofpersons=Numofpersons;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public void setRegNo(int regNo) {
        RegNo = regNo;
    }

    public void setCheckin(String checkin) {
        Checkin = checkin;
    }

    public void setRoomNo(int roomNo) {
        RoomNo = roomNo;
    }

    public void setNumofpersons(int numofpersons) {
        Numofpersons = numofpersons;
    }


    public String getFName() {
        return FName;
    }

    public String getSName() {
        return SName;
    }

    public int getRegNo() {
        return RegNo;
    }

    public String getCheckin() {
        return Checkin;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public int getNumofpersons() {
        return Numofpersons;
    }


    public void ShowCheckinDetails(){
        System.out.println("Fname is "+ FName +
                "Second name is "+ SName+
                "RegNo is "+ RegNo+
                "Checkin date is "+ Checkin+
                "Room number is "+RoomNo+
                "Number of persons is "+Numofpersons);
    }
}
