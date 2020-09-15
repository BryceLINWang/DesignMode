package Singleton;
/**
 * 懒汉式
 * 按需初始化 但线程不安全
 * 可以通过synchronized解决，但也带来了线程不安全
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;
    private  Mgr03(){

    }
    public static synchronized Mgr03 getInstance(){
        if(INSTANCE==null){
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            INSTANCE=new Mgr03();
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
