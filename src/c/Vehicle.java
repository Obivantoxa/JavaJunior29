package c;

public class Vehicle {
    /*
    Vehicle(double petrol_amount, double tank_volume);
double getTankVolume(); - узнать объем бензобака в литрах;
double getPetrolAmount(); - узнать текущее количество топлива в баке;
void arrive(); - приехать на базу;
boolean leave(); - залить полный бак и покинуть базу; в случае невозможности уехать возвращает false;
     */
    private double tank_volume;
    private double petrol_amount;

    public Vehicle(){

    }

    public Vehicle(double tank_volume, double petrol_amount){
        this.tank_volume = tank_volume;
        this.petrol_amount = petrol_amount;
    }

    public double getTank_volume() {
        return tank_volume;
    }

    public double getPetrol_amount() {
        return petrol_amount;
    }
    public void arrive(){
        Base.people_on_base++;
        Base.vehicles_on_base++;
    }

    public boolean leave(){
        if(Base.people_on_base < 1){
            return false;
        }
        if (Base.vehicles_on_base < 1){
            return false;
        }
        double needs_petrol =  petrol_amount-tank_volume;
        if (needs_petrol > Base.petrol_on_base){
            return  false;
        }
        Base.people_on_base--;
        Base.vehicles_on_base--;
        Base.petrol_on_base = Base.petrol_on_base - needs_petrol;
        return true;
    }

}
