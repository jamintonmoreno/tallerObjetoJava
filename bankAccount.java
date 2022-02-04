/*
 * Representa la clase cuenta bancaria y sus principales atributos
 */
public class bankAccount {

    /*
     * Representa los atributos de la clase cuenta bancaria
     */
    private int accountNumber;
    protected boolean activated;
    public String userAccount;

    /*
     * Permite darle un valor al atributo privado de la clase Cuenta Bancaria.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /*
     * Permite mostrar el valor al atributo privado de la clase Cuenta Bancaria.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /*
     * Crea una instancia de la clase cuenta bancaria.
     */
    public bankAccount(){
        accountNumber=12345;
    }

    /*
     * Asigna un valor al atributo número de cuenta (accountNumber).
     * @param accountNumber argumento que tomará el atributo.
     */
    public bankAccount(int accountNumber){
        this.accountNumber=accountNumber;
    }

    /*
     * Método que muestra el valor del atributo número de cuenta.
     * @return devuelve el resultado de la operación.
     */
    public int numberAccount(){
        return this.accountNumber;
    }
}
