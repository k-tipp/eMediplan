package CHMED16A.model;

import CHMED16A.builder.NestedBuilder;

import java.util.Iterator;
import java.util.List;

public class Posology {

    private String dtFrom;
    private String dtTo;
    private int cyDu;
    private int inRes;
    private List<Integer> d;
    private List<TakingTime> tT;

    private Posology(Builder builder) {
        this.dtFrom = builder.dtFrom;
        this.cyDu = builder.cyDu;
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

    public Iterator<Integer> getD() {
        return d;
    }

    public void setD(Iterator<Integer> d) {
        this.d = d;
    }

    public Iterator<TakingTime> gettT() {
        return tT;
    }

    public void settT(Iterator<TakingTime> tT) {
        this.tT = tT;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder extends NestedBuilder<Medicament.Builder, Posology> {
        private String dtFrom;
        private String dtTo;
        private int cyDu;
        private int inRes;
        private List<Integer> d;
        private List<TakingTime> tT;

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

        public Builder addD(int d) {
            this.d.add(d);
            return this;
        }
        public Builder addTT(TakingTime) {
            this.d.add(d);
        }

        public Posology build() {
            return new Posology(this);
        }

    }

}
