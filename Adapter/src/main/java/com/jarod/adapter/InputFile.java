package com.jarod.adapter;

import com.jarod.model.Person;
import java.io.InputStream;
import java.util.List;

/**
 * InputFile
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 05.aug.2026
 */
public interface InputFile {
    List<Person> readFile(InputStream inputStream);
}
