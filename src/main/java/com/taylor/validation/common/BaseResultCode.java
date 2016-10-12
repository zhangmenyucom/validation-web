package com.taylor.validation.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangquan on 16/7/26.
 */
public class BaseResultCode {

    public final static Map<String, String> map = new HashMap<String, String>(30);

    // 10 - 11 表示数据错误
    public final static String TRUE = "0000";
    public final static String ERROR = "1111";
    public final static String ERROR_ID = "1112";
    public final static String ERROR_MOBILE = "1113";

    public final static String COMMON_FAIL = "0001";
    public final static String COMMON_MISSING_PARAMS = "0002";
    public final static String COMMON_WRONG_PARAMS = "0003";
    public final static String COMMON_DB_ERRORS = "0004";
    public final static String COMMON_TOO_MANY_RESULTS = "0005";
    public final static String COMMON_ERROR_FORMAT = "0006";
    public final static String COMMON_ERROR_FORWARD = "0007";
    public final static String COMMON_NO_DATA = "0008";
    public final static String COMMON_PERMISSION_DENIED = "0009";
    public final static String COMMON_CONTAIN_SENSITIVE = "9999";

    static {
        map.put(TRUE, "操作成功！");
        map.put(ERROR_ID, "数据有误或数据不存在，请检查数据重试操作！");
        map.put(ERROR, "操作失败，请重试操作或联系客服人员！");
        map.put(ERROR_MOBILE, "手机号验证失败！");
        map.put(COMMON_FAIL, "操作失败，请重试操作或联系客服人员！");
        map.put(COMMON_MISSING_PARAMS, "您输入的数据不完整！");
        map.put(COMMON_WRONG_PARAMS, "您输入的数据有误！");
        map.put(COMMON_DB_ERRORS, "操作失败，请重试或联系客服人员！");
        map.put(COMMON_TOO_MANY_RESULTS, "返回结果超过一行记录！");
        map.put(COMMON_ERROR_FORMAT, "用户不存在！");
        map.put(COMMON_ERROR_FORWARD, "错误页面跳转提示！");
        map.put(COMMON_NO_DATA, "数据不存在！");
        map.put(COMMON_PERMISSION_DENIED, "没有权限！");
        map.put(COMMON_CONTAIN_SENSITIVE, "未知道错误信息！");
    }

    public static String getValueWithKey(String key) {
        return map.get(key);
    }


}
