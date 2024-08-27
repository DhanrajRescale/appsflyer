package il;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import ek.h;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.n0;
import nl.w;
import nl.y;
import nl.z;
import org.json.JSONException;
import org.json.JSONObject;
import vt.i0;
import yk.l;
import yk.m;
import yk.r;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f20094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20095d;

    public /* synthetic */ a(int i10, Context context, String str, String str2) {
        this.f20092a = i10;
        this.f20094c = context;
        this.f20093b = str;
        this.f20095d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar;
        JSONObject jSONObject;
        switch (this.f20092a) {
            case 0:
                Context context = this.f20094c;
                String str = this.f20093b;
                String applicationId = this.f20095d;
                if (!sl.a.b(b.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(context, "$context");
                        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                        String i10 = Intrinsics.i("pingForOnDevice", applicationId);
                        if (sharedPreferences.getLong(i10, 0L) == 0) {
                            if (!sl.a.b(g.class)) {
                                try {
                                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                                    g.f20110a.b(d.MOBILE_APP_INSTALL, applicationId, i0.f38321a);
                                } catch (Throwable th2) {
                                    sl.a.a(g.class, th2);
                                }
                            }
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(i10, System.currentTimeMillis());
                            edit.apply();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        sl.a.a(b.class, th3);
                        return;
                    }
                }
                return;
            case 1:
                AtomicBoolean atomicBoolean = w.f28946a;
                String applicationId2 = this.f20093b;
                Intrinsics.checkNotNullParameter(applicationId2, "$applicationId");
                Context context2 = this.f20094c;
                Intrinsics.checkNotNullParameter(context2, "$context");
                String gateKeepersKey = this.f20095d;
                Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
                JSONObject a10 = w.a();
                if (a10.length() != 0) {
                    w.d(applicationId2, a10);
                    context2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, a10.toString()).apply();
                    w.f28949d = Long.valueOf(System.currentTimeMillis());
                }
                w.e();
                w.f28946a.set(false);
                return;
            default:
                Context context3 = this.f20094c;
                String settingsKey = this.f20093b;
                String applicationId3 = this.f20095d;
                a0 a0Var = a0.f28827a;
                Intrinsics.checkNotNullParameter(context3, "$context");
                Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
                Intrinsics.checkNotNullParameter(applicationId3, "$applicationId");
                SharedPreferences sharedPreferences2 = context3.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                y yVar = null;
                String string = sharedPreferences2.getString(settingsKey, null);
                boolean A = n0.A(string);
                a0 a0Var2 = a0.f28827a;
                if (!A) {
                    if (string != null) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e10) {
                            n0.E("FacebookSDK", e10);
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            yVar = a0.e(applicationId3, jSONObject);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                JSONObject a11 = a0.a();
                a0.e(applicationId3, a11);
                sharedPreferences2.edit().putString(settingsKey, a11.toString()).apply();
                int i11 = 1;
                if (yVar != null) {
                    String str2 = yVar.f28974i;
                    if (!a0.f28832f && str2 != null && str2.length() > 0) {
                        a0.f28832f = true;
                        Log.w("a0", str2);
                    }
                }
                AtomicBoolean atomicBoolean2 = w.f28946a;
                Intrinsics.checkNotNullParameter(applicationId3, "applicationId");
                JSONObject a12 = w.a();
                FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(a3.a.m(new Object[]{applicationId3}, 1, "com.facebook.internal.APP_GATEKEEPERS.%s", "java.lang.String.format(format, *args)"), a12.toString()).apply();
                w.d(applicationId3, a12);
                r rVar = gl.g.f17468a;
                Context applicationContext = FacebookSdk.getApplicationContext();
                String applicationId4 = FacebookSdk.getApplicationId();
                if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                    if (applicationContext instanceof Application) {
                        h hVar = l.f41701b;
                        Application application = (Application) applicationContext;
                        Intrinsics.checkNotNullParameter(application, "application");
                        ek.e eVar = m.f41703c;
                        Intrinsics.checkNotNullParameter(application, "application");
                        if (FacebookSdk.isInitialized()) {
                            ReentrantReadWriteLock reentrantReadWriteLock = yk.c.f41677a;
                            if (!yk.c.f41679c) {
                                if (m.b() == null) {
                                    ek.e.t();
                                }
                                ScheduledThreadPoolExecutor b10 = m.b();
                                if (b10 != null) {
                                    b10.execute(new com.appsflyer.internal.l(i11));
                                } else {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                            }
                            yk.w wVar = yk.w.f41735a;
                            if (!sl.a.b(yk.w.class)) {
                                try {
                                    if (!yk.w.f41737c.get()) {
                                        yk.w.f41735a.b();
                                    }
                                } catch (Throwable th4) {
                                    sl.a.a(yk.w.class, th4);
                                }
                            }
                            if (applicationId4 == null) {
                                applicationId4 = FacebookSdk.getApplicationId();
                            }
                            FacebookSdk.publishInstallAsync(application, applicationId4);
                            gl.b.c(application, applicationId4);
                        } else {
                            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
                        }
                    } else {
                        Log.w("gl.g", "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                    }
                }
                AtomicReference atomicReference = a0.f28830d;
                if (a0.f28829c.containsKey(applicationId3)) {
                    zVar = z.f28982c;
                } else {
                    zVar = z.f28983d;
                }
                atomicReference.set(zVar);
                a0Var2.g();
                return;
        }
    }

    public /* synthetic */ a(Context context, String str, String str2) {
        this.f20092a = 1;
        this.f20093b = str;
        this.f20094c = context;
        this.f20095d = str2;
    }
}
