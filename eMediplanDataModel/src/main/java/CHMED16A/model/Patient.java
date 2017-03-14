package CHMED16A.model;

public class Patient {
	
	private String fName;
	
	private String lName;
	
	private String bDt;
	
	private int gender;
	
	private String street;
	
	private String zip;
	
	private String city;
	
	private String lng;
	
	private String phone;
	
	private String rcv;
	
	private Iterable<PatientId> ids;
	
	private Iterable<MedicalData> med;
	
	private Iterable<PrivateField> pFields;
	
	public Patient(String fName, String lName, String bDt) {
		this.fName = fName;
		this.lName = lName;
		this.bDt = bDt;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getbDt() {
		return bDt;
	}

	public void setbDt(String bDt) {
		this.bDt = bDt;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRcv() {
		return rcv;
	}

	public void setRcv(String rcv) {
		this.rcv = rcv;
	}

	public Iterable<PatientId> getIds() {
		return ids;
	}

	public void setIds(Iterable<PatientId> ids) {
		this.ids = ids;
	}

	public Iterable<MedicalData> getMed() {
		return med;
	}

	public void setMed(Iterable<MedicalData> med) {
		this.med = med;
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
