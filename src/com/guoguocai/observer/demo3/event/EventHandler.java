package com.guoguocai.observer.demo3.event;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件管理类
 *
 * @auther guoguocai
 * @date 2019/1/19 16:10
 */
public class EventHandler {

    private List<Event> objects;

    public EventHandler()
    {
        objects = new ArrayList<Event>();
    }

    public void addEvent(Object object, String methodName, Object...args)
    {
        objects.add(new Event(object, methodName, args));
    }

    public void Notify() throws Exception
    {
        for (Event event : objects)
        {
            event.invoke();
        }
    }

}
