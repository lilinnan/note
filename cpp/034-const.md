# 034-const 

这个东西是用来声明常量的

例如 const int a = 5; 表示声明了一个int，值为5，它不会变

实际上，这个只是承诺，承诺这个值不会变，但是你可以强行修改你的常量

例如下面的例子，我们可以“强奸”一个常量

```c++
#include <iostream>

int main() {
    volatile const int a = 5;
    std::cout << a << std::endl;
    int *ptr = (int *) &a;
    *ptr = 8;
    std::cout << a << std::endl;
    return 0;
}
```

```
F:\Projects\ClionProjects\test\cmake-build-debug-cygwin\test.exe
5
8

进程已结束，退出代码为 0
```

注意：

- 这里的常量上面添加了关键字volatile，这里的作用是告诉编译器不要优化，如果不添加，应该是会在编译的时候将所有常量替换成具体的值。
- 不要这么违背你的承诺，这样不好。

const用在指针上呢？

```c++
#include <iostream>

int main() {
    const int a = 5;
    //为了便于理解const不同位置的作用，我们先将指针强制转换为int *
    //const int *  int const * 这两种写法表示指针指向的值是不被修改的
    const int *ptr = (int *) &a;
    int const *ptr2 = (int *) &a;
    // * const表示指针的指向不会修改
    int *const ptr3 = (int *) &a;
    //还可以将两者结合起来，例如
    //const int *const 或者 int const *const
    //表示指针指向的值不会变 指针指向的内容也不会变
    const int *const ptr4 = (int *) &a;
    int const *const ptr5 = (int *) &a;
    return 0;
}
```

const的第三种用法

```c++
class Test {
private:
    int mX;
    int mY;
public:
    int getX() const {
        return mX;
    }
};
```

在方法后添加const，表示这个方法不会修改类的任何内容

例如不能在这个方法中修改mX mY。

如果你要返回的内容是个指针，如下

```c++
class Test {
private:
    int *mX;
    int mY;
public:
    const int *const getX() const {
        return mX;
    }
};
```

可以看到，getX方法上有三个const，第一个表示我们返回的这个指针指向的值不能被修改，第二个表示指针的指向不会被修改，第三个const表示这个方法中不会修改类的任何内容，太神奇了。。。

如果是对象指针

```c++
void printX(const Test *test) {
    //这里不能可以修改指针指向的内容，但是不能修改任何test对象的任何内容
    //所以我们可以这样
    test = nullptr;
    //如果我们将getX()的const去掉，这里也会报错，因为修改了test对象内容
    std::cout << test->getX() << std::endl;
}
```

如果是引用呢？

```c++
void printX(const Test &test) {
    std::cout << test.getX() << std::endl;
}
```

这里是引用，引用实际上就是那个对象，所以我们不能修改任何内容，如果我们将getX()的const去掉，同样会报错，因为我们不能保证我们在那个方法里面一定不会修改对象的任何内容

我们如果创建了getX的两个版本，一个有const一个没有const，像这样

```c++
class Test {
private:
    int mX;
    int mY;
public:
    int getX() const {
        return mX;
    }

    int getX() {
        return mX;
    }
};
```

那么我们在printX方法的参数上添加const就会调用const版本，如不添加就调用不添加const的版本

如果我们想在const方法中修改某个变量，比如mY，我就是想修改

我们可以在mX上添加关键字mutable，像这样

```c++
class Test {
private:
    int mX;
    mutable int mY;
public:
    int getX() const {
        mY = 8;
        return mX;
    }
};
```

我们就可以在const方法中修改变量了

************

[https://www.bilibili.com/video/BV1qy4y1e7ds](https://www.bilibili.com/video/BV1qy4y1e7ds)

