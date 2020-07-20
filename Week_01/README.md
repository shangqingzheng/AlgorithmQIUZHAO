学习笔记

第一个周的状态很差，状态和思路完全跟不上。

总结小计，后续继续完善补充：

1、数组：java  ArrayList  容量能够动态增长的动态数组。非线程安全的，注意线程安全可用：Vector、CopyOnWriteArrayList。

```java
ArrayList<E> objectArray = new ArrayList<>();
objectArray.add("test");
objectArray.remove(index);
objectArray.get(index);
objectArray.set(index, "test");
objectArray.size();
数组排序：Collections.sort(intArray);
迭代：ArrayList<String> strArray = new ArrayList<String>();
for (String i : strArray) 
{
	System.out.printlin(i);
}
```

记一个go-vscode 环境搭建：https://www.cnblogs.com/mrbug/archive/2019/12/05/11978765.html记一个java-vscode 环境搭建：https://blog.csdn.net/hezh1994/article/details/79895480 

数组跟链表的优缺点：数组适用于多查询、少操作（增删）链表适用于多操作、少遍历。

遍历复杂度为O（n） 跳表：升维 + 空间换时间，对标二分查找、平衡树（AVL Tree）、时间负责度：O(log n) 

五毒神掌：

1、5-10分钟：读题和思考

2、有思路：自己开始做和写代码；不然，马上看题解。

切记不要死磕。

3、背诵、默写。

不要害羞，就是这么粗暴。

4、闭卷自己写。 

不要每个题目只做一遍！ 作业或刷题：[189. 旋转数组](https://leetcode-cn.com/problems/rotate-array/) 还未想透

```

```