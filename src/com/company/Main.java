package com.company;
import java.util.ArrayList;
import java.util.Scanner;
class Prime {
    public void Factor(int number) {
        for (int i = 2; i <= Math.sqrt(number);){
            if(number % i ==0){
                System.out.print(i);
                number /= i;
                if(number > 1)
                    System.out.print(' ');
            }
            else
                i++;
        }
        if(number > 1)
            System.out.print(number);
    }
}
class Palindrome {
    public boolean checker(String line){
        return (line.equals(new StringBuilder(line).reverse().toString()));
    }
}
class Sequence {
    private ArrayList<Integer> arr;
    public Sequence(){
        arr = new ArrayList<Integer>();
        this.input();
    }
    public void input(){
        if (!arr.isEmpty())
            arr.clear();
        Scanner sc = new Scanner(System.in);
        int buf = 0;

        buf = sc.nextInt();
        while(buf != 0) {
            arr.add(buf);
            buf = sc.nextInt();
        }
    }
    public int Max(){
        int maxnum = Integer.MIN_VALUE;
        for (Integer number : arr)
            if (number > maxnum)
                maxnum = number;
        return maxnum;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите режим работы программы:\n 1. Разложение на множители \n 2. Палиндром \n 3. Максимум последовательности \n");
        Scanner scanner = new Scanner(System.in);
        int sw = scanner.nextInt();
        switch(sw){
            case 1:
                Scanner scan = new Scanner(System.in);

                Prime primeFactorization = new Prime();
                primeFactorization.Factor(scan.nextInt());
                break;
            case 2:
                Scanner sc = new Scanner(System.in);

                Palindrome palindrome = new Palindrome();
                if (palindrome.checker(sc.nextLine()))
                    System.out.println("Да");
                else
                    System.out.println("Нет");
                break;
            case 3:
                Sequence mySequence = new Sequence();
                int maxSequenceNumber = mySequence.Max();

                if (maxSequenceNumber == Integer.MIN_VALUE)
                    System.out.println("Последовательность пуста");
                else
                    System.out.println("Максимальное значение последовательности: " + maxSequenceNumber);
                break;
        }
    }
}