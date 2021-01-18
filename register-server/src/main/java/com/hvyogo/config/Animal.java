package com.hvyogo.config;


/**
 * @author wuxiaobo
 * @date 2020/7/21 13:59
 */
public class Animal {
    private String name;
    public String age;

    public Animal(String name) {
        this.name = name;
    }
    private Animal(){

    }
    public String getName() {
        System.out.println("当前名称:" + name);
        return name;
    }

    public String getAge() {
        System.out.println("哈哈");
        return "哈哈";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String say(String name) {
        System.out.println("第二个接口的方法:" + name);
        String name1 = Animal.this.getName();
        return name;
    }

    public void abstractMethod() {
        System.out.println("abstract");
    }
    private String getString(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return 1;
    }
}
