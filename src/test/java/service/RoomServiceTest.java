package service;

import com.shafaat.thoughtworks.common.ThoughtWorksConstants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomServiceTest {

//    @Test
    void intializeRoom() throws Exception {
        RoomService roomService = new RoomService();
        String expected = ThoughtWorksConstants.ROOM_ROWS+"x"+ThoughtWorksConstants.ROOM_COLUMNS;

        try{
            String actual = roomService.intializeRoom(0, 10);
            assertEquals(expected, actual, "Not properly initialized ::" + actual);
        }catch (Exception e){
            //fail(e.getMessage());
        }

    }

//    @Test
    void intializeRoomPostives() throws Exception {
        RoomService roomService = new RoomService();
        String expected = ThoughtWorksConstants.ROOM_ROWS+"x"+ThoughtWorksConstants.ROOM_COLUMNS;
        String actual = roomService.intializeRoom(10, 10);

        assertEquals(expected, actual, "Not properly initialized ::" + actual);
    }

    @Test
    void showRoomLayout() throws Exception {
        RoomService roomService = new RoomService();
        roomService.intializeRoom(ThoughtWorksConstants.ROOM_ROWS, ThoughtWorksConstants.ROOM_COLUMNS);
        roomService.showRoomLayout();
    }
}