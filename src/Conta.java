public class Conta {

	private double saldo;

	// outros métodos e atributos...

	public void atualiza(double taxa) {
		synchronized (this) {
			double saldoAtualizado = this.saldo * (1 + taxa);
			this.saldo = saldoAtualizado;
		}
		
	}

	public void deposita(double valor) {
		synchronized (this) {
			double novoSaldo = this.saldo + valor;
			this.saldo = novoSaldo;
		}
		
	}

}
