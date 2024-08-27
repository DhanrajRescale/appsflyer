package ls;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: h, reason: collision with root package name */
    public static Double f25280h;

    /* renamed from: b, reason: collision with root package name */
    public o0 f25282b;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f25285e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f25286f;

    /* renamed from: g, reason: collision with root package name */
    public WeakReference f25287g;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f25281a = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public boolean f25283c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25284d = true;

    public p0(n0 n0Var, d0 d0Var) {
        this.f25285e = n0Var;
        this.f25286f = d0Var;
        if (f25280h == null) {
            f25280h = Double.valueOf(System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f25284d = true;
        o0 o0Var = this.f25282b;
        Handler handler = this.f25281a;
        if (o0Var != null) {
            handler.removeCallbacks(o0Var);
        }
        this.f25287g = null;
        o0 o0Var2 = new o0(this, 0);
        this.f25282b = o0Var2;
        handler.postDelayed(o0Var2, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        JSONArray jSONArray;
        if (this.f25286f.f25165q) {
            l0 l0Var = this.f25285e.f25263e;
            n nVar = l0Var.f25236a.f25268j;
            synchronized (nVar) {
                jSONArray = nVar.f25251h;
            }
            l0Var.f25236a.f25264f.j(jSONArray);
        }
        this.f25287g = new WeakReference(activity);
        this.f25284d = false;
        boolean z10 = !this.f25283c;
        this.f25283c = true;
        o0 o0Var = this.f25282b;
        if (o0Var != null) {
            this.f25281a.removeCallbacks(o0Var);
        }
        if (z10) {
            f25280h = Double.valueOf(System.currentTimeMillis());
            this.f25285e.f25272n.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intent intent = activity.getIntent();
        n0 n0Var = this.f25285e;
        if (intent != null && intent.hasExtra("mp_campaign_id") && intent.hasExtra("mp_message_id")) {
            n0.p(n0Var.f25259a, intent, "$app_open", new JSONObject());
        }
        if (this.f25286f.f25165q) {
            l0 l0Var = n0Var.f25263e;
            l0Var.getClass();
            activity.runOnUiThread(new k0(l0Var, null, activity));
        }
        new ll.f(n0Var, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
