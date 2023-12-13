package id.ac.undiksha.siak.people;

import id.ac.undiksha.siak.organisasi.Prodi;

public class Mahasiswa extends Manusia {
	private String nim;
	//private String prodi;
	private Prodi prodi = new Prodi();
	
	public Mahasiswa() {
		this.nim			= "<Masukkan NIM>";
		//this.prodi 			= "<Masukkan Prodi>";
	}
	
	
	public Mahasiswa(String nama, String alamat, String tanggalLahir, boolean jeniskelamin, String nim, String prodi) {
		super(nama, alamat, tanggalLahir, jeniskelamin);
		this.nim = nim;
		//prodi = prodi;
	}


	public Mahasiswa(String nim, String nama, String alamat, String prodi, String tanggalLahir, boolean jeniskelamin) {
		super();
		this.nim = nim;
		//this.prodi = prodi;
	}
	
	
	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public String getNim() {
		return this.nim;
	}

	//public String getProdi() {
		//return prodi;
	//}

	public void setProdi(String prodi) {
		//this.prodi = prodi;
	}
	
	public void printAll() {
		super.printAll();
		System.out.println(this.getNim());
		System.out.println(this.getProdi().getNamaProdi());
	}
	
    public Prodi getProdi() {
        return prodi;
    }
}