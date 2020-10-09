import java.util.HashMap;

public class CaesarCipher {
    public int shift;
    public String message;

    public CaesarCipher(int shift, String Message){
        this.shift = shift;
        this.message = Message;
    }
    public String encryptText(){

        StringBuilder mystring = new StringBuilder();
        for (int i = 0; i < this.message.length(); i++)
        {
            char c = (char) (this.message.charAt(i) + this.shift);
            if (c > 'z')
                mystring.append((char)(this.message.charAt(i) - (26-this.shift)));
            else
                mystring.append((char)(this.message.charAt(i) + this.shift));
        }
        return mystring.toString();
    }

    public String decryptText(String encryptText){
        StringBuilder mystring = new StringBuilder();
        for (int i = 0; i < encryptText.length(); i++)
        {
            char c = (char) (encryptText.charAt(i) - this.shift);
            if (c < 'a')
                mystring.append((char)(encryptText.charAt(i) + (26-(this.shift))));
            else
                mystring.append((char)(encryptText.charAt(i) - this.shift));
        }
        return mystring.toString();

    }
}
