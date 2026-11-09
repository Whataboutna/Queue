public class Main {
    public static void main(String[] args) {
        Queue antrean = new Queue(3);

        antrean.enqueue(10);
        antrean.enqueue(20);
        antrean.enqueue(30);

        antrean.tampilkan();
        antrean.peek();

        antrean.dequeue();
        antrean.tampilkan();
}
}