import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.*;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;

public class PasswordHash {
    private String hashed;

    public PasswordHash(String A, String B) {
        if(!(A.equals("")))
            hashed = salt(A,B);
        else{

        }
    }

    public String hash(){
        return this.hashed;
    }

    public String salt(String A, String B){
        byte[] hash = new byte[0];

        try {
            KeySpec spec = new PBEKeySpec(
                    A.toCharArray(),
                    B.getBytes(StandardCharsets.UTF_8),
                    65536,
                    128
            );
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");

            hash = factory.generateSecret(spec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }

        return Base64.getEncoder().encodeToString(hash);
    }
}
