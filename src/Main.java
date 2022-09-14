

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    static String[] mas = {"Обычный", "профи", "юселесс"};
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<UsualPeople> arrayList = new ArrayList<>();
    int n = scanner.nextInt();
    for(int i = 0; i < n;i++){
        arrayList.add(new UsualPeople(String.format("Я %s человек", mas[i%3])));

    }
    for (UsualPeople u : arrayList){
        u.talk();
    }
    }
}
