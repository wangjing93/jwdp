package cn.zzjddg.jwdp.core.test;

import java.io.Serializable;

/**
 * @author zzjddg
 * @date 2016/1/26
 */
public class Test implements Serializable {

    private static final long serialVersionUID = -2935167516656466473L;

    private Long id;
    private String str;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
