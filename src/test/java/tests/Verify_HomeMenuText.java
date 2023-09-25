package tests;

import base.Base;

public class Verify_HomeMenuText extends Base {
    public static void main(String[] args) {
        Base.startUp();
        getTextCheck("//li[1]/a", "HOME");
    }
}
