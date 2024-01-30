package ro.emanuel.vatman.pojo;

public class Vatman {
	
		private int id;
		private String nume;
		private String prenume;
		private String gen;
		private int varsta;
		private int ani_experienta;
		private String mers_tramvai;
		
		public Vatman(int id, String nume, String prenume, String gen, int varsta, int ani_experienta,
				String mers_tramvai) {
			this.id = id;
			this.nume = nume;
			this.prenume = prenume;
			this.gen = gen;
			this.varsta = varsta;
			this.ani_experienta = ani_experienta;
			this.mers_tramvai = mers_tramvai;
		}
		
		public Vatman() {
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

		public String getPrenume() {
			return prenume;
		}

		public void setPrenume(String prenume) {
			this.prenume = prenume;
		}

		public String getGen() {
			return gen;
		}

		public void setGen(String gen) {
			this.gen = gen;
		}

		public int getVarsta() {
			return varsta;
		}

		public void setVarsta(int varsta) {
			this.varsta = varsta;
		}

		public int getAni_experienta() {
			return ani_experienta;
		}

		public void setAni_experienta(int ani_experienta) {
			this.ani_experienta = ani_experienta;
		}

		public String getMers_tramvai() {
			return mers_tramvai;
		}

		public void setMers_tramvai(String mers_tramvai) {
			this.mers_tramvai = mers_tramvai;
		}
		
}
