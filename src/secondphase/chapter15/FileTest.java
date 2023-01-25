package secondphase.chapter15;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
//        File file = new File("word.txt");
//        if (file.exists()) {
//            file.delete();
//            System.out.println("文件已删除");
//        } else {
//            try {
//                file.createNewFile();
//                System.out.println("文件已创建");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

        File file = new File("word.txt");
//        try {
//            String string = "我有一只小毛驴，我从来都不骑";
//            String[] content = {"加油", "加油", "加油"};
//            FileWriter out = new FileWriter(file);
//            BufferedWriter writer = new BufferedWriter(out);
//            for (int i = 0; i < content.length; i++) {
//                writer.write(content[i]);
//                writer.newLine();
//            }
//            writer.write(string);
//            writer.close();
//            out.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            FileReader in = new FileReader(file);
//            BufferedReader reader = new BufferedReader(in);
//            System.out.println("文件的信息是：");
//            String s;
//            while ((s = reader.readLine()) != null) {
//                System.out.println(s);
//            }
//            in.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dis = new DataOutputStream(fos);
            dis.writeUTF("加油s");
            dis.writeChars("加油ss");
            dis.writeBytes("加油sss");
            dis.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
