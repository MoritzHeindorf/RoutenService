package routing.rest.endpoint;

import org.junit.Test;
import routing.rest.call.services.classes.Station;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by FBeck on 09.11.2016.
 */
public class RoutingTest {
    @Test
    public void orderStations() throws Exception {
        Routing routing = new Routing(null,null,null);

        Station station1 = new Station();
        station1.setName("1");
        station1.setLatitude(50.0);
        station1.setLongitude(50.0);
        Station station2 = new Station();
        station2.setName("2");
        station2.setLatitude(51.0);
        station2.setLongitude(51.0);

        List stationList = new ArrayList();
        stationList.add(station2);
        stationList.add(station1);

        List orderedStations = routing.orderStations(stationList,49.0,49.0);

        List rightStationsList = new ArrayList();
        rightStationsList.add(station1);
        rightStationsList.add(station2);

        assertEquals(rightStationsList,orderedStations);
    }

}