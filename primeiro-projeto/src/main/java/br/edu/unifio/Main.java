package br.edu.unifio;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String senha = RandomStringUtils.insecure().nextAlphabetic(8);
        System.out.println(senha);
    }
}