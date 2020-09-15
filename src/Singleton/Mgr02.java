package Singleton;

/**
 * 懒汉式
 * 按需初始化 但线程不安全
 */
public class Mgr02 {
    private static Mgr02 INSTANCE;
    private Mgr02(){}
    public static Mgr02 getInstance(){
        if(INSTANCE==null){
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            INSTANCE=new Mgr02();
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr02.getInstance().hashCode());
            }).start();
        }
    }
}
