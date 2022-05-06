package com.msb.dongbao.portal.web.md5;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.DigestUtils;

/**
 * @Author HeJie
 * @Date 2022/4/28
 * @Time 16:17
 */
public class EncoderOrDecoderTest {
    @Test
    public void encoderAndDecode(){
        String sourceString = "123456";
        String s = DigestUtils.md5DigestAsHex(sourceString.getBytes());
        System.out.println("第1次加密值：" + s);
        s = DigestUtils.md5DigestAsHex(sourceString.getBytes());
        System.out.println("第2次加密值：" + s);
    }

    @Test
    public void bcrypt(){
        String sourceString = "123456";
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode(sourceString);
        System.out.println("第1次加密值：" + encode);
        boolean matches = bCryptPasswordEncoder.matches(sourceString, encode);
        System.out.println("第1次验证：" + matches);

        encode = bCryptPasswordEncoder.encode(sourceString);

        System.out.println("第2次加密值：" + encode);
        matches = bCryptPasswordEncoder.matches(sourceString,encode);
        System.out.println("第2次验证：" + matches);
    }
}
