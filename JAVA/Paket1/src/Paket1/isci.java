package paket1;

public class isci {
			private int maas=1;
			private int personelno;
			private int saat;
	public isci (int saat, int personelno, int maas){
		setSaat(saat);
		setPersonelno(personelno);
		setMaas(maas);
	}
			public int getMaas() {
				return maas;
			}
			public void setMaas(int saat ) {
				this.maas = maashesapla(saat);
			}
			public int getPersonelno() {
				return personelno;
			}
			public void setPersonelno(int personelno) {
				this.personelno = personelno;
			}
			private int maashesapla(int saat){
				return saat*10;
			}
			private int setSaat(int saat){
				return this.saat=saat;
			}
}
