package CHMED16A.model;

import CHMED16A.builder.NestedBuilder;
import CHMED16A.builder.RecommendationListBuilder;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

public class Recommendation {
    @JsonProperty("Id")
    private String id;
    @JsonProperty("PatAgr")
    private int patAgr;
    @JsonProperty("Rmk")
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

    @JsonIgnoreProperties
    public static final class Builder extends NestedBuilder<RecommendationListBuilder, Recommendation> {
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
        
        public Builder withArrayList(ArrayList<Recommendation> recommendations) {
        	return this;
        }

        public Builder withRemark(String rmk) {
            this.rmk = rmk;
            return this;
        }

        public RecommendationListBuilder addRecommendationToList() {
        	this.parent.addRecommendation(this.build());
            return this.parent;
        }

        public Recommendation build() {
            return new Recommendation(this);
        }

    }
}
