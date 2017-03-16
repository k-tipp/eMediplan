package CHMED16A.model;

import CHMED16A.builder.MedicamentListBuilder;
import CHMED16A.builder.NestedBuilder;
import CHMED16A.builder.PosologyListBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

public class Medicament {
	
	private String id;
	private int idType;
	private List<Posology> pos;
	private String unit;
	private String tkgRsn;
	private String appInstr;
	private int autoMed;
	private String prscbBy;
	private String roa;
	private int rep;
	private int subs;
	private float nbPack;
	private List<PrivateField> pFields;

	
	public Medicament(Builder builder) {
		this.id = builder.id;
		this.idType = builder.idType;
		this.pos = builder.pos;
		this.unit = builder.unit;
		this.tkgRsn = builder.tkgRsn;
		this.appInstr = builder.appInstr;
		this.autoMed = builder.autoMed;
		this.prscbBy = builder.prscbBy;
		this.roa = builder.roa;
		this.rep = builder.rep;
		this.subs = builder.subs;
		this.nbPack = builder.nbPack;
		this.pFields = builder.pFields;
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

	public List<Posology> getPos() {
		return pos;
	}

	public void setPos(List<Posology> pos) {
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

	public List<PrivateField> getpFields() {
		return pFields;
	}

	public void setpFields(List<PrivateField> pFields) {
		this.pFields = pFields;
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	@JsonIgnoreProperties
	public static final class Builder extends NestedBuilder<MedicamentListBuilder, Medicament> {
		private String id;
		private int idType;
		private List<Posology> pos;
		private String unit;
		private String tkgRsn;
		private String appInstr;
		private int autoMed;
		private String prscbBy;
		private String roa;
		private int rep;
		private int subs;
		private float nbPack;
		private List<PrivateField> pFields;

		private Builder() {
		}

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder type(int idType) {
			this.idType = idType;
			return this;
		}
		
		public Builder withArrayList(ArrayList<Posology> pos) {
			this.pos = pos;
			return this;
		}

		public PosologyListBuilder posologies() {
			return PosologyListBuilder.newBuilder().withParentBuilder(this);
		}

		public Builder unit(String unit) {
			this.unit = unit;
			return this;
		}

		public Builder takingReason(String tkgRsn) {
			this.tkgRsn = tkgRsn;
			return this;
		}

		public Builder applicationInstruction(String appInstr) {
			this.appInstr = appInstr;
			return this;
		}

		public Builder autoMedication(int autoMed) {
			this.autoMed = autoMed;
			return this;
		}

		public Builder prescribedBy(String prscbBy) {
			this.prscbBy = prscbBy;
			return this;
		}

		public Builder routeOfAdministration(String roa) {
			this.roa = roa;
			return this;
		}

		public Builder repetitions(int rep) {
			this.rep = rep;
			return this;
		}

		public Builder isSubstituable(int subs) {
			this.subs = subs;
			return this;
		}

		public Builder nbrOfPkgToBeDelivered(float nbPack) {
			this.nbPack = nbPack;
			return this;
		}

		// ToDo: Find a better solution to add nested private fields
		public Builder withPrivateFields(List<PrivateField> pFields) {
			this.pFields = pFields;
			return this;
		}

		public MedicamentListBuilder addMedicamentToList() {
			Medicament m = this.build();
			this.parent.addMedicament(m);
			return this.parent;
		}

		public Medicament build() {
			return new Medicament(this);
		}

	}
}
