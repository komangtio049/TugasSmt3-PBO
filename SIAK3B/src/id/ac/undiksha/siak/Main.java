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
		
        System.out.println("_________________________");
		
        Dosen vladimir = new Dosen();
        vladimir.setNip("150001");
        vladimir.setNama("Vladimir");
        vladimir.setAlamat("Gilimanuk");
        vladimir.setBidang_keahlian("Teknologi Web");
        vladimir.setJeniskelamin(false);
        vladimir.setAlamat("Negara");
        vladimir.setTanggalLahir("29 Februari 1990");

        
        System.out.println(vladimir.getNip());
        System.out.println(vladimir.getNama());
        System.out.println(vladimir.getTanggalLahir());
        System.out.println(vladimir.getJenisKelamin());
        System.out.println(vladimir.getBidang_keahlian());
        System.out.println(vladimir.getAlamat());
        
        System.out.println("_________________________");
        
        Mahasiswa budi =  new Mahasiswa();
        budi.printAll();
        
        System.out.println("_________________________");
        
        //Mahasiswa caca = new Mahasiswa("Caca", "Gianyar", "1 Februari 2000", true, "230002", "Geografi");
        //caca.printAll();
        
        System.out.println("_________________________");
        
        Dosen volibear = new Dosen("Volibear", "Tabanan", "3 Maret 1995", false, "150002", "Kimia");
        volibear.printAll();
        
        System.out.println("_________________________");
        
        //Manusia mh2 = new Mahasiswa();
        //Mahasiswa mh1 = new Manusia();
        
        Mahasiswa ashe = new Mahasiswa();
        ashe.printAll();
        ashe.getProdi().setKodeProdi("1");
        ashe.getProdi().setNamaProdi("Ilmu Komputer");        
        
        
        
	}

}