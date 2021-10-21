package com.company.advancedWebsite;

import com.company.Footer;
import com.company.Header;
import com.company.Slider;
import com.company.WebsiteBuilderFactory;
import com.company.simpleWebsite.SimpleFooter;
import com.company.simpleWebsite.SimpleHeader;
import com.company.simpleWebsite.SimpleSlider;

public class AdvancedWebsiteFactory implements WebsiteBuilderFactory {
    @Override
    public Header getHeader() {
        return new AdvancedHeader();
    }

    @Override
    public Slider getSlider() {
        return new AdvancedSlider();
    }

    @Override
    public Footer getFooter() {
        return new AdvancedFooter();
    }
}
