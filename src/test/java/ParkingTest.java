import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ParkingTest {

    @DisplayName("Parking in a lot between 1 and 3 a.m.")
    @Test
    void ReceiveTicketParking1to3AM () {
        boolean getTicket = Parking.getParkingTicket(true, 230);
        boolean secondTicket = Parking.getParkingTicket(false, 105);
        boolean resultTicket = getTicket && secondTicket;
        assertTrue(resultTicket);
    }

    @DisplayName("Parking without a permit between 7 a.m. and 5 p.m.")
    @Test
    void ReceiveTicketWhenParkingWithoutPermit7to5 () {
        boolean getTicket = Parking.getParkingTicket(false, 730);
        boolean secondTicket = Parking.getParkingTicket(false, 1550);
        boolean resultTicket = getTicket && secondTicket;
        assertTrue(resultTicket);
    }

    @DisplayName("Parking with a permit between 7 a.m. and 5 p.m.")
    @Test
    void NoTicketWhenParkingWithPermit7to5 () {
        boolean getTicket = Parking.getParkingTicket(true, 915);
        boolean secondTicket = Parking.getParkingTicket(true, 1321);
        boolean resultTicket = getTicket && secondTicket;
        assertFalse(resultTicket);
    }

    @DisplayName("Parking without a permit 5 p.m. to 7 a.m.")
    @Test
    void NoTicketWhenParkingWithoutPermit5PMto7AMExcluding1to3AM () {
        boolean getTicket = Parking.getParkingTicket(false, 550);
        boolean secondTicket = Parking.getParkingTicket(false, 1710);
        boolean resultTicket = getTicket && secondTicket;
        assertFalse(resultTicket);
    }
}