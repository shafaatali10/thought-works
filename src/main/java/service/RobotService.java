package service;

import sun.rmi.server.InactiveGroupException;

import java.util.Arrays;

public class RobotService {

    public String[] commands = {"M", "L", "R"};
    public String[] directions = {"N", "E", "S", "W"};

    private Integer[] x={0,1,2,3,4,5};
    private Integer[] y={0,1,2,3,4,5};


    public String moveRight(Integer x, Integer y, String currentFacingDirection){
        int currentIndex = Arrays.asList(directions).indexOf(currentFacingDirection);
        int newIndex = currentIndex == directions.length-1 ? 0 : currentIndex +1;

        return x + ", " + y + ", " + directions[newIndex];
    }

    public String moveLeft(Integer x, Integer y, String currentFacingDirection){
        int currentIndex = Arrays.asList(directions).indexOf(currentFacingDirection);
        int newIndex = currentIndex == 0 ? directions.length-1 : currentIndex -1;
        return x + ", " + y + ", " + directions[newIndex];
    }

    public String moveStraight(Integer currentX, Integer currentY, String currentFace ){

        int newX = currentX;
        int newY = currentY;


        switch (currentFace){
            case "N":
                newY = currentY==5?currentY:currentY+1;
                break;
            case "E":
                newX = currentX==5?currentX:currentX+1;
                break;
            case "S":
                newY = currentY==0?currentY:currentY-1;
                break;
            case "W":
                newX = currentX==0?currentX:currentX-1;
                break;
            default:

        }

        return newX + ", " + newY + ", " + currentFace;
    }
    public String giveCommand(String command, String currentFacingDirection, int currentx, int currnety) throws Exception {
        String newFacingDirection = currentFacingDirection;

        switch (command){
            case "M":
                newFacingDirection= moveStraight(currentx, currnety, currentFacingDirection);
                break;

            case "L":
                newFacingDirection = moveLeft(currentx, currnety, currentFacingDirection);
                break;

            case "R":
                newFacingDirection = moveRight(currentx, currnety, currentFacingDirection);
                break;

            default:
                throw new Exception("Wrong Command");
        }
        return newFacingDirection;
    }

}
