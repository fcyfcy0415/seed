package reserve;

public class employer_Info {
	  public String Ename;
	  public String Cname;
	  public String Cno;
	  public String passwork;
	  public String Cadress;
	  public String Clegal; //法人代表
	  public String CTel;
	  public String E_E_Mail;
	  public String Licno;  //营业执照编码
    public String getCname() {
			return Cname;
		}
    public void setCname(String cname) {
			Cname = cname;
		}
    public String getPasswork() {
		return passwork;
	}
	public void setPasswork(String passwork) {
		this.passwork = passwork;
	}
	public String getCno() {
			return Cno;
		}
    public void setCno(String cno) {
			Cno = cno;
		}
	public String getEname() {
		return Ename;
	}
	public void setEname(String Ename) {
		this.Ename = Ename;
	}
	
	public String getCadress() {
		return Cadress;
	}
	public void setCadress(String Cadress) {
		this.Cadress = Cadress;
	}
	public String getClegal() {
		return Clegal;
	}
	public void setClegal(String Clegal) {
		this.Clegal = Clegal;
	}
	public String getCTel() {
		return CTel;
	}
	public void setCTel(String CTel) {
		this.CTel = CTel;
	}
	public String getE_E_Mail() {
		return E_E_Mail;
	}
	public void setE_E_Mail(String E_E_Mail) {
		this.E_E_Mail = E_E_Mail;
	}
	public String getLicno() {
		return Licno;
	}
	public void setLicno(String Licno) {
		this.Licno = Licno;
	}
	

}
