package org.example.day06.observer.javaUtil;

import java.util.Observable;

/**
 * @author Fickler
 * @date 2024/4/22 9:28
 */
public class SubjectForSSQ extends Observable {
    private String msg;

    public String getMsg() {
        return msg;
    }

    /**
     * 更新主题消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        // 将此 Observable 对象标记为已更改; hasChanged 方法现在将返回 true
        setChanged();
        notifyObservers();
    }
}
