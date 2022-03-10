package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) { // isso é um método ele é criado dentro da classe principal
		this.saldo += valor; // aqui é o que o método faz this.saldo = this.saldo + valor;(outra forma de escrever)
		
	}
	 public boolean saca(double valor) {
		 if(this.saldo >= valor) {
			 this.saldo -= valor;// this.saldo = this.saldo - valor (outra forma de escrever)
			 return true;
		 } else {
			 return false;
		 }
		 
		 
	}
	 
	 public boolean transfere(double valor, Conta destino) {
		 if(this.saldo>= valor) {
			 this.saldo -= valor;
			 destino.deposita(valor);
			 return true;
		 }
		 return false;
	 }
	 

}
