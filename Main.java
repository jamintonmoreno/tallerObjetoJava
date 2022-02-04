/*
 * Representa la clase principal del programa y las clases
 * requeridas para el funcionamiento del mismo.
 */
public class Main {
    /*
     * Muestra el resultado de los procesos al usuario.
     */
        public static void main(String[] args){
        /*
         * Realiza el llamado a la clase persona y muestra el valor del método
         * nombre al usuario.
         */
        People people1 = new People();
        System.out.println(people1.namePeople());

        /*
         * Realiza el llamado a la clase fruta y muestra el valor del método
         * nombre al usuario.
         */
        Fruit fruit1 = new Fruit();
        System.out.println(fruit1.nameFruit());

        /*
         * Realiza el llamado a la clase cuenta bancaria y muestra el valor del
         * método número de cuenta.
         */
        bankAccount bank1 = new bankAccount();
        System.out.println(bank1.numberAccount());

        /*
         * Realiza el llamado a la clase libro y muestra el valor del
         * método nombre del autor.
         */
        Book book1 = new Book();
        System.out.println(book1.nameAuthor());

        /*
         * Realiza el llamado a la clase carro y muestra el valor del
         * método nombre del carro.
         */
        Car car1 = new Car();
        System.out.println(car1.carName());

        /*
         * Realiza el llamado a la clase casa y muestra el valor del
         * método cantidad de pisos.
         */
        House house1 = new House();
        System.out.println(house1.amountFloors());

    }
}
