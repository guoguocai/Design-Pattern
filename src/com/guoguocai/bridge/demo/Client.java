package com.guoguocai.bridge.demo;

import com.guoguocai.bridge.demo.abs.PhoneBrand;
import com.guoguocai.bridge.demo.imp.PhoneAddressList;
import com.guoguocai.bridge.demo.imp.PhoneBrandM;
import com.guoguocai.bridge.demo.imp.PhoneBrandN;
import com.guoguocai.bridge.demo.imp.PhoneGame;

/**
 * @auther guoguocai
 * @date 2019/1/14 22:54
 */
public class Client {

    public static void main(String[] args) {

        PhoneBrand brand;

        System.out.println("手机品牌 M:");
        brand = new PhoneBrandM();
        brand.setPhoneSoft(new PhoneGame());
        brand.run();
        brand.setPhoneSoft(new PhoneAddressList());
        brand.run();

        System.out.println("手机品牌 N:");
        brand = new PhoneBrandN();
        brand.setPhoneSoft(new PhoneGame());
        brand.run();
        brand.setPhoneSoft(new PhoneAddressList());
        brand.run();
    }
}
