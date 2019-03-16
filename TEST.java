package org;

/**
 * Created by zjt on 18-7-19.
 */
class  A extends  Thread {
    private ThreadLocal<String> name;//

    public void setName(ThreadLocal name) {//
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}
    public class TEST {
        public static void main(String[] args) {
            A a = new A();
            a.setName("sss");
            System.out.println("...."+a.getName());
            a.start();
        }


    }

