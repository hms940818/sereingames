package com.sereingames.model;

import java.io.Serializable;

public class HomeWebDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 802516060441676434L;

	public HomeWebDto() {

	}

    private String currentTab;// 当前页面
    private boolean spFlg;// 电脑・手机区分
	
    public HomeWebDto(String currentTab, boolean spFlg) {
		super();
		this.currentTab = currentTab;
        this.spFlg = spFlg;
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
	
}
