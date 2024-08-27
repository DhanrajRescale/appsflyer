package os;

import android.app.Activity;
import android.app.Application;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public final class q implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final j f30365a = new j(this);

    /* renamed from: b, reason: collision with root package name */
    public final p f30366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f30367c;

    public q(u uVar) {
        this.f30367c = uVar;
        this.f30366b = new p(uVar);
    }

    public static boolean a() {
        String str = Build.HARDWARE;
        if (!str.toLowerCase().equals("goldfish") && !str.toLowerCase().equals("ranchu")) {
            return false;
        }
        String str2 = Build.BRAND;
        if ((!str2.toLowerCase().startsWith("generic") && !str2.toLowerCase().equals(LogSubCategory.LifeCycle.ANDROID) && !str2.toLowerCase().equals("google")) || !Build.DEVICE.toLowerCase().startsWith("generic") || !Build.PRODUCT.toLowerCase().contains(PaymentConstants.Category.SDK) || !Build.MODEL.toLowerCase(Locale.US).contains(PaymentConstants.Category.SDK)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        com.google.firebase.messaging.t tVar = this.f30367c.f30396e;
        tVar.getClass();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            ((Set) tVar.f11782b).remove(activity);
            if (a() && !this.f30367c.f30392a.f25156h) {
                p pVar = this.f30366b;
                pVar.f30363a = true;
                pVar.f30364b.f30399h.removeCallbacks(pVar);
                return;
            } else {
                if (!this.f30367c.f30392a.f25155g) {
                    ((SensorManager) activity.getSystemService("sensor")).unregisterListener(this.f30365a);
                    return;
                }
                return;
            }
        }
        throw new RuntimeException("Can't remove an activity when not on the UI thread");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (a() && !this.f30367c.f30392a.f25156h) {
            p pVar = this.f30366b;
            pVar.f30363a = false;
            pVar.f30364b.f30399h.post(pVar);
        } else if (!this.f30367c.f30392a.f25155g) {
            SensorManager sensorManager = (SensorManager) activity.getSystemService("sensor");
            sensorManager.registerListener(this.f30365a, sensorManager.getDefaultSensor(1), 3);
        }
        com.google.firebase.messaging.t tVar = this.f30367c.f30396e;
        tVar.getClass();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            ((Set) tVar.f11782b).add(activity);
            tVar.c();
            return;
        }
        throw new RuntimeException("Can't add an activity when not on the UI thread");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
