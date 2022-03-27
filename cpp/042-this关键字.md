this是指向当前对象的指针，this的指向是不能修改的，也就是`Type *const &name`

怎么用？

像Java中那样，在构造方法中经常使用，C++也是类似的，其他的一些操作也标注在下方了

```c++
#include <iostream>


class Entity;

void print(const Entity &entity);


class Entity {
private:
    float x;
    float y;
public:
    Entity(float x, float y) {
        //this实际上就是这样的
        Entity *const &real = this;
        //因为形参和实际的成员变量名称相同
        //所以x = x肯定是不行的
        //可使用this
        this->x = x;
        this->y = y;
        
        
        //我们还可以对this解引用，并将其传递到外部
        print(*this);
        //在非const方法中其实就是
        Entity &entity = *this;
    }

    float getX() const {
        //注意，在本方法中，下面这样写是不行的，因为方法上添加了const
        //表示我们不能修改这个方法的值，但是下面这样我们是可以修改的，
        //含义明显有冲突
        Entity *entity = this;
        //所以应该是这样的，这样我们就不能修改指针指向对象的内容了 而且也不能修改指针指向的内容
        const Entity *const entity1 = this;

        
        //接24行 在常量方法中是
        const Entity &entity2 = *this;
        print(*this);

        return x;
    }

};

void print(const Entity &entity) {
    std::cout << entity.getX() << std::endl;
}

int main() {
    Entity entity1(5, 8);
    const Entity &entity = entity1;
    return 0;
}
```

<hr>

https://www.bilibili.com/video/BV1qo4y1o7W5



<iframe src="//player.bilibili.com/player.html?aid=373744231&bvid=BV1qo4y1o7W5&cid=282068979&page=1" scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true" height="640" > </iframe>

