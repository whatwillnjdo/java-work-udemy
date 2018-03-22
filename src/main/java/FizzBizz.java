public final class FizzBizz {
    public static String someMethod(int somevalue) {
        if(String.valueOf(somevalue).length()==0){
            throw new IllegalArgumentException("No number was found");
        }
        else if (somevalue%15 == 0){
            return "FizzBizz";
        }
        else if(somevalue%5 == 0){
            return "Bizz";
        }
        else if(somevalue%3 == 0){
            return "Fizz";
        }
        else {
            return Integer.toString(somevalue);
        }
    }
}
