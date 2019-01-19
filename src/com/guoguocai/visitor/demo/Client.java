package com.guoguocai.visitor.demo;

import com.guoguocai.visitor.demo.actionimp.Amativeness;
import com.guoguocai.visitor.demo.actionimp.Failure;
import com.guoguocai.visitor.demo.actionimp.Success;
import com.guoguocai.visitor.demo.personimp.Man;
import com.guoguocai.visitor.demo.personimp.Woman;

/**
 * @auther guoguocai
 * @date 2019/1/19 20:18
 */
public class Client {

    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());

        // 成功时的反应
        Success v1 = new Success();
        structure.display(v1);

        // 失败时的反应
        Failure v2 = new Failure();
        structure.display(v2);

        // 恋爱时的反应
        Amativeness v3 = new Amativeness();
        structure.display(v3);
    }
}
