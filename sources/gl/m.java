package gl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import ek.u;
import kotlin.jvm.internal.Intrinsics;
import nl.e0;
import xk.g0;
import yk.p;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f17484a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f17485b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final void b(String activityName, String str, Context context) {
        if (sl.a.b(m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bundle.putString("fb_mobile_pckg_fp", f17484a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", al.d.n0(context));
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            yk.m loggerImpl = new yk.m(activityName, str);
            Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                loggerImpl.d("fb_mobile_activate_app", bundle);
            }
            if (yk.m.f41703c.r() != yk.k.f41699b && !sl.a.b(loggerImpl)) {
                try {
                    u uVar = yk.i.f41694a;
                    yk.i.c(p.f41714a);
                } catch (Throwable th2) {
                    sl.a.a(loggerImpl, th2);
                }
            }
        } catch (Throwable th3) {
            sl.a.a(m.class, th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057 A[Catch: all -> 0x002e, TryCatch #2 {all -> 0x002e, blocks: (B:6:0x000f, B:9:0x0015, B:11:0x001b, B:13:0x0021, B:16:0x002b, B:19:0x003b, B:20:0x003f, B:22:0x0043, B:25:0x0048, B:28:0x0057, B:29:0x005b, B:33:0x008f, B:36:0x00ad, B:40:0x00b5, B:43:0x00c7, B:45:0x00ed, B:52:0x0104, B:57:0x00c3, B:70:0x008b, B:72:0x0027, B:73:0x0031, B:48:0x00f4, B:60:0x007a, B:62:0x0080), top: B:5:0x000f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #2 {all -> 0x002e, blocks: (B:6:0x000f, B:9:0x0015, B:11:0x001b, B:13:0x0021, B:16:0x002b, B:19:0x003b, B:20:0x003f, B:22:0x0043, B:25:0x0048, B:28:0x0057, B:29:0x005b, B:33:0x008f, B:36:0x00ad, B:40:0x00b5, B:43:0x00c7, B:45:0x00ed, B:52:0x0104, B:57:0x00c3, B:70:0x008b, B:72:0x0027, B:73:0x0031, B:48:0x00f4, B:60:0x007a, B:62:0x0080), top: B:5:0x000f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:6:0x000f, B:9:0x0015, B:11:0x001b, B:13:0x0021, B:16:0x002b, B:19:0x003b, B:20:0x003f, B:22:0x0043, B:25:0x0048, B:28:0x0057, B:29:0x005b, B:33:0x008f, B:36:0x00ad, B:40:0x00b5, B:43:0x00c7, B:45:0x00ed, B:52:0x0104, B:57:0x00c3, B:70:0x008b, B:72:0x0027, B:73:0x0031, B:48:0x00f4, B:60:0x007a, B:62:0x0080), top: B:5:0x000f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3 A[Catch: all -> 0x002e, TryCatch #2 {all -> 0x002e, blocks: (B:6:0x000f, B:9:0x0015, B:11:0x001b, B:13:0x0021, B:16:0x002b, B:19:0x003b, B:20:0x003f, B:22:0x0043, B:25:0x0048, B:28:0x0057, B:29:0x005b, B:33:0x008f, B:36:0x00ad, B:40:0x00b5, B:43:0x00c7, B:45:0x00ed, B:52:0x0104, B:57:0x00c3, B:70:0x008b, B:72:0x0027, B:73:0x0031, B:48:0x00f4, B:60:0x007a, B:62:0x0080), top: B:5:0x000f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(java.lang.String r21, gl.l r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.m.d(java.lang.String, gl.l, java.lang.String):void");
    }

    public final String a(Context context) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String i10 = Intrinsics.i(packageManager.getPackageInfo(context.getPackageName(), 0).versionName, "PCKGCHKSUM;");
            SharedPreferences sharedPreferences = context.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0);
            String string = sharedPreferences.getString(i10, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String b10 = k.b(context);
            if (b10 == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                b10 = k.a(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(i10, b10).apply();
            return b10;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final void c() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            e0.f28850c.r(g0.f40374e, "gl.m", "Clock skew detected");
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
