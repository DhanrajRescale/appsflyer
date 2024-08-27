package nl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.FacebookSdk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f28877a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    public static final String a() {
        if (sl.a.b(l.class)) {
            return null;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            List<ResolveInfo> queryIntentServices = applicationContext.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            String[] strArr = f28877a;
            Intrinsics.checkNotNullParameter(strArr, "<this>");
            HashSet hashSet = new HashSet(vt.o0.a(3));
            vt.v.w(hashSet, strArr);
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            sl.a.a(l.class, th2);
            return null;
        }
    }

    public static final String b() {
        if (sl.a.b(l.class)) {
            return null;
        }
        try {
            return Intrinsics.i(FacebookSdk.getApplicationContext().getPackageName(), "fbconnect://cct.");
        } catch (Throwable th2) {
            sl.a.a(l.class, th2);
            return null;
        }
    }

    public static final String c() {
        return a3.a.m(new Object[]{FacebookSdk.getFacebookDomain()}, 1, "m.%s", "java.lang.String.format(format, *args)");
    }

    public static final String d() {
        return a3.a.m(new Object[]{FacebookSdk.getInstagramDomain()}, 1, "m.%s", "java.lang.String.format(format, *args)");
    }

    public static final String e(String developerDefinedRedirectURI) {
        if (sl.a.b(l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            if (n0.t(FacebookSdk.getApplicationContext(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            if (n0.t(FacebookSdk.getApplicationContext(), b())) {
                return b();
            }
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Throwable th2) {
            sl.a.a(l.class, th2);
            return null;
        }
    }
}
