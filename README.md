# Java基础知识

## 输入和输出

输入：

```java
Scanner in = new Scanner(System.in);

System.out.println(in.next());   //方法一
System.out.println(in.nextLine());    //方法二
```

> 只有遇到`next():`、`nextLine()`才会触发输入：
>
> **next()**:
>
> - 一定要读取到有效字符后才可以结束输入。
> - 对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
> - 只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
> - 不能得到带有空格的字符串。
>
> **nextLine()**：
>
> - 以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
> - 可以获得空白。
>
> 如果要输入 int 或 float 类型的数据，在 Scanner 类中也有支持，但是在输入之前最好先使用` hasNextXxx() `方法进行验证，再使用 `nextXxx() `（nextInt()、nextDouble()……）来读取：
>
> ```java
> if (scan.hasNextInt()) {// 判断输入的是否是整数            
>     i = scan.nextInt();            // 接收整数            
>     System.out.println("整数数据：" + i);        
> }
> ```


输出：

```java
System.out.println(input);
System.out.println("%2.f",sum);    //保留两位小数
```

完整代码：

```java
package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Object i = in.nextLine();
//        System.out.println(in.next());
//        System.out.println(in.nextLine());
        System.out.println(i);
        System.out.println("2+3="+5);
        System.out.println("2+3="+2+3);
        System.out.println("2+3="+(2+3));
        System.out.println(2+3+"=2+3");
    }
}
```

## 类型转换

方法一：输入时自动转换

```java
Scanner in = new Scanner(System.in)
int i;
i = in.nextDouble();      
```

方法二：输出时转换

int转为double可以自动进行：float = int正确

float转为int需要手动：int = float会出错，需要进行强制转换（去掉小数部分）

```java
int i;
i = (int)(3/2.0)    #去掉小数部分
```

## 比较优先级

判断是否相等的`==`和`!=`的优先级比其他的低，并且连续的关系运算是从左到右进行的：

```python
5>3 == 6>4    //true
6>5>4      //变成true>4，false
a == b == true     //true
a == b == 6      //变成true==6，false
a == b > false     //先进行b>false，无法比较，false
(a == b) > false    //true和false无法比大小

5 == 5.0    //true
1.0 == 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1    //false，浮点运算有误差
```

判断两个浮点数大小：将两个浮点数取其差数的绝对值，比一个很小的数小即为相等

```java
Math.abs(f1-f2) < 1e-6
```

## 分支语句

### if-else

### switch-case-default

```java
switch(控制表达式) {    //控制表达式只能是整数型的结果，其结果对应的是case后面的常量
    case 常量: 
        语句;
        break;     /  /如果没有break，则会继续进行下一个case/default语句，直到break
    case 常量: 
        语句;
        break;
    case 常量: 
        语句;
        break;
    ……
    default:
        语句;
        break;
}
```

## 循环语句

### wihle(){}

至少执行0次

### do{}while()

至少执行1次

### for

多重循环的跳出：在想跳出的for的外面写`OUT`定位，在需要跳的地方写`break OUT`;即可跳出到OUT下的for循环之外。
```java
...
OUT:
for 
    for
        for
            for
                for
                    break OUT;
```

continue同理，默认跳过当前循环，但加上标号后，可以对标号下的for循环起作用。

## 逻辑运算

非`!`，与`&&`，或`||`

![image-20220909201256704](pic/image-20220909201256704.png)

```java
not age > 20   //先进行not age，再进行>
```

## 数组

<类型>[] <名字> = new <类型>[元素个数];

元素个数必须给出，一定是整数，**可以是变量**

```java
int[] numbers = new int[100];       //创建一个放100个int的数组
```

> **注意：java的数组的元素个数可以是变量！！**

```java
int t;
int[] numbers = new int[t];       //创建一个放100个int的数组
```

> **注意：java的数组具有length变量，表示数组的长度（定义的长度）**





37