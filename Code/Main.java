import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class Main {     //带public的class对其他类可见但文件名必须和类名一致
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/*
Java type:
·boolean: Truth value (true or false).
·int: Integer (0, 1, -47).
·double: Real number (3.14, 1.0, -2.1).
·String: Text (“hello”, “example”).  Java verifies that types always match: String five = 5; 类型不匹配
""包裹的是String字符串，''包裹的是单个的字符字面量

Division (“/”) operates differently on integers and on doubles!
Example:
double a = 5.0/2.0; // a = 2.5
int b = 4/2; // b = 2
int c = 5/2; // c = 2
double d = 5/2; // d = 2.0


Conversion by casting:
int a = 2;                   a = 2
double a = 2;                a = 2.0 (Implicit)
int a = 18.7;                ERROR
int a = (int)18.7;           a = 18
double a = 2/3;              a = 0.0
double a = (double)2/3;      a = 0.6666…

Conversion by method:
int to String:
String five = 5;    ERROR!
String five = Integer.toString (5);
String five = “” + 5;    five = “5”
String to int:
int foo = “18”;    ERROR!
int foo = Integer.parseInt (“18”);

Comparison operators：
·Do NOT call == on doubles! EVER.

Arrays:
·An array is an indexed list of values.
·You can make an array of any type: int, double, String, etc..
·All elements of an array must have the same type.
·直接打印数组只会返回数组存放的内存地址

Note:
• Class names are Capitalized
• 1 Class = 1 file
• Having a main method means the class can be run

Constructors:
• Constructor name == the class name
• No return type – never returns anything
• Usually initialize fields
• All classes need at least one constructor  一个类也可以同时拥有多个构造函数，只要参数名，数量不同即可
– If you don’t write one, defaults to
CLASSNAME () {
}

Primitives vs References:
• Primitive types are basic java types
– int, long, double, boolean, char, short, byte, float
– The actual values are stored in the variable
• Reference types are arrays and objects
– String, int[], Baby, …

How java stores primitives:
• Variables are like fixed size cups
• Primitives are small enough that they just fit into the cup

How java stores objects:
• Objects are too big to fit in a variable
– Stored somewhere else
– Variable stores a number that locates the object
• The object’s location is called a reference
Java 总是值传递：对于对象或数组，传递的是“引用的副本”，但这个副本仍然指向原对象，所以能修改原数据；基本类型改的是副本，改不动原值。

static
• Applies to fields and methods
• Means the field/method
– Is defined for the class declaration,
– Is not unique for each instance
example:
public class Baby {
    public String name;          // 实例字段（每个对象都有自己的）
    public static int count = 0; // 静态字段（所有对象共用）

    public Baby(String name) {
        this.name = name;
        count++;  // 每创建一个 Baby，count 就加一
    }
}
static notes:
• Non-static methods can reference static methods, but not the other way around

Packages:
· Each class belongs to a package
· Classes in the same package serve a similar purpose
· Packages are just directories
· Classes in other packages need to be imported
可以把包看成文件夹，里面的类就是文件，同一个包（文件夹）内的类（文件）可以互相访问，不同包之间需要import

ArrayList:
·Modifiable list
·Internally implemented with arrays
Features:
·Get/put items by index
·Add items                -list.add()
·get items                -list.get($)
·Delete items             -list.remove() or list.clear()
·modify items             -list.set($,$)
·Loop over all items
- ArrayList only use to store object

Sets:
·Like an ArrayList, but
·Only one copy of each object, and No array index
Features:
·Add objects to the set              -set.add("abc")
·Remove objects from the set         -set.remove("abc")
·Is an object in the set?            -set.contains("abc")
·TreeSet: Sorted (lowest to highest)
·HashSet: Unordered (pseudo-random)

Maps:
·Stores a (key, value) pair of objects
·Look up the key, get back the value
Example: Address Book
·Map from names to email addresses
·TreeMap: Sorted (lowest to highest)
·HashMap: Unordered (pseudo-random)

Interfaces:
·Set of classes that share methods
·Declare an interface with the common methods
·Can use the interface, without knowing an object's specific type
·All fields are final (cannot be changed)

Interface Notes:
·Only have methods (mostly true)
·Do not provide code, only the definition(called signatures)
·A class can implement any number of interface

final:
·修饰字段时代表值不可更改
·修饰方法时代表不能重写
·修饰类时代表不能被继承

Inheritance Summary:
• class A extends B {} == A is a subclass of B
• A has all the fields and methods that B has
• A can add it's own fields and methods
• A can only have 1 parent
• A can replace a parent’s method by re-implementing it
• If A doesn’t implement something Java searches ancestors

InputStream:
• InputStream is a stream of bytes
– Read one byte after another using read()
• A byte is just a number
– Data on your hard drive is stored in bytes
– Bytes can be interpreted as characters, numbers..

InputStreamReader:
• Reader is a class for character streams
– Read one character after another using read()
• InputStreamReader takes an InputStream and converts bytes to characters
• Still inconvenient
– Can only read a character at a time

BufferedReader:
• BufferedReader buffers a character stream so you can read line by line
– String readLine()

FileReader:
• FileReader takes a text file
– converts it into a character stream
– FileReader(“PATH TO FILE”);
• Use this + BufferedReader to read files!
*/

//Assignment1:
class GravityCalculate {
    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.5 * gravity * fallingTime * fallingTime;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}


class NewLine {
    public static void newLine() {
        System.out.println("newLine");
    }
    public static void threeLines() {
        newLine();newLine();newLine();
    }
    public static void main(String[] args) {
        threeLines();
    }
} //function call: name();

class Square {
    public static void printSquare(int x) {
        System.out.println(x*x);
    }
    public static void main(String[] arguments) {
        int value = 2;
        printSquare(value);
        printSquare(3);
        printSquare(value*2);
    }
} //specify incoming parameters

class Multiply {
    public static void times (double a, double b) {
        System.out.println(a * b);
    }
    public static void main(String[] arguments) {
        times (2, 2);
        times (3, 4);
    }
} //you can put many arguments

class Square4 {
    public static double square(double x) {
        return x*x;
    }
    public static void main(String[] arguments) {
        System.out.println(square(5));
        System.out.println(square(2));
    }
} //void means no type

class SquareChange {
    public static void printSquare(int x) {
        System.out.println("printSquare x = " + x);
        x = x * x;
        System.out.println("printSquare x = " + x);
    }
    public static void main(String[] arguments) {
        int x = 5;
        System.out.println("main x = " + x);
        printSquare(x);
        System.out.println("main x = " + x);
    }
} //Variable Scope：Variables live in the block ({}) where they are defined (scope)
 //Method parameters are like defining a new variable in the method


class Condition {
    public static void test(int x) {
        if (x > 5){
            System.out.println(x + " is > 5");
        }
        else if (x == 5){
            System.out.println(x + " is equal to 5");
        }
        else{
            System.out.println(x + " is < 5");
        }
    }
    public static void main(String[] args) {
            test(5);
            test(2);
            test(6);
    }
}

//Assignment2:
class FooCorporation{
    public static double base_pay(double pay,int hours){
        double money;
        if (pay < 8){
            System.out.println("pay can't be less than 8");
            return 0;
        }
        if (hours <= 40){
            money = hours * pay;
        }
        else if (hours <= 60){
            money = (hours - 40) * 1.5 * pay + 40 * pay;
        }
        else{
            System.out.println("work time should less than 60");
            return 0;
        }
        System.out.println("The employee's base pay is " + money);
        return money;
    }
    /*    更高效的写法：
        public static void pay(double basePay, int hours) {
            if (basePay < 8.0) {
                System.out.println("You must be paid at least $8.00/hour");
            } else if (hours > 60) {
                System.out.println("You can't work more than 60 hours a week");
            } else {
                int overtimeHours = 0;
                if (hours > 40) {
                    overtimeHours = hours - 40;
                    hours = 40;
                }
                double pay = basePay * hours;
                pay += overtimeHours * basePay * 1.5;
                System.out.println("Pay this employee $" + pay);
            }
        }
    */
    public static void main(String[] args){
        base_pay(7.50,35);
        base_pay(8.20,47);
        base_pay(10.00,73);
    }
}

class loop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3){
           System.out.println("Rule #" + i);
           i += 1;
       }
        for (int j = 3; j < 6; j ++){
            System.out.println("Rule #" + j);
        }
        for (int k = 0; k<100; k++){
            if (k == 50)
                break;
            System.out.println("Rule #" + k);
        }
        for (int l = 0; l<100; l++){
            if (l == 50)
                continue;
            System.out.println("Rule #" + l);
        }
        for (int m = 0; m < 3; m++) {
            for (int n = 2; n < 4; n++) {
                System.out.println (m +" "+ n);
            }
        }
    }
}

class Array {
    public static void Looping_through_array(){
        int[] values = new int[5];
        for (int i = 0; i < values.length; i++){
            values[i] = i;
            int j = values[i] * values[i];
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
        int[] values = new int[5];
        int[] value = { 12, 24, -23, 47 };
        int size = values.length;  //The length variable: Each array has a length variable built-in that contains the length of the array.
    }
}

//Assignment3:
class Marathon {
    public static int fastest(int[] values){
        int begin = values[0];
        int index = 0;
        for (int i = 1; i < values.length; i++){
            if (values[i] < begin){
                begin = values[i];
                index = i;
            }
        }
        return index;
    }

/*    更优版本:
    public static int getMinIndex(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0; i<values.length; i++)
            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }
        return minIndex;
    }
*/

    public static int fastest_second(int[] values){
        int fast = fastest(values);
        int[] mid = new int[values.length];
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++){
            if (i == fast) {
                mid[i] = max;
                continue;
            }
            mid[i] = values[i];
        }
        return fastest(mid);
    }
/*    gpt给出的不用复制数组的方法，确实更安全高效
    public static int fastest_second(int[] values) {
        int first = fastest(values);
        int secondIndex = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (i == first) continue;
            if (values[i] < min) {
                min = values[i];
                secondIndex = i;
            }
        }
        return secondIndex;
    }
*/

    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        int index = fastest(times);
        int second = fastest_second(times);
        System.out.println("The fastest one is "+ names[index] + " and he/she used " + times[index] + " minutes.");
        System.out.println("The second one is "+ names[second] + " and he/she used " + times[second] + " minutes.");
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i] + ": " + times[i]);
//        }
    }
}


class Baby {
    String name;
    int age;
    double weight = 5.0;
    Boolean isMale;
    Baby (String babyName, int babyAge, Boolean isMale){

        name = babyName;
        age = babyAge;
        isMale = isMale;
    }
    void eat (double foodweight){
        if (foodweight > 0 && foodweight <= weight){
            System.out.println(name + " ate " + foodweight + " foods");
        }
    }
    void hi(){
        System.out.println("Hello my name is " + name + " and age is " + age);
    }
}


class test {
    public static void main(String[] args) {
        Baby xiaoming = new Baby ("xiaoming", 3, true);
        Baby xiaoai = new Baby ("xiaoai", 3, false);
        System.out.println(xiaoming.name);
        System.out.println(xiaoai.name);
        xiaoming.hi();
        xiaoai.eat(3.0);
        xiaoming.name = "xiaoxiaoming";
        System.out.println(xiaoming.name);
        xiaoming.eat(2);
        assert xiaoming.age > 3; //启用断言：-ea；禁用断言：-da
        System.out.println(xiaoming.weight);
    }
}


//Assignment4:
class Book {
    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        title = bookTitle;
        borrowed = false;
    }

    // Marks the book as rented
    public void rented() {
        borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
        borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        if (borrowed)
            return true;
        else
            return false;
    }

    // Returns the title of the book
    public String getTitle() {
        return title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}


class Library {
    // Add the missing implementation to this class
    String Local;
    Book[] books;
    int bookCount = 0;
    public Library(String Location) {
        Local = Location;
        books = new Book[10];
    }

    public void addBook(Book book){
        if (bookCount == books.length) {
            // 手动扩容（创建更大的数组）
            Book[] newBooks = new Book[books.length + 10];
            for (int i = 0; i < books.length; i++) {
                newBooks[i] = books[i];
            }
            books = newBooks;
        }

        books[bookCount] = book;
        bookCount++;
    }

    public static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(Local);
    }

    public void borrowBook(String bookname) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(bookname)) {
                if (books[i].isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");
                }
                else {
                    books[i].rented();
                    System.out.println("You successfully borrowed " + books[i].getTitle());
                }
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }
    public void printAvailableBooks() {
        if (bookCount == 0) {
            System.out.println("No book in catalog");
        }
        else {
            for (int i = 0; i < bookCount; i++) {
                if (books[i].isBorrowed()) {
                    continue;
                }
                else {
                    System.out.println(books[i].getTitle());
                }
            }
        }
    }

    public void returnBook(String bookname) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(bookname)) {
                books[i].returned();
                System.out.println("You successfully returned " + books[i].getTitle());
            }
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}

class Variables {
    int servings;  // 这是类的字段（成员变量）

    void feed(int servings) {  //这个方法参数也叫 servings
        servings = servings + servings;
    }  //变量遮蔽
    void food(int servings) {
        this.servings = this.servings + servings; //这样才是：把传入的参数值加到类的 servings 上
    } //对于static静态实例是没有this关键字的


    void poop() {
        System.out.println("All better!");
        servings = 0;  // 这里访问的是类的成员变量
    }
}

class ArrayListExample {
    public static void main(String[] arguments) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Evan");
        strings.add("Eugene");
        strings.add("Adam");
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        strings.set(0, "Goodbye");
        strings.remove(1);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        for (String s : strings) {
            System.out.println(s);
        } //增强型for循环，也叫for-each循环，类似于python中的for循环，strings是一个可迭代值，将strings的迭代器绑定到变量s中，直到迭代器耗尽
    }
}

class SetExample {
    public static void main(String[] arguments) {
        TreeSet<String> strings = new TreeSet<String>(); //TreeSet是有序集合，底层是红黑树
        HashSet<String> str = new HashSet<String>(); //HashSet是无需集合，底层是哈希表
        strings.add("Evan");
        strings.add("Eugene");
        strings.add("Adam");
        System.out.println(strings.size());
        System.out.println(strings.first());
        System.out.println(strings.last());
        strings.remove("Eugene");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}

class MapExample {
    public static void main(String[] arguments) {
        HashMap<String, String> strings = new HashMap<String, String>(); //无序集合
        TreeMap<String, String> str = new TreeMap<String, String>(); //有序集合
        strings.put("Evan", "email1@mit.edu");
        strings.put("Eugene", "email2@mit.edu");
        strings.put("Adam", "email3@mit.edu");
        System.out.println(strings.size());
        strings.remove("Evan");
        System.out.println(strings.get("Eugene"));
        for (String s : strings.keySet()) {
            System.out.println(s);
        }
        for (String s : strings.values()) {
            System.out.println(s);
        }
        for (Map.Entry<String, String> pairs : strings.entrySet()) {
            System.out.println(pairs);
        }
    }
}

//Java 的内建类型（如 String, Integer）都已经实现了 Comparable 接口，Java 知道怎么排序它们。
// 但如果你使用自定义类（比如 Book, Student），你就要实现 Comparable<T> 接口，否则会报错。如果你使用 HashSet 或 HashMap，你要了解 equals() 和 hashCode() 方法.
class Boo implements Comparable<Book> {  //当你实现 Comparable<Book> 时，你就必须写一个方法：compareTo
    String title;
    public Boo(String title) {
        this.title = title;
    }

    @Override  //这里的作用是告诉编译器重写了父类或接口中的方法，没有 @Override 时，写错了其实不会报错，只是没有真正重写成功，会导致程序行为不正确。
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);  // 按书名排序
    }
}

//Assignment5:
//Files are in draw package



/*
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);  // 如果 result 是 5，就测试通过
    }  测试类推荐单独写在一个文件内，通过导入包的方式在测试文件中测试我们工作文件的代码类
}
*/



interface Animal {   //实现接口
    void makeSound(); //声明无参函数,所有实现Animal接口的类都要有这个方法
    //默认的抽象方法不能写函数体，只有private和static类型才能写
}

class dog implements Animal {  //声明实现接口
    int age;
     public dog(int age){
         this.age = age;
     }
     public void makeSound(){  //实现接口声明的无参函数
         System.out.println("Woof");
     }
}

class cat implements Animal { //声明实现接口
    int age;
    public cat(int age) {
        this.age = age;
    }
    public void makeSound() { //实现接口声明的无参函数
        System.out.println("Meow");
    }
}

class zoo {
    public static void main(String[] args) {
        Animal a = new dog(5);
        Animal b = new cat(3);
        a.makeSound();
        b.makeSound();
    }
}

//Assignment6 files are in drawMore

class Animals {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("The dog barks.");
    }
}

interface Flyer {
    void fly();
}

interface Swimmer {
    void swim();
}

class Duck implements Flyer, Swimmer {
    public void fly() {
        System.out.println("Duck flies");
    }
    public void swim() {
        System.out.println("Duck swims");
    }
}  //Java不支持多继承，但可以通过声明多个接口并实现的方式达到多继承的效果

class Exception{
    public static int get(int[] arr, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        return arr[index];
    }
//throws在函数声明中，代表该函数可能会抛出异常，而throw在函数体中实际抛出异常
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        try {
            System.out.println(get(myArray, 5));  //  错误索引，触发异常
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

class Input_and_Output {
    public static void main(String[] args) throws IOException {  //这里idea提示必须声明是因为输入方法可能抛出IOException异常，所以必须在方法声明中写出throws语句，否则就要在
                                                                // 方法体内写出try-catch语句进行处理
//        BufferedReader reader = new BufferedReader(
//                new InputStreamReader(System.in)
//        );
//        String input = reader.readLine();
//        System.out.println("你输入的是：" + input);

        Scanner scanner = new Scanner(System.in);  //System.in获取的输入属于字节流
        int number = scanner.nextInt();
        scanner.nextLine();
        String text = scanner.nextLine();
        System.out.println("Your input str is: " + text);
        System.out.println("Your output num is: " + number);
    }
}  //何时使用close方法关闭流呢:
 //1.文件流必须关闭  比如FileReader()
 //2.scanner,BufferedReader JVM会自动关闭但还是推荐手动关闭
 //3.System.in System.out 不推荐关闭，关闭后程序无法使用标准输入输出
