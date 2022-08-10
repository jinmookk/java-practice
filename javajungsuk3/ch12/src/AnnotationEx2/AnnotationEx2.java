package AnnotationEx2;

class NewClass {
    int newFeild;

    int getNewFeild() {
        return newFeild;
    }

    @Deprecated
    int oldFeild;

    @Deprecated
    int getOldFeild() {
        return oldFeild;
    }
}

class AnnotationEx2 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldFeild = 10;                       // @Deprecated가 붙은 대상을 사용
        System.out.println(nc.getOldFeild());   // @Deprecated가 붙은 대상을 사용
    }
}
