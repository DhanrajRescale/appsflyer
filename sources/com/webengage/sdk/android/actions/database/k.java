package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.l.f;
import java.util.Map;

/* loaded from: classes2.dex */
public class k extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    Context f12275c;

    /* renamed from: d, reason: collision with root package name */
    String f12276d;

    /* renamed from: e, reason: collision with root package name */
    com.webengage.sdk.android.actions.rules.c f12277e;

    public k(Context context) {
        super(context);
        this.f12276d = null;
        this.f12277e = null;
        this.f12275c = context;
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        String str;
        Map<String, Object> map;
        if (((Boolean) obj).booleanValue()) {
            try {
                str = (String) DataType.convert(DataHolder.get().C(), DataType.STRING, false);
            } catch (Exception e10) {
                b(e10);
                str = null;
            }
            String a10 = WebEngageConstant.d.a(g(), d(), WebEngage.get().getWebEngageConfig().getWebEngageKey(), str);
            System.currentTimeMillis();
            com.webengage.sdk.android.utils.l.g a11 = new f.b(a10, com.webengage.sdk.android.utils.l.e.GET, this.f12275c).a(3).a().a();
            if (a11 != null && a11.n()) {
                this.f12276d = d().isEmpty() ? g() : d();
                try {
                    map = com.webengage.sdk.android.utils.g.a(a11.h(), true);
                } catch (Exception e11) {
                    b(e11);
                    map = null;
                }
                if (map != null) {
                    DataHolder.get().b(f.JOURNEY.toString(), map.get("journey"));
                }
            } else if (a11 != null) {
                a11.a();
            }
        }
        return null;
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        return Boolean.valueOf(DataHolder.get().C() != null && DataHolder.get().E());
    }
}
