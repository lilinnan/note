package com.lln.java17.test2;

import com.lln.java17.test3.Test1;

public sealed class Base permits Test, Test2 {

}

final class Test extends Base {

}

final class Test2 extends Base {

}
