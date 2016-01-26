package cn.zzjddg.jwdp.core.test;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zzjddg
 * @date 2016/1/26
 */
@Repository
public class TestDaoImpl extends SqlSessionDaoSupport implements TestDao {

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        //设置父类setSqlSessionFactory
        super.setSqlSessionFactory(sqlSessionFactory);;
    }

    public List<Test> findAll() {
        TestMapper mapper = this.getSqlSession().getMapper(TestMapper.class);
        return mapper.findAll();
    }
}
