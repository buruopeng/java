# 一.实验内容
1.CPU 类要求getSpeed返回 speed的值,要求 setSpeed（int m )方法将参数m的值赋值给 speed；
2.HardDisk 类要求getAmount返回 amount 的值,要求 setAmount（int m)方法将参数 m 的值赋值给amount；
3.PC 类要求 setCPU（CPU c)将参数 c 的值赋值给cpu，要求 setHardDisk ( HardDisk h）方法将参数 h 的值赋值给 HD .
4.要求 show（）的方法能显示cpu的速度和硬盘的容量。
5.主类Tesk的要求：
(1)main 方法中创建一个 CPU 对象 cpu , cpu 将自己的 speed 设置为2200。
(2)main 方法中创建一个 HardDisk 对象 disk , dis 将自飞的 amount 设置为200。
(3)main 方法中创建一个 PC 对象 pc。
(4)pc 调用 setCPU（CPU cpu）方法,调用时实参是 cpu。
(5)pc 调用 setHardDisk ( HardDisk h )方法,调用时实参是 disk。
(6)pc 调用 show（）方法。
附加要求：
a)类中定义不少于两个构造方法； 每个类定义不少于2个属性，且属性的类型应该多样化；
b)根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；
c)且定义的方法内应该有符合常理的逻辑判断；
d)尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
# 二.实验方法
1.构造四个类：CPU，PC,Test,HardDisk。
2.每个类定义两个构造方法，定义两个属性，使属性更多样化。
3.使用修饰符private封装程序。
4.在主类Test中创建三个对象，调用set将变量赋值，调用show（）方法通过get输出。
# 三.核心方法
这部分代码，创建了3个对象，利用set对变量进行赋值，最后利用show（）方法输出。
 ```  
 CPU cpu=new CPU(4);
 HardDisk HD=new HardDisk(128);
 cpu.setSpeed(2200);
 cpu.setName(7000);
 cpu.setFre(4);
 HD.setAmount(200);
 HD.setCondition("固态");
 PC pc=new PC(cpu);
 pc.setCPU(cpu);
 pc.setHardDisk(HD);
 pc.show();
   ```
# 四.实验结果




       
