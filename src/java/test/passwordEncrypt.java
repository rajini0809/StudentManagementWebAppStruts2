package test;

import java.util.Base64;

public class passwordEncrypt {
    
    public static String pEncode(String userpassword){
        return Base64.getEncoder().encodeToString(userpassword.getBytes());
    }
    
    public static String pDecode(String userpassword){
        return new String(Base64.getMimeDecoder().decode(userpassword));
    }
    
}
