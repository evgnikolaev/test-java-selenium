package a2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a10_TableClass {

    private WebElement tableElement;
    private WebDriver driver;


    public a10_TableClass(WebElement tableElement, WebDriver driver) {
        this.tableElement = tableElement;
        this.driver = driver;
    }


    //Верни tr
    public List<WebElement> getRows() {
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr"));
        rows.remove(0);
        return rows;
    }

    //Верни заголовки th
    public List<WebElement> getHeadings() {
        WebElement rows = tableElement.findElement(By.xpath(".//tr[1]"));
        List<WebElement> headingColumns = rows.findElements(By.xpath(".//th"));
        return headingColumns;
    }


    //верни td (лист листов - двумерный массив)
    public List<List<WebElement>> getRowsWithColumns() {
        List<WebElement> rows = getRows();
        List<List<WebElement>> rowsWithColumns = new ArrayList<List<WebElement>>();
        for (WebElement row : rows) {
            List<WebElement> rowWithColumns = row.findElements(By.xpath(".//td"));
            rowsWithColumns.add(rowWithColumns);
        }
        return rowsWithColumns;
    }


    //Верни значение ячейки, зная порядковые номера
    public String getValueFromCell(int rowNumber, int columnNumber) {
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns();
        WebElement cell = rowsWithColumns.get(rowNumber - 1).get(columnNumber - 1);
        return cell.getText();
    }


    //верни getRowsWithColumnsByHeading  ячейки для заголовка
    public List<Map<String, WebElement>> getRowsWithColumnsByHeading() {
        List<Map<String, WebElement>> getRowsWithColumnsByHeading = new ArrayList<Map<String, WebElement>>();
        Map<String, WebElement> rowByHeading;

        List<List<WebElement>> rowsWithColumns = getRowsWithColumns(); //td (лист листов - двумерный массив)
        List<WebElement> headingColumns = getHeadings(); //th заголовки

        for (List<WebElement> row : rowsWithColumns) {
            rowByHeading = new HashMap<String, WebElement>();

            for (int i = 0; i < headingColumns.size(); i++) {
                String heading = headingColumns.get(i).getText();
                WebElement cell = row.get(i);

                rowByHeading.put(heading, cell);
            }

            getRowsWithColumnsByHeading.add(rowByHeading);
        }
        return getRowsWithColumnsByHeading;
    }



    //Верни значение ячейки, зная порядковый номер строки и название заголовка
    public String getValueFromCell(int rowNumber, String columnName) {
        List<Map<String, WebElement>> getRowsWithColumnsByHeading = getRowsWithColumnsByHeading();

        WebElement cell = getRowsWithColumnsByHeading.get(rowNumber - 1).get(columnName);
        return cell.getText();

    }
}
