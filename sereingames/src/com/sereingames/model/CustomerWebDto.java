package com.sereingames.model;

import java.io.Serializable;
import java.util.List;

public class CustomerWebDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 802516060441676434L;

	public CustomerWebDto() {

	}

    private String currentTab;// 当前页面
    private boolean spFlg;// 电脑・手机区分

    private List<CustomerDetailDto> detailDtoList ; //合作伙伴dto list
	
    public CustomerWebDto(String currentTab, boolean spFlg, List<CustomerDetailDto> detailDtoList) {
		super();
		this.currentTab = currentTab;
        this.spFlg = spFlg;
        this.setDetailDtoList(detailDtoList);
	}

	/**
	 * @return the currentTab
	 */
	public String getCurrentTab() {
		return currentTab;
	}

	/**
	 * @param currentTab the currentTab to set
	 */
	public void setCurrentTab(String currentTab) {
		this.currentTab = currentTab;
	}

    /**
     * @return the spFlg
     */
    public boolean isSpFlg() {
        return spFlg;
    }

    /**
     * @param spFlg
     *            the spFlg to set
     */
    public void setSpFlg(boolean spFlg) {
        this.spFlg = spFlg;
    }

    /**
     * @return the serialversionuid
     */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the detailDtoList
	 */
	public List<CustomerDetailDto> getDetailDtoList() {
		return detailDtoList;
	}

	/**
	 * @param detailDtoList the detailDtoList to set
	 */
	public void setDetailDtoList(List<CustomerDetailDto> detailDtoList) {
		this.detailDtoList = detailDtoList;
	}
	
}
