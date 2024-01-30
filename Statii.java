package ro.emanuel.statii.pojo;

public class Statii {

	private int id;
	private String nume;
	private int urcare;
	private int coborare;
	private int unuN;
	private int unuR;
	private int unuS;
	private int doiN;
	private int doiR;
	private int treiN;
	private int treiR;
	private int patruN;
	private int patruR;
	
	
	public Statii(int id, String nume, int urcare, int coborare, int unuN, int unuR, int unuS, int doiN, int doiR,
			int treiN, int treiR, int patruN, int patruR) {
		this.id = id;
		this.nume = nume;
		this.urcare = urcare;
		this.coborare = coborare;
		this.unuN = unuN;
		this.unuR = unuR;
		this.unuS = unuS;
		this.doiN = doiN;
		this.doiR = doiR;
		this.treiN = treiN;
		this.treiR = treiR;
		this.patruN = patruN;
		this.patruR = patruR;
	}
	
	public Statii() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getUrcare() {
		return urcare;
	}

	public void setUrcare(int urcare) {
		this.urcare = urcare;
	}

	public int getCoborare() {
		return coborare;
	}

	public void setCoborare(int coborare) {
		this.coborare = coborare;
	}

	public int getUnuN() {
		return unuN;
	}

	public void setUnuN(int unuN) {
		this.unuN = unuN;
	}

	public int getUnuR() {
		return unuR;
	}

	public void setUnuR(int unuR) {
		this.unuR = unuR;
	}

	public int getUnuS() {
		return unuS;
	}

	public void setUnuS(int unuS) {
		this.unuS = unuS;
	}

	public int getDoiN() {
		return doiN;
	}

	public void setDoiN(int doiN) {
		this.doiN = doiN;
	}

	public int getDoiR() {
		return doiR;
	}

	public void setDoiR(int doiR) {
		this.doiR = doiR;
	}

	public int getTreiN() {
		return treiN;
	}

	public void setTreiN(int treiN) {
		this.treiN = treiN;
	}

	public int getTreiR() {
		return treiR;
	}

	public void setTreiR(int treiR) {
		this.treiR = treiR;
	}

	public int getPatruN() {
		return patruN;
	}

	public void setPatruN(int patruN) {
		this.patruN = patruN;
	}

	public int getPatruR() {
		return patruR;
	}

	public void setPatruR(int patruR) {
		this.patruR = patruR;
	}
}
