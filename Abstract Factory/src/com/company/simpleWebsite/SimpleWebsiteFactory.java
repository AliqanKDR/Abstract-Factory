package com.company.simpleWebsite;

import com.company.Footer;
import com.company.Header;
import com.company.Slider;
import com.company.WebsiteBuilderFactory;

public class SimpleWebsiteFactory implements WebsiteBuilderFactory {
    @Override
    public Header getHeader() {
        return new SimpleHeader();
    }

    @Override
    public Slider getSlider() {
        return new SimpleSlider();
    }

    @Override
    public Footer getFooter() {
        return new SimpleFooter();
    }
}
