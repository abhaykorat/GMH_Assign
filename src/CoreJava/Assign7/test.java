package CoreJava.Assign7;


import java.io.FileNotFoundException;

public class emj {
    public static void test() throws FileNotFoundException {
        try {
            throw new FileNotFoundException();
        } finally {
        }
    }
}