package id.ac.undiksha.siak.people;

public class Dosen extends Manusia{

	public String nip;
	public String bidang_keahlian; 
	
	public Dosen() {
		this.nip				= "<Masukkan NIP>";
		this.bidang_keahlian	= "<Masukkan Prodi>";
	}
	
	public Dosen(String nip, String bidang_keahlian) {
		super();
		this.nip = nip;
		this.bidang_keahlian = bidang_keahlian;
	}
	
	
	public Dosen(String nama, String alamat, String tanggalLahir, boolean jeniskelamin, String nip, String bidang_keahlian) {
		super(nama, alamat, tanggalLahir, jeniskelamin);
		this.nip = nip;
		this.bidang_keahlian = bidang_keahlian;
	}

	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getBidang_keahlian() {
		return bidang_keahlian;
	}
	public void setBidang_keahlian(String bidang_keahlian) {
		this.bidang_keahlian = bidang_keahlian;
	}
	
	public void printAll() {
		super.printAll();
		System.out.println(this.getNip());
		System.out.println(this.getBidang_keahlian());
	}
}
