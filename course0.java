package package0;



class course0  {
	String Name;
    public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	int arress;
	String time;
	String number;
	String palce;
	String teacher;
	String [] a= {"java","java web","ps"};
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPalce() {
		return palce;
	}
	public void setPalce(String palce) {
		this.palce = palce;
	}
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public void xuanke(String name){
		student student=new student();
		student.getName();
		student.setNumber("2020322081");
		student.setName("����");
		String bh;
		bh=student.getNumber();
	    if(student.getNumber()=="2020322081") {
	    	arress=301;time="8:00";
	    	System.out.println("ѧ��������"+student.getName());
	    	System.out.println("ѧ��ѡ��Ŀγ� ��"+a[0]);
	    	System.out.println("�Ͽεص㣺"+arress+"����");
	    	System.out.println("�Ͽ�ʱ�䣺"+time);
	    	
	    }else  {
	    	System.out.println("������Ŀγ�����");
	    }
	}
	public void duike(String name) {
		student student=new student();
		student.getName();
		student.setNumber("2020322081");
		student.setName("����");
		String bh;
		bh=student.getNumber();
		if(student.getNumber()=="2020322081") {
			System.out.println("ѧ��������"+student.getName());
			System.out.println("���Ѿ��˿��ˣ�������ѡ��");
		}
	}
	}
