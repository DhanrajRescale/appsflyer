package com.webengage.sdk.android.actions.database;

import com.webengage.sdk.android.m0;
import com.webengage.sdk.android.q0;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class DataHolder {

    /* renamed from: a, reason: collision with root package name */
    private static DataHolder f12234a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f12235b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private List<n> f12236c = new ArrayList();
    public Map<String, Object> container;

    /* renamed from: d, reason: collision with root package name */
    private List<Object> f12237d;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12238a;

        static {
            int[] iArr = new int[WebEngageConstant.a.values().length];
            f12238a = iArr;
            try {
                iArr[WebEngageConstant.a.NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12238a[WebEngageConstant.a.PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12238a[WebEngageConstant.a.INLINE_PERSONALIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12238a[WebEngageConstant.a.SURVEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private DataHolder() {
        this.container = null;
        this.f12237d = null;
        this.container = new HashMap();
        this.f12237d = new ArrayList();
    }

    public static DataHolder get() {
        if (f12234a == null) {
            synchronized (f12235b) {
                try {
                    if (f12234a == null) {
                        f12234a = new DataHolder();
                    }
                } finally {
                }
            }
        }
        return f12234a;
    }

    public Map<String, List<Object>> A() {
        Map<String, List<Object>> map;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(PaymentConstants.Category.CONFIG);
            this.f12237d.add("tokens");
            map = (Map) a(this.f12237d);
        }
        return map;
    }

    public Long B() {
        Long l10;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("total_page_view_count");
            l10 = (Long) a(this.f12237d);
        }
        return l10;
    }

    public Map<String, Object> C() {
        Map<String, Object> map;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(PaymentConstants.Category.CONFIG);
            this.f12237d.add("upfc");
            map = (Map) a(this.f12237d);
        }
        return map;
    }

    public Date D() {
        Date date;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("last_logged_in");
            date = (Date) a(this.f12237d);
        }
        return date;
    }

    public boolean E() {
        boolean z10;
        synchronized (f12235b) {
            try {
                z10 = this.container.get("app_foreground") != null && ((Boolean) this.container.get("app_foreground")).booleanValue();
            } finally {
            }
        }
        return z10;
    }

    public boolean F() {
        boolean z10;
        synchronized (f12235b) {
            try {
                z10 = this.container.get("boot_up") != null && ((Boolean) this.container.get("boot_up")).booleanValue();
            } finally {
            }
        }
        return z10;
    }

    public boolean G() {
        boolean z10;
        synchronized (f12235b) {
            try {
                z10 = this.container.get("refreshSessionPageRule") != null && ((Boolean) this.container.get("refreshSessionPageRule")).booleanValue();
            } finally {
            }
        }
        return z10;
    }

    public boolean H() {
        boolean z10;
        synchronized (f12235b) {
            try {
                z10 = this.container.get("useLegacyRuleCompiler") != null && ((Boolean) this.container.get("useLegacyRuleCompiler")).booleanValue();
            } finally {
            }
        }
        return z10;
    }

    public Long a(Map<String, Object> map, WebEngageConstant.a aVar) {
        this.f12237d.clear();
        this.f12237d.add(f.SCOPES.toString());
        this.f12237d.add(e(map, aVar) + "_click");
        Long l10 = (Long) a(this.f12237d);
        return Long.valueOf(l10 == null ? 0L : l10.longValue());
    }

    public Long b() {
        Long l10;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("b_session_count");
            l10 = (Long) a(this.f12237d);
        }
        return l10;
    }

    public Long c(String str) {
        Long valueOf;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.SCOPES.toString());
            this.f12237d.add(str + "_view");
            Long l10 = (Long) a(this.f12237d);
            valueOf = Long.valueOf(l10 == null ? 0L : l10.longValue());
        }
        return valueOf;
    }

    public Long d(String str) {
        Long valueOf;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.SCOPES.toString());
            this.f12237d.add(str + "_view_session");
            Long l10 = (Long) a(this.f12237d);
            valueOf = Long.valueOf(l10 == null ? 0L : l10.longValue());
        }
        return valueOf;
    }

    public String e() {
        String str;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("country");
            str = (String) a(this.f12237d);
        }
        return str;
    }

    public Object f(String str) {
        Object a10;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.USER.toString());
            this.f12237d.add(str);
            a10 = a(this.f12237d);
        }
        return a10;
    }

    public long g() {
        long longValue;
        synchronized (f12235b) {
            try {
                longValue = this.container.containsKey("f_activity_start_ep") ? ((Long) this.container.get("f_activity_start_ep")).longValue() : -1L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return longValue;
    }

    public Long h() {
        Long l10;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("session_count");
            l10 = (Long) a(this.f12237d);
        }
        return l10;
    }

    public Map<String, Object> i() {
        Map<String, Object> map;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(PaymentConstants.Category.CONFIG);
            this.f12237d.add("geoFences");
            map = (Map) a(this.f12237d);
        }
        return map;
    }

    public int j() {
        int parseInt;
        synchronized (f12235b) {
            parseInt = this.container.get("p_campaign_limit") == null ? 4 : Integer.parseInt(String.valueOf((Long) this.container.get("p_campaign_limit")));
        }
        return parseInt;
    }

    public Map<String, Object> k() {
        Map<String, Object> map;
        synchronized (f12235b) {
            map = this.container.get("inline_campaigns") == null ? null : (Map) this.container.get("inline_campaigns");
        }
        return map;
    }

    public List<HashMap<String, Object>> l() {
        List<HashMap<String, Object>> list;
        synchronized (f12235b) {
            list = this.container.get("inline_properties") == null ? null : (List) this.container.get("inline_properties");
        }
        return list;
    }

    public String m() {
        String str;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("session_type");
            str = (String) a(this.f12237d);
        }
        return str;
    }

    public Double n() {
        Double d10;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("latitude");
            d10 = (Double) a(this.f12237d);
        }
        return d10;
    }

    public String o() {
        String str;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("locality");
            str = (String) a(this.f12237d);
        }
        return str;
    }

    public Double p() {
        Double d10;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("longitude");
            d10 = (Double) a(this.f12237d);
        }
        return d10;
    }

    public List<Object> q() {
        List<Object> list;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(PaymentConstants.Category.CONFIG);
            this.f12237d.add("events");
            this.f12237d.add("we_wk_page_delay");
            list = (List) a(this.f12237d);
        }
        return list;
    }

    public String r() {
        String str;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("postal_code");
            str = (String) a(this.f12237d);
        }
        return str;
    }

    public String s() {
        String str;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("region");
            str = (String) a(this.f12237d);
        }
        return str;
    }

    public String t() {
        String str;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.PAGE.toString());
            this.f12237d.add(LogSubCategory.Action.SYSTEM);
            this.f12237d.add("screen_name");
            str = (String) a(this.f12237d);
        }
        return str;
    }

    public String u() {
        String str;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.PAGE.toString());
            this.f12237d.add(LogSubCategory.Action.SYSTEM);
            this.f12237d.add("screen_path");
            str = (String) a(this.f12237d);
        }
        return str;
    }

    public String v() {
        String str;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.PAGE.toString());
            this.f12237d.add(LogSubCategory.Action.SYSTEM);
            this.f12237d.add("screen_title");
            str = (String) a(this.f12237d);
        }
        return str;
    }

    public List<Object> w() {
        List<Object> list;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(PaymentConstants.Category.CONFIG);
            this.f12237d.add("events");
            this.f12237d.add("we_wk_session_delay");
            list = (List) a(this.f12237d);
        }
        return list;
    }

    public Long x() {
        Long l10;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("page_view_count_session");
            l10 = (Long) a(this.f12237d);
        }
        return l10;
    }

    public Map<String, Object> y() {
        Map<String, Object> map;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.PAGE.toString());
            this.f12237d.add(LogSubCategory.Action.SYSTEM);
            map = (Map) a(this.f12237d);
        }
        return map;
    }

    public Long z() {
        Long l10;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(PaymentConstants.Category.CONFIG);
            this.f12237d.add("tzo");
            l10 = (Long) a(this.f12237d);
        }
        return l10;
    }

    public Object a(String str) {
        Object obj;
        synchronized (f12235b) {
            obj = this.container.get(str);
        }
        try {
            return DataType.cloneInternal(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    public Long b(Map<String, Object> map, WebEngageConstant.a aVar) {
        Long valueOf;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.SCOPES.toString());
            this.f12237d.add(e(map, aVar) + "_close_session");
            Long l10 = (Long) a(this.f12237d);
            valueOf = Long.valueOf(l10 == null ? 0L : l10.longValue());
        }
        return valueOf;
    }

    public Long c(Map<String, Object> map, WebEngageConstant.a aVar) {
        Long valueOf;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.SCOPES.toString());
            this.f12237d.add(e(map, aVar) + "_hide_session");
            Long l10 = (Long) a(this.f12237d);
            valueOf = Long.valueOf(l10 == null ? 0L : l10.longValue());
        }
        return valueOf;
    }

    public Long d(Map<String, Object> map, WebEngageConstant.a aVar) {
        Long valueOf;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.SCOPES.toString());
            this.f12237d.add(e(map, aVar) + "_view");
            Long l10 = (Long) a(this.f12237d);
            valueOf = Long.valueOf(l10 == null ? 0L : l10.longValue());
        }
        return valueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0003, B:11:0x003e, B:13:0x004e, B:15:0x0068, B:16:0x0075, B:17:0x0079, B:21:0x0028, B:22:0x002d, B:23:0x003c, B:24:0x0032, B:25:0x0037), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String e(java.util.Map<java.lang.String, java.lang.Object> r7, com.webengage.sdk.android.utils.WebEngageConstant.a r8) {
        /*
            r6 = this;
            java.lang.Object r0 = com.webengage.sdk.android.actions.database.DataHolder.f12235b
            monitor-enter(r0)
            java.lang.String r1 = "journeyId"
            java.lang.Object r1 = r7.get(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L30
            java.util.List<com.webengage.sdk.android.utils.WebEngageConstant$b> r2 = com.webengage.sdk.android.utils.WebEngageConstant.f12691b     // Catch: java.lang.Throwable -> L30
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L30
            com.webengage.sdk.android.utils.WebEngageConstant$b r4 = (com.webengage.sdk.android.utils.WebEngageConstant.b) r4     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r4.f12700b     // Catch: java.lang.Throwable -> L30
            int[] r5 = com.webengage.sdk.android.actions.database.DataHolder.a.f12238a     // Catch: java.lang.Throwable -> L30
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L30
            r8 = r5[r8]     // Catch: java.lang.Throwable -> L30
            r5 = 1
            if (r8 == r5) goto L37
            r5 = 3
            if (r8 == r5) goto L32
            r3 = 4
            if (r8 == r3) goto L28
            goto L3e
        L28:
            r8 = 2
            java.lang.Object r8 = r2.get(r8)     // Catch: java.lang.Throwable -> L30
        L2d:
            com.webengage.sdk.android.utils.WebEngageConstant$b r8 = (com.webengage.sdk.android.utils.WebEngageConstant.b) r8     // Catch: java.lang.Throwable -> L30
            goto L3c
        L30:
            r7 = move-exception
            goto L7b
        L32:
            java.lang.Object r8 = r2.get(r3)     // Catch: java.lang.Throwable -> L30
            goto L2d
        L37:
            java.lang.Object r8 = r2.get(r5)     // Catch: java.lang.Throwable -> L30
            goto L2d
        L3c:
            java.lang.String r4 = r8.f12700b     // Catch: java.lang.Throwable -> L30
        L3e:
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r8.<init>()     // Catch: java.lang.Throwable -> L30
            r8.append(r7)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L75
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r7.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "journey"
            r7.add(r2)     // Catch: java.lang.Throwable -> L30
            r7.add(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "id"
            r7.add(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = r6.a(r7)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L30
            if (r7 == 0) goto L75
            java.lang.String r1 = "["
            r8.append(r1)     // Catch: java.lang.Throwable -> L30
            r8.append(r7)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "]"
            r8.append(r7)     // Catch: java.lang.Throwable -> L30
        L75:
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return r7
        L7b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.database.DataHolder.e(java.util.Map, com.webengage.sdk.android.utils.WebEngageConstant$a):java.lang.String");
    }

    public Map<String, Object> f() {
        Map<String, Object> map;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.PAGE.toString());
            this.f12237d.add("custom");
            map = (Map) a(this.f12237d);
        }
        return map;
    }

    public void g(String str, Map<String, Object> map) {
        synchronized (f12235b) {
            if (map != null) {
                try {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (q0.a(key) != null) {
                            a(str, key, entry.getValue(), f.USER);
                        }
                        if (m0.a(key)) {
                            a(str, key, entry.getValue(), f.ANDROID);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public Object a(List<? extends Object> list) {
        Object obj;
        if (list == null) {
            return null;
        }
        synchronized (f12235b) {
            try {
                obj = this.container.containsKey(list.get(0).toString()) ? this.container.get(list.get(0).toString()) : null;
                for (int i10 = 1; i10 < list.size(); i10++) {
                    if (obj != null) {
                        if (obj instanceof Map) {
                            for (Map.Entry entry : ((Map) obj).entrySet()) {
                                if (((String) entry.getKey()).equalsIgnoreCase(list.get(i10).toString())) {
                                    obj = entry.getValue();
                                    break;
                                }
                            }
                            obj = null;
                        } else {
                            if (obj instanceof List) {
                                List list2 = (List) obj;
                                if (list.get(i10) != null && list2.size() > Integer.parseInt(list.get(i10).toString())) {
                                    obj = list2.get(Integer.parseInt(list.get(i10).toString()));
                                }
                            }
                            obj = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            return DataType.cloneInternal(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    public Object b(String str) {
        Object a10;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add(str);
            a10 = a(this.f12237d);
        }
        return a10;
    }

    public String c() {
        String str;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(PaymentConstants.Category.CONFIG);
            this.f12237d.add("gbp");
            str = (String) a(this.f12237d);
        }
        return str;
    }

    public String d() {
        String str;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.ANDROID.toString());
            this.f12237d.add("city");
            str = (String) a(this.f12237d);
        }
        return str;
    }

    public Map<String, Object> e(String str) {
        Map<String, Object> map;
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.EVENT_CRITERIA.toString());
            this.f12237d.add(str);
            map = (Map) a(this.f12237d);
        }
        return map;
    }

    public void f(String str, Map<String, Object> map) {
        synchronized (f12235b) {
            if (map != null) {
                try {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        a(str, entry.getKey(), entry.getValue(), f.ANDROID);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a() {
        HashMap hashMap;
        synchronized (f12235b) {
            try {
                Map map = (Map) a(f.EVENT.toString());
                if (map != null) {
                    hashMap = new HashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((String) entry.getKey()).equals("we_wk_session_delay")) {
                            hashMap.put("we_wk_session_delay", entry.getValue());
                        }
                    }
                } else {
                    hashMap = null;
                }
                this.f12237d.clear();
                this.f12237d.add(f.EVENT.toString());
                a(this.f12237d, hashMap);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(String str, Object obj) {
        synchronized (f12235b) {
            this.container.put(str, obj);
        }
    }

    public void c(String str, Map<String, Object> map) {
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.EVENT.toString());
            this.f12237d.add(str);
            a(this.f12237d, map);
        }
    }

    public void d(String str, Map<String, Object> map) {
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.LATEST_EVENT.toString());
            this.f12237d.add(str);
            a(this.f12237d, map);
        }
    }

    public void e(String str, Map<String, Object> map) {
        synchronized (f12235b) {
            if (map != null) {
                try {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        a(str, entry.getKey(), entry.getValue(), f.ATTR);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a(long j10) {
        synchronized (f12235b) {
            this.container.put("f_activity_start_ep", Long.valueOf(j10));
        }
    }

    public void b(String str, Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                if (q0.a(key) != null) {
                    a(str, key, (Number) entry.getValue(), f.USER);
                }
                if (m0.a(key)) {
                    a(str, key, (Number) entry.getValue(), f.ANDROID);
                }
            }
        }
    }

    public void c(Map<String, Object> map) {
        synchronized (f12235b) {
            this.container.putAll(map);
        }
    }

    public void d(boolean z10) {
        synchronized (f12235b) {
            this.container.put("useLegacyRuleCompiler", Boolean.valueOf(z10));
        }
    }

    private void b(List<Object> list, Object obj, String str, o oVar) {
        Object obj2;
        synchronized (f12235b) {
            try {
                Object obj3 = this.container;
                boolean z10 = false;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (obj3 instanceof Map) {
                        obj2 = ((Map) obj3).get(list.get(i10).toString());
                    } else {
                        if (obj3 instanceof List) {
                            Integer valueOf = Integer.valueOf(Integer.parseInt(list.get(i10).toString()));
                            if (valueOf.intValue() < ((List) obj3).size()) {
                                obj2 = ((List) obj3).get(valueOf.intValue());
                            }
                        }
                        obj2 = null;
                    }
                    if (i10 != list.size() - 1) {
                        if (obj2 == null) {
                            int i11 = i10 + 1;
                            Cloneable hashMap = (i11 >= list.size() || !(list.get(i11) instanceof Number)) ? new HashMap() : new ArrayList();
                            if (obj3 instanceof Map) {
                                ((Map) obj3).put(list.get(i10).toString(), hashMap);
                            } else if (obj3 instanceof List) {
                                List list2 = (List) obj3;
                                Integer valueOf2 = Integer.valueOf(Integer.parseInt(list.get(i10).toString()));
                                if (list2.size() <= valueOf2.intValue()) {
                                    for (int size = list2.size() + 1; size <= valueOf2.intValue() + 1; size++) {
                                        list2.add(null);
                                    }
                                }
                                list2.set(valueOf2.intValue(), hashMap);
                            }
                        }
                        if (obj3 instanceof Map) {
                            obj3 = ((Map) obj3).get(list.get(i10).toString());
                        } else if (obj3 instanceof List) {
                            obj3 = ((List) obj3).get(Integer.parseInt(list.get(i10).toString()));
                        }
                    } else if (!o.OPT_UPDATE.equals(oVar) || obj2 == null) {
                        if (obj3 instanceof Map) {
                            ((Map) obj3).put(list.get(i10).toString(), obj);
                        } else if (obj3 instanceof List) {
                            List list3 = (List) obj3;
                            Integer valueOf3 = Integer.valueOf(Integer.parseInt(list.get(i10).toString()));
                            if (list3.size() <= valueOf3.intValue()) {
                                for (int size2 = list3.size() + 1; size2 <= valueOf3.intValue() + 1; size2++) {
                                    list3.add(null);
                                }
                            }
                            list3.set(valueOf3.intValue(), obj);
                        }
                        z10 = true;
                    }
                }
                if (z10) {
                    a(list, obj, str, oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(n nVar) {
        if (this.f12236c == null) {
            this.f12236c = new ArrayList();
        }
        this.f12236c.add(nVar);
    }

    public void c(boolean z10) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) a("entity_is_running");
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
        }
        atomicBoolean.set(z10);
        b("entity_is_running", atomicBoolean);
    }

    public void a(String str, f fVar) {
        synchronized (f12235b) {
            try {
                Map map = (Map) a(fVar.toString());
                if (map != null) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        String str2 = (String) ((Map.Entry) it.next()).getKey();
                        if (str2 != null && str2.endsWith("_session")) {
                            a(str, str2, (Object) null, fVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Map<String, Object> map) {
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.PAGE.toString());
            this.f12237d.add(LogSubCategory.Action.SYSTEM);
            a(this.f12237d, map);
        }
    }

    public void a(String str, Object obj) {
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(str);
            a(this.f12237d, obj);
        }
    }

    public void b(boolean z10) {
        synchronized (f12235b) {
            this.container.put("boot_up", Boolean.valueOf(z10));
        }
    }

    public void a(String str, String str2, Number number, f fVar) {
        synchronized (f12235b) {
            try {
                this.f12237d.clear();
                this.f12237d.add(fVar.toString());
                this.f12237d.add(str2);
                Number number2 = (Number) a(this.f12237d);
                if (number2 == null) {
                    number2 = 0;
                }
                Number valueOf = Double.valueOf(number2.doubleValue() + number.doubleValue());
                try {
                    Number number3 = (Number) DataType.convert(valueOf, DataType.detect(number), false);
                    try {
                        b(this.f12237d, number3, str, o.INCREMENT);
                    } catch (Exception unused) {
                        valueOf = number3;
                        b(this.f12237d, valueOf, str, o.INCREMENT);
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(String str, String str2, Object obj, f fVar) {
        synchronized (f12235b) {
            a(str, str2, obj, fVar, o.FORCE_UPDATE);
        }
    }

    public void a(String str, String str2, Object obj, f fVar, o oVar) {
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(fVar.toString());
            this.f12237d.add(str2);
            b(this.f12237d, obj, str, oVar);
        }
    }

    public void a(String str, String str2, Map<String, Object> map) {
        synchronized (f12235b) {
            a(str, str2, map, f.EVENT_CRITERIA);
        }
    }

    public void a(String str, Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                a(str, entry.getKey(), (Number) entry.getValue(), f.ATTR);
            }
        }
    }

    public void a(List<Object> list, Object obj) {
        b(list, obj, null, o.FORCE_UPDATE);
    }

    private void a(List<Object> list, Object obj, String str, o oVar) {
        List<n> list2 = this.f12236c;
        if (list2 != null) {
            Iterator<n> it = list2.iterator();
            while (it.hasNext()) {
                it.next().a(list, obj, str, oVar);
            }
        }
    }

    public void a(Map<String, Object> map) {
        synchronized (f12235b) {
            this.f12237d.clear();
            this.f12237d.add(f.PAGE.toString());
            this.f12237d.add("custom");
            a(this.f12237d, map);
        }
    }

    public void a(boolean z10) {
        synchronized (f12235b) {
            this.container.put("app_foreground", Boolean.valueOf(z10));
        }
    }

    public boolean a(WebEngageConstant.a aVar) {
        synchronized (f12235b) {
            boolean z10 = true;
            try {
                if (aVar == null) {
                    return true;
                }
                int i10 = a.f12238a[aVar.ordinal()];
                if (i10 == 1) {
                    Boolean bool = (Boolean) b("opt_in_inapp");
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    }
                    return z10;
                }
                if (i10 != 2) {
                    return true;
                }
                Boolean bool2 = (Boolean) f(q0.f12652k.toString());
                Boolean valueOf = Boolean.valueOf(bool2 == null ? true : bool2.booleanValue());
                Boolean bool3 = (Boolean) b("opt_in_push");
                Boolean valueOf2 = Boolean.valueOf(bool3 == null ? true : bool3.booleanValue());
                if (!valueOf.booleanValue() || !valueOf2.booleanValue()) {
                    z10 = false;
                }
                return z10;
            } finally {
            }
        }
    }

    public boolean a(boolean z10, boolean z11) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) a("entity_is_running");
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
        }
        boolean compareAndSet = atomicBoolean.compareAndSet(z10, z11);
        b("entity_is_running", atomicBoolean);
        return compareAndSet;
    }
}
