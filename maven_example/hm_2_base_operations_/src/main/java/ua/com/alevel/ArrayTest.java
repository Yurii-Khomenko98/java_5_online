package ua.com.alevel;

public class ArrayTest {

    public void test() {
        char[] ivan = new char[4];
        ivan[0] = 'i';
        ivan[1] = 'v';
        ivan[2] = 'a';
        ivan[3] = 'n';
        for (char c : ivan) {
            System.out.println("c = " + c);
        }


        ivan = new char[]{'i', 'v', 'a', 'n'};
        String ivan1 = "ivan";
        }
    }

