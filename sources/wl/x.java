package wl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f39298d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a, reason: collision with root package name */
    public final String f39299a;

    /* renamed from: b, reason: collision with root package name */
    public final yk.r f39300b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39301c;

    public x(Context context, String applicationId) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f39299a = applicationId;
        this.f39300b = new yk.r(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f39301c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(String str, String str2) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Bundle a10 = ll.e.a(HttpUrl.FRAGMENT_ENCODE_SET);
            a10.putString("2_result", "error");
            a10.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            a10.putString("3_method", str2);
            this.f39300b.a(a10, str);
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
