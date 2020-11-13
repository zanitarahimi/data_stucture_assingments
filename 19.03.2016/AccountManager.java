//Autor : ZANITA RAHIMI
public class AccountManager

{ public static void main(String[] args)
{ BankReader a = new BankReader();
BankAccount kontoja_e_pare = new BankAccount(0);
BankWriter b1= new BankWriter("Kontoja e pare ", kontoja_e_pare);
BankAccount kontoja_e_dyte = new BankAccount(0);
BankWriter b2 = new BankWriter("Kontoja e dyte", kontoja_e_dyte);
AccountController bankieri = new AccountController(a,kontoja_e_pare, b1,kontoja_e_dyte,b2);
bankieri.procesi_i_transaksionit();
}
}