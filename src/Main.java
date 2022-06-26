import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                list1.add(new Random().nextInt(10));
            }
            list.add(list1);
        }
        //System.out.println(list);
        //Выводим матрицу
        for (int i = 0; i < list.size() ; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
        }
        //переставляем эллемнеты
        Integer temp;
        for (int i = 0; i < 5; i++) {
            temp = list.get(i).get(0);
            for (int j = 0; j < 4; j++) {
                list.get(i).set(j,list.get(i).get(j+1));
            }
            list.get(i).set(4,temp);
        }

        System.out.println("");
        //Выводим матрицу
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
        }
    }
}