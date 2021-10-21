package com.company;

import com.company.advancedWebsite.AdvancedWebsiteFactory;
import com.company.simpleWebsite.SimpleWebsiteFactory;

public class Main {

    public static void main(String[] args) {

        WebsiteBuilderFactory websiteBuilderFactory = new SimpleWebsiteFactory();
        Header header = websiteBuilderFactory.getHeader();
        Slider slider = websiteBuilderFactory.getSlider();
        Footer footer = websiteBuilderFactory.getFooter();


        header.buildHeader();
        slider.buildSlider();
        footer.buildFooter();
    }
}
