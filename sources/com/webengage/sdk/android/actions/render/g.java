package com.webengage.sdk.android.actions.render;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.j0;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class g extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f12341c;

    public g(Context context) {
        super(context);
        this.f12341c = context;
    }

    private String i(String str) {
        List<Object> list;
        Object a10;
        Map<String, List<Object>> A = DataHolder.get().A();
        if (A != null && (list = A.get(str)) != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList != null && arrayList.size() > 0 && (a10 = com.webengage.sdk.android.actions.rules.h.b().getFunction("$we_getResolvedData").a(arrayList)) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(str);
                    arrayList2.addAll(arrayList);
                    DataHolder.get().a(arrayList2, a10);
                }
            }
        }
        HashMap hashMap = (HashMap) DataHolder.get().a(str);
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        try {
            return (String) DataType.convert(hashMap, DataType.STRING, true);
        } catch (Exception unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    private void j(String str) {
        try {
            Map<String, Object> a10 = new com.webengage.sdk.android.actions.rules.c(this.f12552b).a(str, WebEngageConstant.a.INLINE_PERSONALIZATION);
            if (a10.get("controlGroup") == null || Long.parseLong(a10.get("controlGroup").toString()) <= 0) {
                return;
            }
            Logger.d("WebEngage", "InLinePersonalizationAction (" + str + ") has fallen in control group");
            HashMap hashMap = new HashMap();
            hashMap.put("experiment_id", str);
            WebEngage.startService(com.webengage.sdk.android.q.a(j0.f12598b, com.webengage.sdk.android.l.b("app_personalization_control_group", hashMap, null, null, this.f12552b), this.f12552b), this.f12552b);
        } catch (Exception unused) {
        }
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap hashMap2 = new HashMap();
        if (((List) obj).size() <= 0) {
            return null;
        }
        hashMap2.put("luid", g());
        hashMap2.put("cuid", d());
        hashMap2.put("base_url", WebEngageConstant.d.PERSONALISATION_BASE.toString());
        hashMap.put("systemData", hashMap2);
        hashMap.put("properties", obj);
        WeakReference<Activity> activity = com.webengage.sdk.android.c.a(this.f12341c).getActivity();
        if (activity.get() == null || activity.get().isFinishing()) {
            return null;
        }
        com.webengage.sdk.android.i.a(this.f12341c).propertiesReceived(activity, hashMap);
        return null;
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
    }

    private boolean e(Map<String, Object> map) {
        return com.webengage.sdk.android.actions.rules.h.b().evaluateRule(new com.webengage.sdk.android.actions.rules.e(String.valueOf(map.get("pageRuleCode"))), WebEngageConstant.c.CUSTOM_RULE);
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        HashMap hashMap;
        StringBuilder s7;
        String str;
        int j10 = DataHolder.get().j();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = (HashMap) map.get("action_data");
        List<HashMap<String, Object>> l10 = DataHolder.get().l();
        if (l10 != null) {
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            for (HashMap<String, Object> hashMap3 : l10) {
                HashMap hashMap4 = new HashMap();
                hashMap4.putAll(hashMap3);
                String str2 = (String) hashMap4.get("targetView");
                if (str2 != null && !TextUtils.isEmpty(str2.trim())) {
                    String trim = str2.trim();
                    if (!e((Map<String, Object>) hashMap4)) {
                        hashMap = hashMap2;
                        s7 = da.e.s("Ignoring property: ", trim, " with Id: ");
                        s7.append(hashMap4.get("p_id"));
                        s7.append(" because screen rule failed");
                    } else if (hashMap2 == null || hashMap2.containsKey(trim)) {
                        HashMap hashMap5 = (HashMap) hashMap2.get(trim);
                        if (hashMap5 != null) {
                            String str3 = (String) hashMap5.get("notificationEncId");
                            hashMap = hashMap2;
                            Map<String, String> map2 = n().get(str3);
                            if (map2 == null) {
                                Logger.d("WebEngage", "Ignoring campaign due to control group: layoutIdMap " + str3);
                                j(str3);
                            } else {
                                String next = map2.keySet().iterator().next();
                                hashMap4.put("variationId", next);
                                hashMap4.put("campaign", hashMap5);
                                if (next != null) {
                                    hashMap4.put("params", i(next));
                                }
                                if (i10 >= j10) {
                                    str = "Ignoring property: _campaignCount > mCampaignCount variationId " + next;
                                    Logger.d("WebEngage", str);
                                } else if (arrayList2.contains(trim)) {
                                    s7 = da.e.s("Ignoring property: ", trim, " with Id: ");
                                    s7.append(hashMap4.get("p_id"));
                                    s7.append(" because it is already been consumed");
                                } else {
                                    arrayList2.add(trim);
                                    arrayList.add(hashMap4);
                                    i10++;
                                }
                            }
                            hashMap2 = hashMap;
                        }
                    } else if (arrayList2.contains(trim)) {
                        StringBuilder s10 = da.e.s("Ignoring property: ", trim, " with Id: ");
                        s10.append(hashMap4.get("p_id"));
                        s10.append(" because it is already been consumed");
                        Logger.d("WebEngage", s10.toString());
                    } else {
                        arrayList2.add(trim);
                        arrayList.add(hashMap4);
                    }
                    str = s7.toString();
                    Logger.d("WebEngage", str);
                    hashMap2 = hashMap;
                }
                hashMap = hashMap2;
                hashMap2 = hashMap;
            }
        }
        return arrayList;
    }
}
