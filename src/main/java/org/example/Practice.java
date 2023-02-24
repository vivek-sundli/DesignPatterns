package org.example;

public class Practice {

    public static void main(String[] args) {
        OperatingSystemFactory obj = new OperatingSystemFactory();
        OperatingSystem os = obj.getInstance("KaiOS");
        os.show();
    }
}