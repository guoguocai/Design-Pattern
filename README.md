## Design Pattern

此项目用于学习在编程中常用到的 23 种设计模式，根据包名来区分不同的设计模式，大部分的设计模式都有相应的实例代码，放于该设计模式的 Demo 包下面，每个 Demo 都很简单且容易理解，适合于想学习设计模式的初学者。

### 单例模式

主要介绍了单例模式的饿汉式和懒汉式两种形式。
  
适用场景：  
保证类只有一个实例。
  
举例说明：  
1.电脑中的任务管理器，不管打开多少次，始终只有一个。  
2.Hibernate中 的 SessionFactory，MyBatis 中的 SqlSessionFactory。

### 简单工厂模式

适用场景：  
工厂类中包含了必要的逻辑判断，可以根据客户端的选择条件动态地实例化相关的类，对于客户端来说，去除了与具体产品的依赖。

Demo：  
编写简单的计算器程序，要求输入两个数，得结果（加、减、乘、除）。