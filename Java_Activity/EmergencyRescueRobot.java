// Interface 1
interface Flyable {
    void fly();
}

// Interface 2
interface Swimmable {
    void swim();
}

// Interface 3
interface Climbable {
    void climb();
}

// Abstract Class
abstract class RescueRobot {

    protected int robotId;
    protected String robotName;

    RescueRobot(int id, String name) {
        robotId = id;
        robotName = name;
    }

    void displayRobotDetails() {
        System.out.println("Robot ID   : " + robotId);
        System.out.println("Robot Name : " + robotName);
    }

    void startRobot() {
        System.out.println("Robot Started");
    }

    abstract void performMission();
}

// Drone Robot
class DroneRobot extends RescueRobot implements Flyable {

    DroneRobot(int id, String name) {
        super(id, name);
    }

    public void fly() {
        System.out.println("Flying to rescue location");
    }

    void performMission() {
        System.out.println("Searching missing people from air");
    }
}

// Water Robot
class WaterRobot extends RescueRobot implements Swimmable {

    WaterRobot(int id, String name) {
        super(id, name);
    }

    public void swim() {
        System.out.println("Swimming through water");
    }

    void performMission() {
        System.out.println("Rescuing flood victims");
    }
}

// Mountain Robot
class MountainRobot extends RescueRobot implements Climbable {

    MountainRobot(int id, String name) {
        super(id, name);
    }

    public void climb() {
        System.out.println("Climbing mountains");
    }

    void performMission() {
        System.out.println("Rescuing people from hills");
    }
}

// Rescue Car Robot
class RescueCarRobot extends RescueRobot
        implements Flyable, Swimmable, Climbable {

    RescueCarRobot(int id, String name) {
        super(id, name);
    }

    public void fly() {
        System.out.println("Flying over obstacles");
    }

    public void swim() {
        System.out.println("Crossing flooded roads");
    }

    public void climb() {
        System.out.println("Climbing rough terrain");
    }

    void performMission() {
        System.out.println("Performing multi-purpose rescue mission");
    }
}

// Main Class
public class EmergencyRescueRobot {

    public static void main(String[] args) {

        // Abstract class references
        RescueRobot robots[] = {

                new DroneRobot(101, "Drone X"),
                new WaterRobot(102, "Water Y"),
                new MountainRobot(103, "Mountain Z"),
                new RescueCarRobot(104, "Rescue Car")
        };

        for (RescueRobot r : robots) {

            r.displayRobotDetails();
            r.startRobot();
            r.performMission();

            if (r instanceof Flyable) {
                Flyable f = (Flyable) r;
                f.fly();
            }

            if (r instanceof Swimmable) {
                Swimmable s = (Swimmable) r;
                s.swim();
            }

            if (r instanceof Climbable) {
                Climbable c = (Climbable) r;
                c.climb();
            }

            System.out.println("---------------------------");
        }
    }
}