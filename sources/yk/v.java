package yk;

import android.content.SharedPreferences;
import in.juspay.hypersdk.analytics.LogPusherExp;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41734c;

    public /* synthetic */ v(String str, String str2, int i10) {
        this.f41732a = i10;
        this.f41733b = str;
        this.f41734c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f41732a;
        String value = this.f41734c;
        String key = this.f41733b;
        switch (i10) {
            case 0:
                if (!sl.a.b(w.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(key, "$key");
                        Intrinsics.checkNotNullParameter(value, "$value");
                        if (!w.f41737c.get()) {
                            w.f41735a.b();
                        }
                        SharedPreferences sharedPreferences = w.f41736b;
                        if (sharedPreferences != null) {
                            sharedPreferences.edit().putString(key, value).apply();
                            return;
                        } else {
                            Intrinsics.k("sharedPreferences");
                            throw null;
                        }
                    } catch (Throwable th2) {
                        sl.a.a(w.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(key, "$queriedEvent");
                Intrinsics.checkNotNullParameter(value, "$buttonText");
                HashSet hashSet = kl.f.f23258e;
                androidx.work.u.A(key, value, new float[0]);
                return;
            default:
                LogPusherExp.lambda$addLogLines$3(key, value);
                return;
        }
    }
}
