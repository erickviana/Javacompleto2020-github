package entities;

public class OutsurcedEmployee extends Secao14Employee {

	Double additionalCharge;

	public OutsurcedEmployee() {
		super();
	}
	
	public OutsurcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	@Override
	public double payment() {
		//super.payment pega a funcao pagamento da superclasse.
		return super.payment() + (additionalCharge * 110 / 100);
	}
	
}
