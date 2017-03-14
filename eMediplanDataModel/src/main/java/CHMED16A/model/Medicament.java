package CHMED16A.model;

public class Medicament {
	
	private String id;
	
	private int idType;
	
	private Iterable<Posology> pos;
	
	private String unit;
	
	private String tkgRsn;
	
	private String appInstr;
	
	private int autoMed;
	
	private String prscbBy;
	
	private String roa;
	
	private int rep;
	
	private int subs;
	
	private float nbPack;
	
	private Iterable<PrivateField> pFields;
	
	public Medicament(String id, int idType, int autoMed) {
		this.id = id;
		this.idType = idType;
		this.autoMed = autoMed;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public Iterable<Posology> getPos() {
		return pos;
	}

	public void setPos(Iterable<Posology> pos) {
		this.pos = pos;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getTkgRsn() {
		return tkgRsn;
	}

	public void setTkgRsn(String tkgRsn) {
		this.tkgRsn = tkgRsn;
	}

	public String getAppInstr() {
		return appInstr;
	}

	public void setAppInstr(String appInstr) {
		this.appInstr = appInstr;
	}

	public int getAutoMed() {
		return autoMed;
	}

	public void setAutoMed(int autoMed) {
		this.autoMed = autoMed;
	}

	public String getPrscbBy() {
		return prscbBy;
	}

	public void setPrscbBy(String prscbBy) {
		this.prscbBy = prscbBy;
	}

	public String getRoa() {
		return roa;
	}

	public void setRoa(String roa) {
		this.roa = roa;
	}

	public int getRep() {
		return rep;
	}

	public void setRep(int rep) {
		this.rep = rep;
	}

	public int getSubs() {
		return subs;
	}

	public void setSubs(int subs) {
		this.subs = subs;
	}

	public float getNbPack() {
		return nbPack;
	}

	public void setNbPack(float nbPack) {
		this.nbPack = nbPack;
	}

	public Iterable<PrivateField> getpFields() {
		return pFields;
	}

	public void setpFields(Iterable<PrivateField> pFields) {
		this.pFields = pFields;
	}

	public static Measurement.Builder newBuilder() {
		return new Measurement.Builder();
	}

	public static final class Builder extends NestedBuilder<MedicalData.Builder, Measurement> {
		private int type;
		private String val;
		private int unit;

		private Builder() {
		}

		public Measurement.Builder withType(int type) {
			this.type = type;
			return this;
		}

		public Measurement.Builder withValue(String value) {
			this.val = value;
			return this;
		}

		public Measurement.Builder withUnit(int unit) {
			this.unit = unit;
			return this;
		}


		public Measurement build() {
			return new Measurement(this);
		}

	}
}
