package ro.emanuel.tramvai.pojo;

import java.sql.Date;

public class Tramvai {
	
	private int id;
	private float lungimea;
	private int nr_scaune;
	private int max_capacitate;
	private String linia;
	private int timp_ciclu;
	private Date pornit;
	
	public Tramvai(int id, float lungimea, int nr_scaune, int max_capacitate, String linia, int timp_ciclu,
			Date pornit) {
		this.id = id;
		this.lungimea = lungimea;
		this.nr_scaune = nr_scaune;
		this.max_capacitate = max_capacitate;
		this.linia = linia;
		this.timp_ciclu = timp_ciclu;
		this.pornit = pornit;
	}
	
	public Tramvai() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getLungimea() {
		return lungimea;
	}

	public void setLungimea(float lungimea) {
		this.lungimea = lungimea;
	}

	public int getNr_scaune() {
		return nr_scaune;
	}

	public void setNr_scaune(int nr_scaune) {
		this.nr_scaune = nr_scaune;
	}

	public int getMax_capacitate() {
		return max_capacitate;
	}

	public void setMax_capacitate(int max_capacitate) {
		this.max_capacitate = max_capacitate;
	}

	public String getLinia() {
		return linia;
	}

	public void setLinia(String linia) {
		this.linia = linia;
	}

	public int getTimp_ciclu() {
		return timp_ciclu;
	}

	public void setTimp_ciclu(int timp_ciclu) {
		this.timp_ciclu = timp_ciclu;
	}

	public Date getPornit() {
		return pornit;
	}

	public void setPornit(Date pornit) {
		this.pornit = pornit;
	}

}
