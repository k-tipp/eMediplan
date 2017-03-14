package CHMED16A.model;

import CHMED16A.builder.NestedBuilder;

public class TakingTime {
    private int off;
    private int du;
    private double doFrom;
    private double doTo;
    private double a;
    private double mA;

    private TakingTime(Builder builder) {
        this.off = builder.off;
        this.du = builder.du;
        this.doFrom = builder.doFrom;
        this.doTo = builder.doTo;
        this.a = builder.a;
        this.mA = builder.mA;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder extends NestedBuilder<Posology.Builder, TakingTime> {
        private int off;
        private int du;
        private double doFrom;
        private double doTo;
        private double a;
        private double mA;

        private Builder() {
        }

        public Builder withOff(int off) {
            this.off = off;
            return this;
        }

        public Builder withDu(int du) {
            this.du = du;
            return this;
        }

        public Builder withDoFrom(double doFrom) {
            this.doFrom = doFrom;
            return this;
        }

        public Builder withDoTo(double doTo) {
            this.doTo = doTo;
            return this;
        }

        public Builder withA(double a) {
            this.a = a;
            return this;
        }

        public Builder withMA(double mA) {
            this.mA = mA;
            return this;
        }


        public TakingTime build() {
            return new TakingTime(this);
        }

    }
}
