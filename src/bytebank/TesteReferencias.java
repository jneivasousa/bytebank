package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da Primeira Conta = " +primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da Segunda Conta = " +segundaConta.saldo);
		System.out.println("Saldo da Primeira Conta = " +primeiraConta.saldo);
		
		
	}

}
