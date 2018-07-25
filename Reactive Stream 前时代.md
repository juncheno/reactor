WebFlux -> Reactor ->Reactive Stream API



[WebFlux 简单使用](https://blog.csdn.net/tjq980303/article/details/79222350)



 ### Reactive Stream 前时代

 #### 阻塞式编程

* #### 无法并行计算

* #### 资源低效利用



  如果式cpu密集型 ，Reactive 都无济于事

Thread CPU 沾满了，其他线程不得不等待

一个20G 文件，4G内存机器 



#### Reactive Stream 规范

https://github.com/reactive-streams/reactive-streams-jvm



Reactive 是一中给观察这模式的扩展

观察这模式，责任链式模式，迭代器模式，发布-订阅模式

Streams 流式  A ->B ->C -> D-->E

List<Integer> values = Arrays.asList(1,2,3,4,5);

四种角色



1. Publisher ：发布者
2. Subscriber ：订阅者
3. Subscription ：订阅的控制器
4. Processor ：发布者|订阅者



#### 对比Iterator 模式

#### - 数据方向 

* ##### Reactive Streams ：推模式

* #### Iterator ： 拉模式（pull）

  [reactor](http://projectreactor.io/docs/core/release/reference/docs/index.html#getting-started-understanding-bom)

 #### 信号

#### - onSubscribe() :订阅事件

#### - onNext() : 数据达到事件

#### - onComplete() : 订阅完成事件

#### - onError() : 订阅异常

#### - request() : 请求

#### -cancle() : 取消

### Reactive Stream 框架 - Reactor 

### 





