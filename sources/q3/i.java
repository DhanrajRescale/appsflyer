package q3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f31616a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f31617b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31618c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31619d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31620e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31621f = false;

    public i(Activity activity) {
        this.f31617b = activity;
        this.f31618c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f31617b == activity) {
            this.f31617b = null;
            this.f31620e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f31620e && !this.f31621f && !this.f31619d) {
            Object obj = this.f31616a;
            try {
                Object obj2 = j.f31624c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f31618c) {
                    j.f31628g.postAtFrontOfQueue(new m.j(j.f31623b.get(activity), obj2, 4));
                    this.f31621f = true;
                    this.f31616a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f31617b == activity) {
            this.f31619d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
