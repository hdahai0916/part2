# task3
## ans
- ##### Error 和 Exception 的区别是什么？面对它们时，程序的处理态度应该有什么不同？<br>
Error是程序运行时jvm或运行环境发生的严重错误，比如内存溢出、运行环境错误等，一般无法通过程序解决。
Exception是程序运行中一些可以预料或可以处理的错误。
对于Error，程序应该不处理，因为一般也处理不了。
对于Exception，应该通过try-catch结构进行处理。
- ##### checked exception 和 unchecked exception 的区别是什么？它们通常分别由什么原因引起？<br>
checked exception 是编译器会检查的异常，如果程序中可能出现这类异常，但程序中没有对应的处理代码时，编译器会让程序员修改代码。
unchecked exception是编译器不会检查的异常。
checked exception通常是由外部因素或运行过程中程序员无法完全控制的因素导致的，比如文件不存在，网络中断等。
unchecked exception通常是由于程序的逻辑有问题或者操作错误引起的，这类问题应该通过修改程序解决，而不是用try-catch。
- ##### 题目：读取文件并计算平均值
代码在task3.java里。