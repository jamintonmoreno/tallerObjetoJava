/*
 * Representa la clase Casa y sus principales atributos.
 */
public class House {

    /*
     * Representa los atributos de la clase Casa.
     */
    public int numberFloors;
    private String typeRoof;
    public int numberRooms;
    protected float price;

    /*
     * Permite darle un valor al atributo privado de la clase Casa.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /*
     * Permite mostrar el valor al atributo privado de la clase Casa.
     */
    public float getPrice() {
        return price;
    }

    /*
     * Crea una instancia de la clase Casa.
     */
    public House (){
        numberFloors=2;
    }

    /*
     * Asigna un valor al atributo número de pisos (numberFloors).
     * @param numberFloors argumento que tomará el atributo.
     */
    public House(int numberFloors){
        this.numberFloors=numberFloors;
    }

    /*
     * Método que muestra el valor del atributo número de pisos.
     * @return devuelve el resultado de la operación.
     */
    public int amountFloors(){
        return this.numberFloors;
    }
}
