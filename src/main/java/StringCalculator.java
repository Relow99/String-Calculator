import com.sun.tools.javac.util.Convert;

import java.io.InputStream;
import java.io.StringBufferInputStream;

public class StringCalculator {
    public static int add(String stringInput) {

        int results = 0;

        String newStringInput = stringInput.replaceAll("\n",",").replaceAll(";",",").replaceAll("//","").replaceAll("\n","").replaceAll(",,",",").replaceAll("4",",");

        String stringArr[] = newStringInput.split(",");

        for(int i =0 ; i<stringArr.length; i++ )
        {
            if (stringArr[i]!= "") {
                results = results + Integer.parseInt(stringArr[i]);
            }


        }
        return results;
    }
}
