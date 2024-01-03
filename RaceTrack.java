package elonsToyCar;

public class RaceTrack {
    private int distance = 800;
    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car){
        int maxDistance = car.getBatteryPercentage() * car.getSpeed() /car.getBatteryDrain();
        return (maxDistance >= distance);

    }

    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;

        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
        int distance = 100;
        RaceTrack race = new RaceTrack(distance);
        boolean canFinish = race.carCanFinish(car);
        if(canFinish){
            System.out.println("The car can finish the race!");
        }else{
            System.out.println("The car cannot finish the race!");
        }

    }
}

