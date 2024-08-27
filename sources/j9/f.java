package j9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import com.assetgro.stockgro.data.TokenInvalidationInterceptor;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21146c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f21144a = i10;
        this.f21146c = obj;
        this.f21145b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i10;
        ComponentName startService;
        String str2 = null;
        switch (this.f21144a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f21146c;
                String str3 = (String) this.f21145b;
                if (lottieAnimationView.f8368m) {
                    Context context = lottieAnimationView.getContext();
                    HashMap hashMap = o.f21198a;
                    return o.b(context, str3, "asset_" + str3);
                }
                return o.b(lottieAnimationView.getContext(), str3, null);
            case 1:
                String str4 = (String) this.f21145b;
                String str5 = (String) this.f21146c;
                HashMap hashMap2 = o.f21198a;
                bv.e0 v10 = hl.f.v(hl.f.Z0(new ByteArrayInputStream(str4.getBytes())));
                String[] strArr = v9.c.f37801e;
                return o.d(new v9.d(v10), str5, true);
            case 2:
                return o.c((InputStream) this.f21146c, (String) this.f21145b);
            case 3:
                nl.d0 this$0 = (nl.d0) this.f21146c;
                Callable callable = (Callable) this.f21145b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(callable, "$callable");
                try {
                    this$0.f28847a = callable.call();
                    return null;
                } finally {
                    CountDownLatch countDownLatch = this$0.f28848b;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            case 4:
                Context context2 = (Context) this.f21146c;
                Intent intent = (Intent) this.f21145b;
                Object obj = com.google.firebase.messaging.h.f11753c;
                com.google.firebase.messaging.t q10 = com.google.firebase.messaging.t.q();
                q10.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((Queue) q10.f11785e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context2.getPackageName());
                synchronized (q10) {
                    try {
                        Object obj2 = q10.f11782b;
                        if (((String) obj2) != null) {
                            str2 = (String) obj2;
                        } else {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(".")) {
                                        q10.f11782b = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        q10.f11782b = serviceInfo.name;
                                    }
                                    str2 = (String) q10.f11782b;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context2.getPackageName(), str2);
                }
                try {
                    if (q10.t(context2)) {
                        startService = com.google.firebase.messaging.d0.b(context2, intent2);
                    } else {
                        startService = context2.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i10 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i10 = TokenInvalidationInterceptor.InvalidatedTokenResponseCode;
                }
                return Integer.valueOf(i10);
            case 5:
                ir.b bVar = (ir.b) this.f21146c;
                mn.f fVar = (mn.f) this.f21145b;
                jr.l lVar = bVar.f20506i;
                synchronized (lVar.f21627b) {
                    lVar.f21626a.edit().putLong("fetch_timeout_in_seconds", fVar.f27852a).putLong("minimum_fetch_interval_in_seconds", fVar.f27853b).commit();
                }
                return null;
            default:
                jr.d dVar = (jr.d) this.f21146c;
                jr.e eVar = (jr.e) this.f21145b;
                jr.o oVar = dVar.f21588b;
                synchronized (oVar) {
                    FileOutputStream openFileOutput = oVar.f21649a.openFileOutput(oVar.f21650b, 0);
                    try {
                        openFileOutput.write(eVar.f21591a.toString().getBytes("UTF-8"));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
        }
    }

    public /* synthetic */ f(String str, String str2) {
        this.f21144a = 1;
        this.f21145b = str;
        this.f21146c = str2;
    }
}
