package ar.edu.unlam.pb2.cuenta2;

public class CuentaCorriente2 extends Cuenta2 {

	private static final Double RECARGO_GIRO_DESCUBIERTO = 0.05;
	private static final Double MAX_GIRO_DESCUBIERTO = -150.0;

	CuentaCorriente2(String titular) {
		super(titular);

	}

	@Override
	public void retirarDinero(Double monto) {
		if (saldo - monto < 0) {
			Double diferencia = Math.abs(saldo - monto);
			monto += diferencia * RECARGO_GIRO_DESCUBIERTO;
		}
		if (saldo > MAX_GIRO_DESCUBIERTO && saldo - monto >= MAX_GIRO_DESCUBIERTO) {
			saldo -= monto;
		}
	}

	@Override
	public String getTipoCuenta() {
		return TipoCuenta.CUENTA_CORRIENTE.getNombre();
	}

}
