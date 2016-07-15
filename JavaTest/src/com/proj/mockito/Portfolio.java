package com.proj.mockito;

import java.util.List;

public class Portfolio {
	private StockService stockService;
	private List<Stock> stocks;

	public StockService getStockService() {
		return this.stockService;
	}

	public void setStockService(StockService stockService) {
		this.stockService = stockService;
	}

	public List<Stock> getStocks() {
		return this.stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public double getMarketValue() {
		double marketValue = 0.0;
		
		for (Stock stock : this.stocks) {
			marketValue += this.stockService.getPrice(stock) * stock.getQuantity();
		}
		return marketValue;
	}
}