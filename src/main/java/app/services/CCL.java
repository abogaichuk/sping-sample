package app.services;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class CCL extends ClassLoader {
    @SneakyThrows
    @Override
    public Class<?> findClass(String className) {
//        String fileName = "target/classes/"+className.replace('.', File.separatorChar) + ".class";
        String fileName = "/home/volotsyuga/projects/tests/MagicHealer.class";
        byte[] bytes = Files.newInputStream(Path.of(fileName)).readAllBytes();
        return defineClass(className, bytes, 0, bytes.length);
    }
}
