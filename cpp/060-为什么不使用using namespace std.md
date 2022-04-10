# 060-为什么不使用using namespace std

```c++
#include <iostream>
#include <vector>
#include <functional>
#include <algorithm>

int main() {
    std::vector<int> vector = {9, 9, 0, 9, 0, 3};
    auto result = std::find_if(vector.begin(), vector.end(), [](int value) {
        return value > 0;
    });
    std::cout << *result << std::endl;
    return 0;
}
```

以上节的代码为例，使用using namespace std之后，我们的代码可以简化为如下的形式，也就是不需要一直写std::了

```c++
#include <iostream>
#include <vector>
#include <functional>
#include <algorithm>

using namespace std;

int main() {
    vector<int> vector = {9, 9, 0, 9, 0, 3};
    auto result = find_if(vector.begin(), vector.end(), [](int value) {
        return value > 0;
    });
    cout << *result << endl;
    return 0;
}
```

> using namespace 可以使用在任何作用域，不止是声明在最上面

我们可以在命名空间特别长或者是在某个函数中一直调用某个命名空间的函数时可以使用using namespace

不使用using namespace std的时候，我们可以很容易的分辨，只要有std::的就是来自于标准库的，如果使用了using namespace，就难以分辨。

如果在多个命名空间内有着同样的函数，我们就不能清楚的知道哪个被调用，像下面这样

```c++
#include <iostream>
#include <vector>
#include <functional>
#include <algorithm>

namespace Test1 {
    void print(const std::string &message) {
        std::cout << message << std::endl;
    }
}

namespace Test2 {
    void print(const char *message) {
        std::string temp = message;
        std::reverse(temp.begin(), temp.end());
        std::cout << temp << std::endl;
    }
}

using namespace Test1;
using namespace Test2;

int main() {
    //如果不使用using namespace，我们可以很清楚知道我们调用的是哪个
    Test1::print("Hello");
    Test2::print("Hello");
    //如果使用了，我们根本不知道哪个会被调用
    print("Hello");
    //这里实际上调用了Test2里面的，因为字符串字面量类型为const char* 
    //和Test2里面的print函数的参数更加匹配，Test1的print需要做一次隐式转换
    return 0;
}
```

> :warning: 千万不要在头文件中写using namespace，因为这个头文件不一定包含在哪，如果项目较大，非常难找到问题

可以在适当的位置来使用using namespace，尽量减小到最小的作用域

***





