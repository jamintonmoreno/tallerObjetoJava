/*
 * Representa la clase Carro y sus principales atributos.
 */
public class Car {

    /*
     * Representa los atributos de la clase Carro.
     */
    public String brand;
    protected String model;
    private float price;
    public String color;

    /*
     * Permite darle un valor al atributo privado de la clase Carro.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /*
     * Permite mostrar el valor al atributo privado de la clase Carro.
     */
    public float getPrice() {
        return price;
    }

    /*
     * Crea una instancia de la clase Carro.
     */
    public Car(){
        brand="Toyota";
    }

    /*
     * Asigna un valor al atributo número marca de carro.
     * @param accountNumber argumento que tomará el atributo.
     */
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
