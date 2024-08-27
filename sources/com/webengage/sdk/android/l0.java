package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.actions.database.r;
import com.webengage.sdk.android.utils.Provider;
import com.webengage.sdk.android.utils.WebEngageUtils;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class l0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    Context f12614a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f12615b = null;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Analytics f12616a;

        public a(Analytics analytics) {
            this.f12616a = analytics;
        }

        @Override // java.lang.Runnable
        public void run() {
            long b10 = this.f12616a.a().b();
            r.b(false);
            this.f12616a.b().a(b10);
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12618a;

        static {
            int[] iArr = new int[j0.values().length];
            f12618a = iArr;
            try {
                iArr[j0.f12598b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12618a[j0.f12604h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12618a[j0.f12605i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12618a[j0.f12599c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12618a[j0.f12600d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12618a[j0.f12610n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12618a[j0.f12608l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12618a[j0.f12609m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12618a[j0.f12597a.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12618a[j0.f12611o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public l0(Context context) {
        this.f12614a = null;
        this.f12614a = context.getApplicationContext();
    }

    private void a(Analytics analytics) {
        String str;
        if (analytics.a().b("webengage_volatile_prefs.txt").contains("referrer")) {
            try {
                str = URLDecoder.decode(analytics.a().c("referrer"), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            analytics.a().d("referrer");
            HashMap hashMap = new HashMap();
            if (!str.isEmpty()) {
                hashMap.put("referrer", str);
                hashMap.putAll(new o().a(str));
            }
            WebEngage.startService(q.a(j0.f12598b, l.b("app_installed", hashMap, null, null, this.f12614a), this.f12614a), this.f12614a);
        }
    }

    private void b(Analytics analytics) {
        int o10 = analytics.a().o();
        PackageInfo e10 = WebEngageUtils.e(this.f12614a);
        if (e10 != null) {
            int i10 = e10.versionCode;
            if (o10 != -1 && o10 != i10) {
                HashMap hashMap = new HashMap();
                da.e.v(o10, hashMap, "app_version_code_old", i10, "app_version_code_new");
                WebEngage.startService(q.a(j0.f12598b, l.b("app_upgraded", null, hashMap, null, this.f12614a), this.f12614a), this.f12614a);
                i.a(this.f12614a).onAppUpgraded(this.f12614a, o10, i10);
            }
            analytics.a().a(e10.versionCode);
        }
    }

    @Override // com.webengage.sdk.android.k0
    public void a(j0 j0Var, Object obj) {
        d0 b10;
        long currentTimeMillis;
        Analytics a10 = c.a(this.f12614a);
        long j10 = 60000;
        switch (b.f12618a[j0Var.ordinal()]) {
            case 1:
            case 2:
                n nVar = (n) obj;
                if (LogSubCategory.Action.SYSTEM.equals(nVar.b())) {
                    a(nVar);
                    if (j0.f12598b.equals(j0Var) && "background".equals(DataHolder.get().m())) {
                        WebEngage.get().c((BroadcastReceiver) null);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                a10.c().d();
                return;
            case 4:
            default:
                return;
            case 5:
                if (DataHolder.get().E()) {
                    a10.b().b(System.currentTimeMillis() + 120000);
                }
                if (DataHolder.get().G()) {
                    a10.c().e();
                    DataHolder.get().b("refreshSessionPageRule", Boolean.FALSE);
                    return;
                }
                return;
            case 6:
                if (!DataHolder.get().E()) {
                    b10 = a10.b();
                    currentTimeMillis = System.currentTimeMillis();
                    j10 = 10800000;
                } else if (DataHolder.get().C() != null) {
                    b10 = a10.b();
                    currentTimeMillis = System.currentTimeMillis();
                    j10 = 15000;
                } else {
                    b10 = a10.b();
                    currentTimeMillis = System.currentTimeMillis();
                }
                b10.c(currentTimeMillis + j10);
                return;
            case 7:
                ArrayList arrayList = new ArrayList();
                arrayList.add(com.webengage.sdk.android.actions.database.f.USER.toString());
                arrayList.add("cuid");
                String str = (String) DataHolder.get().a(arrayList);
                if (!a10.a().d().isEmpty() && ((str == null || str.isEmpty()) && DataHolder.get().E())) {
                    a10.b().e(System.currentTimeMillis() + 60000);
                    break;
                }
                break;
            case 8:
                break;
            case 9:
                a10.c().e();
                try {
                    a(a10);
                    b(a10);
                } catch (Exception e10) {
                    Logger.e("WebEngage", "Exception while checking for app install and app upgrade events", e10);
                }
                d0 b11 = a10.b();
                if (b11.d()) {
                    return;
                }
                b11.a(a10.a().b());
                return;
            case 10:
                a10.a().a();
                if (this.f12615b == null) {
                    this.f12615b = new ScheduledThreadPoolExecutor(1);
                }
                this.f12615b.schedule(new a(a10), 30000L, TimeUnit.MILLISECONDS);
                return;
        }
        a10.c().e();
    }

    private void a(n nVar) {
        String d10 = nVar.d();
        Analytics a10 = c.a(this.f12614a);
        if (d10 != null) {
            if ("user_logged_out".equals(d10)) {
                if (DataHolder.get().E()) {
                    long g10 = DataHolder.get().g();
                    if (g10 != -1) {
                        DataHolder.get().a(System.currentTimeMillis());
                        a10.c().a(System.currentTimeMillis() - g10);
                    }
                }
                a10.c().c();
                a10.a().i(HttpUrl.FRAGMENT_ENCODE_SET);
                ((o0) n0.a(this.f12614a, a10)).a();
                String d11 = a10.a().d();
                com.webengage.sdk.android.actions.database.y b10 = com.webengage.sdk.android.actions.database.y.b(this.f12614a);
                if (d11.isEmpty()) {
                    d11 = a10.a().g();
                }
                Map<String, Object> a11 = b10.a(d11);
                if (a11 != null && a11.size() > 0) {
                    DataHolder.get().c(a11);
                }
                if (DataHolder.get().E()) {
                    a10.c().b();
                } else {
                    a10.c().a();
                }
                a10.b().b();
                return;
            }
            if ("visitor_session_close".equals(d10)) {
                return;
            }
            if ("user_logged_in".equals(d10)) {
                a10.b().e(System.currentTimeMillis() + 60000);
                return;
            }
            if ("notification_control_group".equals(d10)) {
                DataHolder.get().c(false);
                return;
            }
            if ("app_upgraded".equals(d10)) {
                HashMap hashMap = new HashMap();
                String h10 = a10.a().h();
                if (!WebEngageUtils.c(h10)) {
                    hashMap.put("gcm_regId", h10);
                    hashMap.put("gcm_project_number", null);
                    hashMap.put("provider", Provider.FCM.name());
                    WebEngage.startService(q.a(j0.f12598b, l.b("gcm_registered", null, hashMap, null, this.f12614a), this.f12614a), this.f12614a);
                }
                HashMap hashMap2 = new HashMap();
                String p10 = a10.a().p();
                if (!WebEngageUtils.c(p10)) {
                    hashMap.put("gcm_regId", p10);
                    hashMap.put("gcm_project_number", null);
                    hashMap.put("provider", Provider.MI.name());
                    WebEngage.startService(q.a(j0.f12598b, l.b("gcm_registered", null, hashMap2, null, this.f12614a), this.f12614a), this.f12614a);
                }
                HashMap hashMap3 = new HashMap();
                String e10 = a10.a().e();
                if (WebEngageUtils.c(e10)) {
                    return;
                }
                hashMap.put("gcm_regId", e10);
                hashMap.put("gcm_project_number", null);
                hashMap.put("provider", Provider.HW.name());
                WebEngage.startService(q.a(j0.f12598b, l.b("gcm_registered", null, hashMap3, null, this.f12614a), this.f12614a), this.f12614a);
            }
        }
    }

    @Override // com.webengage.sdk.android.k0
    public boolean b(j0 j0Var, Object obj) {
        JSONObject jSONObject;
        Analytics a10 = c.a(this.f12614a);
        if (a10.a().f().isEmpty()) {
            String str = this.f12614a.getPackageName() + "|" + WebEngageUtils.b(this.f12614a);
            a10.a().b(false);
            Logger.d("WebEngage", "preAnalyzeSystemEvent INTERFACE_ID: " + str);
            a10.a().j(str);
        }
        int i10 = b.f12618a[j0Var.ordinal()];
        if (i10 == 1 || i10 == 2) {
            n nVar = (n) obj;
            if (LogSubCategory.Action.SYSTEM.equals(nVar.b())) {
                return b(nVar);
            }
        } else if (i10 == 4) {
            Bundle bundle = (Bundle) obj;
            if ("show_system_tray_notification".equalsIgnoreCase(bundle.getString("message_action"))) {
                try {
                    jSONObject = new JSONObject(bundle.getString("message_data"));
                } catch (JSONException e10) {
                    Logger.e("WebEngage", "Exception while parsing push message_data for deduping", e10);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    String optString = jSONObject.optString("experimentId");
                    String optString2 = jSONObject.optString("identifier");
                    f a11 = c.a(this.f12614a).a();
                    Set<String> l10 = a11.l();
                    if (l10 != null && l10.contains(optString)) {
                        Logger.d("WebEngage", jr.h.s("Push {id: ", optString2, ", experiment-id: ", optString, "} is already shown, hence not rendering."));
                        return false;
                    }
                    a11.g(optString);
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if ("background".equals(r0) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if ("background".equals(r0) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(com.webengage.sdk.android.n r17) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.l0.b(com.webengage.sdk.android.n):boolean");
    }
}
