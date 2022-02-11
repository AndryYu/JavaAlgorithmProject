# JavaAlgorithmProject

算法：一系列解决问题的，清晰、可执行的计算机指令
1. 有限性
2. 确定性：不会产生二义性
3. 可行性
4. 输入
5. 输出

### 1.线性查找
使用泛型
* 不可以是基本数据类型，只能是类对象
 boolean,byte,char,short,int,long,float,double
* 每个基本数据类型都有对应的包装类
 Boolean,Byte,Character,Short,Integer,Long,Float,Double
 
基本数据类型和引用数据类型 
1. 基本数据类型：变量名指向具体的数值(boolean,byte,char,short,int,long,float,double)
2. 引用数据类型：变量名不是指向具体的数值，而是指向存数据的内存地址或hash值(类(class),接口(interface),数组(array))

==和equals区别
* == 对于基本数据类型的变量，直接对其值进行比较
* == 引用数据类型的变量，则是对其内存地址的比较
* 任何类都继承Object类，Object方法中有equals方法。equals方法不能作用于基本数据类型的变量，这是因为基本数据类型非对象的缘故，没有equals方法。

循环不变量<br/>
复杂度分析：表示算法的性能。算法运行的上界

### 2.排序基础
#### 2.1 选择排序法
先把最小的拿出来<br/>
剩下的，再把最小的拿出来<br/>
剩下的，再把最小的拿出来<br/>
....<br/>
每次选择还没处理的元素里最小的元素<br/>

复杂度分析：O(n^2)

#### 2.2 插入排序法

 
