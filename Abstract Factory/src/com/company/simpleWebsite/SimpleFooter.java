package com.company.simpleWebsite;

import com.company.Footer;

public class SimpleFooter implements Footer {
    @Override
    public void buildFooter() {
        System.out.println("Build simple footer");
    }
}
