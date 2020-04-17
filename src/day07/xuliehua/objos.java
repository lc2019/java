package day07.xuliehua;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
类的序列化由实现java.io.Serializable接口的类启用。 不实现此接口的类将不会使任何状态序列化或反序列化。
可序列化类的所有子类型都是可序列化的。
 */
public class objos {
    public static void main(String[] args) throws IOException {

        ObjectOutputStream objos = new ObjectOutputStream(new FileOutputStream("demo3.txt"));
        stu s1 = new stu("lc", 20);
        //序列化
        objos.writeObject(s1);

        objos.close();
    }
}
