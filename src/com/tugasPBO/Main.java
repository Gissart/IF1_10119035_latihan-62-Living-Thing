package com.tugasPBO;
/*Nama      : Argya Aulia Fauzandika
  NIM       : 10119035
  Kelas     : IF1
  Deskripsi : program ini menampilkan OOP tentang kehidupan sehari hari manusia
* */
public class Main {
    public static void main(String[] args){
        Human human = new Human();
        human.setNama("Argya Aulia Fauzandika");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
}
