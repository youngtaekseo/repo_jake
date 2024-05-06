package com.win.work.product;

import com.win.common.base.BaseVo;

public class ProductVo extends BaseVo {
	private String shSeq;
	private Integer shCarType     = null; 	// 1:중형차, 2:대형차
	private Integer shCarBrand    = null; 	// 1:현대, 2:제네시스, 3:기아
	private Integer shCarColor    = null; 	// 1:검정색, 2:흰색
	private Integer shRecommend   = null; 	// 1:추천, 2:비추천
	private Integer shAccident    = null; 	// 1:무사고, 2:유사고
	private Integer shOptionRunKm = null;	// 주행기록
	private Integer shOptionRunKmFrom; 		// 주행기록 시작값
	private Integer shOptionRunKmTo;   		// 주행기록 종료값
	private Integer shOptionYear  = null;	// 연식
	private Integer shOptionYearFrom; 		// 연식 시작값
	private Integer shOptionYearTo;   		// 연식 종료값
	
//=============================================================================
    
	public String getShSeq() {
		return shSeq;
	}
	public void setShSeq(String shSeq) {
		this.shSeq = shSeq;
	}
	public Integer getShCarType() {
		return shCarType;
	}
	public void setShCarType(Integer shCarType) {
		this.shCarType = shCarType;
	}
	public Integer getShCarBrand() {
		return shCarBrand;
	}
	public void setShCarBrand(Integer shCarBrand) {
		this.shCarBrand = shCarBrand;
	}
	public Integer getShCarColor() {
		return shCarColor;
	}
	public void setShCarColor(Integer shCarColor) {
		this.shCarColor = shCarColor;
	}
	public Integer getShRecommend() {
		return shRecommend;
	}
	public void setShRecommend(Integer shRecommend) {
		this.shRecommend = shRecommend;
	}
	public Integer getShAccident() {
		return shAccident;
	}
	public void setShAccident(Integer shAccident) {
		this.shAccident = shAccident;
	}
	public Integer getShOptionRunKm() {
		return shOptionRunKm;
	}
	public void setShOptionRunKm(Integer shOptionRunKm) {
		this.shOptionRunKm = shOptionRunKm;
	}
	public Integer getShOptionRunKmFrom() {
		return shOptionRunKmFrom;
	}
	public void setShOptionRunKmFrom(Integer shOptionRunKmFrom) {
		this.shOptionRunKmFrom = shOptionRunKmFrom;
	}
	public Integer getShOptionRunKmTo() {
		return shOptionRunKmTo;
	}
	public void setShOptionRunKmTo(Integer shOptionRunKmTo) {
		this.shOptionRunKmTo = shOptionRunKmTo;
	}
	public Integer getShOptionYear() {
		return shOptionYear;
	}
	public void setShOptionYear(Integer shOptionYear) {
		this.shOptionYear = shOptionYear;
	}
	public Integer getShOptionYearFrom() {
		return shOptionYearFrom;
	}
	public void setShOptionYearFrom(Integer shOptionYearFrom) {
		this.shOptionYearFrom = shOptionYearFrom;
	}
	public Integer getShOptionYearTo() {
		return shOptionYearTo;
	}
	public void setShOptionYearTo(Integer shOptionYearTo) {
		this.shOptionYearTo = shOptionYearTo;
	}
    
}
