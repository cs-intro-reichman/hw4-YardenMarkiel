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
        System.out.println("Prime numbers up to " + N + ":");
        for ( int i = 0 ; i < arr.length ; i ++){
            if ( arr[i] == true){
                System.out.println( i );
                counter++;
            }
        }
        double P = (counter / N) * 100;
        System.out.println( "There are " + counter + " primes between 2 and " + N + " (" + (int)P + "% are primes)" );
    }
}