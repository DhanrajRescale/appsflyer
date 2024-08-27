package com.webengage.sdk.android.actions.rules;

import android.content.Context;
import android.text.TextUtils;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.n;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class f extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f12454c;

    /* renamed from: d, reason: collision with root package name */
    private List<WebEngageConstant.c> f12455d;

    /* renamed from: e, reason: collision with root package name */
    String f12456e;

    /* renamed from: f, reason: collision with root package name */
    long f12457f;

    public f(Context context) {
        super(context);
        this.f12454c = null;
        this.f12455d = null;
        this.f12456e = null;
        this.f12457f = -1L;
        this.f12454c = context.getApplicationContext();
    }

    private String a(String str, Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        if (map.get("journeyId") != null) {
            str = (String) map.get("journeyId");
        }
        double a10 = WebEngageUtils.a(str, this.f12456e);
        List list = (List) map.get("variations");
        if (list == null) {
            return null;
        }
        double d10 = 0.0d;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Map map2 = (Map) list.get(i10);
            if (map2 != null) {
                double parseDouble = map2.get("sampling") == null ? 100.0d : Double.parseDouble(map2.get("sampling") + HttpUrl.FRAGMENT_ENCODE_SET);
                if (a10 >= d10 && a10 < d10 + parseDouble) {
                    return (String) map2.get("id");
                }
                d10 += parseDouble;
            }
        }
        return null;
    }

    private List<String> b(List<String> list) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            for (String str : list) {
                if (DataHolder.get().k() == null || DataHolder.get().k().get(str) == null) {
                    arrayList.add(str);
                } else {
                    HashMap hashMap2 = (HashMap) DataHolder.get().k().get(str);
                    String str2 = (String) hashMap2.get("targetView");
                    if (!TextUtils.isEmpty(str2) && hashMap.get(str2) == null) {
                        hashMap.put(str2, hashMap2);
                    }
                }
            }
            if ((this.f12455d.size() == 1 && this.f12455d.get(0) == WebEngageConstant.c.PAGE_RULE) || this.f12455d.get(0) == WebEngageConstant.c.EVENT_RULE) {
                com.webengage.sdk.android.actions.render.g gVar = new com.webengage.sdk.android.actions.render.g(this.f12454c);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("action_data", hashMap);
                gVar.c((Map<String, Object>) hashMap3);
            }
        }
        return arrayList;
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        WebEngageConstant.a aVar;
        Map<String, Object> a10;
        boolean z10;
        List<WebEngageConstant.c> list;
        WebEngageConstant.c cVar;
        this.f12457f = System.currentTimeMillis();
        this.f12456e = d().isEmpty() ? g() : d();
        Map map = (Map) obj;
        this.f12455d = (List) map.get("execution_chain");
        n nVar = (n) map.get("event_state_data");
        boolean z11 = true;
        if (nVar != null && a(nVar)) {
            if (this.f12455d.size() > 0) {
                WebEngageConstant.c cVar2 = this.f12455d.get(0);
                WebEngageConstant.c cVar3 = WebEngageConstant.c.SESSION_RULE;
                if (cVar2 != cVar3) {
                    this.f12455d.add(0, cVar3);
                }
                if (this.f12455d.size() > 1) {
                    WebEngageConstant.c cVar4 = this.f12455d.get(1);
                    cVar = WebEngageConstant.c.PAGE_RULE;
                    if (cVar4 != cVar) {
                        list = this.f12455d;
                        list.add(1, cVar);
                    }
                }
            } else {
                this.f12455d.add(0, WebEngageConstant.c.SESSION_RULE);
            }
            list = this.f12455d;
            cVar = WebEngageConstant.c.PAGE_RULE;
            list.add(1, cVar);
        }
        List<String> list2 = null;
        for (WebEngageConstant.c cVar5 : this.f12455d) {
            WebEngageConstant.c cVar6 = WebEngageConstant.c.PAGE_RULE;
            if (cVar5.equals(cVar6)) {
                h.b().setCompetingIds(k());
                Map<String, Map<String, String>> n10 = n();
                List<String> evaluateRulesByCategory = h.b().evaluateRulesByCategory(cVar6);
                try {
                    ArrayList arrayList = new ArrayList();
                    try {
                        if (evaluateRulesByCategory.size() > 0) {
                            c cVar7 = new c(this.f12454c);
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            for (String str : evaluateRulesByCategory) {
                                if (DataHolder.get().k() == null || DataHolder.get().k().get(str) == null) {
                                    aVar = WebEngageConstant.a.NOTIFICATION;
                                    a10 = cVar7.a(str, aVar);
                                    z10 = false;
                                } else {
                                    aVar = WebEngageConstant.a.INLINE_PERSONALIZATION;
                                    z10 = z11;
                                    a10 = cVar7.a(str, aVar);
                                }
                                long longValue = a10.get("order") == null ? 0L : ((Long) a10.get("order")).longValue();
                                if (z10) {
                                    Map<String, String> map2 = n10.get(str);
                                    if (a(a10, map2 != null ? cVar7.a(map2.keySet().iterator().next(), a10) : null, aVar)) {
                                        arrayList.add(str);
                                    }
                                } else if (j11 == j10 || longValue <= j11) {
                                    Map<String, String> map3 = n10.get(str);
                                    if (a(a10, map3 != null ? cVar7.a(map3.keySet().iterator().next(), a10) : null, aVar)) {
                                        long min = Math.min(longValue, j11);
                                        arrayList.add(str);
                                        j11 = min;
                                    }
                                }
                                z11 = true;
                                j10 = Long.MAX_VALUE;
                            }
                        }
                        h.b().setCompetingIds(arrayList);
                    } catch (Exception unused) {
                    }
                    list2 = arrayList;
                } catch (Exception unused2) {
                }
            } else {
                WebEngageConstant.c cVar8 = WebEngageConstant.c.SESSION_RULE;
                if (cVar5.equals(cVar8)) {
                    c cVar9 = new c(this.f12454c);
                    h.b().reset();
                    list2 = h.b().evaluateRulesByCategory(cVar8);
                    HashMap hashMap = new HashMap();
                    HashSet hashSet = new HashSet();
                    for (String str2 : list2) {
                        Map<String, Object> a11 = cVar9.a(str2, (DataHolder.get().k() == null || DataHolder.get().k().get(str2) == null) ? WebEngageConstant.a.NOTIFICATION : WebEngageConstant.a.INLINE_PERSONALIZATION);
                        String a12 = a(str2, a11);
                        if (a12 != null) {
                            String str3 = (String) cVar9.a(a12, a11).get("layout");
                            hashSet.add(cVar9.a(str3));
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(a12, str3);
                            hashMap.put(str2, hashMap2);
                        }
                    }
                    if (!hashSet.isEmpty() && nVar != null && "visitor_new_session".equals(nVar.d())) {
                        com.webengage.sdk.android.utils.g.a(hashSet, this.f12454c);
                    }
                    h.b().setCompetingIds(list2);
                    a(list2);
                    a((Map<String, Map<String, String>>) hashMap);
                } else {
                    WebEngageConstant.c cVar10 = WebEngageConstant.c.EVENT_RULE;
                    if (cVar5.equals(cVar10)) {
                        list2 = h.b().evaluateRulesByCategory(cVar10);
                    }
                }
            }
            z11 = true;
        }
        return list2;
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
        List<String> list;
        List<String> list2 = (List) obj;
        if (list2 != null) {
            list = h.b().filterRenderingIds(list2, (WebEngageConstant.c) nn.d.g(this.f12455d, 1));
        } else {
            list = null;
        }
        c(b(list));
    }

    public boolean a(n nVar) {
        String d10 = nVar.d();
        boolean z10 = false;
        if (d10 != null) {
            if (LogSubCategory.Action.SYSTEM.equals(nVar.b()) && !d10.startsWith("we_")) {
                d10 = "we_".concat(d10);
            }
            List<d> eventCriteriasForEvent = h.b().getEventCriteriasForEvent(d10);
            if (eventCriteriasForEvent != null) {
                for (d dVar : eventCriteriasForEvent) {
                    Object a10 = dVar.c().a();
                    if (a10 != null && ((Boolean) a10).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(com.webengage.sdk.android.actions.database.f.EVENT.toString());
                        arrayList.add(d10);
                        if (LogSubCategory.Action.SYSTEM.equals(dVar.b())) {
                            arrayList.add("we_wk_sys");
                        }
                        arrayList.add(dVar.a());
                        Object a11 = DataHolder.get().a(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(a11);
                        arrayList2.add(DataHolder.get().e(dVar.e()));
                        com.webengage.sdk.android.actions.rules.k.e function = h.b().getFunction(dVar.d());
                        Object a12 = function != null ? function.a(arrayList2) : null;
                        if (a12 != null) {
                            DataHolder.get().a(this.f12456e, dVar.e(), (Map) a12);
                            z10 = true;
                        }
                    }
                }
            }
        }
        return z10;
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        return map;
    }

    public static boolean a(Map<String, Object> map, Map<String, Object> map2, WebEngageConstant.a aVar) {
        Long l10 = (Long) map.get("maxTimesPerUser");
        Long d10 = DataHolder.get().d(map, aVar);
        Long a10 = DataHolder.get().a(map, aVar);
        Long b10 = DataHolder.get().b(map, aVar);
        Long c10 = DataHolder.get().c(map, aVar);
        boolean z10 = l10 == null || d10.longValue() < l10.longValue();
        if (map.get("targetView") == null) {
            z10 = z10 && a10.longValue() < 1 && b10.longValue() < 1 && c10.longValue() < 1;
        }
        if (map2 != null) {
            List list = (List) map2.get("targetActivities");
            boolean booleanValue = map.containsKey("skipTargetPage") ? Boolean.valueOf(map.get("skipTargetPage").toString()).booleanValue() : false;
            if (list != null && !list.isEmpty() && booleanValue) {
                z10 = z10 && !list.contains(DataHolder.get().u());
            }
        }
        Long valueOf = Long.valueOf(map.get("startTimestamp") == null ? Long.MIN_VALUE : ((Long) map.get("startTimestamp")).longValue());
        Long valueOf2 = Long.valueOf(map.get("endTimestamp") == null ? Long.MAX_VALUE : ((Long) map.get("endTimestamp")).longValue());
        Long valueOf3 = Long.valueOf(System.currentTimeMillis());
        return z10 && valueOf3.longValue() >= valueOf.longValue() && valueOf3.longValue() <= valueOf2.longValue();
    }
}
