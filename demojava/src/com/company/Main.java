package com.company;


import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("in.csv");
        FileWriter fw = new FileWriter("out.txt");

        ArrayList<Student> LstStudet = new ArrayList<Student>();

        BufferedReader br = new BufferedReader(fr);

        // write data from in.csv to file out.txt
        fw.write(br.readLine() + '\n'); //write name class
        while (true){
            Student st = new Student();
            String str = br.readLine();
            if (str == null)
                break;

            st._MSSV = str.split(",")[0]; //set MSSV for student
            st._HOTEN = str.split(",")[1]; //set Name for student
            if (str.split(",")[2].equals("Nam"))
                st._GT = true; //set true if is boy
            else
                st._GT = false; //set true if is girl
            st._CMND = str.split(",")[3]; //set CMND for student
            LstStudet.add(st);

            fw.write(str + '\n'); //write file out.txt
        }
        fr.close();
        fw.close();
        System.out.println("MSSV \t HỌ TÊN \t GIỚI TÍNH \t CMND");
        for (int i = 0; i< LstStudet.size(); i++){
            System.out.println(LstStudet.get(i)._MSSV +  '\t' +
                    LstStudet.get(i)._HOTEN + '\t' +
                    (LstStudet.get(i)._GT == true ? "Nam" : "Nữ") + '\t' +
                    LstStudet.get(i)._CMND);
        }


    }
}
