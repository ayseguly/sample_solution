import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        int nums[]= {5,2,7,4,4,1};
        

        question1 mQuestion1 = new question1();
        String text= mQuestion1.sample();
        System.out.println(text);

        

        question2 mQuestion2 = new question2();
        mQuestion2.thirdElement(nums);
        int answer= mQuestion2.thirdElement(nums);
        System.out.println(answer);


        question3 mQuestion3 = new question3();
        int n = nums.length;
        
        int x=13;
        mQuestion3.addElement(n, nums, x);

       
        nums = mQuestion3.addElement(n, nums, x);
        
        System.out.println(Arrays.toString(nums));
        
    }



}
