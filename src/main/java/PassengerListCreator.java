import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PassengerListCreator {
    public static List<TitanicPassenger> getPassengersFromJsonFile() throws Exception{
        List<TitanicPassenger> allPassengers = new ArrayList<TitanicPassenger>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        InputStream input = new FileInputStream("titanic_csv.json");

        allPassengers = objectMapper.readValue(input, new TypeReference<List<TitanicPassenger>>(){});
        return allPassengers;
    }
}
