package learning.problem;

public class Prescription implements Comparable<Prescription> {
	
	private String rxNumber;
	private int units;
	private Double amount;
	
	public Prescription(String rxNumber, int units, double amount) {
		super();
		this.rxNumber = rxNumber;
		this.units = units;
		this.amount = amount;
	}
	public String getRxNumber() {
		return rxNumber;
	}
	public void setRxNumber(String rxNumber) {
		this.rxNumber = rxNumber;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Prescription [rxNumber=" + rxNumber + ", units=" + units + ", amount=" + amount + "]";
	}
	@Override
	public int compareTo(Prescription o) {
		
		return this.getAmount().compareTo(o.getAmount());
	}
	
	

}
