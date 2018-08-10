package com.alucardlockon.relearnjava.datastructure;

/**
 * Map字典
 * Java 自带了各种 Map 类，这些 Map 类可归为三种类型：
 *
 * 通用Map
 * 用于在应用程序中管理映射，通常在 java.util 程序包中实现
 *
 * HashMap、Hashtable、Properties、LinkedHashMap、IdentityHashMap、TreeMap、WeakHashMap、ConcurrentHashMap
 *
 * 专用Map
 * 通常我们不必亲自创建此类Map，而是通过某些其他类对其进行访问
 *
 * java.util.jar.Attributes、javax.print.attribute.standard.PrinterStateReasons、java.security.Provider、java.awt.RenderingHints、javax.swing.UIDefaults
 *
 * 自行实现Map
 * 一个用于帮助我们实现自己的Map类的抽象类
 *
 * AbstractMap
 */
public class Map {
    public static void main(String[] args) {
        // HashMap HashMap最多只允许一条记录的键为Null(多条会覆盖);允许多条记录的值为 Null。非同步的。
        // Hashtable 与 HashMap类似,不同的是:key和value的值均不允许为null;它支持线程的同步，
        // 即任一时刻只有一个线程能写Hashtable,因此也导致了Hashtale在写入时会比较慢。
        // TreeMap默认按key进行升序排序，如果想改变默认的顺序，可以使用比较器
    }
}
