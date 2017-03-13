package CHMED16A;

public class Recommendation {
    private String id;

    private int patAgr;
    private String rmk;

    public Recommendation(String id) {
        this.id = id;
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
}
