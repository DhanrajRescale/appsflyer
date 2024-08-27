package xk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f40356a;

    /* renamed from: b, reason: collision with root package name */
    public String f40357b;

    /* renamed from: c, reason: collision with root package name */
    public int f40358c;

    /* renamed from: d, reason: collision with root package name */
    public int f40359d;

    /* renamed from: e, reason: collision with root package name */
    public Object f40360e;

    public static String b(pp.g gVar) {
        gVar.a();
        pp.h hVar = gVar.f31273c;
        String str = hVar.f31284e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = hVar.f31281b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.f40356a == null) {
                e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f40356a;
    }

    public final PackageInfo c(String str) {
        try {
            return ((Context) this.f40360e).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public final boolean d() {
        synchronized (this) {
            int i10 = this.f40359d;
            if (i10 == 0) {
                PackageManager packageManager = ((Context) this.f40360e).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    return false;
                }
                if (!PlatformVersion.isAtLeastO()) {
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                    if (queryIntentServices != null && queryIntentServices.size() > 0) {
                        this.f40359d = 1;
                        return true;
                    }
                }
                Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                intent2.setPackage("com.google.android.gms");
                List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                    this.f40359d = 2;
                    return true;
                }
                Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                if (PlatformVersion.isAtLeastO()) {
                    this.f40359d = 2;
                } else {
                    this.f40359d = 1;
                }
                i10 = this.f40359d;
            }
            if (i10 != 0) {
                return true;
            }
            return false;
        }
    }

    public final synchronized void e() {
        PackageInfo c10 = c(((Context) this.f40360e).getPackageName());
        if (c10 != null) {
            this.f40356a = Integer.toString(c10.versionCode);
            this.f40357b = c10.versionName;
        }
    }
}
