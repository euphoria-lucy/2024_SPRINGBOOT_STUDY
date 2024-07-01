package kr.hs.study.firstDB.service;

import kr.hs.study.firstDB.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper // mapper 인터페이스가 query를 호출한다는 걸 알려주는 어노테이션
public interface TestService {
    public void insert(TestDTO dto);
    public void update(TestDTO dto);
    public void delete(int id);
    public List<TestDTO> listAll( );
    public TestDTO listOne(int id); // 내용 보기
}
