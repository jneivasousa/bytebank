package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		contaDoJoao.saldo = 100;
		contaDoJoao.deposita(50);
		
		System.out.println(contaDoJoao.saldo);
		
		boolean conseguiuRetirar = contaDoJoao.saca(20);
		System.out.println(contaDoJoao.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaJack = new Conta();
		contaDaJack.deposita(1000);
		System.out.println("Saldo inicial da Conta do João " + contaDoJoao.saldo);
		System.out.println("Saldo inicial da Conta da Jack " + contaDaJack.saldo);
		System.out.println();
		
		if(contaDaJack.transfere(300, contaDoJoao)) {
			System.out.println("Transferencia realizada com Sucesso!");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println("Saldo Final da Conta do João " + contaDoJoao.saldo);
		System.out.println("Saldo Final da Conta da Jack " + contaDaJack.saldo);
		
		
		
	}

}
