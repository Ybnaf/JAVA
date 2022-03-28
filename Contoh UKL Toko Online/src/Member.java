import java.util.ArrayList;

public class Member implements User {

    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Member() {
        this.namaMember.add("Dion");
        this.alamat.add("Malang");
        this.telepon.add("01230123");
        this.saldo.add(9000000);

        this.namaMember.add("Adam");
        this.alamat.add("Malang");
        this.telepon.add("01231234");
        this.saldo.add(7400000);

        this.namaMember.add("Nizam");
        this.alamat.add("Malang");
        this.telepon.add("013423523");
        this.saldo.add(5000000);

    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);

    }

    public int getSaldo(int idMember) {
        return this.saldo.get(idMember);
    }

    // Untuk perubahan saldo member
    public void setSaldo(int saldo, int idMember) {
        this.saldo.set(saldo, idMember);
    }

    public int getJumlahMember() {
        return this.namaMember.size();
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

}
