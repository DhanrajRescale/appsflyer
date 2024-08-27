package ls;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f25228a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f25229b;

    /* renamed from: c, reason: collision with root package name */
    public String f25230c;

    /* renamed from: d, reason: collision with root package name */
    public int f25231d;

    public k(Context context, n0 n0Var) {
        this.f25228a = n0Var;
        this.f25229b = context;
    }

    public final void a() {
        try {
            Object invoke = Class.forName("com.urbanairship.UAirship").getMethod("shared", new Class[0]).invoke(null, new Object[0]);
            Object invoke2 = invoke.getClass().getMethod("getPushManager", new Class[0]).invoke(invoke, new Object[0]);
            String str = (String) invoke2.getClass().getMethod("getChannelId", new Class[0]).invoke(invoke2, new Object[0]);
            if (str != null && !str.isEmpty()) {
                this.f25231d = 0;
                String str2 = this.f25230c;
                if (str2 != null) {
                    if (!str2.equals(str)) {
                    }
                }
                this.f25228a.f25263e.f(str, "$android_urban_airship_channel_id");
                this.f25230c = str;
            } else {
                int i10 = 1;
                int i11 = this.f25231d + 1;
                this.f25231d = i11;
                if (i11 <= 3) {
                    new Handler(Looper.getMainLooper()).postDelayed(new o0(this, i10), 2000L);
                }
            }
        } catch (ClassNotFoundException e10) {
            el.l.W0("MixpanelAPI.CnctInts", "Airship SDK not found but Urban Airship is integrated on Mixpanel", e10);
        } catch (IllegalAccessException e11) {
            el.l.N("MixpanelAPI.CnctInts", "method invocation failed", e11);
        } catch (NoSuchMethodException e12) {
            el.l.N("MixpanelAPI.CnctInts", "Airship SDK class exists but methods do not", e12);
        } catch (InvocationTargetException e13) {
            el.l.N("MixpanelAPI.CnctInts", "method invocation failed", e13);
        } catch (Exception e14) {
            el.l.N("MixpanelAPI.CnctInts", "Error setting Airship people property", e14);
        }
    }
}
