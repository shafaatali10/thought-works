package service;

import com.shafaat.thoughtworks.common.Room;
import com.shafaat.thoughtworks.common.ThoughtWorksConstants;

public class RoomService {
    private Room room = new Room();

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


    public String intializeRoom(Integer rows, Integer columns) throws Exception {

        if (rows < 1 || columns < 1) {
            throw new Exception("Invalid values. Need to have atleast 1 row/column");
        }

        room.setRows(rows);
        room.setColumns(columns);

        return room.getRows() + "x" + room.getColumns();
    }

    public void showRoomLayout() {
        int rows = room.getRows();
        int cols = room.getColumns();

//        System.out.println(rows);

        for( int i = rows-1 ; i>=0; i --){
//            System.out.println(i);
            for( int j = 0; j < cols; j++  ){
                System.out.print("("+j+","+i + ")    ");
            }
            System.out.println();

        }
    }

}
