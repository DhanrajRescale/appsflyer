package com.webengage.sdk.android.actions.rules;

import android.content.Context;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.actions.database.y;
import com.webengage.sdk.android.j0;
import com.webengage.sdk.android.t;
import com.webengage.sdk.android.utils.l.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
class a extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f12430c;

    /* renamed from: d, reason: collision with root package name */
    private j0 f12431d;

    /* renamed from: com.webengage.sdk.android.actions.rules.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C0003a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12432a;

        static {
            int[] iArr = new int[j0.values().length];
            f12432a = iArr;
            try {
                iArr[j0.f12597a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12432a[j0.f12600d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(Context context) {
        super(context);
        this.f12430c = null;
        this.f12431d = null;
        this.f12430c = context.getApplicationContext();
    }

    private void a(c cVar, Set<String> set) {
        Set<String> b10 = cVar.b();
        Set<String> d10 = com.webengage.sdk.android.utils.l.b.b(this.f12430c).d();
        d10.removeAll(b10);
        com.webengage.sdk.android.utils.l.b.b(this.f12430c).a(d10);
        Set<String> e10 = cVar.e();
        Map<String, Set<String>> d11 = y.b(this.f12430c).d();
        if (d11 != null) {
            for (Map.Entry<String, Set<String>> entry : d11.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                value.removeAll(e10);
                if (value.size() > 0) {
                    Iterator<String> it = value.iterator();
                    while (it.hasNext()) {
                        DataHolder.get().a(key, it.next(), null);
                    }
                }
            }
        }
        Map<String, Set<String>> e11 = y.b(this.f12430c).e();
        if (e11 != null) {
            for (Map.Entry<String, Set<String>> entry2 : e11.entrySet()) {
                String key2 = entry2.getKey();
                Set<String> value2 = entry2.getValue();
                HashSet hashSet = new HashSet();
                for (String str : value2) {
                    int indexOf = str.indexOf(91);
                    if (indexOf == -1) {
                        indexOf = str.indexOf(95);
                    }
                    if (indexOf != -1) {
                        hashSet.add(str.substring(0, indexOf));
                    }
                }
                hashSet.removeAll(set);
                if (hashSet.size() > 0) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        for (String str3 : value2) {
                            if (str3.startsWith(str2)) {
                                DataHolder.get().a(key2, str3, (Object) null, com.webengage.sdk.android.actions.database.f.SCOPES);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        com.webengage.sdk.android.utils.l.g gVar = (com.webengage.sdk.android.utils.l.g) obj;
        if (!gVar.n()) {
            gVar.a();
            return null;
        }
        int i10 = C0003a.f12432a[this.f12431d.ordinal()];
        if (i10 == 1) {
            try {
                c cVar = new c(com.webengage.sdk.android.utils.g.a(gVar.h(), false));
                cVar.a(h.b(), DataHolder.get());
                e(DataHolder.get().i());
                b(cVar.i());
            } catch (Exception e10) {
                b(e10);
            }
        } else if (i10 == 2) {
            try {
                try {
                    if (gVar.i() == 200) {
                        DataHolder.get().b("refreshSessionPageRule", Boolean.TRUE);
                        Map<String, Object> i11 = DataHolder.get().i();
                        c cVar2 = new c(com.webengage.sdk.android.utils.g.a(gVar.h(), false));
                        a(cVar2, cVar2.a(h.b(), DataHolder.get()));
                        com.webengage.sdk.android.utils.g.a(cVar2.h(), this.f12430c);
                        a(i11, DataHolder.get().i());
                        b(cVar2.i());
                    }
                } finally {
                    gVar.b();
                }
            } catch (Exception e11) {
                b(e11);
            }
        }
        return gVar;
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        e(map2);
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.keySet());
            if (map2 != null) {
                arrayList.removeAll(map2.keySet());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            t.a(this.f12430c).a(arrayList);
        }
    }

    private void e(Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Map map2 = (Map) entry.getValue();
                if (map2 != null) {
                    t.a(this.f12430c).a(((Double) map2.get("lat")).doubleValue(), ((Double) map2.get("long")).doubleValue(), Float.parseFloat(map2.get("radius").toString()), entry.getKey(), WebEngage.get().getWebEngageConfig());
                }
            }
        }
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        String str = (String) map.get("config_url");
        j0 j0Var = (j0) map.get("topic");
        this.f12431d = j0Var;
        return new f.b(str, com.webengage.sdk.android.utils.l.e.GET, this.f12430c).a(C0003a.f12432a[j0Var.ordinal()] != 1 ? 2 : 4).a().a();
    }
}
