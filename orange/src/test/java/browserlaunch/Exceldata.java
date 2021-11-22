package browserlaunch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class Exceldata {
	Workbook wk;
	XSSFSheet sh;

	public Exceldata() {

		try {
			File src = new File("E:\\java\\Data.Xlsx");
			FileInputStream excel = new FileInputStream(src);
			wk = new XSSFWorkbook(excel);

		}

		catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Test
	public String getdata(int sheetnumber, int row, int col) {
		sh = (XSSFSheet) wk.getSheetAt(sheetnumber);
		DataFormatter formatter = new DataFormatter();
		String data = formatter.formatCellValue(sh.getRow(row).getCell(col));
		return data;
	}
}
