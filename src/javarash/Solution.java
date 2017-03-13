package javarash;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Консоль-копилка
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово «сумма».
Вывести на экран полученную сумму.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        while (true) {
            String a = reader.readLine();
            if (a.equals("сумма")) {
                System.out.println(s);
                break;
            }
            else {
                int i = Integer.parseInt(a);
                s = s + i;
            }
        }
    }
}


