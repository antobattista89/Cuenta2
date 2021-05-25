package ar.edu.unlam.pb2.cuenta2;

public class CuentaSueldo2 extends Cuenta2{

	CuentaSueldo2(String titular) {
		super(titular);
		
	}

	@Override
	public void retirarDinero(Double monto) {
		if(saldo>0 && saldo>=monto) {
			saldo-=monto;
		}
		
	}

	@Override
	public String getTipoCuenta() {
		return TipoCuenta.CUENTA_SUELDO.getNombre();
	}

}
