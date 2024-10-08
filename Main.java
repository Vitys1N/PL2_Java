import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    // Метод для получения дробной части числа
    public double fraction(double x) {
        return x - (int) x;
    }

    // Метод для преобразования символа в число
    public int charToNum(char x) {
        return x - '0'; // Вычитание символа '0' для получения числа
    }

    // Метод для проверки, является ли число двузначным
    public boolean is2Digits(int x) {
        return (x >= 10 && x <= 99) || (x >= -99 && x <= -10);
    }

    // Метод для проверки, входит ли число в диапазон
    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b); // находим меньшую границу
        int max = Math.max(a, b); // находим большую границу
        return num >= min && num <= max;
    }

    // Метод для проверки, равны ли три числа
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // Метод для нахождения модуля числа
    public int abs(int x) {
        if (x<0) {
            return -x;
        }
        return x;
    }

    // Метод для проверки делимости на 3 или 5
    public boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false; // Делится на 3 и 5 одновременно
        } else {
            return x % 3 == 0 || x % 5 == 0;
        }
    }

    // Метод для нахождения максимума из трех чисел
    public int max3(int x, int y, int z) {
        int max = (x > y) ? x : y;
        return (max > z) ? max : z;
    }

    // Метод для суммы двух чисел с проверкой диапазона
    public int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    // Метод для получения дня недели
    public String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    // Метод для вывода всех чисел от 0 до x включительно
    public String listNums(int x) {
        StringBuilder result = new StringBuilder("0");
        for (int i = 0; i <= x; i++) {
            result.append(" ").append(Integer.toString(i));
        }
        return result.toString();
    }

    // Метод для вывода всех четных чисел от 0 до x включительно
    public String chet(int x) {
        StringBuilder result = new StringBuilder("0");
        for (int i = 0; i <= x; i += 2) {
            result.append(" ").append(i);
        }
        return result.toString();
    }

    // Метод для подсчета количества знаков в числе
    public int numLen(long x) {
        int length = 0;
        while (x != 0) {
            x /= 10;
            length++;
        }
        return (length == 0) ? 1 : length; // Если число 0, то длина будет 1
    }

    // Метод для вывода квадрата размером x на x символами '*'
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                out.print("*");
            }
            out.println(); // Новая строка
        }
    }

    // Метод для вывода правого треугольника символами '*', выровненного по правому краю
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            // Вывод пробелов
            for (int j = 0; j < x - i; j++) {
                out.print(" ");
            }
            // Вывод звездочек
            for (int k = 0; k < i; k++) {
                out.print("*");
            }
            out.println(); // Новая строка
        }
    }

    // Метод для поиска первого вхождения числа x в массив arr
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Возвращаем индекс первого вхождения
            }
        }
        return -1; // Если число не найдено
    }

    // Метод для поиска наибольшего по модулю значения в массиве
    public int maxAbs(int[] arr) {
        int max = Math.abs(arr[0]);
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
                result = arr[i];
            }
        }
        return result;
    }

    // Метод для вставки массива ins в массив arr на позицию pos
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        // Копируем элементы до позиции вставки
        System.arraycopy(arr, 0, result, 0, pos);
        // Копируем элементы для вставки
        System.arraycopy(ins, 0, result, pos, ins.length);
        // Копируем оставшиеся элементы
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }

    // Метод для реверса массива arr
    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // Метод для поиска всех индексов числа x в массиве arr
    public int[] findAll(int[] arr, int x) {
        // Считаем количество вхождений числа x
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }

        // Если вхождений нет, возвращаем пустой массив
        if (count == 0) {
            return new int[0];
        }

        // Создаем массив для индексов вхождений
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index++] = i;
            }
        }
        return result;
    }

    // ввод массива
    public int[] inputArray(Scanner scanner) {
        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main tasks = new Main();

        while (true) {
            out.println("Выберите задание:");
            out.println("11 - Дробная часть");
            out.println("13 - Преобразовать символ в число");
            out.println("15 - Проверить, является ли число двузначным");
            out.println("17 - Проверить, входит ли число в диапазон");
            out.println("19 - Проверить, равны ли три числа");
            out.println("21 - Модуль числа");
            out.println("23 - Проверка делимости на 3 или 5");
            out.println("25 - Максимум из трех чисел");
            out.println("27 - Сумма двух чисел с проверкой");
            out.println("29 - День недели");
            out.println("31 - Вывести все числа от 0 до x");
            out.println("33 - Вывести все четные числа от 0 до x");
            out.println("35 - Подсчитать количество цифр в числе");
            out.println("37 - Нарисовать квадрат из символов '*'");
            out.println("39 - Нарисовать правый треугольник из символов '*'");
            out.println("41 - Поиск первого вхождения числа x в массив");
            out.println("43 - Найти наибольшее по модулю значение в массиве");
            out.println("45 - Вставить один массив в другой");
            out.println("47 - Реверс массива");
            out.println("49 - Найти все индексы вхождений числа x");
            out.println("0 - Выход");
            out.print("Номер: ");

            int choice = in.nextInt();

            switch (choice) {
                case 11:
                    // метод fraction
                    out.print("Введите вещественное число: ");
                    double num = in.nextDouble();
                    out.println("Дробная часть числа: " + tasks.fraction(num));
                    break;

                case 13:
                    // метод charToNum
                    out.print("Введите символ от '0' до '9': ");
                    char ch = in.next().charAt(0);
                    if (ch >= '0' && ch <= '9') {
                        out.println("Число, соответствующее символу: " + tasks.charToNum(ch));
                    } else {
                        out.println("Введен некорректный символ.");
                    }
                    break;

                case 15:
                    // метод is2Digits
                    out.print("Введите целое число: ");
                    int intNum = in.nextInt();
                    out.println("Число является двузначным: " + tasks.is2Digits(intNum));
                    break;

                case 17:
                    // метод isInRange
                    out.print("Введите первую границу диапазона: ");
                    int a = in.nextInt();
                    out.print("Введите вторую границу диапазона: ");
                    int b = in.nextInt();
                    out.print("Введите число для проверки: ");
                    int numForRange = in.nextInt();
                    out.println("Число " + numForRange + " входит в диапазон: " + tasks.isInRange(a, b, numForRange));
                    break;

                case 19:
                    // метод isEqual
                    out.print("Введите первое число: ");
                    int first = in.nextInt();
                    out.print("Введите второе число: ");
                    int second = in.nextInt();
                    out.print("Введите третье число: ");
                    int third = in.nextInt();
                    out.println("Все три числа равны: " + tasks.isEqual(first, second, third));
                    break;

                case 21:
                    // метод abs
                    out.print("Введите число для модуля: ");
                    int absNum = in.nextInt();
                    out.println("Модуль числа: " + tasks.abs(absNum));
                    break;

                case 23:
                    // метод is35
                    out.print("Введите число для проверки делимости на 3 или 5: ");
                    int divNum = in.nextInt();
                    out.println("Число делится на 3 или 5: " + tasks.is35(divNum));
                    break;

                case 25:
                    // метод max3
                    out.print("Введите первое число: ");
                    int x = in.nextInt();
                    out.print("Введите второе число: ");
                    int y = in.nextInt();
                    out.print("Введите третье число: ");
                    int z = in.nextInt();
                    out.println("Максимум из трех чисел: " + tasks.max3(x, y, z));
                    break;

                case 27:
                    // метод sum2
                    out.print("Введите первое число: ");
                    int sumX = in.nextInt();
                    out.print("Введите второе число: ");
                    int sumY = in.nextInt();
                    out.println("Результат суммы: " + tasks.sum2(sumX, sumY));
                    break;

                case 29:
                    // метод day
                    out.print("Введите число, обозначающее день недели (1-7): ");
                    int dayNum = in.nextInt();
                    out.println("День недели: " + tasks.day(dayNum));
                    break;

                case 31:
                    // метод listNums
                    out.print("Введите число x: ");
                    int xList = in.nextInt();
                    out.println("Числа от 0 до " + xList + ": " + tasks.listNums(xList));
                    break;

                case 33:
                    // метод chet
                    out.print("Введите число x: ");
                    int xChet = in.nextInt();
                    out.println("Четные числа от 0 до " + xChet + ": " + tasks.chet(xChet));
                    break;

                case 35:
                    // метод numlen
                    out.print("Введите число: ");
                    long xLen = in.nextLong();
                    out.println("Количество знаков в числе: " + tasks.numLen(xLen));
                    break;

                case 37:
                    // метод square
                    out.print("Введите размер квадрата: ");
                    int xSquare = in.nextInt();
                    tasks.square(xSquare);
                    break;

                case 39:
                    // метод RightTriangle
                    out.print("Введите высоту треугольника: ");
                    int xTriangle = in.nextInt();
                    tasks.rightTriangle(xTriangle);
                    break;

                case 41:
                    // метод findFirst
                    int[] arr1 = tasks.inputArray(in);
                    System.out.print("Введите число для поиска: ");
                    int numFind = in.nextInt();
                    System.out.println("Индекс первого вхождения: " + tasks.findFirst(arr1, numFind));
                    break;

                case 43:
                    // метод maxAbs
                    int[] arr2 = tasks.inputArray(in);
                    System.out.println("Наибольшее по модулю значение: " + tasks.maxAbs(arr2));
                    break;

                case 45:
                    // метод add
                    int[] arr3 = tasks.inputArray(in); // Исходный массив
                    System.out.print("Введите количество элементов массива для вставки: ");
                    int n = in.nextInt();
                    int[] ins = new int[n];
                    System.out.println("Введите элементы массива для вставки:");
                    for (int i = 0; i < n; i++) {
                        ins[i] = in.nextInt();
                    }
                    System.out.print("Введите позицию для вставки: ");
                    int pos = in.nextInt();
                    System.out.println("Результат вставки: " + Arrays.toString(tasks.add(arr3, ins, pos)));
                    break;

                case 47:
                    // метод reverseBack
                    int[] arr4 = tasks.inputArray(in);
                    System.out.println("Реверс массива: " + Arrays.toString(tasks.reverseBack(arr4)));
                    break;

                case 49:
                    // метод findAll
                    int[] arr5 = tasks.inputArray(in);
                    System.out.print("Введите число для поиска всех вхождений: ");
                    int numFindAll = in.nextInt();
                    System.out.println("Индексы всех вхождений: " + Arrays.toString(tasks.findAll(arr5, numFindAll)));
                    break;

                case 0:
                    out.println("Выход из программы.");
                    in.close();
                    return;

                default:
                    out.println("Выберите номер из списка выше!");
            }
        }

        //in.close(); //закрываем сканнер ввод
    }
}
