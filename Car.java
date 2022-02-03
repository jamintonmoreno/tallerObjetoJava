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

    /*
     * Método que muestra el valor del atributo marca.
     * @return devuelve el resultado de la operación.
     */
     public String carName(){
        return this.brand;
     }
}
