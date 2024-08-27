package yk;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import in.juspay.hyper.constants.LogCategory;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import nl.e0;
import nl.n0;
import org.json.JSONException;
import xk.g0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c */
    public static final ek.e f41703c = new ek.e(21, 0);

    /* renamed from: d */
    public static final String f41704d;

    /* renamed from: e */
    public static ScheduledThreadPoolExecutor f41705e;

    /* renamed from: f */
    public static final Object f41706f;

    /* renamed from: g */
    public static String f41707g;

    /* renamed from: h */
    public static boolean f41708h;

    /* renamed from: a */
    public final String f41709a;

    /* renamed from: b */
    public final b f41710b;

    static {
        String canonicalName = m.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f41704d = canonicalName;
        f41706f = new Object();
    }

    public m(String activityName, String str) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        n0.R();
        this.f41709a = activityName;
        Date date = xk.a.f40309l;
        xk.a accessToken = ek.h.q();
        if (accessToken == null || new Date().after(accessToken.f40312a) || !(str == null || Intrinsics.a(str, accessToken.f40319h))) {
            if (str == null) {
                n0.K(FacebookSdk.getApplicationContext(), LogCategory.CONTEXT);
                str = FacebookSdk.getApplicationId();
            }
            if (str != null) {
                this.f41710b = new b(null, str);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            this.f41710b = new b(accessToken.f40316e, FacebookSdk.getApplicationId());
        }
        ek.e.t();
    }

    public static final /* synthetic */ String a() {
        if (sl.a.b(m.class)) {
            return null;
        }
        try {
            return f41707g;
        } catch (Throwable th2) {
            sl.a.a(m.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (sl.a.b(m.class)) {
            return null;
        }
        try {
            return f41705e;
        } catch (Throwable th2) {
            sl.a.a(m.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ Object c() {
        if (sl.a.b(m.class)) {
            return null;
        }
        try {
            return f41706f;
        } catch (Throwable th2) {
            sl.a.a(m.class, th2);
            return null;
        }
    }

    public final void d(String str, Bundle bundle) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, false, gl.b.b());
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final void e(String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        boolean z11;
        if (!sl.a.b(this) && str != null) {
            try {
                if (str.length() != 0) {
                    AtomicBoolean atomicBoolean = nl.w.f28946a;
                    boolean b10 = nl.w.b("app_events_killswitch", FacebookSdk.getApplicationId(), false);
                    g0 g0Var = g0.f40374e;
                    if (b10) {
                        e0.f28850c.s(g0Var, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                        return;
                    }
                    try {
                        fl.b.e(bundle, str);
                        fl.d.b(bundle);
                        String str2 = this.f41709a;
                        if (gl.b.f17459j == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ek.e.d(new e(str2, str, d10, bundle, z10, z11, uuid), this.f41710b);
                    } catch (FacebookException e10) {
                        e0.f28850c.s(g0Var, "AppEvents", "Invalid app event: %s", e10.toString());
                    } catch (JSONException e11) {
                        e0.f28850c.s(g0Var, "AppEvents", "JSON encoding for app event failed: '%s'", e11.toString());
                    }
                }
            } catch (Throwable th2) {
                sl.a.a(this, th2);
            }
        }
    }

    public final void f(String str, Bundle bundle) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, true, gl.b.b());
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final void g(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (sl.a.b(this)) {
            return;
        }
        ek.e eVar = f41703c;
        g0 g0Var = g0.f40375f;
        try {
            if (bigDecimal == null) {
                e0.f28850c.r(g0Var, "AppEvents", "purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                e0.f28850c.r(g0Var, "AppEvents", "currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, gl.b.b());
            if (eVar.r() != k.f41699b) {
                ek.u uVar = i.f41694a;
                i.c(p.f41717d);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public m(Context context, String str) {
        this(n0.l(context), str);
    }
}
