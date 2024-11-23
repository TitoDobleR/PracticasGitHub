import java.util.Scanner;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un digito:");
        String texto = sc.nextLine();
        String TextoEncriptado = EncriptarSHA1(texto);
        System.out.println(TextoEncriptado);
    }

    public static String EncriptarSHA1(String texto) {
        try {
            MessageDigest dig = MessageDigest.getInstance("SHA-1");
            byte[] jash = dig.digest(texto.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : jash) {
                hexString.append(String.format("%02x", b));
            }
            return EncriptarSHA256(hexString.toString()).toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;

        }
    }

    public static String EncriptarSHA256(String texto) {
        try {
            MessageDigest dig = MessageDigest.getInstance("SHA-256");
            byte[] jash = dig.digest(texto.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : jash) {
                hexString.append(String.format("%02x", b));
            }
            return EncriptarSHA512(hexString.toString()).toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;

        }
    }

    public static String EncriptarSHA512(String texto) {
        try {
            MessageDigest dig = MessageDigest.getInstance("SHA-512");
            byte[] jash = dig.digest(texto.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : jash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;

        }
    }
}