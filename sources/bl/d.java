package bl;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.work.u;
import com.facebook.FacebookSdk;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.messaging.f0;
import com.webengage.sdk.android.callbacks.LifeCycleCallbacks;
import in.juspay.hypersdk.safe.Godel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.r;
import nl.v;
import nl.w;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import xk.e0;
import xk.z;
import yk.n;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7086b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f7085a = i10;
        this.f7086b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String a10;
        Locale locale = null;
        boolean z10 = true;
        switch (this.f7085a) {
            case 0:
                String str = (String) this.f7086b;
                String str2 = "0";
                if (!sl.a.b(e.class)) {
                    try {
                        Bundle bundle = new Bundle();
                        Context applicationContext = FacebookSdk.getApplicationContext();
                        String str3 = nl.c.f28837f;
                        nl.c h10 = ll.e.h(applicationContext);
                        JSONArray jSONArray = new JSONArray();
                        String str4 = Build.MODEL;
                        if (str4 == null) {
                            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        jSONArray.put(str4);
                        if (h10 == null) {
                            a10 = null;
                        } else {
                            a10 = h10.a();
                        }
                        if (a10 != null) {
                            jSONArray.put(h10.a());
                        } else {
                            jSONArray.put(HttpUrl.FRAGMENT_ENCODE_SET);
                        }
                        jSONArray.put("0");
                        if (gl.c.c()) {
                            str2 = "1";
                        }
                        jSONArray.put(str2);
                        try {
                            locale = FacebookSdk.getApplicationContext().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                        }
                        jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
                        String jSONArray2 = jSONArray.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONArray2, "extInfoArray.toString()");
                        bundle.putString("device_session_id", e.a());
                        bundle.putString("extinfo", jSONArray2);
                        String str5 = z.f40475j;
                        String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                        JSONObject jSONObject = new z(null, format, bundle, e0.f40354b, null).c().f40343b;
                        AtomicBoolean atomicBoolean = e.f7093g;
                        if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                            z10 = false;
                        }
                        atomicBoolean.set(z10);
                        if (!atomicBoolean.get()) {
                            e.f7091e = null;
                        } else {
                            l lVar = e.f7090d;
                            if (lVar != null) {
                                lVar.c();
                            }
                        }
                        e.f7094h = false;
                        return;
                    } catch (Throwable th2) {
                        sl.a.a(e.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                h this$0 = (h) this.f7086b;
                u uVar = h.f7101f;
                if (!sl.a.b(h.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.b();
                        return;
                    } catch (Throwable th3) {
                        sl.a.a(h.class, th3);
                        return;
                    }
                }
                return;
            case 2:
                kl.e this$02 = (kl.e) this.f7086b;
                ek.e eVar = kl.e.f23253d;
                if (!sl.a.b(kl.e.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                        try {
                            View b10 = gl.c.b((Activity) this$02.f23255a.get());
                            Activity activity = (Activity) this$02.f23255a.get();
                            if (b10 != null && activity != null) {
                                Iterator it = kl.c.a(b10).iterator();
                                while (it.hasNext()) {
                                    View view = (View) it.next();
                                    if (!cl.f.b(view)) {
                                        String d10 = kl.c.d(view);
                                        if (d10.length() > 0 && d10.length() <= 300) {
                                            HashSet hashSet = kl.f.f23258e;
                                            String localClassName = activity.getLocalClassName();
                                            Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
                                            u.q(view, b10, localClassName);
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    } catch (Throwable th4) {
                        sl.a.a(kl.e.class, th4);
                        return;
                    }
                }
                return;
            case 3:
                r.g((r) this.f7086b);
                return;
            case 4:
                nl.u uVar2 = (nl.u) this.f7086b;
                AtomicBoolean atomicBoolean2 = w.f28946a;
                uVar2.getClass();
                v vVar = v.f28944a;
                uVar2.f28941a.f(v.b(uVar2.f28942b));
                return;
            case 5:
                n nVar = (n) this.f7086b;
                a0 a0Var = a0.f28827a;
                nVar.getClass();
                return;
            case 6:
                wl.i this$03 = (wl.i) this.f7086b;
                int i10 = wl.i.f39198l;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.w();
                return;
            case 7:
                cm.f fVar = (cm.f) this.f7086b;
                fVar.f8238e = 0L;
                fVar.f8237d.setVisibility(8);
                fVar.f8235b.setVisibility(8);
                return;
            case 8:
                ((em.h) ((zl.e) this.f7086b).f42570f).f15716h.setVisibility(0);
                return;
            case 9:
                gm.f fVar2 = (gm.f) this.f7086b;
                int i11 = gm.f.f17510m;
                fVar2.p();
                return;
            case 10:
                on.i iVar = (on.i) this.f7086b;
                iVar.getClass();
                ((pn.j) iVar.f30150d).g(new dj.e(iVar, 16));
                return;
            case 11:
            default:
                ((Godel) this.f7086b).resetWebView();
                return;
            case 12:
                ao.d dVar = (ao.d) this.f7086b;
                dVar.f2654c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) dVar.f2656e;
                l4.e eVar2 = sideSheetBehavior.f11418i;
                if (eVar2 != null && eVar2.g()) {
                    dVar.a(dVar.f2653b);
                    return;
                } else {
                    if (sideSheetBehavior.f11417h == 2) {
                        sideSheetBehavior.s(dVar.f2653b);
                        return;
                    }
                    return;
                }
            case 13:
                ((zo.c) this.f7086b).t(true);
                return;
            case 14:
                zo.i iVar2 = (zo.i) this.f7086b;
                boolean isPopupShowing = iVar2.f42601h.isPopupShowing();
                iVar2.t(isPopupShowing);
                iVar2.f42606m = isPopupShowing;
                return;
            case 15:
                nq.c cVar = (nq.c) this.f7086b;
                Object obj = nq.c.f29079m;
                cVar.a(false);
                return;
            case 16:
                com.google.firebase.messaging.u uVar3 = (com.google.firebase.messaging.u) this.f7086b;
                synchronized (((ArrayDeque) uVar3.f11790e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) uVar3.f11787b).edit();
                    String str6 = (String) uVar3.f11788c;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it2 = ((ArrayDeque) uVar3.f11790e).iterator();
                    while (it2.hasNext()) {
                        sb2.append((String) it2.next());
                        sb2.append((String) uVar3.f11789d);
                    }
                    edit.putString(str6, sb2.toString()).commit();
                }
                return;
            case 17:
                f0 f0Var = (f0) this.f7086b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + f0Var.f11744a.getAction() + " Releasing WakeLock.");
                f0Var.f11745b.trySetResult(null);
                return;
            case 18:
                com.webengage.sdk.android.i.d((LifeCycleCallbacks) this.f7086b);
                return;
        }
    }
}
