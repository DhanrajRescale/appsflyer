package com.webengage.sdk.android.actions.render;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.j0;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.l.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f12334c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12335d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12336e;

    /* renamed from: f, reason: collision with root package name */
    private String f12337f;

    /* renamed from: g, reason: collision with root package name */
    private String f12338g;

    /* renamed from: h, reason: collision with root package name */
    private String f12339h;

    /* renamed from: i, reason: collision with root package name */
    private InAppNotificationData f12340i;

    public f(Context context) {
        super(context);
        this.f12334c = null;
        this.f12335d = false;
        this.f12336e = false;
        this.f12337f = null;
        this.f12338g = null;
        this.f12339h = null;
        this.f12340i = null;
        this.f12334c = context.getApplicationContext();
    }

    private String i(String str) {
        String str2;
        List<Object> list;
        Object a10;
        Map<String, List<Object>> A = DataHolder.get().A();
        if (A != null && (list = A.get(str)) != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                List<Object> list2 = (List) it.next();
                if (list2 != null && list2.size() > 0 && (a10 = com.webengage.sdk.android.actions.rules.h.b().getFunction("$we_getResolvedData").a(list2)) != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    arrayList.addAll(list2);
                    DataHolder.get().a(arrayList, a10);
                }
            }
        }
        Object obj = (Map) DataHolder.get().a(str);
        if (obj == null) {
            obj = new HashMap();
        }
        try {
            str2 = (String) DataType.convert(obj, DataType.STRING, true);
        } catch (Exception unused) {
            str2 = null;
        }
        DataHolder.get().a(str, (Object) null);
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Content-Encoding", "gzip");
        com.webengage.sdk.android.utils.l.g a11 = new f.b(WebEngageConstant.d.a(WebEngage.get().getWebEngageConfig().getWebEngageKey(), g(), str, d(), "NOTIFICATION-"), com.webengage.sdk.android.utils.l.e.POST, this.f12334c).a(3).a((Object) str2).a((Map<String, String>) hashMap).a().a();
        if (a11.n()) {
            return com.webengage.sdk.android.utils.g.a(a11.h());
        }
        a11.a();
        return null;
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        if (this.f12335d) {
            try {
                WeakReference<Activity> activity = com.webengage.sdk.android.c.a(this.f12334c).getActivity();
                InAppNotificationData inAppNotificationData = new InAppNotificationData(this.f12337f, this.f12338g, this.f12339h, i(this.f12338g));
                this.f12340i = inAppNotificationData;
                JSONObject optJSONObject = inAppNotificationData.getData().optJSONObject("layoutAttributes");
                boolean optBoolean = optJSONObject.optBoolean("allowLandscape", false);
                boolean optBoolean2 = optJSONObject.optBoolean("allowPortrait", false);
                int i10 = activity.get().getResources().getConfiguration().orientation;
                if (optJSONObject.isNull("allowPortrait")) {
                    if (!optBoolean && i10 == 2) {
                        this.f12335d = false;
                        return null;
                    }
                } else if ((!optBoolean || !optBoolean2) && ((optBoolean2 && i10 == 2) || (optBoolean && i10 == 1))) {
                    this.f12335d = false;
                    return null;
                }
                if (activity.get() != null && !activity.get().isFinishing()) {
                    InAppNotificationData onInAppNotificationPrepared = a(this.f12334c).onInAppNotificationPrepared(this.f12334c, this.f12340i);
                    if (onInAppNotificationPrepared != null) {
                        this.f12340i = onInAppNotificationPrepared;
                    }
                    InAppNotificationData inAppNotificationData2 = this.f12340i;
                    if (inAppNotificationData2 != null && inAppNotificationData2.shouldRender() && activity.get() != null && !activity.get().isFinishing()) {
                        FragmentManager fragmentManager = activity.get().getFragmentManager();
                        n nVar = new n();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("fullscreen", (activity.get().getWindow().getAttributes().flags & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0);
                        bundle.putParcelable("notificationData", this.f12340i);
                        bundle.putString("baseUrl", DataHolder.get().c());
                        nVar.setArguments(bundle);
                        nVar.setRetainInstance(true);
                        fragmentManager.beginTransaction().add(nVar, "WebEngage").commitAllowingStateLoss();
                    }
                }
                this.f12335d = false;
            } catch (Exception e10) {
                b(e10);
                this.f12335d = false;
            }
        }
        return null;
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
        if (this.f12335d || this.f12336e) {
            return;
        }
        DataHolder.get().c(false);
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        this.f12337f = (String) map.get("action_data");
        Map<String, String> map2 = n().get(this.f12337f);
        if (map2 != null) {
            String next = map2.keySet().iterator().next();
            this.f12338g = next;
            this.f12339h = map2.get(next);
            this.f12335d = true;
        } else {
            try {
                Map<String, Object> a10 = new com.webengage.sdk.android.actions.rules.c(this.f12334c).a(this.f12337f, WebEngageConstant.a.NOTIFICATION);
                if (a10.get("controlGroup") != null && Long.parseLong(a10.get("controlGroup").toString()) > 0) {
                    Logger.d("WebEngage", "In-app (" + this.f12337f + ") has fallen in control group");
                    this.f12335d = false;
                    this.f12336e = true;
                    HashMap hashMap = new HashMap();
                    hashMap.put("experiment_id", this.f12337f);
                    WebEngage.startService(com.webengage.sdk.android.q.a(j0.f12598b, com.webengage.sdk.android.l.b("notification_control_group", hashMap, null, null, this.f12334c), this.f12334c), this.f12334c);
                }
            } catch (Exception unused) {
            }
        }
        return Boolean.valueOf(this.f12335d);
    }
}
