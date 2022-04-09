# 057-静态数组-stdarray

```c++
#include <iostream>
#include <array>

template<typename T, size_t S>
void printArray(const std::array<T, S> &array) {
    for (int i = 0; i < S; i++) {
        std::cout << array[i] << std::endl;
    }
}

template<typename T, size_t S>
void printArray(const T *array) {
    for (int i = 0; i < S; i++) {
        std::cout << array[i] << std::endl;
    }
}

int main() {
    std::array<int, 5> array;
    for (int i = 0; i < array.size(); i++) {
        array[i] = i * 2;
    }
    printArray(array);

    const int size = 5;
    int arr[size];
    for (int i = 0; i < size; i++) {
        arr[i] = i * 2;
    }
    printArray<int, size>(arr);
    return 0;
}
```

> 和std::vector内容存储在堆上不同，std:array的内容是存储在栈上的

使用传统数组，我们需要维护数组的大小，要不我们就无法使用它，使用std::array，我们可以直接调用size方法来获取数组大小

使用std::array，在迭代调试模式下，会有边界检查，如果越界会出现异常，但是如果使用经典数组，越界只会访问到不属于我们的内容

std::array在最优化的模式下，其实和普通风格的数组相同，std::array实际上不会存储大小，这个只是一个模板参数，你写几，它就返回几，并不存储这个大小

我们应该一直使用std::array，因为基本上没有性能问题，还有一些调试功能。

***

