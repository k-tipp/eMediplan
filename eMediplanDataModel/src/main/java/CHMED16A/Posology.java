package CHMED16A;

import java.util.Iterator;

public class Posology {

    private String dtFrom;

    private String dtTo;

    private int cyDu;

    private int inRes;

    private Iterator<Integer> d;

    private Iterator<TakingTime> tT;

    public Posology(String dtFrom, int cyDu) {
        this.dtFrom = dtFrom;
        this.cyDu = cyDu;
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
}
