
import java.util.Date;
/*
 * Representa una persona y sus principales atributos
 */
public class People {
    /*
     * Representa los atributos que posee la clase persona.
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /*
     * Crea una instancia de la clase persona.
     */
    public People () {
        name = "Jaminton";
    }

    /*
     * Asigna un valor al atributo nombre.
     * @param name argumento que tomará el atributo.
     */
    public People(String name) {
        this.name=name;
    }

    /*
     * Método que muestra el valor del atributo nombre.
     * @return devuelve el resultado de la operación.
     */
    public String namePeople(){
        return this.name;
    }

}
