import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SampleTest {

    String strToTest = "SnoopDog";
    SampleString ss = new SampleString( strToTest );

    @org.junit.jupiter.api.Test
    void returnsPart() {
        String resultStr = "pDog";
        //  String returnString = ss.returnsPart( 4 );
        assertTrue( ss.returnsPart( 4 ).equals( resultStr ) );
    }

    @org.junit.jupiter.api.Test
    void returnsPart1() {
        String resultStr = "Snoo";
        assertTrue (ss.returnsPart( 0, 4 ).equals( resultStr ));
    }

    @org.junit.jupiter.api.Test
    void compareTwoStringsTest() {
        String str1 = "b";
        String str2 = "a";
        assertEquals( 1, ss.compareTwoStrings( str1, str2 ) );
    }

}