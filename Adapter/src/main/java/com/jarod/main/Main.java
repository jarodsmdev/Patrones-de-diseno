package com.jarod.main;

import com.jarod.adapter.CsvFileAdapter;
import com.jarod.adapter.ExcelFileAdapter;
import com.jarod.adapter.FileAdapter;
import com.jarod.adapter.InputFile;
import com.jarod.model.Person;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/**
 *
 * @author Jarod Smith
 */
public class Main {
    
    private static final String path = 
            "src" + File.separator +
            "main" + File.separator +
            "resources" + File.separator +
            "files" + File.separator ;
    
    public static void main(String[] args) throws FileNotFoundException{
        /* Read Excel */
        System.out.println("------EXCEL FILE--------");

                
        InputFile excelFileAdapter = new ExcelFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(excelFileAdapter);
        
        InputStream inputStream = new FileInputStream(path + "Libro1.xlsx");
        List<Person> personList = fileAdapter.readFile(inputStream);
        
        System.out.println(personList);
        
        System.out.println("------CSV FILE--------");
        
        /* Read CSV file */
        InputFile csvFileAdapter = new CsvFileAdapter();
        FileAdapter fileAdapterCSV = new FileAdapter(csvFileAdapter);
        
        InputStream inputStreamCSV = new FileInputStream(path + "ArchivoCSV.csv");
        List<Person> personListCSV = fileAdapterCSV.readFile(inputStreamCSV);
        
        System.out.println(personListCSV);
        
    }
    
}
