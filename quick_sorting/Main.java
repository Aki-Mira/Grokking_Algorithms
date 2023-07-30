import java.util.ArrayList;
class Main {
  // Рекурсия для суммирования элементов массива
  public static int sum(int [] array, int l)
  {
    int summ;
    if (l == 0)
    {
      summ = 0;
    }
    else
    {
      summ = array [l - 1] + sum(array, l - 1);
    }
    return summ;
  }
  // Рекурсия нахождения колличества элементов в списке
  public static int count(ArrayList <Integer>  List)
  {
    int c;
    ArrayList<Integer> D1 = new ArrayList <> ();
    if (List.isEmpty())
    {
      c = 0;
    }
    else
    {
      D1.add(List.get(0));
      List.remove(0);
      c = 1 + count(List);
    }
    List.addAll(D1);
    D1.clear();
    return c;
  }
  // Рекурсия нахождения максимального числа из списка 
  public static int max(ArrayList <Integer>  List)
  {
    int m1 = List.get(0);
    ArrayList<Integer> D1 = new ArrayList <> ();
    while (List.size() != 1)
    {
     D1.add(List.get(0));
     List.remove(0);
     if (List.get(0) > m1)
     {
      m1 = max(List);
     }
    }
    List.addAll(D1);
    D1.clear();
    return m1;
  }
  public static void main(String[] args) {
//1. Напишите рекурсивный код для сумирования элементов массива
    int [] F = {3, 6};
    int s = sum(F, F.length);
    System.out.println(s);
//2. Напишите рекурсивную функцию для нахождения колличества элементов в списке
    ArrayList<Integer> D = new ArrayList <> ();
    D.add(1);
    D.add(1);
    D.add(1);
    int c = count(D);
    System.out.println(c);
//3. Найдите наибольшее число в списке
    ArrayList<Integer> K = new ArrayList <> ();
    K.add(-1);
    K.add(-4);
    K.add(-3);
    K.add(-7);
    K.add(-12);
    K.add(-54);
    K.add(-99);
    K.add(-8);
    K.add(-9);
    int m = max(K);
    System.out.println(m);
  }
}