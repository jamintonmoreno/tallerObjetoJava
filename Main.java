/*
  Representa la clase principal del programa y las clases
  requeridas para el funcionamiento del mismo.
 */
public class Main {
    // Muestra el resultado de los procesos al usuario.

    public static void main(String[] args){
        /*
          Realiza el llamado a la clase persona y muestra el valor del atributo
          nombre al usuario.
        */
        People people1 = new People();
        System.out.println(people1.nombrePersona());

        /*
          Realiza el llamado a la clase fruta y muestra el valor del atributo
          nombre al usuario.
        */
        Fruit fruit1 = new Fruit();
        System.out.println(fruit1.nameFruit());

        /*
          Realiza el llamado a la clase cuenta bancaria y muestra el valor del
          atributo número de cuenta.
        */
        bankAccount bank1 = new bankAccount();
        System.out.println(bank1.numberAccount());

        /*
          Realiza el llamado a la clase libro y muestra el valor del
          atributo autor.
        */
        Book book1 = new Book();
        System.out.println(book1.nameAuthor());



    }
}
