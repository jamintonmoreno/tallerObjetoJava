public class Car {

    public String brand;
    public String model;
    private float price;
    public String color;

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }


    public Car(){
        brand="Toyota";
    }
     public Car(String brand){
        this.brand=brand;
     }

     public String carName(){
        return this.brand;
     }
}
