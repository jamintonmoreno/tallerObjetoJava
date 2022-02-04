import java.util.ArrayList;

/*
 * Representa la clase fruta y sus principales atributos.
 */
public class Fruit {

    /*
     * Representa los atributos que tiene la clase fruta.
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /*
     * Permite darle un valor al atributo privado de la clase Fruta.
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /*
     * Permite mostrar el valor al atributo privado de la clase Fruta.
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /*
     * Crea una instancia de la clase fruta.
     */
    public Fruit(){
        name="mango";
    }

    /*
     * Asigna un valor al atributo nombre.
     * @param name Argumento que tomará el atributo.
     */
    public Fruit(String name){
        this.name=name;
    }

    /*
     * Método que muestra el valor del atributo nombre.
     * @return devuelve el resultado de la operación.
     */
    public String nameFruit(){
        return this.name;
    }

}
