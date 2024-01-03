package elonsToyCar;

public class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int batteryPercentage;
    private double distance;
    private boolean isBatteryDrained;

    public NeedForSpeed(int speed, int batteryDrain){
        this. speed = speed;
        this.batteryDrain = batteryDrain;
        this.batteryPercentage = 100;
        this.distance = 0;
        this.isBatteryDrained = false;
    }
    //getters
    public int getSpeed(){
        return speed;
    }
    public int getBatteryDrain(){
        return batteryDrain;
    }
    public int getBatteryPercentage(){
        return batteryPercentage;
    }
    public double getDistance(){
        return distance;
    }
    public boolean isBatteryDrained(){
        return isBatteryDrained;
    }
    public void drive(){
        if(batteryPercentage > 0){
            distance += speed;
            batteryPercentage -= batteryDrain;
        } else{
            System.out.println("Battery is empty. Please recharge.");
        }
    }
    public void distanceDriven(){
        System.out.println("The car has driven "+ distance + " meters. ");
    }
    public String getBatteryStatus() {
        if (batteryPercentage <= 0) {
            return "Battery empty.";
        } else {
            return "Battery at " + batteryPercentage + " %.";
        }
    }


    public static NeedForSpeed nitro(){
        return new NeedForSpeed(50, 4);
    }





    public static void main(String[] args) {
        NeedForSpeed car = new NeedForSpeed(5,2);
        for (int i = 0; i<10; i++){
            car.drive();
            System.out.println("Distance: "+ car.distance + " meters");
            System.out.println("Battery percentage: " + car.batteryPercentage + " %");
        }
        car.distanceDriven();
        car.getBatteryStatus();
        System.out.println("Now we have tested the car.");
        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        for (int i = 0; i<10; i++){
            nitroCar.drive();
            System.out.println("Distance: "+ car.distance + " meters");
            System.out.println("Battery percentage: " + car.batteryPercentage + " %");
        }
        nitroCar.drive();
        nitroCar.distanceDriven();
        nitroCar.getBatteryStatus();
        System.out.println("Now we have tested the nitroCar.");


    }
}