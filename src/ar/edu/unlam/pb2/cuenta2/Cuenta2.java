package ar.edu.unlam.pb2.cuenta2;

public abstract class Cuenta2 {
	
	protected String titular;
	protected Double saldo;
	
	Cuenta2(String titular){
		this.titular=titular;
		this.saldo=0.0;		
	}

	public Double getSaldo() {
		return saldo;
	}

	protected void depositarMonto(Double monto) {
		this.saldo+=monto;
	}
	public abstract void retirarDinero(Double monto); 
	
	public abstract String getTipoCuenta(); 
}
