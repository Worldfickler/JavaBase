package org.example.day09.practice;

import cn.hutool.json.JSONUtil;

import java.io.*;
import java.lang.reflect.Field;

/**
 * @author Fickler
 * @date 2024/4/24 14:16
 */
public class Compare<T> {

    /**
     * 比较方法（自定义处理、自定义日志、自定义控制台）
     * @param tA 实体类对象A
     * @param tB 实体类对象B
     * @param type 比较的属性名称
     * @param control 自定义控制台输出
     * @param log 自定义日志打印
     * @param deal 自定义比较方法
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     */
    public void compare(T tA, T tB, String type, ConsoleLogPrintResolve<T> control, LogFilePrintResolveAdapter<T> log, BinaryResolve<T> deal) throws IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = tA.getClass();
        Class<?> bClass = tB.getClass();
        Field aField = aClass.getField(type);
        aField.setAccessible(true);
        Field bField = bClass.getField(type);
        Object a = aField.get(tA);
        Object b = bField.get(tB);

        if (a.equals(b)) {
            System.out.println("相同");
        } else {
            System.out.println("不同");
            if(deal != null){
                deal.resolve(tA,tB);
            }
        }
        if(log != null){
            try {
                log.doResolve(tA, tB);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        if(control != null){
            control.resolve(tA, tB);
        }
    }

    /**
     * 实现出现差异（不相等）时，的处理逻辑
     *
     * @param <T> 比较的对象类型
     */
    public interface BinaryResolve<T>{
        /**
         * 实际的处理逻辑
         *
         * @param s 被比较的对象
         * @param t 比较的对象
         */
        void resolve(T s,T t);
    }

    class BinaryResolveImpl implements BinaryResolve {

        @Override
        public void resolve(Object s, Object o) {
            System.out.println("shdajhsdjahsjd");
        }
    }

    public interface ConsoleLogPrintResolve<T> extends BinaryResolve<T>{
        void resolve(T s,T t);
    }

    public abstract static class ConsoleLogPrintResolveAdapter<T> implements ConsoleLogPrintResolve<T>{
        protected String toJson(T t){
            return JSONUtil.toJsonStr(t);
        }
    }

    public interface LogFilePrintResolve<T> {

        /**
         *
         * @param s
         * @param t
         * @param bufferedOutputStream 不需要手动关闭！！！
         */
        void resolve(T s,T t,BufferedOutputStream bufferedOutputStream);
    }

    public abstract static class LogFilePrintResolveAdapter<T> implements LogFilePrintResolve<T>{

        private File file;

        public LogFilePrintResolveAdapter(File file) {
            this.file = file;
        }

        protected String toJson(T t){
            return JSONUtil.toJsonStr(t);
        }

        public void doResolve(T s,T t) throws FileNotFoundException {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            try{
                resolve(s,t,bufferedOutputStream);
            }finally {
                if(bufferedOutputStream != null){
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

                if(fileOutputStream != null){
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
