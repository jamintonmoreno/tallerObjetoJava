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

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

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
     * Muestra el valor del atributo
     * @return devuelve el valor del atributo name.
     */
    public String nameFruit(){
        return this.name;
    }

}
