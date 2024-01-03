package elonsToyCar;

public class ElonsToyCar {
    private String model;
    private double pret;
    private int percentage;
    private double distanceDriven;
    private boolean isBatteryEmpty;
    public ElonsToyCar(String model, double pret){
        this.model = model;
        this.pret = pret;
        this.percentage = 100;
    }
    public void buy(){
        System.out.println("Felicitari, ai cumparat masinuta cu telecomanda!");
        System.out.println("Model: " + model);
        System.out.println(" Pret:"+ pret + "lei");
    }
    public String distanceDisplay(){//arata distanta de pe led
        return "Driven " + distanceDriven +" meters.";

    }public String batteryDisplay() {
        if (isBatteryEmpty) {
            return "Battery empty.";
        } else {
            return "Battery at " + percentage + "%.";
        }
    }


    public void drive(double distance){

        if(isBatteryEmpty){
            System.out.println(" E goala bateria. Incarca si tu inainte sa te joci. ");
        }


        distanceDriven += distance;
        int batteryConsumption = (int) (distance/20);
        percentage -= batteryConsumption;


        if(percentage == 0){
            isBatteryEmpty = true;
            System.out.println(" E goala bateria. Incarca si tu inainte sa te joci. ");
        }


    }

    public static void main(String[] args) {
        ElonsToyCar car = new ElonsToyCar(" Dacia 1300 ", 50);
        car.buy();
        car.drive(2000.0);

        //mers
        System.out.println(car.distanceDisplay());// out "Driven 100.0 meters"

    }

}


