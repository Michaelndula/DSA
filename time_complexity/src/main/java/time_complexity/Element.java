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