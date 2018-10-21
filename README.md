#Hikari Project内容说明
本项目是个人用与多线程&高并发的练习使用。

#学习笔记

目录结构
---
~~~
cmemory.hikari.annoations存放自定义标签，标注方法时候线程安全
cmemory.hikari.thread下存放学习的过程和练习和部分测试
~~~

181011
--
创建线程 first of all

181015
--
多线程默认是异步执行的
加synchronized可以同步执行代码块

synchronized可以锁代码块或者class或者字符串等
作用域完全不一样，持有的锁不一样代码跑起来也不一样，详情请见示例

181016
--
不同的对象加在锁上面的时候结果还是异步的，因为获取到的不是同一把锁。
这里要特殊说明的是JVM常量池缓存，因为有它的存在会使如下代码成立
~~~
String a = "hikari";
String b = "hikari";
~~~
此时 a == b结果为true
也就是说当你使用String类型变量作为锁的时候，可能会导致线程不安全情况

181019
--
~~~
"Thread", "Concurrency", "Spring Cloud",
"RPC", "Dubbo", "Redis", "RabbitMQ", "ZooKeeper",
"Zipkin", "Hystrix"
~~~
如果我有幸能让你点开我的项目并读到这里，非常荣幸，我正在学习以上的技能，希望你也能加油！
我会持续更新此代码并且以后更新上述项目及实战。
目标剑指架构师！

synchronized(class)对class上锁以后，其他线程只能用同步的方式调用class中的静态同步方法。
这个现象十分有趣，我还尝试了把锁加在类上和方法中，尝试了锁变量和class，结果大相径庭。

今天还探索了死锁的一种情况，当双方互相持有对方锁的时候，此时会导致死锁。详情可以通过jstack查看。
~~~
在jdk bin 目录下执行jps
可以看到目前仍然在run的线程id
再执行jstack -l id就可以检测到目前线程的情况
~~~

181021
--
volatile可以保证线程之间的可见性，但是并不能保证原子性。
如果只想使用类似i++的操作，那么可以使用atomic包中的方法。
~~~
private AtomicInteger count = new AtomicInteger(0);
~~~
此时使用
~~~
count.incrementAndGet()
~~~
就可以达到++并且取值的效果了。
atomic中提供了很多方法可以使用，详细等以后用到再了解，毕竟他是丢在concurrency下的呀。

#
All For My Ycc <br>
By Hikari