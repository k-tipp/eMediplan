package CHMED16A.model;

public class Recommendation {
    private String id;
    private int patAgr;
    private String rmk;

    private Recommendation(Builder builder) {

        this.id = builder.id;
        this.patAgr = builder.patAgr;
        this.rmk = builder.rmk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPatAgr() {
        return patAgr;
    }

    public void setPatAgr(int patAgr) {
        this.patAgr = patAgr;
    }

    public String getRmk() {
        return rmk;
    }

    public void setRmk(String rmk) {
        this.rmk = rmk;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder extends NestedBuilder<Medication.Builder, Measurement> {
        private String id;
        private int patAgr;
        private String rmk;

        private Builder() {
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withPatientAgreement(int patAgr) {
            this.patAgr = patAgr;
            return this;
        }

        public Builder withRemark(String rmk) {
            this.rmk = rmk;
            return this;
        }


        public Recommendation build() {
            return new Recommendation(this);
        }

    }
}
