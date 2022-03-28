import java.util.ArrayList;

public class Karyawan implements User {

    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    Karyawan() {

        this.namaKaryawan.add("Abdul");
        this.alamat.add("Malang");
        this.telepon.add("02134241");
        this.jabatan.add(0);

    }

    public void setJabatan(int jabatan) {
        this.jabatan.add(jabatan);

    }

    public int getJabatan(int id) {
        return this.jabatan.get(id);

    }

    public int getJumlahKaryawan() {
        return this.namaKaryawan.size();

    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);

    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

}
