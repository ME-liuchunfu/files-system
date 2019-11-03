package xin.spring.files.system.utils;

import java.util.HashMap;

/**
 * @author spring
 * email: 4298293220@qq.com
 * site: https://springbless.xin
 * @description
 * @date 2019/11/1
 */
public class MapUtil extends HashMap {

    protected static final String DATA_KEY = "data";

    public MapUtil putVal(String key, Object value){
        put(key, value);
        return this;
    }

    public MapUtil putVal(Object value){
        put(DATA_KEY, value);
        return this;
    }

}
