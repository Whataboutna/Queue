public class Queue {
    private int[] elemen;
    private int ukuran;
    private int kapasitas;

    public Queue(int kapasitas) {
        this.kapasitas = kapasitas;
        this.elemen = new int[kapasitas];
        this.ukuran = 0;
    }

    public void enqueue(int data) {
        if (ukuran == kapasitas) {
            System.out.println("Antrean penuh!");
            return;
        }
        elemen[ukuran] = data;
        ukuran++;
        System.out.println(data + " masuk antrean.");
    }

    public void dequeue() {
        if (ukuran == 0) {
            System.out.println("Antrean kosong!");
            return;
        }
        
        int dataKeluar = elemen[0];
        for (int i = 0; i < ukuran - 1; i++) {
            elemen[i] = elemen[i + 1];
        }
        ukuran--;
        System.out.println(dataKeluar + " keluar antrean.");
    }

    public void peek() {
        if (ukuran == 0) {
            System.out.println("Antrean kosong!");
        } else {
            System.out.println("Elemen terdepan: " + elemen[0]);
        }
    }

    public void tampilkan() {
        if (ukuran == 0) {
            System.out.println("Antrean kosong!");
            return;
        }
        System.out.print("Isi Antrean: ");
        for (int i = 0; i < ukuran; i++) {
            System.out.print(elemen[i] + " ");
        }
        System.out.println();
    }
}