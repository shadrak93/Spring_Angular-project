package com.consignment.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ConsignmentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer consignmentId;
	private String consignmencatogey;
	private String deliverypartner;
	private String consignmentstatus;
	
	
	public Integer getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(Integer consignmentId) {
		this.consignmentId = consignmentId;
	}
	public String getConsignmencatogey() {
		return consignmencatogey;
	}
	public void setConsignmencatogey(String consignmencatogey) {
		this.consignmencatogey = consignmencatogey;
	}
	public String getDeliverypartner() {
		return deliverypartner;
	}
	public void setDeliverypartner(String deliverypartner) {
		this.deliverypartner = deliverypartner;
	}
	public String getConsignmentstatus() {
		return consignmentstatus;
	}
	public void setConsignmentstatus(String consignmentstatus) {
		this.consignmentstatus = consignmentstatus;
	}
	
	
}
