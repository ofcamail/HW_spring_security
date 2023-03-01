package org.example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }


    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{Config.class};
    }

    // Мапинг для сервлета. Обрабатывает все запросы, поэтому "/"
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}