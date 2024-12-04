
/** A library of operations on arrays of characters (char values).
 *  The library also features a string comparison method. */
public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        System.out.println(str);  // Prints the string
        println(arr1);            // Prints an array of characters
        System.out.println(charAt(arr1,2));      
        System.out.println(indexOf(arr1,'l'));  
        System.out.println(indexOf(arr1,'l',3)); 
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static char charAt(char[] arr, int index) {
        char C = arr[index];
        return C;
    }

    public static boolean equals(char[] arr1, char[] arr2) {
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (charAt(arr1, i) != charAt(arr2, j)) return false;
            j++;
        }
        return true;
    }

    public static int indexOf(char[] arr, char ch) {
        for (int i = 0; i < arr.length; i++) {
            if (charAt(arr, i) == ch) return i;
        }
        return -1;
    }

    public static int indexOf(char[] arr, char ch, int fromIndex) {
        for (int i = fromIndex; i < arr.length; i++) {
            if (charAt(arr, i) == ch) return i;
        }
        return -1;
    }

    public static int lastIndexOf(char[] arr, char ch) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (charAt(arr, i) == ch) j = i;
        }
        return j;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        if (arr1 == null || arr2 == null) {
            return null;
        }
    
        char[] result = new char[arr1.length + arr2.length];
    
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
    
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
    
        return result;
    }

    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        char[] newarr = new char[endIndex - beginIndex];
        if (newarr.length == 0) return null;
        for (int i = beginIndex; i < endIndex; i++) {
            newarr[i - beginIndex] = arr[i];
        }
        return newarr;
    }

    public static long hashCode(char[] arr) {
        long result = 0;
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            result += arr[i]*Math.pow(7, (arr.length - (i + 1)));
        }
        return result;
   }

    public static int compareTo(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0) return -2;
    
        int N = str1.length();
        int J = str2.length();
    
        // Check for invalid characters in the strings
        for (int i = 0; i < N; i++) {
            if (str1.charAt(i) < 'A' || str1.charAt(i) > 'z') return -2;
        }
        for (int i = 0; i < J; i++) {
            if (str2.charAt(i) < 'A' || str2.charAt(i) > 'z') return -2;
        }
    
        // Compare lengths of the strings
        if (N < J) return -1;
        else if (N > J) return 1;
    
        // Compare characters one by one
        for (int i = 0; i < N; i++) {
            if (str1.charAt(i) > str2.charAt(i)) return 1;
            else if (str1.charAt(i) < str2.charAt(i)) return -1;
        }
    
        return 0;  // Strings are equal
    }
}