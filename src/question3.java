

public class question3 {

    public int[] addElement(int n, int [] nums, int x){

        int i;
  
        // create a new array of size n+1
        int newarray[] = new int[n + 1];
  
        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarray[i] = nums[i];
  
        newarray[n] = x;
  
        return newarray;
    }

}
