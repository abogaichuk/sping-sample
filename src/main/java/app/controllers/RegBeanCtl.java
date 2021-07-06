package app.controllers;

import app.entity.BeanMD;
import app.services.CCL;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegBeanCtl {
    @Autowired
    private GenericApplicationContext context;

    @Autowired
    private CCL ccl;

    @GetMapping("/beans")
    public String[] beans() {
        return context.getBeanDefinitionNames();
    }

    @SneakyThrows
    @PostMapping("/beans")
    public String regBean(@RequestBody BeanMD beanMD) {
        Class<?> beanClass = ccl.findClass(beanMD.getBeanClassname());
        BeanDefinitionRegistry beanFactory = (BeanDefinitionRegistry) context.getBeanFactory();

        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
        beanDefinition.setBeanClass(beanClass);
        beanFactory.registerBeanDefinition(beanMD.getBeanName(), beanDefinition);
        context.getBean(beanMD.getBeanName());
        return "registered";
    }
}
