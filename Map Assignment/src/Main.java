import sun.util.resources.cldr.es.CalendarData_es_EC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {


        HashMap<CaesarCipher, Integer> text = new HashMap<CaesarCipher, Integer>();
        text.put(new CaesarCipher(24,"abcdefghijklmnopqrstuvwxyz"),1);

        Iterator<CaesarCipher> cipherIterator = text.keySet().iterator();
        while(cipherIterator.hasNext()){
            CaesarCipher temp = cipherIterator.next();
            System.out.println("Plain Text: "+temp.message);
            System.out.println("After Encryption:"+temp.encryptText());
            System.out.println("After Decryption:"+temp.decryptText(temp.encryptText()));
            System.out.println("======================================");
        }

    }
}
