package Exercise8_9;

class Exercise8_9 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFunctionException extends RuntimeException {
    final private int ERR_CODE; // 에러코드

    UnsupportedFunctionException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    UnsupportedFunctionException(String msg) {
        this(msg, 100); // ERR_CODE를 100(기본값)으로 초기화한다.
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "["+getERR_CODE()+"]"+super.getMessage();
    }
}
