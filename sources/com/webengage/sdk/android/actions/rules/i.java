package com.webengage.sdk.android.actions.rules;

import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i extends RuleExecutor {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f12463a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, com.webengage.sdk.android.actions.rules.e> f12465c;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f12464b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<com.webengage.sdk.android.actions.rules.d>> f12466d = new HashMap();

    /* loaded from: classes2.dex */
    public class a extends com.webengage.sdk.android.actions.rules.k.e {
        public a(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list.size() == 0 || list.size() == 0) {
                return null;
            }
            return WebEngageUtils.a(list.get(0).toString());
        }
    }

    /* loaded from: classes2.dex */
    public class b extends com.webengage.sdk.android.actions.rules.k.e {
        public b(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(list.get(0) != null);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends com.webengage.sdk.android.actions.rules.k.e {
        public c(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list.size() <= 1) {
                return null;
            }
            return list.get(0) == null ? list.get(1) : list.get(0);
        }
    }

    /* loaded from: classes2.dex */
    public class d extends com.webengage.sdk.android.actions.rules.k.e {
        public d(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(com.webengage.sdk.android.actions.database.f.EVENT_CRITERIA.toString());
            arrayList.add(list.get(0));
            arrayList.add("val");
            return com.webengage.sdk.android.actions.rules.h.b().getFunction("$we_getData").a(arrayList);
        }
    }

    /* loaded from: classes2.dex */
    public class e extends com.webengage.sdk.android.actions.rules.k.e {
        public e(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            Number number = (Number) list.get(0);
            Map map = (Map) list.get(1);
            if (map == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("val", number);
                return hashMap;
            }
            Number number2 = (Number) map.get("val");
            if (number2 == null) {
                map.put("val", number);
                return map;
            }
            map.put("val", Double.valueOf(number.doubleValue() + number2.doubleValue()));
            return map;
        }
    }

    /* loaded from: classes2.dex */
    public class f extends com.webengage.sdk.android.actions.rules.k.e {
        public f(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            Number number = (Number) list.get(0);
            Map map = (Map) list.get(1);
            if (map == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("val", number);
                hashMap.put("count", 1L);
                return hashMap;
            }
            Number number2 = (Number) map.get("val");
            Number number3 = (Number) map.get("count");
            if (number2 == null || number3 == null) {
                map.put("val", number);
                map.put("count", 1L);
                return map;
            }
            map.put("val", Double.valueOf((number.doubleValue() + (number2.doubleValue() * number3.longValue())) / (number3.longValue() + 1)));
            map.put("count", Long.valueOf(number3.longValue() + 1));
            return map;
        }
    }

    /* loaded from: classes2.dex */
    public class g extends com.webengage.sdk.android.actions.rules.k.e {
        public g(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            Map map = (Map) list.get(1);
            if (map == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("val", 1L);
                return hashMap;
            }
            Number number = (Number) map.get("val");
            if (number == null) {
                map.put("val", 1L);
                return map;
            }
            map.put("val", Long.valueOf(number.longValue() + 1));
            return map;
        }
    }

    /* loaded from: classes2.dex */
    public class h extends com.webengage.sdk.android.actions.rules.k.e {
        public h(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            Object obj = list.get(0);
            Map map = (Map) list.get(1);
            if (map == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("val", obj);
                return hashMap;
            }
            if (obj instanceof Date) {
                Object obj2 = map.get("val");
                if (!(obj2 instanceof Date)) {
                    try {
                        obj2 = DataType.convert(obj2, DataType.DATE, true);
                    } catch (Exception unused) {
                        map.put("val", obj);
                        return map;
                    }
                }
                if (((Date) obj).getTime() < ((Date) obj2).getTime()) {
                    map.put("val", obj);
                }
                return map;
            }
            if (!(obj instanceof Number)) {
                return null;
            }
            Number number = (Number) map.get("val");
            if (number == null) {
                map.put("val", obj);
                return map;
            }
            if (((Number) obj).doubleValue() < number.doubleValue()) {
                map.put("val", obj);
            }
            return map;
        }
    }

    /* renamed from: com.webengage.sdk.android.actions.rules.i$i, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0004i extends com.webengage.sdk.android.actions.rules.k.e {
        public C0004i(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            Object obj = list.get(0);
            Map map = (Map) list.get(1);
            if (map == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("val", obj);
                return hashMap;
            }
            if (obj instanceof Date) {
                Object obj2 = map.get("val");
                if (!(obj2 instanceof Date)) {
                    try {
                        obj2 = DataType.convert(obj2, DataType.DATE, true);
                    } catch (Exception unused) {
                        map.put("val", obj);
                        return map;
                    }
                }
                if (((Date) obj).getTime() > ((Date) obj2).getTime()) {
                    map.put("val", obj);
                }
                return map;
            }
            if (!(obj instanceof Number)) {
                return null;
            }
            Number number = (Number) map.get("val");
            if (number == null) {
                map.put("val", obj);
                return map;
            }
            if (((Number) obj).doubleValue() > number.doubleValue()) {
                map.put("val", obj);
            }
            return map;
        }
    }

    /* loaded from: classes2.dex */
    public class j extends com.webengage.sdk.android.actions.rules.k.e {
        public j(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list != null && list.size() != 0) {
                try {
                    return Long.valueOf(((Date) DataType.convert(list.get(0), DataType.DATE, false)).getTime());
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class k extends com.webengage.sdk.android.actions.rules.k.g {
        public k(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            boolean z10 = obj2 instanceof List;
            if (z10 && (obj instanceof List)) {
                ((List) obj).addAll((List) obj2);
                return obj;
            }
            if (z10) {
                ((List) obj2).add(0, obj);
                return obj2;
            }
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public class l extends com.webengage.sdk.android.actions.rules.k.e {
        public l(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list.size() == 0 || list.size() < 2) {
                return null;
            }
            return Long.valueOf(TimeUnit.MILLISECONDS.convert(((Integer) list.get(0)).intValue(), TimeUnit.valueOf(((String) list.get(1)).toUpperCase())));
        }
    }

    /* loaded from: classes2.dex */
    public class m extends com.webengage.sdk.android.actions.rules.k.e {
        public m(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            return Long.valueOf(new Date().getTime());
        }
    }

    /* loaded from: classes2.dex */
    public class n extends com.webengage.sdk.android.actions.rules.k.e {
        public n(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            return list.size() < 2 ? Boolean.FALSE : com.webengage.sdk.android.actions.rules.h.b().getOperator("==").a(list.get(0), list.get(1));
        }
    }

    /* loaded from: classes2.dex */
    public class o extends com.webengage.sdk.android.actions.rules.k.e {
        public o(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            Date a10;
            if (list == null || list.size() < 2 || list.get(0) == null || list.get(1) == null || (a10 = new com.webengage.sdk.android.utils.j(((Long) list.get(0)).longValue(), (String) list.get(1)).a()) == null) {
                return null;
            }
            return Long.valueOf(a10.getTime());
        }
    }

    /* loaded from: classes2.dex */
    public class p extends com.webengage.sdk.android.actions.rules.k.e {
        public p(String str) {
            super(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:126:0x0298  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x02bc  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x02c5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x02c6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01b1  */
        @Override // com.webengage.sdk.android.actions.rules.k.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(java.util.List<java.lang.Object> r11) {
            /*
                Method dump skipped, instructions count: 712
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.rules.i.p.a(java.util.List):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class q {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12483a;

        static {
            int[] iArr = new int[WebEngageConstant.c.values().length];
            f12483a = iArr;
            try {
                iArr[WebEngageConstant.c.SESSION_RULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12483a[WebEngageConstant.c.PAGE_RULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12483a[WebEngageConstant.c.EVENT_RULE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12483a[WebEngageConstant.c.CUSTOM_RULE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class r extends com.webengage.sdk.android.actions.rules.k.g {
        public r(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof List)) {
                List list = (List) obj2;
                if (list.size() < 2) {
                    return Boolean.FALSE;
                }
                double doubleValue = ((Number) obj).doubleValue();
                boolean z10 = false;
                if (list.get(0) == null || list.get(1) == null) {
                    return Boolean.FALSE;
                }
                double doubleValue2 = ((Number) list.get(0)).doubleValue();
                double doubleValue3 = ((Number) list.get(1)).doubleValue();
                if (doubleValue >= doubleValue2 && doubleValue <= doubleValue3) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes2.dex */
    public class s extends com.webengage.sdk.android.actions.rules.k.g {
        public s(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return Boolean.FALSE;
            }
            if (!(obj2 instanceof List)) {
                return com.webengage.sdk.android.actions.rules.h.b().getOperator("==").a(obj, obj2);
            }
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                if (((Boolean) com.webengage.sdk.android.actions.rules.h.b().getOperator("$we_in").a(obj, it.next())).booleanValue()) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes2.dex */
    public class t extends com.webengage.sdk.android.actions.rules.k.g {
        public t(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            return Boolean.valueOf(!((Boolean) com.webengage.sdk.android.actions.rules.h.b().getOperator("$we_in").a(obj, obj2)).booleanValue());
        }
    }

    /* loaded from: classes2.dex */
    public class u extends com.webengage.sdk.android.actions.rules.k.g {
        public u(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            if (!(obj instanceof List)) {
                return obj2 instanceof List ? Boolean.FALSE : com.webengage.sdk.android.actions.rules.h.b().getOperator("==").a(obj, obj2);
            }
            if (!(obj2 instanceof List)) {
                return com.webengage.sdk.android.actions.rules.h.b().getOperator("$we_in").a(obj2, obj);
            }
            Iterator it = ((List) obj2).iterator();
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                if (!it.hasNext()) {
                    z10 = z11;
                    break;
                }
                if (!((Boolean) com.webengage.sdk.android.actions.rules.h.b().getOperator("$we_contains_all").a(obj, it.next())).booleanValue()) {
                    break;
                }
                z11 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* loaded from: classes2.dex */
    public class v extends com.webengage.sdk.android.actions.rules.k.g {
        public v(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            boolean z10 = true;
            if (obj instanceof List) {
                if (!(obj2 instanceof List)) {
                    return com.webengage.sdk.android.actions.rules.h.b().getOperator("$we_in").a(obj2, obj);
                }
                Iterator it = ((List) obj2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (((Boolean) com.webengage.sdk.android.actions.rules.h.b().getOperator("$we_contains_any").a(obj, it.next())).booleanValue()) {
                        break;
                    }
                }
                return Boolean.valueOf(z10);
            }
            if (!(obj2 instanceof List)) {
                return com.webengage.sdk.android.actions.rules.h.b().getOperator("==").a(obj, obj2);
            }
            Iterator it2 = ((List) obj2).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = false;
                    break;
                }
                if (((Boolean) com.webengage.sdk.android.actions.rules.h.b().getOperator("$we_contains_any").a(obj, it2.next())).booleanValue()) {
                    break;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* loaded from: classes2.dex */
    public class w extends com.webengage.sdk.android.actions.rules.k.g {
        public w(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            return Boolean.valueOf(!((Boolean) com.webengage.sdk.android.actions.rules.h.b().getOperator("$we_contains_any").a(obj, obj2)).booleanValue());
        }
    }

    /* loaded from: classes2.dex */
    public class x extends com.webengage.sdk.android.actions.rules.k.e {
        public x(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            if (list.size() <= 1) {
                return Boolean.FALSE;
            }
            if (list.get(0) != null) {
                String obj = list.get(0).toString();
                if (list.get(1) instanceof List) {
                    for (Object obj2 : (List) list.get(1)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(obj);
                        arrayList.add(obj2);
                        if (((Boolean) com.webengage.sdk.android.actions.rules.h.b().getFunction("$we_matches").a(arrayList)).booleanValue()) {
                            return Boolean.TRUE;
                        }
                    }
                } else if (list.get(1) != null) {
                    return Boolean.valueOf(Pattern.compile(list.get(1).toString()).matcher(obj).find());
                }
            }
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes2.dex */
    public class y extends com.webengage.sdk.android.actions.rules.k.e {
        public y(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            Object a10 = DataHolder.get().a((List<? extends Object>) list);
            return (a10 == null || !(a10 instanceof Date)) ? a10 : Long.valueOf(((Date) a10).getTime());
        }
    }

    public i() {
        this.f12465c = null;
        this.f12465c = new LinkedHashMap();
        a();
    }

    private void a() {
        com.webengage.sdk.android.actions.rules.k.c.a().a(new k("->", -2147483647));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new r("$we_between", 100));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new s("$we_in", 100));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new t("$we_nin", 100));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new u("$we_contains_all", 100));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new v("$we_contains_any", 100));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new w("$we_exclude_all", 100));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new x("$we_matches"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new y("$we_getData"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new a("$we_escapeRegex"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new b("$we_exists"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new c("$we_default"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new d("$we_event_criteria"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new e("SUM"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new f("AVG"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new g("COUNT"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new h("MIN"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new C0004i("MAX"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new j("$we_date"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new l("$we_ms"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new m("$we_now"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new n("$we_boolean"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new o("$we_ref_date"));
        com.webengage.sdk.android.actions.rules.k.c.a().a(new p("$we_getResolvedData"));
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public Object evaluateInfixRule(String str) {
        try {
            return new com.webengage.sdk.android.actions.rules.k.d(str).a();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public Object evaluatePostfixRule(List<String> list) {
        try {
            return new com.webengage.sdk.android.actions.rules.k.d(list).a();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public boolean evaluateRule(com.webengage.sdk.android.actions.rules.e eVar, WebEngageConstant.c cVar) {
        Boolean bool = Boolean.FALSE;
        try {
            if (q.f12483a[cVar.ordinal()] == 4) {
                bool = (Boolean) eVar.a().a();
            }
        } catch (Exception e10) {
            Logger.e("WebEngage", "Exception while evaluating rule for custom rule category", e10);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public List<String> evaluateRulesByCategory(WebEngageConstant.c cVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (f12463a) {
            try {
                for (String str : this.f12464b) {
                    if (evaluateRule(str, cVar)) {
                        arrayList.add(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public List<String> filterRenderingIds(List<String> list, WebEngageConstant.c cVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            synchronized (f12463a) {
                try {
                    for (String str : list) {
                        if (this.f12465c.get(str).c().compareTo(cVar) <= 0) {
                            arrayList.add(str);
                        }
                    }
                } finally {
                }
            }
        }
        return arrayList;
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public List<com.webengage.sdk.android.actions.rules.d> getEventCriteriasForEvent(String str) {
        List<com.webengage.sdk.android.actions.rules.d> list;
        synchronized (f12463a) {
            list = this.f12466d.get(str);
        }
        return list;
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public com.webengage.sdk.android.actions.rules.k.e getFunction(String str) {
        return com.webengage.sdk.android.actions.rules.k.c.a().a(str);
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public com.webengage.sdk.android.actions.rules.k.g getOperator(String str) {
        return com.webengage.sdk.android.actions.rules.k.c.a().b(str);
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public void reset() {
        synchronized (f12463a) {
            try {
                this.f12464b.clear();
                if (this.f12465c != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.f12465c.keySet());
                    this.f12464b.addAll(arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public void setCompetingIds(List<String> list) {
        synchronized (f12463a) {
            try {
                this.f12464b.clear();
                if (list != null) {
                    this.f12464b.addAll(list);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public void setEventCriteriaMap(Map<String, List<com.webengage.sdk.android.actions.rules.d>> map) {
        synchronized (f12463a) {
            try {
                this.f12466d.clear();
                if (map != null) {
                    this.f12466d.putAll(map);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    public void setRuleMap(Map<String, com.webengage.sdk.android.actions.rules.e> map) {
        synchronized (f12463a) {
            try {
                this.f12465c.clear();
                this.f12464b.clear();
                if (map != null) {
                    this.f12465c.putAll(map);
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(map.keySet());
                    this.f12464b.addAll(arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[RETURN] */
    @Override // com.webengage.sdk.android.actions.rules.RuleExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean evaluateRule(java.lang.String r3, com.webengage.sdk.android.utils.WebEngageConstant.c r4) {
        /*
            r2 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            int[] r1 = com.webengage.sdk.android.actions.rules.i.q.f12483a     // Catch: java.lang.Exception -> L25
            int r4 = r4.ordinal()     // Catch: java.lang.Exception -> L25
            r4 = r1[r4]     // Catch: java.lang.Exception -> L25
            r1 = 1
            if (r4 == r1) goto L34
            r1 = 2
            if (r4 == r1) goto L27
            r1 = 3
            if (r4 == r1) goto L14
            goto L4c
        L14:
            java.util.Map<java.lang.String, com.webengage.sdk.android.actions.rules.e> r4 = r2.f12465c     // Catch: java.lang.Exception -> L25
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Exception -> L25
            com.webengage.sdk.android.actions.rules.e r3 = (com.webengage.sdk.android.actions.rules.e) r3     // Catch: java.lang.Exception -> L25
            com.webengage.sdk.android.actions.rules.k.d r3 = r3.b()     // Catch: java.lang.Exception -> L25
        L20:
            java.lang.Object r3 = r3.a()     // Catch: java.lang.Exception -> L25
            goto L41
        L25:
            r3 = move-exception
            goto L45
        L27:
            java.util.Map<java.lang.String, com.webengage.sdk.android.actions.rules.e> r4 = r2.f12465c     // Catch: java.lang.Exception -> L25
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Exception -> L25
            com.webengage.sdk.android.actions.rules.e r3 = (com.webengage.sdk.android.actions.rules.e) r3     // Catch: java.lang.Exception -> L25
            com.webengage.sdk.android.actions.rules.k.d r3 = r3.d()     // Catch: java.lang.Exception -> L25
            goto L20
        L34:
            java.util.Map<java.lang.String, com.webengage.sdk.android.actions.rules.e> r4 = r2.f12465c     // Catch: java.lang.Exception -> L25
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Exception -> L25
            com.webengage.sdk.android.actions.rules.e r3 = (com.webengage.sdk.android.actions.rules.e) r3     // Catch: java.lang.Exception -> L25
            com.webengage.sdk.android.actions.rules.k.d r3 = r3.e()     // Catch: java.lang.Exception -> L25
            goto L20
        L41:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L25
            r0 = r3
            goto L4c
        L45:
            java.lang.String r4 = "WebEngage"
            java.lang.String r1 = "Exception while evaluating rule for experiment by category"
            com.webengage.sdk.android.Logger.e(r4, r1, r3)
        L4c:
            if (r0 == 0) goto L53
            boolean r3 = r0.booleanValue()
            return r3
        L53:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.rules.i.evaluateRule(java.lang.String, com.webengage.sdk.android.utils.WebEngageConstant$c):boolean");
    }
}
