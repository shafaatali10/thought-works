package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CleaningServiceTest {

    @Test
    void cleanRoom1() throws Exception {

        String initialPosition = "1, 2, N";
        String coordinates[] = initialPosition.split(", ");

        int x=Integer.valueOf(coordinates[0]);
        int y=Integer.valueOf(coordinates[1]);
        String face=coordinates[2];

        String room1Commands[] = {"L", "M", "L", "M", "L", "M", "L", "M", "M"};

        String expected = "1, 3, N";


        CleaningService service = new CleaningService();
        String finalPosition = service.cleanRoom(x, y, face, room1Commands);

        assertEquals(expected, finalPosition);

    }

    @Test
    void cleanRoom2() throws Exception {
        String initialPosition = "3, 5, N";
        String coordinates[] = initialPosition.split(", ");

        int x=Integer.valueOf(coordinates[0]);
        int y=Integer.valueOf(coordinates[1]);
        String face=coordinates[2];

        String room1Commands[] = {"M", "L", "M"};

        String expected = "2, 5, W";


        CleaningService service = new CleaningService();
        String finalPosition = service.cleanRoom(x, y, face, room1Commands);

        assertEquals(expected, finalPosition);
    }
}