public class SampleString {

    private String str1;

    public SampleString(String str) {
        str1 = str;
    }

    public String returnsPart(int from, int to) {
        return str1.substring( from, to );
    }

    public String returnsPart(int from) {
        return str1.substring( from );
    }


    public int compareTwoStrings(String str1, String str2) {
        return str1.compareTo( str2 );
    }

    public static void main(String[] args) {
        String str = "SnoopDoggyDog";
        CharSequence c = str.subSequence( 0, 5 );

    }
}

