package com.jizhi.oracle.java.study;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author JiZhi
 * @version V1.0
 * @date 2021/10/12 14:26
 **/
public class Day17 {

    public static void main(String[] args) throws IOException {
        extendOne();
    }

    public static void extendOne() throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("data.txt"));
        for (int i = 0; i < 3; i++) {
            System.out.print("输入第" + (i + 1) + "个校验码");
            String s = scanner.nextLine() + "\n";
            bufferedOutputStream.write(s.getBytes());
        }
        bufferedOutputStream.close();
        List<String> scannerList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String s = reader.readLine();
        while (s != null) {
            scannerList.add(s);
            s = reader.readLine();
        }

        System.out.println("输入被校验的验证码：");
        String s2 = scanner.nextLine();
        if (scannerList.contains(s2)) {
            System.out.println("存在");
        } else {
            System.out.println("不存在");
        }


    }

    @Test
    public void baseOne() throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("hello.txt"), StandardCharsets.UTF_8);
        outputStreamWriter.write("你好");
        outputStreamWriter.flush();
        outputStreamWriter.close();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("hello.txt"), StandardCharsets.UTF_8);
        int index = 0;
        while ((index = inputStreamReader.read()) != -1) {
            System.out.print((char) index);
        }
        inputStreamReader.close();
    }

    @Test
    public void baseTwo() throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "GBK");
        outputStreamWriter.write("你好jklfasdfjklasdfjkfasdjklsdf ajklasdfjklkjasdfjkl;asdfjkl;asdf121231231231231234568795");
        outputStreamWriter.flush();
        outputStreamWriter.close();
        outputStreamWriter = new OutputStreamWriter(new FileOutputStream("utf.txt"), StandardCharsets.UTF_8);
        outputStreamWriter.write("你好jklfasdfjklasdfjkfasdjklsdf ajklasdfjklkjasdfjkl;asdfjkl;asdf121231231231231234568795");
        outputStreamWriter.flush();
        outputStreamWriter.close();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("gbk.txt"), "GBK");
        int index;
        while ((index = inputStreamReader.read()) != -1) {
            System.out.print((char) index);
        }
        inputStreamReader.close();
        System.out.println();
        inputStreamReader = new InputStreamReader(new FileInputStream("utf.txt"), StandardCharsets.UTF_8);
        while ((index = inputStreamReader.read()) != -1) {
            System.out.print((char) index);
        }
        inputStreamReader.close();
    }

    @Test
    public void basicThree() throws IOException {
        String i_love_java = "i love javasddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
        byte[] bytes = i_love_java.getBytes(StandardCharsets.UTF_8);
        long start = System.currentTimeMillis();
        BufferedOutputStream outputStreamWriter = new BufferedOutputStream(new FileOutputStream("there1.txt"));
        outputStreamWriter.write(bytes);
        outputStreamWriter.flush();
        outputStreamWriter.close();
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
        start = System.currentTimeMillis();
        FileOutputStream fileOutputStream = new FileOutputStream("there2.txt");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }

    @Test
    public void basicFour() throws IOException {
        BufferedInputStream inputStreamReader = new BufferedInputStream(new FileInputStream("1.png"));
        BufferedOutputStream outputStreamWriter = new BufferedOutputStream(new FileOutputStream("1_copy.png"));
        byte[] datas = new byte[1024];

        int read;
        while ((read = inputStreamReader.read(datas)) != -1) {
            outputStreamWriter.write(datas, 0, read);
            outputStreamWriter.flush();
        }
        outputStreamWriter.close();
        inputStreamReader.close();


        inputStreamReader = new BufferedInputStream(new FileInputStream("2.mp4"));
        outputStreamWriter = new BufferedOutputStream(new FileOutputStream("2_copy.mp4"));

        while ((read = inputStreamReader.read(datas)) != -1) {
            outputStreamWriter.write(datas, 0, read);
            outputStreamWriter.flush();
        }
        outputStreamWriter.close();
        inputStreamReader.close();
    }

    @Test
    public void beanToTxt() throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.txt"));
        objectOutputStream.writeObject(new Student("极致", 6, 0));
        objectOutputStream.close();

    }

    @Test
    public void txtToBean() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.txt"));
        Student o = (Student) objectInputStream.readObject();
        System.out.println(o);

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Student implements Serializable{
        private String name;
        private int age;
        private int sex;
    }


}
