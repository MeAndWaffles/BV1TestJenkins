import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class StringTest {
    @Test
    public void charArrayTest() {
        String hi = "Hi World";
        char chaa = 0;
        System.out.println(hi.charAt(0));
        for (int i = 0; i < hi.length(); i++) {
            chaa = hi.charAt(i);
            System.out.println(chaa);
        }
        char[] cha = hi.toCharArray();
        System.out.println(cha);
    }
    @Test
    public void endsWithTest(){
        String hi = "Hi World";
        String hi1 = "d";
        Assert.assertTrue(hi.endsWith(hi1));
        System.out.println(hi.endsWith(hi1));
    }
    @Test
    public void startsWithTest(){
        String hi = "Hi World";
        String hi1 = "H";
        Assert.assertTrue(hi.startsWith(hi1));
        System.out.println(hi.startsWith(hi1));
    }
    @Test
    public void equalsIgnoreCaseTest(){
        String hi = "Hi World";
        String hi2 = new String("Hi World");
        System.out.println(hi.equalsIgnoreCase(hi2));
    }

    @Test
    public void concatTest() {
        String hi = "Hi World";
        String hi1 = "Evil Me";
        String hi2 = "Hold On";
        System.out.println(hi.concat(hi1 + " ") + " ".concat(hi2));
        System.out.println(hi.compareTo(hi1));
    }

    @Test
    public void splitTest() {
        String splitText = "One Two Tree";
        String splitText2[] = splitText.split(" ");
        System.out.println(splitText2[0]);
    }

    @Test
    public void splitTwoTest() {
        String str = "Hey there I am misusing Whats App";
        String[] split = str.split(" ", 7);
        // 7 це ліміт split, скільки разів розділяти(це скільки буде стрінгів в масиві)
        for (String obj : split) {
            System.out.println(obj);
        }
    }

    @Test
    public void reverseTest() {
        String splitText = "One Two Tree";
        StringBuffer sp = new StringBuffer(splitText);
        System.out.println(sp.reverse());
    }

    @Test
    public void reverseStringBufferTest() {
        StringBuffer strBuffer = new StringBuffer("abdc");
        strBuffer.reverse();
        System.out.println(strBuffer);
    }

    @Test
    public void replaceTest() {
        String replace = "Star";
        System.out.println(replace.replace("Star", "Cat"));
        String replace2 = "Mine and your cookies";
        System.out.println(replace2.replace("and your ", ""));
    }

    @Test
    public void replaceStringBufferTest() {
        StringBuffer strBuffer = new StringBuffer("hello world!");
        strBuffer.replace(6, 11, "java");
        System.out.println(strBuffer.toString()); //hello java!
    }

    @Test
    public void substringTest() {
        String substring = "Me and cookies";
        System.out.println(substring.substring(0, 2));
        System.out.println(substring.substring(3, 6));
        System.out.println(substring.substring(7));
    }

    @Test
    public void joinTest() {
        List list = Arrays.asList("To", "Hold", "On");
        String string2[] = {"q","w","e"};
        String string = " ";
        String splitList2 = String.join(string, string2);
        String splitList = String.join(string, list);
        System.out.println(splitList);
        System.out.println(splitList2);
    }

    @Test
    public void setLengthStringBuilderTest() {
        StringBuilder std = new StringBuilder("saket");
        System.out.println(std);
        System.out.println("length of std is " + std.length());
        std.setLength(10);
        System.out.println("Increased the length to 10, string = " + std);
        System.out.println("length = " + std.length());
        System.out.println(std);
    }

    @Test
    public void setLengthStringBufferTest() {
        StringBuffer strBuffer = new StringBuffer("hello");
        strBuffer.setLength(10);
        System.out.println(strBuffer); //"hello
        strBuffer.setLength(4);
        System.out.println(strBuffer); //"hell"
    }

    @Test
    public void capacityAndEnsureCapacityStringBufferTest() {
        String str = "Java";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("Емкость: " + strBuffer.capacity()); // 20<font></font>
        strBuffer.ensureCapacity(32);
        System.out.println("Емкость: " + strBuffer.capacity()); // 42<font></font>
        System.out.println("Длина: " + strBuffer.length()); // 4<font></font>
    }

    @Test
    public void toStringStringBufferTest() {
        String str = "Java";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println(strBuffer.toString()); // щоб отримати рядок який там але і працює без toString
    }

    @Test
    public void charAtAndSetCharAtStringBufferTest() {
        StringBuffer strBuffer = new StringBuffer("Java");
        char c = strBuffer.charAt(0); // J<font></font>
        System.out.println(c);
        strBuffer.setCharAt(0, 's');
        System.out.println(strBuffer.toString()); // cava<font></font>
    }

    @Test
    public void getCharsStringBufferTest() {
        StringBuffer strBuffer = new StringBuffer("world");
        String str= "stars";
        int startIndex = 1;
        int endIndex = 4;
        char[] buffer = new char[endIndex - startIndex];
        str.getChars(startIndex, endIndex, buffer, 0);
        System.out.println(buffer);
        strBuffer.getChars(startIndex, endIndex, buffer, 0);
        System.out.println(buffer); // orl<font></font>
    }

    @Test
    public void appendBufferTest() {
        StringBuffer strBuffer = new StringBuffer("hello");
        strBuffer.append(" world");
        System.out.println(strBuffer); // hello world
    }

    @Test
    public void insertBufferTest() {
        StringBuffer strBuffer = new StringBuffer("word");
        strBuffer.insert(3, 'l');
        System.out.println(strBuffer); //world
        strBuffer.insert(0, "s");
        System.out.println(strBuffer); //sworld
    }

    @Test
    public void deleteAndDeleteCharAtStringBufferTest() {
        StringBuffer strBuffer = new StringBuffer("assembler");
        strBuffer.delete(0, 2);
        System.out.println(strBuffer); //sembler
        strBuffer.deleteCharAt(6);
        System.out.println(strBuffer); //semble
    }

    @Test
    public void substringBufferTest() {
        StringBuffer strBuffer = new StringBuffer("hello java!");
        String str1 = strBuffer.substring(6); // обрезка строки с 6 символа до конца
        System.out.println(str1); //java!
        String str2 = strBuffer.substring(3, 9); // обрезка строки с 3 по 9 символ
        System.out.println(str2); //lo jav
    }
}
