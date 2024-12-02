package com.guoguocai.agent.demo2.imp;

import com.guoguocai.agent.demo2.interfaces.InvocationHandler;

import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

    // 被代理对象（声明为 Moveable 类型也没问题，但此时的代理类是支持对任意对象进行代理的，因此声明为 Object 更通用）
    private Object original;

    public LogHandler(Object original) {
        this.original = original;
    }

    @Override
    public void invoke(Method method, Object myProxy) {
        System.out.println("Tank move log open [");
        try {
            // 通过反射调用被代理对象的方法，第二个参数是方法的参数，有就传；注意这里的两个 invoke 只是碰巧同名
            method.invoke(original, new Object[]{});
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Tank move log close ]");
    }
}
