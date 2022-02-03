/*
 * Representa la clase cuenta bancaria y sus principales atributos
 */
public class bankAccount {

    /*
     * Representa los atributos de la clase cuenta bancaria
     */
    private int accountNumber;
    protected boolean activated;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

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
     * Muestra el valor del atributo.
     * @return devuelve el valor del atributo accountNumber.
     */
    public int numberAccount(){
        return this.accountNumber;
    }
}
