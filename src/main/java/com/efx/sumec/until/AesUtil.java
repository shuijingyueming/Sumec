package com.efx.sumec.until;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * @Author Sunweifeng
 * @Date 2023/4/15 15:08
 */
public class AesUtil {
    /**
     * 默认的字符编码
     */
    private static final String DEFAULT_CHARSET = "utf-8";

    public static final String Key = "MIGfMA0GCSqGSIb3DQEBAQUAWEUJ7812";

    public static final String Key1 = "MIGMqSbDhfUhWE81";



    /**
     * 算法
     */
    private static String ALGORITHM = "AES";

    /**
     * 算法/模式/填充
     **/
    private static final String CipherMode = "AES/ECB/PKCS5Padding";


    private AesUtil() {}

    /**
     * 解密AES 32位
     *
     * @param sSrc      解密的内容
     * @param secretKey 秘钥
     * @return 解密后的明文 数据
     */
    public static String decrypt(String sSrc, String secretKey) {

        if (secretKey == null) {
            System.out.println("需要加密的秘钥为空");
            return null;
        }
        try {
            byte[] raw = secretKey.getBytes(DEFAULT_CHARSET);
            SecretKeySpec secretKeySpec = new SecretKeySpec(raw, ALGORITHM);
            Cipher cipher = Cipher.getInstance(CipherMode);
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            // 先用base64解密
            byte[] encryptedArr = Base64.getDecoder().decode(sSrc);
            byte[] original = cipher.doFinal(encryptedArr);
            return new String(original, DEFAULT_CHARSET);
        } catch (Exception ex) {
            System.out.println("AES解密失败");
            return null;
        }
    }


    /**
     * 加密32位
     *
     * @param sSrc 需要加密的内容
     * @param sKey 秘钥
     * @return 加密的内容
     */
    public static String encrypt(String sSrc, String sKey) {
        if (sKey == null) {
            System.out.println("需要加密的秘钥为空");
            return null;
        }
        try {
            byte[] raw = sKey.getBytes(DEFAULT_CHARSET);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, ALGORITHM);
            Cipher cipher = Cipher.getInstance(CipherMode);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            byte[] encrypted = cipher.doFinal(sSrc.getBytes(DEFAULT_CHARSET));

            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception ex) {
            System.out.println("AES加密失败");
            return null;
        }
    }

    public static void main(String[] args) throws Exception {
           String enString = "Sunwf12#9938efxa";
           String enstr = encrypt(enString,Key);
           System.out.println(enstr);
           enstr="Y4/HeU8Pv9QYy528O2RMNerkkJB8UAwQhdA5oiHbjJu/A5MUcQKpumzsRMHD9OWT";
           System.out.println(decrypt(enstr,Key1));
    }
}
