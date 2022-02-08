# JavaAlgorithmProject

一系列解决问题的，清晰、可执行的计算机指令
1. 有限性
2. 确定性：不会产生二义性
3. 可行性
4. 输入
5. 输出

###1.线性查找
使用泛型
* 不可以是基本数据类型，只能是类对象
 boolean,byte,char,short,int,long,float,double
* 每个基本数据类型都有对应的包装类
 Boolean,Byte,Character,Short,Integer,Long,Float,Double
 
基本数据类型和引用数据类型 
1. 基本数据类型：变量名指向具体的数值
2. 引用数据类型：变量名不是指向具体的数值，而是指向存数据的内存地址或hash值

==和equals区别
* == 对于基本数据类型的变量，直接对其值进行比较
* == 引用数据类型的变量，则是对其内存地址的比较
* 任何类都继承Object类，Object方法中有equals方法。equals方法不能作用于基本数据类型的变量，这是因为基本数据类型非对象的缘故，没有equals方法。
 
