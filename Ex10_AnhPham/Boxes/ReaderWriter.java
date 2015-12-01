package Boxes;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class ReaderWriter {
    public static void main(String[] args) {
        NumberBox box = new NumberBox();
        Writer writer = new Writer(box);
        Reader reader = new Reader(box);
        writer.start();
        reader.start();
    }
}
