package com.company.simpleWebsite;

import com.company.Header;

public class SimpleHeader implements Header {
    @Override
    public void buildHeader() {
        System.out.println("Build simple header");
    }
}
