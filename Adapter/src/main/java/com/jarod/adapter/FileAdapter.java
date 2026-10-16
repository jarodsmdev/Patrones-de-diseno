package com.jarod.adapter;

import com.jarod.model.Person;
import java.io.InputStream;
import java.util.List;

/**
 * FileAdapter
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 05.aug.2026
 */
public class FileAdapter {
    private InputFile inputFile;
    
    public FileAdapter(InputFile inputFile){
        this.inputFile = inputFile;
    }
    
    public List<Person> readFile(InputStream inputStream){
        return this.inputFile.readFile(inputStream);
    }
}
