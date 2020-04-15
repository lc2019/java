package day07.write;
/**
 * 异常处理以及finally
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class tryc {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("c:/x");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
