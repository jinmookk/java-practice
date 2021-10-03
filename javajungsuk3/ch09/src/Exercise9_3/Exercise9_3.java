package Exercise9_3;

import java.util.StringTokenizer;

class Exercise9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

//        String[] strArr = fullPath.split("\\\\");
//
//        for (int i=0; i < strArr.length - 1; i++) {
//            path += strArr[i];
//            if (i == strArr.length -2)
//                break;
//            path += "\\";
//        }
//
//        fileName = strArr[strArr.length - 1];

        int pos = fullPath.lastIndexOf("\\");

        if (pos != -1) {
            path = fullPath.substring(0, pos);
            fileName = fullPath.substring(pos+1);
        }

        System.out.println("fullpath:"+fullPath);
        System.out.println("path:"+path);
        System.out.println("fileName:"+fileName);
    }
}
