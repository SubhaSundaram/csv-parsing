package com.kgisl.parseexbeen;

public class GiveUpFile {

	private String TRADENUM;

	private String BS_IND;

	private String BROK_ID;

	private String PART_CODE;

	private String INST_TYPE;

	private String SYMBOL;

	private String EXP_DATE;

	private String STR_PRICE;

	private String OPT_TYPE;

	private long TRD_QTY;

	private double TRD_PRICE;

	private String GV_STS;

	private String OC_FLAG;

	private String CU_FLAG;

	private long ORDER_NUM;

	private String LAST_MODIDT;

	private String RESERVED;

	// private String Mismatch = "";

	// public String getMismatch() {
	// 	return Mismatch;
	// }

	// public void setMismatch(String mismatch) {
	// 	Mismatch += mismatch;
	// }

	public GiveUpFile() {

	}

	public GiveUpFile(
		String TRADENUM,
		String BS_IND,
		String BROK_ID,
		String PART_CODE,
		String INST_TYPE,
		String SYMBOL,
		String EXP_DATE,
		String STR_PRICE,
		String OPT_TYPE,
		long TRD_QTY,
		double TRD_PRICE,
		String GV_STS,
		String OC_FLAG,
		String CU_FLAG,
		long ORDER_NUM,
		String LAST_MODIDT,
		String RESERVED
	) {
		this.TRADENUM=TRADENUM;
		this.BS_IND=BS_IND;
		this.BROK_ID=BROK_ID;
		this.PART_CODE=PART_CODE;
		this.INST_TYPE=INST_TYPE;
		this.SYMBOL=SYMBOL;
		this.EXP_DATE=EXP_DATE;
		this.STR_PRICE=STR_PRICE;
		this.OPT_TYPE=OPT_TYPE;
		this.TRD_QTY=TRD_QTY;
		this.TRD_PRICE=TRD_PRICE;
		this.GV_STS=GV_STS;
		this.OC_FLAG=OC_FLAG;
		this.CU_FLAG=CU_FLAG;
		this.ORDER_NUM=ORDER_NUM;
		this.LAST_MODIDT=LAST_MODIDT;
		this.RESERVED=RESERVED;
		
			}

	public String getTRADENUM() {
		return TRADENUM;
	}

	public void setTRADENUM(String tRADENUM) {
		TRADENUM = tRADENUM;
	}

	public String getBS_IND() {
		return BS_IND;
	}

	public void setBS_IND(String bS_IND) {
		BS_IND = bS_IND;
	}

	public String getBROK_ID() {
		return BROK_ID;
	}

	public void setBROK_ID(String bROK_ID) {
		BROK_ID = bROK_ID;
	}

	public String getPART_CODE() {
		return PART_CODE;
	}

	public void setPART_CODE(String pART_CODE) {
		PART_CODE = pART_CODE;
	}

	public String getINST_TYPE() {
		return INST_TYPE;
	}

	public void setINST_TYPE(String iNST_TYPE) {
		INST_TYPE = iNST_TYPE;
	}

	public String getSYMBOL() {
		return SYMBOL;
	}

	public void setSYMBOL(String sYMBOL) {
		SYMBOL = sYMBOL;
	}

	public String getEXP_DATE() {
		return EXP_DATE;
	}

	public void setEXP_DATE(String eXP_DATE) {
		EXP_DATE = eXP_DATE;
	}

	public String getSTR_PRICE() {
		return STR_PRICE;
	}

	public void setSTR_PRICE(String sTR_PRICE) {
		STR_PRICE = sTR_PRICE;
	}

	public String getOPT_TYPE() {
		return OPT_TYPE;
	}

	public void setOPT_TYPE(String oPT_TYPE) {
		OPT_TYPE = oPT_TYPE;
	}

	public long getTRD_QTY() {
		return TRD_QTY;
	}

	public void setTRD_QTY(long tRD_QTY) {
		TRD_QTY = tRD_QTY;
	}

	public double getTRD_PRICE() {
		return TRD_PRICE;
	}

	public void setTRD_PRICE(double tRD_PRICE) {
		TRD_PRICE = tRD_PRICE;
	}

	public String getGV_STS() {
		return GV_STS;
	}

	public void setGV_STS(String gV_STS) {
		GV_STS = gV_STS;
	}

	public String getOC_FLAG() {
		return OC_FLAG;
	}

	public void setOC_FLAG(String oC_FLAG) {
		OC_FLAG = oC_FLAG;
	}

	public String getCU_FLAG() {
		return CU_FLAG;
	}

	public void setCU_FLAG(String cU_FLAG) {
		CU_FLAG = cU_FLAG;
	}

	public long getORDER_NUM() {
		return ORDER_NUM;
	}

	public void setORDER_NUM(long oRDER_NUM) {
		ORDER_NUM = oRDER_NUM;
	}

	public String getLAST_MODIDT() {
		return LAST_MODIDT;
	}

	public void setLAST_MODIDT(String lAST_MODIDT) {
		LAST_MODIDT = lAST_MODIDT;
	}

	public String getRESERVED() {
		return RESERVED;
	}

	public void setRESERVED(String rESERVED) {
		RESERVED = rESERVED;
	}

	@Override
	public String toString() {
		// return TRADENUM + "," + ORDER_NUM + "," + GV_STS + "," + LAST_MODIDT + "," + PART_CODE + "," + BS_IND ;
		return TRADENUM + "," +
		BS_IND + "," +
		BROK_ID + "," +
		PART_CODE + "," +
		INST_TYPE + "," +
		SYMBOL + "," +
		EXP_DATE + "," +
		STR_PRICE + "," +
		OPT_TYPE + "," +
		TRD_QTY + "," +
		TRD_PRICE + "," +
		GV_STS + "," +
		OC_FLAG + "," +
		CU_FLAG + "," +
		ORDER_NUM + "," +
		LAST_MODIDT + "," +
		RESERVED;

	}

	// @Override
	// public boolean equals(Object obj) {
	// 	if (obj instanceof GiveUpFile) {
	// 		GiveUpFile temp = (GiveUpFile) obj;
	// 		if (this.TRADENUM == temp.TRADENUM && this.BS_IND == temp.TRADENUM && this.BROK_ID == temp.BROK_ID
	// 				&& this.PART_CODE == temp.PART_CODE && this.INST_TYPE == temp.INST_TYPE
	// 				&& this.SYMBOL == temp.SYMBOL && this.EXP_DATE == temp.EXP_DATE && this.STR_PRICE == temp.STR_PRICE
	// 				&& this.OPT_TYPE == temp.OPT_TYPE && this.TRD_QTY == temp.TRD_QTY
	// 				&& this.TRD_PRICE == temp.TRD_PRICE && this.GV_STS == temp.GV_STS && this.OC_FLAG == temp.OC_FLAG
	// 				&& this.CU_FLAG == temp.CU_FLAG && this.ORDER_NUM == temp.ORDER_NUM
	// 				&& this.LAST_MODIDT == temp.LAST_MODIDT && this.RESERVED == temp.RESERVED)
	// 			return true;
	// 	}
	// 	return false;
	// }

	@Override
    public boolean equals(Object obj) {
        if (obj instanceof GiveUpFile) {
            return 
((GiveUpFile) obj).TRADENUM == TRADENUM &&
((GiveUpFile) obj).BS_IND == BS_IND &&
((GiveUpFile) obj).BROK_ID == BROK_ID &&
((GiveUpFile) obj).PART_CODE == PART_CODE &&
((GiveUpFile) obj).INST_TYPE == INST_TYPE &&
((GiveUpFile) obj).SYMBOL == SYMBOL &&
((GiveUpFile) obj).EXP_DATE == EXP_DATE &&
((GiveUpFile) obj).STR_PRICE == STR_PRICE &&
((GiveUpFile) obj).OPT_TYPE == OPT_TYPE &&
((GiveUpFile) obj).TRD_QTY == TRD_QTY &&
((GiveUpFile) obj).TRD_PRICE == TRD_PRICE &&
((GiveUpFile) obj).GV_STS == GV_STS &&
((GiveUpFile) obj).OC_FLAG == OC_FLAG &&
((GiveUpFile) obj).CU_FLAG == CU_FLAG &&
((GiveUpFile) obj).ORDER_NUM == ORDER_NUM &&
((GiveUpFile) obj).LAST_MODIDT == LAST_MODIDT &&
((GiveUpFile) obj).RESERVED == RESERVED ;
// ((GiveUpFile) obj).Mismatch == Mismatch &&;
}
        return false;

	}
	
	@Override
	public int hashCode() {
		return (this.TRADENUM.hashCode() + this.BS_IND.hashCode() + this.BROK_ID.hashCode() + this.PART_CODE.hashCode()
				+ this.INST_TYPE.hashCode() + this.SYMBOL.hashCode() + this.EXP_DATE.hashCode()
				+ this.STR_PRICE.hashCode() + this.OPT_TYPE.hashCode() + this.GV_STS.hashCode()
				+ this.OC_FLAG.hashCode() + this.CU_FLAG.hashCode() + this.LAST_MODIDT.hashCode()
				+ this.RESERVED.hashCode() + Double.valueOf(this.TRD_PRICE).hashCode()
				+ Double.valueOf(this.TRD_QTY).hashCode() + Double.valueOf(this.ORDER_NUM).hashCode());
	}
}
