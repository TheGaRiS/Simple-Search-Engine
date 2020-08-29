import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        byte[] b = inputStream.readNBytes(256);
        for (byte value : b) {
            System.out.print(value);
        }
    }
}