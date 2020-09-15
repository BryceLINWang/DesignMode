package Singleton;
/**
 * 懒汉式
 * 按需初始化 但线程不安全
 * 可以通过synchronized解决，但也带来了线程不安全
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;
    private Mgr04(){}
    public static Mgr04 getInstance(){
        if(INSTANCE==null){
            //妄图减小同步代码块的方式提高效率，然后不可行
            synchronized (Mgr04.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE=new Mgr04();
            }
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
