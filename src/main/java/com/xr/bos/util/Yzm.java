package com.xr.bos.util;

import org.springframework.stereotype.Controller;

import java.util.Random;

@Controller
public class Yzm {
    /**
     * 生成一个长度为4的字符串(随机包含大写字母，小写字母，数字)
     *
     * @return
     */
    public String getString() {
        Random random = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            int num = random.nextInt(3);
            switch (num) {
                case 0:// 数字
                    int number = random.nextInt(10);
                    str += number;
                    break;
                case 1:// 小写字母
                    int lower = random.nextInt(26) + 97;
                    str += (char) lower;
                    break;
                case 2:// 大写字母
                    int upper = random.nextInt(26) + 65;
                    str += (char) upper;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        return str;
    }
}
