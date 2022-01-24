package com.example.CarProject.Controller.model;

public class Order {

	private int order_id;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	private int series_id;
	private int model_id;
	public int getSeries_id() {
		return series_id;
	}
	public void setSeries_id(int series_id) {
		this.series_id = series_id;
	}
	public int getModel_id() {
		return model_id;
	}
	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}
	public Order(int series_id, int model_id,int order_id) {
		super();
		this.series_id = series_id;
		this.model_id = model_id;
		this.order_id=order_id;
	}
	public Order() {
		
	}
	
}
