package pack.controler;

import pack.model.DataDao;

public class BusinessServiceImpl  implements BusinessService{
	private DataDao dataDao;   //DataDaoimpl의 부모클래스가 DataDao여서 클래스의 포함관계를 사용.. (다형성)
	/*
	public BusinessServiceImpl() {  //파라미터 없는 생성자
		// TODO Auto-generated constructor stub
	}
	*/
	public BusinessServiceImpl(DataDao dataDao) {  //파라미터 있는 생성자
		// 생성자를 통해 DB 처리용 영역 클래스의 객체 주소를 치환(injection)
		this.dataDao = dataDao;
	}
	
	@Override
	public void selectProcess() {
		// DB와 연결해 자료를 읽는 DataDaoImpl클래스의 selectData 메소드 실행용 - (DB처리용과 BL영역을 나누기 위해 이렇게 함..)
		dataDao.selectData();
	}
}
