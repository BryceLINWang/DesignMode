package Singleton;
/**
 * 单例模式：某个类只能生成一个实例，
 * 该类提供了一个全局访问的结点供外部获取该实例。
 *
 * 好处：
 * 1.某些类创建比较频繁，对于一些大的项目，是一笔很大系统开销
 * 2。省去了new，降低了系统内存的使用频率，减轻了GC压力
 * 3。针对特定必须单一存在事物，必须使用单例模式
 * 缺点：
 *  没有抽象层，不能扩展
 *  职责过重，违背了单一性原则
 */
public class Main {
    //new Mgr01();做不到！
}
