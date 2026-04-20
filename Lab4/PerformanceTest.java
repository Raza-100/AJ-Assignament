package Basic4;

public class PerformanceTest {

    public static void main(String[] args) {

        // Test for StringBuffer
        long startTime = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 10000; i++) {
            sb.append("AIET");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");


        // Test for StringBuilder
        startTime = System.currentTimeMillis();

        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            sb2.append("AIET");
        }

        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");
    }
}