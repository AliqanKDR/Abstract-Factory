package com.company.advancedWebsite;

import com.company.Header;

public class AdvancedHeader implements Header {
    @Override
    public void buildHeader() {
        System.out.println("Build advanced header");
    }
}
