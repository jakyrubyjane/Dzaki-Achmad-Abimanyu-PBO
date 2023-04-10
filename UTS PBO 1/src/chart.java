import java.util.ArrayList;

public class chart {
    private int beban;
    private String nama;
    static ArrayList<String> namalist = new ArrayList<>();
    static ArrayList<Integer> bebanlist = new ArrayList<>();

    public chart(int beban, String nama) {
        namalist.add(nama);
        bebanlist.add(beban);
    }

    public chart() {

    }

    public int getBeban() {
        return beban;
    }

    public void setBeban() {
        this.beban = beban;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public void addChart(chart chart) {

    }
}

