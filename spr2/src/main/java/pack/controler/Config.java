package pack.controler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pack.model.DataDaoimpl;

@Configuration   // 어노테이션 함으로써 Configuration 클래스라는 걸 말해줌
public class Config {
	// 객체 환경설정파일(**.xml) 대신 클래스로 객체 환경설정을 할 수 있다.
	
	public DataDaoimpl  dataDaoimpl() {
		DataDaoimpl dataDaoimpl = new DataDaoimpl();
		return dataDaoimpl;
	}
	
	@Bean  // Bean을 생성
	public BusinessServiceImpl businessServiceImpl() {
		BusinessServiceImpl businessServiceImpl = new BusinessServiceImpl(dataDaoimpl());
		return businessServiceImpl;
	}
}
