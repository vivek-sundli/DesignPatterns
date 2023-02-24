package org.example;

public class OperatingSystemFactory {


    public OperatingSystem getInstance(String str) {
        if(str.equals("Apple")){
            return new AppleOS();
        }else if(str.equals("Android")){
            return new Android();
        }else{
            return new Windows();
        }
    }

}
