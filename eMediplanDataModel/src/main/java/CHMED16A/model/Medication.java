package CHMED16A.model;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Medication {

    private Patient patient;
    private List<Medicament> medicaments;
    private List<Recommendation> recoms;
    private List<PrivateField> pFields;
    private String pSchema;
    private int medType;
    private String id;
    private String auth;
    private String zsr;
    private String dt;
    private String rmk;
    private String valBy;
    private String valDt;

    public Medication(Patient patient, int medType, String id, String auth, String dt) {
        this.patient = patient;
        this.medType = medType;
        this.id = id;
        this.auth = auth;
        this.dt = dt;
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

    public static final class MedicationPlanBuilder {
        private Patient patient;
        private List<Medicament> medicaments;
        private List<PrivateField> pFields;
        private String pSchema;
        private static final int medType = 1;
        private String id;
        private String auth;
        private String dt;
        private String rmk;
        private String valBy;
        private String valDt;

        private MedicationPlanBuilder() {}

        private MedicationPlanBuilder forPatient(Patient patient) {
            this.patient = patient;
            return this;
        }

        private MedicationPlanBuilder addMedicaments(List<Medicament> medicaments) {
            this.medicaments = medicaments;
            return this;
        }

        private MedicationPlanBuilder withPrivateFields(List<PrivateField> pFields) {
            this.pFields = pFields;
            return this;
        }

        private MedicationPlanBuilder withSchemas(List<String> pSchemas) {
            this.pSchema = pSchema;
            return this;
        }

        private MedicationPlanBuilder withId(String id) {
            this.id = id;
            return this;
        }

        private MedicationPlanBuilder withAuth(String auth) {
            this.auth = auth;
            return this;
        }

        private MedicationPlanBuilder setDate(String date) {
            this.dt = date;
            return this;
        }

        private MedicationPlanBuilder setRemark(String remarks) {
            this.rmk = remarks;
            return this;
        }

        private MedicationPlanBuilder validatedBy(String valBy) {
            this.valBy = valBy;
            return this;
        }

        private MedicationPlanBuilder validationDate(String valDt) {
            this.valDt = valDt;
            return this;
        }
    }

    public static final class PolymedicationCheckBuilder {
        private Patient patient;
        private List<Medicament> medicaments;
        private List<Recommendation> recoms;
        private List<PrivateField> pFields;
        private String pSchema;
        private static final int medType = 2;
        private String id;
        private String auth;
        private String dt;
        private String valBy;
        private String valDt;

        private PolymedicationCheckBuilder() {}

        private PolymedicationCheckBuilder forPatient(Patient patient) {
            this.patient = patient;
            return this;
        }

        private PolymedicationCheckBuilder addMedicaments(List<Medicament> medicaments) {
            this.medicaments = medicaments;
            return this;
        }

        private PolymedicationCheckBuilder addRecoms(List<Recommendation> recoms) {
            this.recoms = recoms;
            return this;
        }

        private PolymedicationCheckBuilder withPrivateFields(List<PrivateField> pFields) {
            this.pFields = pFields;
            return this;
        }

        private PolymedicationCheckBuilder withSchema(String pSchemas) {
            this.pSchema = pSchemas;
            return this;
        }

        private PolymedicationCheckBuilder withId(String id) {
            this.id = id;
            return this;
        }

        private PolymedicationCheckBuilder withAuth(String auth) {
            this.auth = auth;
            return this;
        }

        private PolymedicationCheckBuilder setDate(String date) {
            this.dt = date;
            return this;
        }

        private PolymedicationCheckBuilder validatedBy(String valBy) {
            this.valBy = valBy;
            return this;
        }

        private PolymedicationCheckBuilder validationDate(String valDt) {
            this.valDt = valDt;
            return this;
        }
    }

    public static final class PrescriptionBuilder {
        private Patient patient;
        private List<Medicament> medicaments;
        private List<PrivateField> pFields;
        private String pSchema;
        private static final int medType = 2;
        private String id;
        private String auth;
        private String dt;
        private String rmk;

        private PrescriptionBuilder() {}

        private PrescriptionBuilder forPatient(Patient patient) {
            this.patient = patient;
            return this;
        }

        private PrescriptionBuilder addMedicaments(List<Medicament> medicaments) {
            this.medicaments = medicaments;
            return this;
        }

        private PrescriptionBuilder withPrivateFields(List<PrivateField> pFields) {
            this.pFields = pFields;
            return this;
        }

        private PrescriptionBuilder withSchema(String pSchema) {
            this.pSchema = pSchema;
            return this;
        }

        private PrescriptionBuilder withId(String id) {
            this.id = id;
            return this;
        }

        private PrescriptionBuilder withAuth(String auth) {
            this.auth = auth;
            return this;
        }

        private PrescriptionBuilder setDate(String date) {
            this.dt = date;
            return this;
        }

        private PrescriptionBuilder setRemark(String rmk) {
            this.rmk = rmk;
            return this;
        }
    }
}
