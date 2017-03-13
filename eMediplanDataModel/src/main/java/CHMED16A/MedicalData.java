package CHMED16A;

public class MedicalData {
	
	private String dtLstMen;
	
	private String prem;
	
	private String toG;
	
	private Iterable<RiskCategory> rG;
	
	private Iterable<Measurement> meas;
	
	private Iterable<PrivateField> pFields;

	public MedicalData() {
		super();
	}

	public String getDtLstMen() {
		return dtLstMen;
	}

	public void setDtLstMen(String dtLstMen) {
		this.dtLstMen = dtLstMen;
	}

	public String getPrem() {
		return prem;
	}

	public void setPrem(String prem) {
		this.prem = prem;
	}

	public String getToG() {
		return toG;
	}

	public void setToG(String toG) {
		this.toG = toG;
	}

	public Iterable<RiskCategory> getrG() {
		return rG;
	}

	public void setrG(Iterable<RiskCategory> rG) {
		this.rG = rG;
	}

	public Iterable<Measurement> getMeas() {
		return meas;
	}

	public void setMeas(Iterable<Measurement> meas) {
		this.meas = meas;
	}

	public Iterable<PrivateField> getpFields() {
		return pFields;
	}

	public void setpFields(Iterable<PrivateField> pFields) {
		this.pFields = pFields;
	}
}
