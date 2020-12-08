# Java第二次实验学生选课系统
#####   2020322102   孔德胤   计G202
## 1.实验内容
      设计一个学生选课系统
      要求：
      -说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，
            每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
      -对象示例：	人员（编号、姓名、性别……）
      --教师（编号、姓名、性别、所授课程、……）
			      学生（编号、姓名、性别、所选课程、……）
			      课程（编号、课程名称、上课地点、时间、授课教师、……）
## 2.实验目的
    初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
    掌握面向对象的类设计方法（属性、方法）；
    掌握类的继承用法，通过构造方法实例化对象；
    学会使用super()，用于实例化子类；
    掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
    
## 3.流程图

![](https://github.com/KongDeYin1/course1/blob/main/%E6%B5%81%E7%A8%8B%E5%9B%BE.PNG)

## 4.核心代码

    String mName = a.getName();
    String mNumber = a.getNumber();
    String mSex = a.getSex();
    
    String teachernumber=b.getNumber();
    String teachername = b.getName();
    String teacherclass =b.getInstruction();
		
    teachername = b.getName();
    teachernumber=b.getNumber();
    teacherclass=b.getInstruction();
    
   
## 5.实验结果（系统运行截图）
![](https://github.com/KongDeYin1/course1/blob/main/%E5%AE%9E%E9%AA%8C%E8%BF%90%E8%A1%8C%E6%88%AA%E5%9B%BE.PNG)

## 6.实验感想
     1.熟悉父类与子类之间继承；
     2.学会使用super()，用于实例化子类；
     3.掌握面向对象的类设计方法；
     
     
     
     
