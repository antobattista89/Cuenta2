package ar.edu.unlam.pb2.cuenta2;

public class CajaDeAhorro2 extends Cuenta2 {

	private static final Double COSTO_EXTRACCION = 6.0;
	private static final Integer MAX_EXTRACCIONES_SIN_COSTO = 5;
	private Integer extracciones;

	CajaDeAhorro2(String titular) {
		super(titular);
		this.extracciones = 0;
	}

	@Override
	public void retirarDinero(Double monto) {
		if (extracciones >= MAX_EXTRACCIONES_SIN_COSTO) {
			monto += COSTO_EXTRACCION;
		}

		if (saldo > 0 && saldo >= monto) {
			saldo -= monto;
			extracciones++;
		}
	}

	@Override
	public String getTipoCuenta() {
		return TipoCuenta.CAJA_DE_AHORRO.getNombre();
	}

}
