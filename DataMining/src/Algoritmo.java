
class Algoritmo {
	private StringBuffer teks = new StringBuffer ();
	private String cari;
	Algoritmo(){
		System.out.println("  Anda Belum Memasukkan Teks..");
	}
	Algoritmo(StringBuffer teks, String cari){
		this.teks.append(teks);
		this.cari=cari;
	}
	int find() {
		int i, jml=0;
		int k=0;
		teks.append(' ');
		for(i=0; i<this.teks.length();i++) {
			if(this.teks.charAt(i)==' ') {
				if(this.cari.equalsIgnoreCase(this.teks.substring(k, i))==true) {
					jml+=1;
				}
				k=i+1;
			}
		}
		return jml;
	}
}
