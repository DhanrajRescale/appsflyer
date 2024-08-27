package ml;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import nl.a0;
import nl.j0;
import nl.n0;
import nl.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27823a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f27824b = new HashMap();

    public static final void a(String str) {
        if (sl.a.b(b.class)) {
            return;
        }
        try {
            f27823a.b(str);
        } catch (Throwable th2) {
            sl.a.a(b.class, th2);
        }
    }

    public static final boolean c() {
        if (sl.a.b(b.class)) {
            return false;
        }
        try {
            a0 a0Var = a0.f28827a;
            y b10 = a0.b(FacebookSdk.getApplicationId());
            if (b10 == null) {
                return false;
            }
            if (!b10.f28968c.contains(j0.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            sl.a.a(b.class, th2);
            return false;
        }
    }

    public final void b(String str) {
        if (sl.a.b(this)) {
            return;
        }
        HashMap hashMap = f27824b;
        try {
            NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) hashMap.get(str);
            if (registrationListener != null) {
                Object systemService = FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
                if (systemService != null) {
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException e10) {
                        n0.E("ml.b", e10);
                    }
                    hashMap.remove(str);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final boolean d(String str) {
        if (sl.a.b(this)) {
            return false;
        }
        try {
            HashMap hashMap = f27824b;
            if (hashMap.containsKey(str)) {
                return true;
            }
            String str2 = "fbsdk_" + Intrinsics.i(s.o(FacebookSdk.getSdkVersion(), '.', '|'), "android-") + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
            if (systemService != null) {
                a aVar = new a(str2, str);
                hashMap.put(str, aVar);
                ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return false;
        }
    }
}
