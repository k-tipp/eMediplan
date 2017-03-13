package CHMED16A;

public class RiskCategory {

	private int id;
	
	private Iterable<Integer> r;
	
	public RiskCategory(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Iterable<Integer> getR() {
		return r;
	}

	public void setR(Iterable<Integer> r) {
		this.r = r;
	}
}
