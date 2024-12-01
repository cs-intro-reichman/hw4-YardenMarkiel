public class Primes {
    public static void main(String[] args) {
        double N = Integer.parseInt(args[0]);
        double counter = 0;
        int S = 2;
        boolean arr[] = new boolean [(int)N] ;
        for ( int i = 0 ; i < arr.length ; i++){
            arr[i] = true;
        }
        arr[0] = false;
        arr[1] = false;
        while ( S <= Math.sqrt(N) ){
            for ( int i = S ; i < N ; i = i + S ){
                if ( (arr[i] == true) && ( i != S ) ) arr[i] = false; 
            } 
            S++;  
        }
        System.out.println("Prime numbers up to " + (int)N + ":");
        for ( int i = 0 ; i < arr.length ; i ++){
            if ( arr[i] == true){
                System.out.println( i );
                counter++;
            }
        }
        int tempCheck = 0;
        int tempLength = arr.length;
        for ( int i = 1 ; i < tempLength+1 ; i++){
            if ( tempLength % i == 0) tempCheck++;
        }
        if ( tempCheck != 0) {
            counter++;
            System.out.println(tempLength);
        }
        double P = (counter / N) * 100;
        System.out.println( "There are " + (int)counter + " primes between 2 and " + (int)N + " (" + (int)P + "% are primes)" );
    }
}