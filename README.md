## Design Pattern

此项目用于学习在编程中常用到的 23 种设计模式，根据包名来区分不同的设计模式，大  
部分的设计模式都有相应的实例代码，放于该设计模式的 Demo 包下面，每个Demo 都很  
简单且容易理解，适合于想学习设计模式的初学者。

### 1. 单例模式

主要介绍了单例模式的饿汉式和懒汉式两种形式。
  
适用场景：  
保证类只有一个实例。
  
举例说明：  
1.电脑中的任务管理器，不管打开多少次，始终只有一个。  
2.Hibernate中 的 SessionFactory，MyBatis 中的 SqlSessionFactory。

### 2. 简单工厂模式

适用场景：  
工厂类中包含了必要的逻辑判断，可以根据客户端的选择条件动态地实例化相关的类，对  
于客户端来说，去除了与具体产品的依赖。

Demo：  
编写简单的计算器程序，要求输入两个数，得结果（加、减、乘、除）。

缺点：  
如果以后计算器程序增加了计算平方的功能，那么就需要去修改简单工厂类，为其增加  
 case 的分支条件。**修改原有的类，违反了开放-封闭原则。**

### 3. 工厂方法模式

优点：  
定义一个工厂类接口，使得能让一个类的实例化延迟到工厂类接口的子类中。这样做不会  
违背开放-封闭原则。

Demo：  
用工厂方法模式来改进用简单工厂写的计算机程序。

缺点：  
每加一个新产品，就需要加一个产品工厂的子类，增加了额外的开发量。而且，工厂方法  
模式把简单工厂的内部逻辑判断转移到了客户端来进行，客户端需要决定实例化哪一个子  
类工厂来实现运算类，**选择判断的问题依然存在。**

### 4. 抽象工厂模式 PART1

优点：  
易于交换某一产品系列。  

Demo：  
某一网站是基于 SqlServer 数据库运行的，现在要将其改为基于 Oracle 数据库运行。