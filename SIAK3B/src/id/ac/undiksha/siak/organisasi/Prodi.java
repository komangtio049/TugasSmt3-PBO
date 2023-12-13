package id.ac.undiksha.siak.organisasi;

public class Prodi implements Jurusan{
	
	private String kodeProdi;
	private String namaProdi;
	
	public Prodi(){
	}
	
	public Prodi(String kodeProdi, String namaProdi) {
		super();
		this.kodeProdi = kodeProdi;
		this.namaProdi = namaProdi;
	}

	public String getKodeProdi() {
		return kodeProdi;
	}

	public void setKodeProdi(String kodeProdi) {
		this.kodeProdi = kodeProdi;
	}

	public String getNamaProdi() {
		return namaProdi;
	}

	public void setNamaProdi(String namaProdi) {
		this.namaProdi = namaProdi;
	}

	private String kodeJurusan;
	@Override
	public void setKodeJurusan(String kodeJurusan) {
		this.kodeJurusan = kodeJurusan;
		
	}

	@Override
	public String getKodeJurusan() {
		// TODO Auto-generated method stub
		return this.kodeJurusan;
	}

	private String namaJurusan;
	@Override
	public void setNamaJurusan(String namaJurusan) {
		this.namaJurusan = namaJurusan;
		
	}

	@Override
	public String getNamaJurusan() {
		// TODO Auto-generated method stub
		return this.namaJurusan;
	}

	private String kodeFakultas;
	@Override
	public void setKodeFakultas(String kodeFakultas) {
		this.kodeFakultas = kodeFakultas;
		
	}

	@Override
	public String getKodeFakultas() {
		// TODO Auto-generated method stub
		return this.kodeFakultas;
	}

	private String namaFakultas;
	@Override
	public void setNamaFakultas(String namaFakultas) {
		this.namaFakultas = namaFakultas;
		
	}

	@Override
	public String getNamaFakultas() {
		// TODO Auto-generated method stub
		return this.namaFakultas;
	}
	
	

}
