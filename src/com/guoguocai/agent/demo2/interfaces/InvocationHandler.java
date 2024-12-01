package com.guoguocai.agent.demo2.interfaces;

import java.lang.reflect.Method;

public interface InvocationHandler {

    void invoke(Method method, Object object);
}
