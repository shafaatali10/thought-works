package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotServiceTest {

    @Test
    void giveWrongCommand()  {
        RobotService service = new RobotService();
        try{
            String newFace = service.giveCommand("X", "N", 0, 0);
        }catch (Exception e){
            String expected = "Wrong Command";
            assertEquals(expected, (e.getMessage()));
        }

    }

    @Test
    void giveCommand() throws Exception {
        RobotService service = new RobotService();
        String newFace = service.giveCommand("R", "W", 0, 0);
        String expected  ="N";
        assertEquals(expected, newFace);
    }

    @Test
    void giveCommandLeft() throws Exception {
        RobotService service = new RobotService();
        String newFace = service.giveCommand("L", "N", 0, 0);
        String expected  ="W";
        assertEquals(expected, newFace);    }

    @Test
    void giveCommandToRobot() throws Exception {
        RobotService service = new RobotService();
        String newFace = service.giveCommand("M", "E", 5, 5);
        String expected  ="5, 5, E";
        assertEquals(expected, newFace);
    }

}