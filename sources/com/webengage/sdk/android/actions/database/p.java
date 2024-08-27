package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.WebEngage;
import java.util.Map;

/* loaded from: classes2.dex */
class p extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    Context f12286c;

    public p(Context context) {
        super(context);
        this.f12286c = null;
        this.f12286c = context.getApplicationContext();
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        com.webengage.sdk.android.n nVar;
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        Object obj2 = map.get("action_data");
        if (obj2 instanceof com.webengage.sdk.android.n) {
            nVar = (com.webengage.sdk.android.n) obj2;
            nVar.f(WebEngage.get().getWebEngageConfig().getWebEngageKey());
            nVar.d(f());
        } else {
            nVar = null;
        }
        ((s) map.get("strategy")).a(nVar);
        return null;
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        return map;
    }
}
