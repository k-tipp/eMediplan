package CHMED16A;

public class Medicament {
	
	private String id;
	
	private int idType;
	
	private Iterable<Posology> pos;
	
	private String unit;
	
	private String tkgRsn;
	
	private String appInstr;
	
	private int autoMed;
	
	private String prscbBy;
	
	private String roa;
	
	private int rep;
	
	private int subs;
	
	private float nbPack;
	
	private Iterable<PrivateField> pFields;
	
	public Medicament(String id, int idType, int autoMed) {
		this.id = id;
		this.idType = idType;
		this.autoMed = autoMed;
	}

}
