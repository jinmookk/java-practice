package AnnotationEx1;

class Parent {
    void parentMethod() {}
}

class Child extends Parent {
//    @Override
//    void parentmethod() {} // 조상 메서드의 이름을 잘못 적었음. 에러

    @Override
    void parentMethod() {}
}
