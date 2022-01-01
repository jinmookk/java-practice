package PropertiesEx4;

import java.util.Properties;

class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println("java.version :" + sysProp.getProperty("java.version"));

        System.out.println("user.language :" + sysProp.getProperty("user.version"));

        sysProp.list(System.out);
    }
}
