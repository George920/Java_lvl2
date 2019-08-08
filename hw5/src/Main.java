
public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        arrSolo();
        arrDoubleT();
    }
    private static void arrSolo (){
        float[] arr = new float[size];
        fill(arr);
        long a = System.currentTimeMillis();
        calculate(arr);
        System.out.println("Первый метод закончил подсчеты за: " + (System.currentTimeMillis()-a));
    }
    private static void arrDoubleT (){
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        fill(arr);

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                calculate(arr1);
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                calculate(arr2);
            }
        });

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        System.out.println("Второй метод закончил подсчеты за: " + (System.currentTimeMillis()-a));
    }
    private static float[] calculate (float[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }
    private static float[] fill (float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1.0f;
        }
        return arr;
    }
}
