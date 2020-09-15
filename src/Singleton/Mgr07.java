package Singleton;

/**
 * 枚举单例
 * 不仅可以解决线程同步，还可以防止序列化
 * 枚举类无构造方法反序列化
 */
public enum Mgr07 {
    INSTANCE;
    public void m(){
        System.out.println("m");
    }
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr07.INSTANCE.hashCode());
            }).start();
        }
    }
}
