package org.example;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Gender (M/F): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = jenisKelaminInput.equalsIgnoreCase("M") ? "Male" : "Fimale";

        System.out.print("Date (yyyy-mm-dd): ");
        String tanggalLahirStr = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        LocalDate now = LocalDate.now();
        long year = ChronoUnit.YEARS.between(tanggalLahir, now);
        long mon = ChronoUnit.MONTHS.between(tanggalLahir.plusYears(year), now);

        System.out.println("\nOutput:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + jenisKelamin);
        System.out.println("Your age: " + year + " year " + mon + " mon");
    }
}