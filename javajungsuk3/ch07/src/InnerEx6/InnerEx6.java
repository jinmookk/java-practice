package InnerEx6;

class InnerEx6 {
    Object iv = new Object() { void method() {} };        // 익명 클래스
    static Object cv = new Object() { void method() {} }; // 익명 클래스
    
    void method() {
        Object lv = new Object() { void method() {} };    // 익명 클래스
    }
}