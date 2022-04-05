# 047-动态数组Vector

Vector，这个东西其实不应该叫Vector，它其实类似于Java中的ArrayList

> 这玩意为啥叫Vector？参照这里，有一些说明
>
> https://stackoverflow.com/questions/581426/why-is-a-c-vector-called-a-vector

我们看看如何使用这个Vector吧

```c++
#include <iostream>
#include <vector>

struct Vertex {
    float x;
    float y;
    float z;

    bool operator==(const Vertex &other) const {
        return x == other.x && y == other.y && z == other.z;
    }
};

std::ostream &operator<<(std::ostream &ostream, const Vertex &vertex) {
    ostream << vertex.x << "," << vertex.y << "," << vertex.z;
    return ostream;
}

int main() {
    //注意这里的模板类型，是可以写原始数据类型的，比如std::vector<int>
    std::vector<Vertex> vector;
    //这里需要添加数据使用的是push_back 相对于Java中的add方法
    vector.push_back({1, 2, 3});
    vector.push_back({4, 5, 6});
    //如果我们想要遍历它
    //可以使用for循环
    for (int i = 0; i < vector.size(); i++) {
        //因为vector重载了[]所以我们可以直接使用数组的方式访问
        std::cout << vector[i] << std::endl;

    }
    for (int i = 0; i < vector.size(); i++) {
        //当然还提供了at方法来访问 相对于Java中的get方法
        std::cout << vector.at(i) << std::endl;
    }
    //当然，我们还可以使用foreach
    //注意，:前面应该使用引用类型，如果不，就会一个个挨着复制...
    for (Vertex &vertex : vector) {
        std::cout << vertex << std::endl;
    }

    //如果我们想要移除某个元素 erase需要传递进去一个迭代器 需要删除0位置就要写begin，删除1可以写begin()+1
    vector.erase(vector.begin());
    std::cout << vector.size() << std::endl;
    //虽然这个迭代器有end end表示表示的是队位后面的一个，仅仅是个标志
    //我们这里传入迭代器不能是end，哪怕做了计算，把它挪到前面也不行... 这个属于未定义行为...

    //如果我们想要清空这个vector 和Java里面是一样的
    vector.clear();

    //另外，还有两个
    //front表示队首的引用
    Vertex &front = vector.front();
    //back表示队尾的引用
    Vertex &back = vector.back();
    
    //学到这里，我不得不感叹一下，这玩意真的没有Java里面的ArrayList好用...删除个元素都这么费劲
   
    return 0;
}
```

> 这里存储的是Vertex而不是它的指针，这实际上就是把对象存在一条直线上
>
> 这两种存储方式有很大的不同，具体的使用依照情况来定
>
> 这里存储Vertex对象比指针更好，因为如果存储的是对象，它会在一块完整的内存上，而不是碎片化的，这些对象都是一个接着一个存在一块的，无论是遍历或者改变它们，它们都在一条高速缓存线上。
>
> 但是如果这个Vector需要扩容，它会需要复制所有的数据，如果你刚好整了一个字符串Vector，在扩容的时候，就需要复制了，这个相对于使用指针就会比较慢，所以两者的使用还是需要依照情况来决定~

***

[https://www.bilibili.com/video/BV1qK4y1H7uX](https://www.bilibili.com/video/BV1qK4y1H7uX)
