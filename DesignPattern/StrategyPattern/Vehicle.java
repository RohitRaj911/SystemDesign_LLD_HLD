public abstract class Vehicle {
    DriveStrategy driveObj;

    Vehicle(DriveStrategy objDriveStrategy){
        this.driveObj=objDriveStrategy;
    }
    public void drive(){
        driveObj.drive();
    }
}
