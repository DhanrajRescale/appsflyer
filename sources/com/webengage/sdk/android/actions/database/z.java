package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.q0;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.l.f;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
class z extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    Context f12310c;

    /* renamed from: d, reason: collision with root package name */
    String f12311d;

    /* renamed from: e, reason: collision with root package name */
    com.webengage.sdk.android.actions.rules.c f12312e;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12313a;

        static {
            int[] iArr = new int[f.values().length];
            f12313a = iArr;
            try {
                iArr[f.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12313a[f.EVENT_CRITERIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12313a[f.ATTR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12313a[f.ANDROID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12313a[f.IOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12313a[f.WEB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public z(Context context) {
        super(context);
        this.f12311d = null;
        this.f12312e = null;
        this.f12310c = context;
    }

    private void a(f fVar, Map<String, Object> map) {
        int i10 = a.f12313a[fVar.ordinal()];
        if (i10 == 1) {
            for (String str : map.keySet()) {
                q0 a10 = q0.a(str);
                if (!"event_criterias".equals(str) && !"devices".equals(str) && !"user_attributes".equals(str) && !"journey".equals(str)) {
                    try {
                        DataHolder.get().a(this.f12311d, str, map.get(str), fVar, a10 == null ? o.FORCE_UPDATE : a10.a());
                    } catch (Exception unused) {
                    }
                }
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                try {
                    DataHolder.get().e(this.f12311d, (Map<String, Object>) map.get("user_attributes"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
            } else {
                if (i10 == 5 || i10 == 6) {
                    a(map, fVar);
                    return;
                }
                return;
            }
        }
        Set<String> e10 = this.f12312e.e();
        List list = (List) map.get("event_criterias");
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                Map<String, Object> map2 = (Map) list.get(i11);
                if (map2 != null) {
                    try {
                        String str2 = (String) map2.get("criteria_id");
                        if (e10 != null && e10.contains(str2)) {
                            DataHolder.get().a(this.f12311d, str2, map2);
                        }
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        Map<String, Object> map;
        Map<String, Object> map2;
        if (((Boolean) obj).booleanValue()) {
            com.webengage.sdk.android.utils.l.g a10 = new f.b(WebEngageConstant.d.b(g(), d(), WebEngage.get().getWebEngageConfig().getWebEngageKey()), com.webengage.sdk.android.utils.l.e.GET, this.f12310c).a(3).a().a();
            if (a10 != null && a10.n()) {
                this.f12311d = d().isEmpty() ? g() : d();
                try {
                    map = com.webengage.sdk.android.utils.g.a(a10.h(), true);
                } catch (Exception e10) {
                    b(e10);
                    map = null;
                }
                if (map != null && (map2 = (Map) map.get("upf")) != null) {
                    int i10 = 0;
                    if (d().isEmpty()) {
                        f[] values = f.values();
                        int length = values.length;
                        while (i10 < length) {
                            f fVar = values[i10];
                            if (fVar.c()) {
                                a(fVar, map2);
                            }
                            i10++;
                        }
                        a(q0.f12658q, map2);
                        a(q0.f12659r, map2);
                        a(q0.f12660s, map2);
                        a(q0.f12662u, map2);
                        a(q0.f12661t, map2);
                    } else if (d().equals(map2.get("cuid"))) {
                        f[] values2 = f.values();
                        int length2 = values2.length;
                        while (i10 < length2) {
                            f fVar2 = values2[i10];
                            if (fVar2.d()) {
                                a(fVar2, map2);
                            }
                            i10++;
                        }
                    }
                }
            } else if (a10 != null) {
                a10.a();
            }
        }
        return null;
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
    }

    private void a(q0 q0Var, Map<String, Object> map) {
        String q0Var2;
        Object obj;
        if (map == null || q0Var == null || (obj = map.get((q0Var2 = q0Var.toString()))) == null) {
            return;
        }
        DataHolder.get().a(this.f12311d, q0Var2, obj, f.USER, o.FORCE_UPDATE);
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        try {
            com.webengage.sdk.android.actions.rules.c cVar = new com.webengage.sdk.android.actions.rules.c(this.f12310c);
            this.f12312e = cVar;
            List<Object> f10 = cVar.f();
            return (f10 == null || f10.size() <= 0) ? Boolean.valueOf(!d().isEmpty()) : Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    private void a(Map<String, Object> map, f fVar) {
        List list;
        Map map2;
        Map map3 = (Map) map.get("devices");
        if (map3 == null || (list = (List) map3.get(fVar.b())) == null || list.size() <= 0 || (map2 = (Map) list.get(0)) == null) {
            return;
        }
        for (String str : map2.keySet()) {
            try {
                DataHolder.get().a(this.f12311d, str, map2.get(str), fVar);
            } catch (Exception unused) {
            }
        }
    }
}
