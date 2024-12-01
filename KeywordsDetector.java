



public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        int N = sentences.length;
        int N2 = keywords.length;
        String temp = "";
        String temp2 = "";
        for ( int i = 0 ; i < N ; i++){
            sentences[i] = lowerCase(sentences[i]);
        } 
        for ( int i = 0 ; i < N2 ; i++){ //lowecase all the chars at sentnces/
            keywords[i] = lowerCase(keywords[i]);
        } 
        for ( int i = 0 ; i < sentences.length ; i++){
            temp = sentences[i];
            for ( int j = 0 ; j < keywords.length ; j++){
                temp2 = keywords[j];
                if ( contains(temp, temp2)){
                    System.out.println(firstLetterUp(temp));
                    break;
                }
            }
        }
        
        }
       


       public static String lowerCase(String str) {
        String result = "";
        for ( int i = 0 ; i < str.length() ; i++){
            if ( (str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')){
                result = result + (char)(str.charAt(i) + 32);
            } else  result = result + (str.charAt(i));
        }
        return result;
    }
    public static boolean contains(String str1, String str2) {
        String x = str1;
        String y = str2;
        int checker = 0; 
        for ( int i = 0 ; i < y.length() ; i++){
            for ( int j = 0 ; j < x. length() ; j++) {
                if ( y.charAt(i) == x.charAt(j)){
                    checker++;
                }
            }
            if ( checker == 0) return false;
            checker = 0; 
        }
        return true;
        }
    public static String firstLetterUp (String str){
        String temp = "";
        temp = temp + (char)(str.charAt(0) - 32) ;
        for ( int i = 1 ; i < str.length() ; i++ ){
            temp = temp + str.charAt(i);
        }
        return temp;
    }
}
   
