package ChainedExceptionEx;

class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // end of main

    static void install() throws InstallException {
        try {
            startInstall(); // 필요그램 설치에 필요한 준비를 한다.
            copyFile();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles(); // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) { // 충분한 설치 공간이 없으면...
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if (!enoughMemory()) { // 충분한 메모리가 없으면...
            throw new MemoryException("메모리가 부족합니다.");
//          throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
        }
    }

    static void copyFile() { /* 파일들을 복사하는 코드를 적는다. */ }
    static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */ }

    static boolean enoughSpace() {
        // 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
        return false;
    }

    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
        return true;
    }
} // end of class ChainedExceptionEx

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}