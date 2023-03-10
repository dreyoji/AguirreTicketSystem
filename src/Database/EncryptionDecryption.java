package Database;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.spec.KeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import org.apache.commons.codec.binary.Base64;

public class EncryptionDecryption {

    private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    private KeySpec _keySpec;
    private SecretKeyFactory _keyFactory;
    private Cipher _cipher;
    private byte[] _arrayBytes;
    private String _myEncryptionKey;
    private String _myEncryptionScheme;
    private SecretKey _key;

    /**
     * Initializes the EncryptionDecryption object with the default encryption
     * key and scheme.
     */
    public EncryptionDecryption() throws Exception {
        // The default encryption key for the application
        _myEncryptionKey = "CcNFRQWP3Kj60/isGU4E/A==";
        _myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
        _arrayBytes = _myEncryptionKey.getBytes(UNICODE_FORMAT);
        _keySpec = new DESedeKeySpec(_arrayBytes);
        _keyFactory = SecretKeyFactory.getInstance(_myEncryptionScheme);
        _cipher = Cipher.getInstance(_myEncryptionScheme);
        _key = _keyFactory.generateSecret(_keySpec);
    }

    /**
     * Encrypts a given string using the default encryption key and scheme.
     */
    public String encrypt(String unencryptedString) {
        String encryptedString = null;
        try {
            _cipher.init(Cipher.ENCRYPT_MODE, _key);
            byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] encryptedText = _cipher.doFinal(plainText);
            encryptedString = new String(Base64.encodeBase64(encryptedText));
        } catch (UnsupportedEncodingException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
        }
        return encryptedString;
    }

    /**
     * Decrypts a given string using the default encryption key and scheme.
     */
    public String decrypt(String encryptedString) {
        String decryptedText = null;
        try {
            _cipher.init(Cipher.DECRYPT_MODE, _key);
            byte[] encryptedText = Base64.decodeBase64(encryptedString);
            byte[] plainText = _cipher.doFinal(encryptedText);
            decryptedText = new String(plainText);
        } catch (InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
        }
        return decryptedText;
    }
}
