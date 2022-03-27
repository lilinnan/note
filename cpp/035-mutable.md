# 035-mutable

1.上节的最后，可以与const一起使用

2.在lambda中使用

```c++
#include <iostream>

int main() {
    int x;
    //使用值传递的时候，添加mutable可以在lamdba中修改x的值，但是原有的值依然不变，还是值传递
    auto f = [=]() mutable {
        x++;
        std::cout << x << std::endl;
    };
    f();
    return 0;
}
```

**********

[https://www.bilibili.com/video/BV12o4y1Z7tf](https://www.bilibili.com/video/BV12o4y1Z7tf)

