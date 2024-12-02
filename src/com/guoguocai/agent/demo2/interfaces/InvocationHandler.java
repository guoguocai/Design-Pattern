package com.guoguocai.agent.demo2.interfaces;

import java.lang.reflect.Method;

/**
 * 调用处理器
 * 接口名和方法名跟 JDK 中的一样，帮助理解
 */
public interface InvocationHandler {

    /**
     * 子类实现具体操作
     * @param method 业务接口的方法
     * @param myProxy 代理对象（不一定用得上）
     */
    void invoke(Method method, Object myProxy);
}
