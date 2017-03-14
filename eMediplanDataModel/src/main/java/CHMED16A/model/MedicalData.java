package CHMED16A.model;

import java.util.List;

import CHMED16A.builder.MeasurementListBuilder;
import CHMED16A.builder.NestedBuilder;
import CHMED16A.builder.PrivateFieldListBuilder;
import CHMED16A.builder.RiskCategoryListBuilder;
import CHMED16A.interfaces.IPrivateFieldsOwner;

public class MedicalData {
	
	private String dLstMen;
	private int prem;
	private String toG;
	private List<RiskCategory> rG;
	private List<Measurement> meas;
	private List<PrivateField> pFields;

	public MedicalData(Builder builder) {
		this.dLstMen = builder.dLstMen;
		this.prem = builder.prem;
		this.toG = builder.toG;
		this.rG = builder.rG;
		this.meas = builder.meas;
		this.pFields = builder.pFields;
	}

	public String getDLstMen() {
		return dLstMen;
	}

	public void setDLstMen(String dtLstMen) {
		this.dLstMen = dtLstMen;
	}

	public int getPrem() {
		return prem;
	}

	public void setPrem(int prem) {
		this.prem = prem;
	}

	public String getToG() {
		return toG;
	}

	public void setToG(String toG) {
		this.toG = toG;
	}

	public List<RiskCategory> getrG() {
		return rG;
	}

	public void setrG(List<RiskCategory> rG) {
		this.rG = rG;
	}

	public List<Measurement> getMeas() {
		return meas;
	}

	public void setMeas(List<Measurement> meas) {
		this.meas = meas;
	}

	public List<PrivateField> getpFields() {
		return pFields;
	}

	public void setpFields(List<PrivateField> pFields) {
		this.pFields = pFields;
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	public static final class Builder extends NestedBuilder<Patient.Builder, MedicalData> implements IPrivateFieldsOwner<Patient.Builder> {
		private String dLstMen;
		private int prem;
		private String toG;
		private List<RiskCategory> rG;
		private List<Measurement> meas;
		private List<PrivateField> pFields;

		private Builder() {
		}

		public Builder withFirstDayOfLastMenstruation(String dLstMen) {
			this.dLstMen = dLstMen;
			return this;
		}

		public Builder withPremature(int prem) {
			this.prem = prem;
			return this;
		}

		public Builder withTimeOfGestation(String toG) {
			this.toG = toG;
			return this;
		}
		
		public RiskCategoryListBuilder addRiskCategories() {			
			return RiskCategoryListBuilder.newBuilder().withParentBuilder(this);
		}
		
		public MeasurementListBuilder addMeasurements() {			
			return MeasurementListBuilder.newBuilder().withParentBuilder(this);
		}
		
		public PrivateFieldListBuilder addPrivateFields() {			
			return PrivateFieldListBuilder.newBuilder().withParentBuilder(this);
		}

		public MedicalData build() {
			return new MedicalData(this);
		}

	}
}
