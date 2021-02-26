
public class ClassesConta {
	
	private double saldo = 0.00;
	
	public void sacar(int valor) {
		saldo -= valor;
		}
	public void depositar(int valor) {
		saldo += valor;
	}
	public double lerSaldo() {
		return saldo;
		
	}

}
