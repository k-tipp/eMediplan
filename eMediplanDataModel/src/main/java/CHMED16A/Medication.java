package CHMED16A;

import java.util.Iterator;

public class Medication {

    private Patient patient;

    private Iterator<Medicament> medicaments;

    private Iterator<Recommendation> recoms;

    private Iterator<PrivateField> pFields;

    private Iterator<String> pSchema;

    private int medType;

    private String id;

    private String auth;

    private Iterator<String> zsr;

    private String dt;

    private Iterator<String> rmk;

    private Iterator<String> valBy;

    private Iterator<String> valDt;


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

    public Iterator<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(Iterator<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public Iterator<Recommendation> getRecoms() {
        return recoms;
    }

    public void setRecoms(Iterator<Recommendation> recoms) {
        this.recoms = recoms;
    }

    public Iterator<PrivateField> getpFields() {
        return pFields;
    }

    public void setpFields(Iterator<PrivateField> pFields) {
        this.pFields = pFields;
    }

    public Iterator<String> getpSchema() {
        return pSchema;
    }

    public void setpSchema(Iterator<String> pSchema) {
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

    public Iterator<String> getZsr() {
        return zsr;
    }

    public void setZsr(Iterator<String> zsr) {
        this.zsr = zsr;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Iterator<String> getRmk() {
        return rmk;
    }

    public void setRmk(Iterator<String> rmk) {
        this.rmk = rmk;
    }

    public Iterator<String> getValBy() {
        return valBy;
    }

    public void setValBy(Iterator<String> valBy) {
        this.valBy = valBy;
    }

    public Iterator<String> getValDt() {
        return valDt;
    }

    public void setValDt(Iterator<String> valDt) {
        this.valDt = valDt;
    }
}
