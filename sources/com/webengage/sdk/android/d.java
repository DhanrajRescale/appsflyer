package com.webengage.sdk.android;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import com.webengage.sdk.android.Analytics;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class d extends Analytics {

    /* renamed from: a, reason: collision with root package name */
    Context f12538a;

    /* renamed from: b, reason: collision with root package name */
    f f12539b;

    /* renamed from: c, reason: collision with root package name */
    WeakReference<Activity> f12540c = null;

    /* renamed from: d, reason: collision with root package name */
    e0 f12541d;

    /* renamed from: e, reason: collision with root package name */
    d0 f12542e;

    /* renamed from: f, reason: collision with root package name */
    AtomicInteger f12543f;

    public d(Context context, f fVar, e0 e0Var, d0 d0Var) {
        this.f12538a = null;
        this.f12539b = null;
        this.f12541d = null;
        this.f12542e = null;
        this.f12543f = null;
        this.f12538a = context.getApplicationContext();
        this.f12539b = fVar;
        this.f12542e = d0Var;
        this.f12541d = e0Var;
        this.f12543f = new AtomicInteger(0);
    }

    @Override // com.webengage.sdk.android.Analytics
    public f a() {
        return this.f12539b;
    }

    @Override // com.webengage.sdk.android.Analytics
    public d0 b() {
        return this.f12542e;
    }

    @Override // com.webengage.sdk.android.Analytics
    public e0 c() {
        return this.f12541d;
    }

    @Override // com.webengage.sdk.android.Analytics
    public WeakReference<Activity> getActivity() {
        return this.f12540c;
    }

    @Override // com.webengage.sdk.android.Analytics
    public void installed(Intent intent) {
        try {
            if (intent == null) {
                Logger.e("WebEngage", "Intent is Null");
                return;
            }
            if (this.f12539b.q()) {
                return;
            }
            this.f12539b.b(true);
            if (intent.hasExtra("referrer")) {
                this.f12539b.a("referrer", intent.getStringExtra("referrer"));
            } else {
                this.f12539b.a("referrer", HttpUrl.FRAGMENT_ENCODE_SET);
            }
        } catch (Exception e10) {
            b(e10);
        }
    }

    @Override // com.webengage.sdk.android.Analytics
    public void screenNavigated(String str) {
        screenNavigated(str, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void setScreenData(Map<String, ? extends Object> map) {
        Map map2;
        try {
            Logger.d("WebEngage", "Set screen data: " + map);
            ArrayList arrayList = new ArrayList();
            arrayList.add(com.webengage.sdk.android.actions.database.f.PAGE.toString());
            arrayList.add("custom");
            HashMap hashMap = new HashMap();
            try {
                map2 = (Map) DataType.cloneExternal(map);
            } catch (Exception unused) {
                map2 = null;
            }
            hashMap.put("data", map2);
            hashMap.put("path", arrayList);
            WebEngage.startService(q.a(j0.f12605i, hashMap, this.f12538a), this.f12538a);
        } catch (Exception e10) {
            b(e10);
        }
    }

    @Override // com.webengage.sdk.android.Analytics
    public void start(Activity activity) {
        try {
            this.f12542e.a();
            int incrementAndGet = this.f12543f.incrementAndGet();
            DataHolder.get().a(true);
            this.f12540c = new WeakReference<>(activity);
            if (activity != null) {
                Logger.d("WebEngage", " Activity start: ".concat(activity.getClass().getName()));
                HashMap hashMap = new HashMap();
                hashMap.put("screen_path", activity.getClass().getName());
                if (activity.getTitle() != null) {
                    hashMap.put("screen_title", activity.getTitle().toString());
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("activity_count", Integer.valueOf(incrementAndGet));
                WebEngage.startService(q.a(j0.f12604h, l.b("we_wk_activity_start", hashMap, null, hashMap2, this.f12538a), this.f12538a), this.f12538a);
                if (WebEngage.get().getWebEngageConfig().getEveryActivityIsScreen()) {
                    screenNavigated(activity.getClass().getName());
                }
            }
        } catch (Exception e10) {
            b(e10);
        }
    }

    @Override // com.webengage.sdk.android.Analytics
    public void stop(Activity activity) {
        long j10;
        if (activity != null) {
            try {
                Logger.d("WebEngage", " Activity stop: ".concat(activity.getClass().getName()));
                try {
                    FragmentManager fragmentManager = activity.getFragmentManager();
                    Fragment findFragmentByTag = fragmentManager.findFragmentByTag("WebEngage");
                    if (findFragmentByTag != null) {
                        fragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
                    }
                } catch (Exception unused) {
                    Logger.e("WebEngage", "Unable to remove attached in-app fragment from stopped activity.");
                }
            } catch (Exception e10) {
                b(e10);
                return;
            }
        }
        int decrementAndGet = this.f12543f.decrementAndGet();
        HashMap hashMap = new HashMap();
        hashMap.put("activity_count", Integer.valueOf(decrementAndGet));
        if (decrementAndGet == 0) {
            DataHolder.get().a(false);
            long j11 = a().j();
            if (j11 == -1) {
                j11 = WebEngage.get().getWebEngageConfig().getSessionDestroyTime();
            }
            if (j11 != -1) {
                if (j11 > 216000) {
                    j10 = 3600000;
                } else if (j11 >= 15) {
                    j10 = j11 * 1000;
                }
                Logger.d("WebEngage", "Visitor session timeout: " + j10);
                this.f12542e.d(System.currentTimeMillis() + j10);
            }
            j10 = 15000;
            Logger.d("WebEngage", "Visitor session timeout: " + j10);
            this.f12542e.d(System.currentTimeMillis() + j10);
        }
        WebEngage.startService(q.a(j0.f12604h, l.b("we_wk_activity_stop", null, null, hashMap, this.f12538a), this.f12538a), this.f12538a);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str) {
        track(str, null, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void trackSystem(String str, Map<String, ?> map, Map<String, ?> map2) {
        if (m.f12619a.contains(str)) {
            if (map2 == null) {
                map2 = null;
            }
            a(l.b(str, map, map2, null, this.f12538a));
        } else {
            Logger.e("WebEngage", "Event name: " + str + " is not a system event");
        }
    }

    @Override // com.webengage.sdk.android.Analytics
    public void a(Object obj) {
        WebEngage.startService(q.a(j0.f12598b, obj, this.f12538a), this.f12538a);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void b(Object obj) {
        if (obj != null) {
            Logger.e("WebEngage", "Some error occurred : " + obj.toString());
        }
        WebEngage.startService(q.a(j0.f12603g, obj, this.f12538a), this.f12538a);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void screenNavigated(String str, Map<String, ? extends Object> map) {
        try {
            Logger.d("WebEngage", "Screen navigated: " + str + " with data: " + map);
            HashMap hashMap = new HashMap();
            hashMap.put("screen_name", str);
            WebEngage.startService(q.a(j0.f12604h, l.b("we_wk_screen_navigated", hashMap, map, null, this.f12538a), this.f12538a), this.f12538a);
        } catch (Exception e10) {
            b(e10);
        }
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Analytics.Options options) {
        track(str, null, options);
    }

    private boolean a(String str) {
        String concat;
        if (WebEngageUtils.b(str)) {
            concat = "Event Name is Invalid";
        } else {
            if (!str.startsWith("we_")) {
                return true;
            }
            concat = "Found prefix \"we_\" in event name : ".concat(str);
        }
        Logger.e("WebEngage", concat);
        return false;
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Map<String, ? extends Object> map) {
        track(str, map, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Map<String, ?> map, Analytics.Options options) {
        if (a(str)) {
            a(l.a(str, null, map, options != null ? options.toMap() : null, this.f12538a));
        }
    }
}
