/**
 * Класс Palindrome выполняет задание связанное
 * */
public class Palindrome {

    /**
     * Поле symbol это поле в котором будут храняться входные данные
     * */
    private static String symbol = "";

    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            symbol = args[i];
            //Вызываем метод isPalindrom и узнаем является ли слово палиндромом
            isPalindrom(symbol);

        }
    }

    /**
     * Данный метод используется для того чтобы вывести слово в обратном порядке
     */
    public static String reverseString(String name)
    {
        //Данная переменная будет хранить в себе слово в обратном порядке
        String a = "";
        //Цикл от длины самого слова до 0
        for (int i = name.length() - 1; i >= 0; i--)
        {
            //Получаем слово в обратном порядке с использованием charAt
            //который возвращяет символ по указанному индексу
            a += name.charAt(i);
        }
        //Возвращает слово в обратном порядке
        return a;
    }

    /**
     * Метод в котором определяется, является ли слово палиндромом
     * */
    public static boolean isPalindrom(String s)
    {
        //Сравнивает слово которое мы перевернули и с первоначальными даннами
        if (symbol.equals(reverseString(symbol)))
        {
            //Если сравнение успешное, то выводит что данное слово не является палиндромом
            System.out.print("Данное слово: " + s + " является палиндромом \n" );
            return true;
        }
        //Если сравнение не успешное то выводит что данное слово не является палиндромом
        System.out.print("Данное слово: " + s + " не является палиндромом \n" );
        return false;

    }
}
