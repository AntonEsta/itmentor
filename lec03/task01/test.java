package task01;


import java.util.Random;

public class test {
    public static void main(String[] args) {
        int arrSize = 200000;
        Number[] nums = new Number[arrSize];
        Number[] nums2 = new Number[arrSize];

        Random rnd = new Random(20000);

        int r;
        for (int i =0 ; i < arrSize; i++) {
            r = rnd.nextInt();
            nums[i] = r;
            nums2[i] = r;
        }

        nums = new Number[]{1,2,2.1};
        nums2 = new Number[]{1,2};



        MathBox<Float> mathBox = new MathBox<>(nums);
        MathBox<Float> mathBox2 = new MathBox<>(nums2);

//        mathBox.print();

        System.out.println("Summa = " + mathBox.summator());

        double divider = 3;

        mathBox.deleteEqual(2);

        mathBox.splitter(divider);
        mathBox2.splitter(divider);

        System.out.println("To string: " + mathBox.toString());
        System.out.println("To string: " + mathBox2.toString());

        System.out.println("Equals: " + mathBox.equals(mathBox2));

        System.out.println("HashCode: " + mathBox.hashCode());
        System.out.println("HashCode: " + mathBox2.hashCode());

    }
}
