package CHMED16A.model;

import CHMED16A.builder.MedicamentListBuilder;
import CHMED16A.builder.NestedBuilder;
import CHMED16A.builder.RecommendationListBuilder;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Medication {

    @JsonProperty("Patient")
    private Patient patient;
    @JsonProperty("Medicaments")
    private List<Medicament> medicaments;
    @JsonProperty("Recoms")
    private List<Recommendation> recoms;
    @JsonProperty("PFields")
    private List<PrivateField> pFields;
    @JsonProperty("PSchema")
    private String pSchema;
    @JsonProperty("MedType")
    private int medType;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("Auth")
    private String auth;
    @JsonProperty("Zsr")
    private String zsr;
    @JsonProperty("Dt")
    private String dt;
    @JsonProperty("Rmk")
    private String rmk;
    @JsonProperty("ValBy")
    private String valBy;
    @JsonProperty("ValDt")
    private String valDt;

    public Medication(Builder builder) {
        this.patient = builder.patient;
        this.medicaments = builder.medicaments;
        this.recoms = builder.recoms;
        this.pFields = builder.pFields;
        this.pSchema = builder.pSchema;
        this.medType = builder.medType;
        this.id = builder.id;
        this.auth = auth;
        this.zsr = builder.zsr;
        this.dt = builder.dt;
        this.rmk = builder.rmk;
        this.valBy = builder.valBy;
        this.valDt = builder.valDt;
    }

    public String serialize() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);

        return mapper.defaultPrettyPrintingWriter().writeValueAsString(this);
    }


    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public List<Medicament> getMedicaments() {
        return medicaments;
    }
    public void setMedicaments(List<Medicament> medicaments) {
        this.medicaments = medicaments;
    }
    public List<Recommendation> getRecoms() {
        return recoms;
    }
    public void setRecoms(List<Recommendation> recoms) {
        this.recoms = recoms;
    }
    public List<PrivateField> getpFields() {
        return pFields;
    }
    public void setpFields(List<PrivateField> pFields) {
        this.pFields = pFields;
    }
    public String getPSchema() {
        return pSchema;
    }
    public void setPSchema(String pSchema) {
        this.pSchema = pSchema;
    }
    public int getMedType() {
        return medType;
    }
    public void setMedType(int medType) {
        this.medType = medType;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAuth() {
        return auth;
    }
    public void setAuth(String auth) {
        this.auth = auth;
    }
    public String getZsr() {
        return zsr;
    }
    public void setZsr(String zsr) {
        this.zsr = zsr;
    }
    public String getDt() {
        return dt;
    }
    public void setDt(String dt) {
        this.dt = dt;
    }
    public String getRmk() {
        return rmk;
    }
    public void setRmk(String rmk) {
        this.rmk = rmk;
    }
    public String getValBy() {
        return valBy;
    }
    public void setValBy(String valBy) {
        this.valBy = valBy;
    }
    public String getValDt() {
        return valDt;
    }
    public void setValDt(String valDt) {
        this.valDt = valDt;
    }

    @JsonIgnore
    public static Builder newBuilder() { return new Builder(); }

    @JsonIgnoreProperties
    public static final class Builder extends NestedBuilder<Builder, Medication> {
        private  Patient patient;
        private List<Medicament> medicaments;
        private List<PrivateField> pFields;
        private String pSchema;
        private String id;
        private String auth;
        private String dt;
        private int medType;
        private String rmk;
        private String valBy;
        private String valDt;
        private List<Recommendation> recoms;
        private String zsr;

        public Patient.Builder withPatient() {
            return Patient.newBuilder().withParentBuilder(this);
        }

        public Builder withPatient(Patient patient) {
            this.patient = patient;
            return this;
        }

        public MedicamentListBuilder addMedicaments() {
            MedicamentListBuilder builder = MedicamentListBuilder.newBuilder().withParentBuilder(this);
            return builder;
        }
        
        public Builder withArrayList(ArrayList<Medicament> medications) {
        	medicaments = medications;
        	return this;
        }

        public Builder addPrivateFields(List<PrivateField> pFields) {
            this.pFields = pFields;
            return this;
        }

/*        public StringListBuilder withSchemas() {
            return StringListBuilder.newBuilder();
        }*/

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withMedType(int medType) {
            this.medType = medType;
            return this;
        }

        public Builder withAuth(String auth) {
            this.auth = auth;
            return this;
        }

        public Builder setDate(String date) {
            this.dt = date;
            return this;
        }

         public Builder setRemark(String remarks) {
            this.rmk = remarks;
            return this;
        }

        public RecommendationListBuilder addRecommendations() {
            return RecommendationListBuilder.newBuilder().withParentBuilder(this);
        }

        public Builder validatedBy(String valBy) {
            this.valBy = valBy;
            return this;
        }

        public Builder validationDate(String valDt) {
            this.valDt = valDt;
            return this;
        }

        public Builder setZSR(String zsr) {
            this.zsr = zsr;
            return this;
        }

        public Medication build() {
            return new Medication(this);
        }

    }
}
