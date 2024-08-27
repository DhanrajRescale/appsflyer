package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.l.f;
import com.webengage.sdk.android.utils.l.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
class u extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f12301c;

    /* renamed from: d, reason: collision with root package name */
    private String f12302d;

    /* renamed from: e, reason: collision with root package name */
    private Object f12303e;

    public u(Context context) {
        super(context);
        this.f12301c = null;
        this.f12302d = null;
        this.f12303e = null;
        this.f12301c = context.getApplicationContext();
    }

    private String a(ArrayList<com.webengage.sdk.android.n> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        try {
            return DataType.convert(arrayList, DataType.STRING, true).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!r.d()) {
            return new g.b().a();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/transit+json");
        return new f.b(this.f12302d, com.webengage.sdk.android.utils.l.e.POST, this.f12301c).a(obj).a((Map<String, String>) hashMap).a().a();
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
        if (obj != null) {
            com.webengage.sdk.android.utils.l.g gVar = (com.webengage.sdk.android.utils.l.g) obj;
            ArrayList arrayList = (ArrayList) this.f12303e;
            if (gVar.f() != null || gVar.i() < 200 || gVar.i() >= 500) {
                if (r.d()) {
                    r.c(false);
                    q.f12287a.e().a(false);
                    q.f12287a.e().e();
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.toString(((com.webengage.sdk.android.n) it.next()).g().intValue()));
                    }
                }
                i.b(this.f12301c).b(arrayList2);
                Logger.d("WebEngage", "Event Logging failed, scheduling next sync");
                if (gVar.f() != null) {
                    Logger.e("WebEngage", "Event sync failed due to Exception: ".concat(String.valueOf(gVar.f())), gVar.f());
                }
            } else {
                q.f12287a.e().a(true);
                q.f12287a.e().f();
                Logger.d("WebEngage", "Events successfully Logged to server, scheduling next sync");
                ArrayList arrayList3 = new ArrayList();
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Integer.toString(((com.webengage.sdk.android.n) it2.next()).g().intValue()));
                    }
                }
                i.b(this.f12301c).a(arrayList3);
            }
            if (gVar.n()) {
                gVar.b();
            } else {
                gVar.a();
            }
        }
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        this.f12303e = map.get("action_data");
        this.f12302d = (String) map.get("server_url");
        return a((ArrayList<com.webengage.sdk.android.n>) this.f12303e);
    }
}
