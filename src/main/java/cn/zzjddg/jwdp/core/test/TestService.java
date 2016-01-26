package cn.zzjddg.jwdp.core.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zzjddg
 * @date 2016/1/26
 */
@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public List<Test> findAll() {
        return testDao.findAll();
    }
}
