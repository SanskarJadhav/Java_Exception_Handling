// Sanskar Jadhav AIML B1 PRN 21070126076
public class InputString {
    public static void checkIndia(String a) throws NOMATCHEXCP {
        // check if string is India
        if (!a.equals("India")) {
            // if not throw exception
            throw new NOMATCHEXCP("You didn't type India!");
        }
    }

    public static void main(String[] args) {
        // count variable to find position of word that is wrong
        int count = 0;
        // loop through all words typed by user
        for(String i: args){
            try{
                checkIndia(i);
                count++;
            }
            catch(NOMATCHEXCP e){
                System.err.println("Error caught for word " + (count+1) +" (" + i +")");
                // to see line of error with message
                e.printStackTrace();
            }
        }
    }
}
