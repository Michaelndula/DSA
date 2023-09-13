package time_complexity;

public class Element {
   public static void main(String[] args){
       System.out.println("Hello World!!");
   }
}

// Time Complexity: In the above code “Hello World” is printed only once on the screen.
// So, the time complexity is constant: O(1) i.e. every time a constant amount of time is required to execute code, no matter which operating system or which machine configurations you are using.
// Auxiliary Space: O(1)

class GFG{
    public static void main(String[] args){
        int i, n = 8;

        for(i = 1; i <= n; i++){
            System.out.println("Hello World");
        }
    }
}

// Time Complexity: In the above code “Hello World !!!” is printed only n times on the screen, as the value of n can change.
// So, the time complexity is linear: O(n) i.e. every time, a linear amount of time is required to execute code.
// Auxiliary Space: O(1)

class GFG1{
    public static void main(String[] args){
        int i, n = 8;

        for(i = 1; i <= n; i=i*2){
            System.out.println("Hello World");
        }
    }
}

// Time Complexity: O(log2(n))
// Auxiliary Space: O(1)

// In the above code, the loop iterates as long as i is less than or equal to n, and in each iteration, 
// i is multiplied by 2. This loop structure makes i double in each iteration. The loop will execute until i becomes greater than n.
// The time complexity of this code is indeed O(log2(n)), as the loop executes roughly log2(n) times. 
// The reason is that i starts at 1 and doubles in each iteration until it exceeds n. In other words, 
// it takes log2(n) iterations for i to become greater than n.
// The auxiliary space complexity is O(1) because the memory usage of the program doesn't depend on the input size n.

class GFG2{
    public static void main(String[] args){
        int i, n=8;

        for(i = 2; i <= n; i=(int)Math.pow(i, 2)){
            System.out.println("Hello World");
        }
    }
}

// Time Complexity: O(log(log n))
// Auxiliary Space: O(1)

// In the above code, the loop iterates as long as i is less than or equal to n, and in each iteration, 
// i is set to the result of raising it to the power of 2. This loop structure makes i grow exponentially in each iteration.
// The time complexity of this code is indeed O(log(log n)). The reason is that i grows exponentially, 
// and it will take log(log n) iterations for i to exceed n. This is because in each iteration, i is squared, 
// and it takes log n iterations for i to grow larger than n, and then you take the log again, which results in log(log n).
// The auxiliary space complexity is O(1) because the memory usage of the program doesn't depend on the input size n.