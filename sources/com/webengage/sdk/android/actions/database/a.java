package com.webengage.sdk.android.actions.database;

import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
class a extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f12239c;

    public a(Context context) {
        super(context);
        this.f12239c = null;
        this.f12239c = context.getApplicationContext();
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        String d10 = d();
        y b10 = y.b(this.f12239c);
        if (d10.isEmpty()) {
            d10 = g();
        }
        Map<String, Object> a10 = b10.a(d10);
        if (a10 == null || a10.size() <= 0) {
            return null;
        }
        DataHolder.get().c(a10);
        return null;
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        return null;
    }
}
