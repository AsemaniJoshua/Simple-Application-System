/*
public class Car extends Vehicle{



    String name;
    //String make = "chevrolet";

    //String model = "corvette";

    //int year = 2020;

   // String color = "blue";

    double price = 5000.00;

    void drive(){
        System.out.println("You drive the car");
    }

    void brake(){
        System.out.println("You step on the brake");
    }

    public String toString(){

     // String mystring=make + "\n" + model + "\n" + color + "\n" + year;
       //return mystring;

        return make + "\n" + model + "\n" + color + "\n" + year;
   }



   Car (String name){
        this.name = name;

   }



    int wheels = 4;
    int doors = 4;




    @Override
    void go() {
        System.out.println(" The driver is driving the car");
    }

    private String make;
    private String model;
    private int year;

    Car(String make,String model,int year ){
       // this.make=make;
        //this.model=model;
       // this.year=year;

        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make=make;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setYear(int year){
        this.year=year;
    }



    private String make;
    private String model;
    private int year;

    Car(String make,String model,int year ){

        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    Car(Car x){

        this.copy(x);

    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make=make;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }


 */

public class Car extends PolymorphismVehicle{
    @Override
    public void go(){

        System.out.println(" The car begins moving ");
    }
}


