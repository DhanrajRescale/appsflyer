package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.utils.l.f;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class y extends a {

    /* renamed from: c, reason: collision with root package name */
    private Context f13014c;

    public y(Context context) {
        super(context);
        this.f13014c = context;
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        JSONObject optJSONObject;
        com.webengage.sdk.android.utils.l.g gVar = (com.webengage.sdk.android.utils.l.g) obj;
        try {
            if (!gVar.n()) {
                gVar.a();
                return null;
            }
            try {
                if (gVar.i() == 200) {
                    JSONObject jSONObject = new JSONObject(com.webengage.sdk.android.utils.g.a(gVar.h()));
                    if ("success".equals(jSONObject.optString("status", HttpUrl.FRAGMENT_ENCODE_SET)) && (optJSONObject = jSONObject.optJSONObject("data")) != null && optJSONObject != JSONObject.NULL) {
                        a(optJSONObject.optLong("next", 180L) * 60000);
                        JSONArray optJSONArray = optJSONObject.optJSONArray("pushPayloads");
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("message_data");
                                if (!jSONObject3.has("amplified")) {
                                    jSONObject3.put("amplified", true);
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("source", jSONObject2.getString("source"));
                                hashMap.put("message_action", jSONObject2.getString("message_action"));
                                hashMap.put("message_data", String.valueOf(jSONObject3));
                                h0.a(this.f13014c).a(j0.f12599c, WebEngageUtils.c(hashMap));
                            }
                        }
                    }
                } else {
                    gVar.b();
                }
            } catch (Exception e10) {
                Logger.e("WebEngage", "Exception while parsing push amplification data", e10);
                b(e10);
            }
            try {
                gVar.b();
                return null;
            } catch (Throwable th2) {
                Logger.e("WebEngage", "Error while closing push-amp input stream", th2);
                return null;
            }
        } catch (Throwable th3) {
            try {
                gVar.b();
            } catch (Throwable th4) {
                Logger.e("WebEngage", "Error while closing push-amp input stream", th4);
            }
            throw th3;
        }
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        return new f.b(WebEngageConstant.d.a(WebEngage.get().getWebEngageConfig().getWebEngageKey(), g(), d()), com.webengage.sdk.android.utils.l.e.GET, this.f13014c).a(3).a().a();
    }
}
