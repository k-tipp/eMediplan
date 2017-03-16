package CHMED16A.model;

import CHMED16A.builder.NestedBuilder;
import CHMED16A.builder.PatientIdListBuilder;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

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
	private List<PatientId> ids;
	private MedicalData med;
	private List<PrivateField> pFields;
	
	public Patient(Builder builder) {
		this.fName = builder.fName;
		this.lName = builder.lName;
		this.bDt = builder.bDt;
		this.gender = builder.gender;
		this.street = builder.street;
		this.zip = builder.zip;
		this.city = builder.city;
		this.lng = builder.lng;
		this.phone = builder.phone;
		this.rcv = builder.rcv;
		this.ids = builder.ids;
		this.med = builder.med;
		this.pFields = builder.pFields;
	}

	public String getFirstName() {
		return fName;
	}

	public void setFirstName(String fName) {
		this.fName = fName;
	}

	public String getLastName() {
		return lName;
	}

	public void setLastName(String lName) {
		this.lName = lName;
	}

	public String getBirthdate() {
		return bDt;
	}

	public void setBirthdate(String bDt) {
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

	public String getLanguage() {
		return lng;
	}

	public void setLanguage(String lng) {
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

	public List<PatientId> getIds() {
		return ids;
	}

	public void setIds(List<PatientId> ids) {
		this.ids = ids;
	}

	public MedicalData getMed() {
		return med;
	}

	public void setMed(MedicalData med) {
		this.med = med;
	}

	public List<PrivateField> getpFields() {
		return pFields;
	}

	public void setpFields(List<PrivateField> pFields) {
		this.pFields = pFields;
	}

	@JsonIgnore
	public static Builder newBuilder() {
		return new Builder();
	}

    @JsonIgnoreProperties
	public static final class Builder extends NestedBuilder<Medication.Builder, Patient> {
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
		private List<PatientId> ids;
		private MedicalData med;
		private List<PrivateField> pFields;

		private Builder() {	}

		public Builder withFirstName(String fName) {
			this.fName = fName;
			return this;
		}
		public Builder withLastName(String lName) {
			this.lName = lName;
			return this;
		}
		public Builder withBirthdate(String bDt) {
			this.bDt = bDt;
			return this;
		}
		public Builder withGender(int gender) {
			this.gender = gender;
			return this;
		}
		public Builder withStreet(String street) {
			this.street = street;
			return this;
		}
		public Builder withZipCode(String zip) {
			this.zip = zip;
			return this;
		}
		public Builder withCity(String city) {
			this.bDt = bDt;
			return this;
		}
		public Builder withLanguage(String lng) {
			this.lng = lng;
			return this;
		}
		public Builder withPhone(String phone) {
			this.phone = phone;
			return this;
		}
		public Builder withReceiver(String rcv) {
			this.rcv = rcv;
			return this;
		}

		public Builder addPrivateFields(List<PrivateField> pFields) {
			this.pFields = pFields;
			return this;
		}

		public MedicalData.Builder setMedicalData() {
			return MedicalData.newBuilder().withParentBuilder(this);
		}

		public PatientIdListBuilder addPatientIds() {
		    return PatientIdListBuilder.newBuilder().withParentBuilder(this);
        }

		public Patient build() {
			return new Patient(this);
		}

	}
}
