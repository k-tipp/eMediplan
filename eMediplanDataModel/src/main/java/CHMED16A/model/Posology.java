package CHMED16A.model;

import CHMED16A.builder.NestedBuilder;
import CHMED16A.builder.PosologyListBuilder;
import CHMED16A.builder.TakingTimeListBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Posology {

    @JsonProperty("dtFrom")
    private String dtFrom = "";
    @JsonProperty("DtTo")
    private String dtTo = "";
    @JsonProperty("CyDu")
    private int cyDu;
    @JsonProperty("InRes")
    private int inRes;
    @JsonProperty("D")
    private List<Integer> d;
    @JsonProperty("TT")
    private List<TakingTime> tT;

    private Posology(Builder builder) {
        this.dtFrom = builder.dtFrom;
        this.dtTo = builder.dtTo;
        this.cyDu = builder.cyDu;
        this.inRes = builder.inRes;
        this.d = builder.d;
        this.tT = builder.tT;
    }

    public String getDtFrom() {
        return dtFrom;
    }

    public void setDtFrom(String dtFrom) {
        this.dtFrom = dtFrom;
    }

    public String getDtTo() {
        return dtTo;
    }

    public void setDtTo(String dtTo) {
        this.dtTo = dtTo;
    }

    public int getCyDu() {
        return cyDu;
    }

    public void setCyDu(int cyDu) {
        this.cyDu = cyDu;
    }

    public int getInRes() {
        return inRes;
    }

    public void setInRes(int inRes) {
        this.inRes = inRes;
    }

    public List<Integer> getD() {
        return d;
    }

    public void setD(List<Integer> d) {
        this.d = d;
    }

    public List<TakingTime> gettT() {
        return tT;
    }

    public void settT(List<TakingTime> tT) {
        this.tT = tT;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @JsonIgnoreProperties
    public static final class Builder extends NestedBuilder<PosologyListBuilder, Posology> {
        private String dtFrom;
        private String dtTo;
        private int cyDu;
        private int inRes;
        private List<Integer> d  = new ArrayList<>();
        private List<TakingTime> tT = new ArrayList<>();
        private PosologyListBuilder posologyListBuilder;

        private Builder() {
        }

        public Builder withDateFrom(String dtFrom) {
            this.dtFrom = dtFrom;
            return this;
        }

        public Builder withDateTo(String dtTo) {
            this.dtTo = dtTo;
            return this;
        }

        public Builder withCycleDuration(int cyDu) {
            this.cyDu = cyDu;
            return this;
        }

        public Builder addSimplifiedTakingTimeDose(int d) {
            this.d.add(d);
            return this;
        }
        public TakingTimeListBuilder addTakingTimes() {
            return TakingTimeListBuilder.newBuilder().withParentBuilder(this);
        }

        public PosologyListBuilder addPosologyToList() {
            this.posologyListBuilder.addPosology(this.build());
            return this.posologyListBuilder;
        }

        public Posology build() {
            return new Posology(this);
        }

    }

}
