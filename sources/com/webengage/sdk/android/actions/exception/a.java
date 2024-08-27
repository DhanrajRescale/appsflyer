package com.webengage.sdk.android.actions.exception;

import android.content.Context;
import android.util.Log;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.utils.l.e;
import com.webengage.sdk.android.utils.l.f;
import com.webengage.sdk.android.utils.l.g;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f12314c;

    public a(Context context) {
        super(context);
        this.f12314c = null;
        this.f12314c = context.getApplicationContext();
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        try {
            Exception exc = (Exception) ((Map) obj).get("action_data");
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_id", Integer.toString(2));
            hashMap.put("luid", g());
            if (!d().isEmpty()) {
                hashMap.put("cuid", d());
            }
            hashMap.put("source", "webengage");
            hashMap.put("event", URLEncoder.encode(exc.getClass().getSimpleName(), "UTF-8"));
            hashMap.put("type", "exception");
            hashMap.put("category", WebEngage.get().getWebEngageConfig().getWebEngageKey());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", WebEngage.get().getWebEngageConfig().getWebEngageVersion());
            jSONObject.put("text", Log.getStackTraceString(exc));
            hashMap.put("data", URLEncoder.encode(jSONObject.toString(), "UTF-8"));
            g a10 = new f.b(WebEngageConstant.d.EXCEPTION_END_POINT.toString() + "/?" + WebEngageUtils.b(hashMap), e.GET, this.f12314c).a((Map<String, String>) new HashMap()).a().a();
            Logger.e("WebEngage", "Exception Logged: " + Log.getStackTraceString(exc));
            if (a10 == null) {
                return null;
            }
            if (a10.n()) {
                a10.b();
                return null;
            }
            a10.a();
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        return map;
    }
}
