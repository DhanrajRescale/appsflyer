package com.webengage.sdk.android.actions.rules;

import android.content.Context;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.actions.rules.d;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.l.f;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Object> f12436a;

    /* renamed from: b, reason: collision with root package name */
    private Context f12437b;

    /* renamed from: c, reason: collision with root package name */
    private long f12438c = -1;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12439a;

        static {
            int[] iArr = new int[WebEngageConstant.a.values().length];
            f12439a = iArr;
            try {
                iArr[WebEngageConstant.a.INLINE_PERSONALIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12439a[WebEngageConstant.a.NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12439a[WebEngageConstant.a.SURVEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(Context context) {
        this.f12437b = context.getApplicationContext();
        com.webengage.sdk.android.utils.l.g a10 = new f.b(WebEngageConstant.d.a(WebEngage.get().getWebEngageConfig().getWebEngageKey()), com.webengage.sdk.android.utils.l.e.GET, context.getApplicationContext()).a(4).a().a();
        if (a10.n()) {
            this.f12436a = com.webengage.sdk.android.utils.g.a(a10.h(), false);
        } else {
            a10.a();
            throw new IOException("Some error during parsing config");
        }
    }

    private e a(Map<String, Object> map) {
        Map map2 = (Map) map.get("rules");
        if (map2 == null) {
            return new e("true", "true", "true");
        }
        String str = (String) map2.get(WebEngageConstant.c.SESSION_RULE.toString());
        String str2 = (String) map2.get(WebEngageConstant.c.PAGE_RULE.toString());
        String str3 = (String) map2.get(WebEngageConstant.c.EVENT_RULE.toString());
        if (str == null) {
            str = "true";
        }
        if (str2 == null) {
            str2 = "true";
        }
        return new e(str, str2, str3 != null ? str3 : "true");
    }

    private Set<String> c() {
        return new HashSet();
    }

    private Map<String, List<d>> g() {
        HashMap hashMap = new HashMap();
        List<Object> f10 = f();
        if (f10 != null) {
            for (int i10 = 0; i10 < f10.size(); i10++) {
                Map map = (Map) f10.get(i10);
                if (map != null && map.get("function") != null) {
                    d a10 = new d.b().d((String) map.get("criteria_id")).c(map.get("function").toString()).a((String) map.get("attribute")).b((String) map.get("attributeCategory")).a(new com.webengage.sdk.android.actions.rules.k.d((String) map.get("rule"))).a();
                    String str = (String) map.get("eventName");
                    if (hashMap.get(str) == null) {
                        hashMap.put(str, new ArrayList());
                    }
                    ((List) hashMap.get(str)).add(a10);
                }
            }
        }
        return hashMap;
    }

    public Set<String> b() {
        Set<String> h10 = h();
        h10.addAll(a());
        h10.addAll(c());
        h10.add(WebEngageConstant.d.a(WebEngage.get().getWebEngageConfig().getWebEngageKey()));
        return h10;
    }

    public String d() {
        return (String) this.f12436a.get("gbp");
    }

    public Set<String> e() {
        HashSet hashSet = new HashSet();
        List<Object> f10 = f();
        if (f10 != null) {
            for (int i10 = 0; i10 < f10.size(); i10++) {
                Map map = (Map) f10.get(i10);
                if (map != null) {
                    hashSet.add((String) map.get("criteria_id"));
                }
            }
        }
        return hashSet;
    }

    public List<Object> f() {
        return (List) this.f12436a.get("ecl");
    }

    public Set<String> h() {
        List list;
        HashSet hashSet = new HashSet();
        String d10 = d();
        if (d10 != null && (list = (List) this.f12436a.get("grs")) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(d10 + ((String) it.next()));
            }
        }
        return hashSet;
    }

    public long i() {
        return this.f12438c;
    }

    public c(Map<String, Object> map) {
        this.f12436a = map;
    }

    public String a(String str) {
        return WebEngageConstant.d.a(d(), str);
    }

    public Set<String> b(String str, Map<String, Object> map) {
        HashSet hashSet = new HashSet();
        hashSet.add(a((String) map.get("layout")));
        hashSet.addAll(b(map));
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> a(java.lang.String r9, com.webengage.sdk.android.utils.WebEngageConstant.a r10) {
        /*
            r8 = this;
            int[] r0 = com.webengage.sdk.android.actions.rules.c.a.f12439a
            int r10 = r10.ordinal()
            r10 = r0[r10]
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 == r2) goto L25
            r3 = 2
            if (r10 == r3) goto L1e
            r2 = 3
            if (r10 == r2) goto L15
            r10 = r1
            goto L2c
        L15:
            java.util.List<com.webengage.sdk.android.utils.WebEngageConstant$b> r10 = com.webengage.sdk.android.utils.WebEngageConstant.f12691b
            java.lang.Object r10 = r10.get(r3)
        L1b:
            com.webengage.sdk.android.utils.WebEngageConstant$b r10 = (com.webengage.sdk.android.utils.WebEngageConstant.b) r10
            goto L2c
        L1e:
            java.util.List<com.webengage.sdk.android.utils.WebEngageConstant$b> r10 = com.webengage.sdk.android.utils.WebEngageConstant.f12691b
            java.lang.Object r10 = r10.get(r2)
            goto L1b
        L25:
            java.util.List<com.webengage.sdk.android.utils.WebEngageConstant$b> r10 = com.webengage.sdk.android.utils.WebEngageConstant.f12691b
            java.lang.Object r10 = r10.get(r0)
            goto L1b
        L2c:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.f12436a
            java.lang.String r3 = r10.f12699a
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L75
            if (r9 == 0) goto L75
            boolean r3 = r9.isEmpty()
            if (r3 != 0) goto L75
            r3 = r0
        L41:
            int r4 = r2.size()
            if (r3 >= r4) goto L75
            java.lang.Object r4 = r2.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L72
            r5 = r0
        L50:
            int r6 = r4.size()
            if (r5 >= r6) goto L72
            java.lang.Object r6 = r4.get(r5)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L6f
            java.lang.String r7 = r10.f12700b
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L6f
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L6f
            return r6
        L6f:
            int r5 = r5 + 1
            goto L50
        L72:
            int r3 = r3 + 1
            goto L41
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.rules.c.a(java.lang.String, com.webengage.sdk.android.utils.WebEngageConstant$a):java.util.Map");
    }

    public Set<String> b(Map<String, Object> map) {
        HashSet hashSet = new HashSet();
        try {
            ArrayList arrayList = (ArrayList) map.get("resources");
            if (arrayList != null) {
                hashSet.addAll(arrayList);
            }
        } catch (Exception unused) {
        }
        return hashSet;
    }

    public Map<String, Object> a(String str, Map<String, Object> map) {
        List list = (List) map.get("variations");
        if (list == null) {
            return null;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            Map<String, Object> map2 = (Map) list.get(i10);
            if (map2 != null && str.equals((String) map2.get("id"))) {
                return map2;
            }
        }
        return null;
    }

    private Set<String> a() {
        HashSet hashSet = new HashSet();
        List list = (List) this.f12436a.get(WebEngageConstant.f12691b.get(1).f12699a);
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                List list2 = (List) list.get(i10);
                if (list2 != null) {
                    for (int i11 = 0; i11 < list2.size(); i11++) {
                        Map<String, Object> map = (Map) list2.get(i11);
                        if (map != null) {
                            hashSet.addAll(a(map, WebEngageConstant.a.NOTIFICATION));
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    public Set<String> a(RuleExecutor ruleExecutor, DataHolder dataHolder) {
        String str;
        List list;
        List list2;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("tzo", this.f12436a.get("tzo"));
        hashMap.put("events", this.f12436a.get("events"));
        hashMap.put("gbp", d());
        hashMap.put("geoFences", this.f12436a.get("geoFences"));
        hashMap.put("upfc", this.f12436a.get("upfc"));
        Object obj = this.f12436a.get("useLegacyRuleCompiler");
        DataHolder.get().d(obj != null ? Boolean.parseBoolean(obj.toString()) : false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap2 = new HashMap();
        HashSet hashSet = new HashSet();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        Iterator<WebEngageConstant.b> it = WebEngageConstant.f12691b.iterator();
        while (it.hasNext()) {
            WebEngageConstant.b next = it.next();
            String str3 = next.f12699a;
            String str4 = next.f12700b;
            List list3 = (List) this.f12436a.get(str3);
            if (list3 != null) {
                int i10 = 0;
                while (i10 < list3.size()) {
                    List list4 = (List) list3.get(i10);
                    Iterator<WebEngageConstant.b> it2 = it;
                    if (list4 != null) {
                        list = list3;
                        int i11 = 0;
                        while (i11 < list4.size()) {
                            Map<String, Object> map = (Map) list4.get(i11);
                            if (map != null) {
                                list2 = list4;
                                String str5 = (String) map.get(str4);
                                str2 = str4;
                                if (str5 != null) {
                                    if ("personalizationRuleList".equals(str3)) {
                                        hashMap3.put(str5, map);
                                    } else if ("notificationRuleList".equals(str3)) {
                                        hashMap4.put(str5, map);
                                    }
                                    hashSet.add(str5);
                                    linkedHashMap.put(str5, a(map));
                                    List list5 = (List) map.get("variations");
                                    if (list5 != null) {
                                        int i12 = 0;
                                        while (i12 < list5.size()) {
                                            Map map2 = (Map) list5.get(i12);
                                            List list6 = list5;
                                            if (map2 != null) {
                                                String str6 = (String) map2.get("id");
                                                List list7 = (List) map2.get("tokens");
                                                if (list7 != null && str6 != null) {
                                                    hashMap2.put(str6, list7);
                                                }
                                            }
                                            i12++;
                                            list5 = list6;
                                        }
                                    }
                                }
                            } else {
                                list2 = list4;
                                str2 = str4;
                            }
                            i11++;
                            str4 = str2;
                            list4 = list2;
                        }
                        str = str4;
                    } else {
                        str = str4;
                        list = list3;
                    }
                    i10++;
                    it = it2;
                    list3 = list;
                    str4 = str;
                }
            }
        }
        ruleExecutor.setRuleMap(linkedHashMap);
        ruleExecutor.setEventCriteriaMap(g());
        hashMap.put("tokens", hashMap2);
        dataHolder.b(PaymentConstants.Category.CONFIG, (Object) hashMap);
        this.f12438c = this.f12436a.get("sdt") != null ? ((Long) this.f12436a.get("sdt")).longValue() : -1L;
        Logger.d("WebEngage", "initRuntime sessionDestroyTime: " + this.f12438c);
        dataHolder.a("inline_campaigns", (Object) hashMap3);
        dataHolder.a("in_app_campaigns", (Object) hashMap4);
        dataHolder.a("inline_properties", this.f12436a.get("properties"));
        dataHolder.a("p_campaign_limit", this.f12436a.get("pCampaignLimit"));
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[LOOP:0: B:10:0x0042->B:16:0x0057, LOOP_START, PHI: r0
  0x0042: PHI (r0v2 int) = (r0v1 int), (r0v3 int) binds: [B:9:0x0040, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Set<java.lang.String> a(java.util.Map<java.lang.String, java.lang.Object> r4, com.webengage.sdk.android.utils.WebEngageConstant.a r5) {
        /*
            r3 = this;
            int[] r0 = com.webengage.sdk.android.actions.rules.c.a.f12439a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L26
            r2 = 2
            if (r5 == r2) goto L1f
            r1 = 3
            if (r5 == r1) goto L14
            r5 = 0
            goto L2d
        L14:
            java.util.List<com.webengage.sdk.android.utils.WebEngageConstant$b> r5 = com.webengage.sdk.android.utils.WebEngageConstant.f12691b
            java.lang.Object r5 = r5.get(r2)
        L1a:
            com.webengage.sdk.android.utils.WebEngageConstant$b r5 = (com.webengage.sdk.android.utils.WebEngageConstant.b) r5
            java.lang.String r5 = r5.f12700b
            goto L2d
        L1f:
            java.util.List<com.webengage.sdk.android.utils.WebEngageConstant$b> r5 = com.webengage.sdk.android.utils.WebEngageConstant.f12691b
            java.lang.Object r5 = r5.get(r1)
            goto L1a
        L26:
            java.util.List<com.webengage.sdk.android.utils.WebEngageConstant$b> r5 = com.webengage.sdk.android.utils.WebEngageConstant.f12691b
            java.lang.Object r5 = r5.get(r0)
            goto L1a
        L2d:
            java.lang.Object r5 = r4.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = "variations"
            java.lang.Object r4 = r4.get(r1)
            java.util.List r4 = (java.util.List) r4
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            if (r4 == 0) goto L5a
        L42:
            int r2 = r4.size()
            if (r0 >= r2) goto L5a
            java.lang.Object r2 = r4.get(r0)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L57
            java.util.Set r2 = r3.b(r5, r2)
            r1.addAll(r2)
        L57:
            int r0 = r0 + 1
            goto L42
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.rules.c.a(java.util.Map, com.webengage.sdk.android.utils.WebEngageConstant$a):java.util.Set");
    }
}
