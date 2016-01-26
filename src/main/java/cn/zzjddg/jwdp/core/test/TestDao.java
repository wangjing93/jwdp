package cn.zzjddg.jwdp.core.test;

import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author zzjddg
 * @date 2016/1/26
 */
public interface TestDao {
    List<Test> findAll();
}
