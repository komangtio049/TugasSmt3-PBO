package id.ac.undiksha.siak;


import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mahasiswa akali =  new Mahasiswa();
		
		akali.setNim("230001");
		akali.setNama("Akali");
		akali.setTanggalLahir("1 Januari 2000");
		akali.setJeniskelamin(true);
		akali.setProdi("Ilmu Komputer");
		akali.setAlamat("Singaraja");
		
		/*akali.nim = "230001";
		akali.nama = "Akali";
		akali.tanggalLahir = "1 Januari 2000";
		akali.jeniskelamin = true;
		akali.prodi = "Ilmu Komputer";
		akali.alamat = "Singaraja";
		*/
		
		System.out.println(akali.getNim());
		System.out.println(akali.getNama());
		System.out.println(akali.getTanggalLahir());
		System.out.println(akali.getJenisKelamin());
		System.out.println(akali.getProdi());
		System.out.println(akali.getAlamat());
		
        Dosen vladimir = new Dosen();
        vladimir.setNip("150001");
        vladimir.setNama_dosen("Vladimir");
        vladimir.setAlamat("Gilimanuk");
        vladimir.setBidang_keahlian("Teknologi Web");
        vladimir.setJenisKelamin(false);

        
        System.out.println(vladimir.getNip());
        System.out.println(vladimir.getNama_dosen());
        System.out.println(vladimir.getAlamat());
        System.out.println(vladimir.getJenisKelamin());
        System.out.println(vladimir.getBidang_keahlian());
	}

}