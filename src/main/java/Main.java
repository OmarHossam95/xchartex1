import java.util.List;

public class Main {
    public static void main(String[] args){
        try {
            List<TitanicPassenger> allPassengers = PassengerListCreator.getPassengersFromJsonFile();

            Operations.graphPassengerAges(allPassengers);
            Operations.graphPassengerClass(allPassengers);
            Operations.graphPassengerSurvived(allPassengers);
            Operations.graphPassengerSurvivedGender(allPassengers);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
