package ss04_lop_doi_tuong_java.exercise;


public class StopWatchV {
    private long startTime;
    private long endTime;

    public StopWatchV() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        // Khai báo mảng 100000 phần tử.
        int arr[] = new int[10000000];
        int count = 0;
        StopWatchV stopWatchV = new StopWatchV();
        stopWatchV.start();
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        stopWatchV.stop();
        System.out.println("Thời gian mất là: " + stopWatchV.getElapsedTime() + " ms" + " biến đếm: " + count);
    }
}
