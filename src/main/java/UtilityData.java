import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UtilityData {

    public static Object[] GetData(String FilePath) throws FileNotFoundException {
        List<Object[]> dataUser = new ArrayList<>();
        File file = new File(FilePath);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sheet = workbook.getSheetAt(0);

        for(int i= 1; i <= sheet.getLastRowNum();i++){
            Row row = sheet.getRow(i);
            Cell cell1 = row.getCell(0);
            Cell cell2 = row.getCell(1);
            String UserName = cell1.getStringCellValue();
            String PassWord = cell2.getStringCellValue();
            dataUser.add(new Object[]{UserName,PassWord});
        }
        return dataUser.toArray(new Object[0][0]);

    }



}
