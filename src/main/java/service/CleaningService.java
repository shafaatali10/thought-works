package service;

import com.shafaat.thoughtworks.common.Room;
import com.shafaat.thoughtworks.common.ThoughtWorksConstants;

public class CleaningService {

    public String cleanRoom(int x, int y, String face, String room1Commands[]) throws Exception {
        RoomService roomService1 = new RoomService();
        roomService1.intializeRoom(ThoughtWorksConstants.ROOM_ROWS, ThoughtWorksConstants.ROOM_COLUMNS);

        RobotService robotService1 = new RobotService();

        for(String eachCommand: room1Commands){
            String newLocation = robotService1.giveCommand(eachCommand, face, x, y);

            String coordinates[] = newLocation.split(", ");
            x=Integer.valueOf(coordinates[0]);
            y=Integer.valueOf(coordinates[1]);
            face=coordinates[2];
        }

        return  x + ", " + y + ", " + face;
    }

}
