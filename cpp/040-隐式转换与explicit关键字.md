# 040-隐式转换与explicit关键字

c++实际上允许编译器堆代码执行一次隐式转换，再两种类型之间执行隐式转换，不需要强制转换，像下面这样

```c++
#include <iostream>

using String = std::string;

class Person {
private:
    String mName;
    int mAge;
public:
    Person(const String &name) : mName(name), mAge(-1) {}

    Person(int age) : mName("Unknown"), mAge(age) {}

};

int main() {
    Person person1 = String("Name");
    Person person2 = 18;
    return 0;
}
```

我们可以看到，可以直接将std::string或者int直接赋值给Person，这个就是隐式转换，它隐式的将字符串或者一个int转换为Person对象，因为Person对象拥有以std::string或者int为参数的构造方法

这个也可以应用再方法的参数上面，看下面的例子

```c++
void test(const Person &person) {
    std::cout << person.getName() << std::endl;
}

int main() {
    //上面是可行的
    test(22);
    //这行是不可行的，因为Test字符串实际上是const char *不是std::string，c++需要做两次转换
    test("Test");
    return 0;
}

```

接下来是`explicit`关键字，为构造方法添加上这个关键字后，就禁止了隐式转换，你必须显示的调用构造函数来创建这个对象，像下面这样

```c++
#include <iostream>

using String = std::string;

class Person {
private:
    String mName;
    int mAge;
public:
    Person(const String &name) : mName(name), mAge(-1) {}

    explicit Person(int age) : mName("Unknown"), mAge(age) {}

    const String &getName() const {
        return mName;
    }

};

int main() {
    //这样是可以的，因为以std::string为参数的构造方法没有被声明为explicit
    Person person1 = String("Name");
    //这样是不行的，因为以int为参数的构造方法被声明为explicit
    Person person2 = 22;
    //我们需要显式调用构造方法，例如下面的两种方式
    Person person3(22);
    Person person4 = Person(22);
    return 0;
}
```

********


[https://www.bilibili.com/video/BV1G54y147dD](https://www.bilibili.com/video/BV1G54y147dD)

