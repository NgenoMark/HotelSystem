public class Main {

    public static void main(String[] args) {

        Checkin version1 = new Checkin("Jane", "Smith", 456, "2022-03-08", 102, 2);
        version1.ShowCheckinDetails();

        Client version2 = new Client("Jane", "Smith", 456, "2022-03-08", 102, 2,8);
        version2.ShowClientDetails();

    }
}
