package id.ac.undiksha.siak.people;

public class Manusia {
	private String nama;
	private String alamat;
	private String tanggalLahir;
	private boolean jeniskelamin;
	
	public Manusia() {
		this.nama 			= "<Masukkan Nama>";
		this.alamat 		= "<Masukkan Alamat>";
		this.tanggalLahir 	= "<Masukkan Tanggal Lahir>";
	}
	
	public Manusia(String nama, String alamat, String tanggalLahir, boolean jeniskelamin) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.tanggalLahir = tanggalLahir;
		this.jeniskelamin = jeniskelamin;
	}
	

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	
	public boolean isJeniskelamin() {
		return jeniskelamin;
	}
	
	public String getJenisKelamin() {
		if (this.isJeniskelamin()) {
			return "Perempuan";
		} else {
			return "Laki-Laki";
		}
	}

	public void setJeniskelamin(boolean jeniskelamin) {
		this.jeniskelamin = jeniskelamin;
	}
	
	public void printAll() {
		System.out.println(this.getNama());
		System.out.println(this.getTanggalLahir());
		System.out.println(this.getJenisKelamin());
		System.out.println(this.getAlamat());
	}
	
}


