package io.ikka.invest;

import io.ikka.invest.model.Stock;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    List<Stock> stockList = new ArrayList<>();
    try {
      List<String> originalLines = Files.readAllLines(Paths.get("input.txt"));
      List<String> processedLines = new ArrayList<>();
      for (int i = 0; i < originalLines.size(); i++) {
        Stock stock = new Stock();
        stock.setCompanyName(originalLines.get(i));
        i++;
        String prices = originalLines.get(i).trim();
        String[] pricesArr = prices.split(" ");
        stock.setPrice(pricesArr[4]);
        stock.setDayChange(pricesArr[0]);
        stock.setYearChange(pricesArr[2]);
        stockList.add(stock);
      }

      for (Stock stock : stockList) {
        System.out.println(stock.getCompanyName() + " " + stock.getPrice());
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
