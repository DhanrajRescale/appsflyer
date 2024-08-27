package wl;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;

/* loaded from: classes.dex */
public abstract class g0 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public String f39189c;

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m(wl.q r8) {
        /*
            r7 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r1 = r8.f39246b
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L29
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L17
            goto L29
        L17:
            java.util.Set r1 = r8.f39246b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r2 = ","
            java.lang.String r1 = android.text.TextUtils.join(r2, r1)
            java.lang.String r2 = "scope"
            r0.putString(r2, r1)
            r7.a(r1, r2)
        L29:
            wl.d r1 = r8.f39247c
            if (r1 != 0) goto L2f
            wl.d r1 = wl.d.NONE
        L2f:
            java.lang.String r2 = "default_audience"
            java.lang.String r1 = r1.f39166a
            r0.putString(r2, r1)
            java.lang.String r8 = r8.f39249e
            java.lang.String r8 = r7.c(r8)
            java.lang.String r1 = "state"
            r0.putString(r1, r8)
            java.util.Date r8 = xk.a.f40309l
            xk.a r8 = ek.h.q()
            if (r8 != 0) goto L4b
            r8 = 0
            goto L4d
        L4b:
            java.lang.String r8 = r8.f40316e
        L4d:
            java.lang.String r1 = "0"
            java.lang.String r2 = "1"
            java.lang.String r3 = "access_token"
            if (r8 == 0) goto L7f
            wl.t r4 = r7.d()
            androidx.fragment.app.j0 r4 = r4.e()
            if (r4 != 0) goto L63
            android.content.Context r4 = com.facebook.FacebookSdk.getApplicationContext()
        L63:
            java.lang.String r5 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
            r6 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r6)
            java.lang.String r5 = "TOKEN"
            java.lang.String r6 = ""
            java.lang.String r4 = r4.getString(r5, r6)
            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r8, r4)
            if (r4 == 0) goto L7f
            r0.putString(r3, r8)
            r7.a(r2, r3)
            goto L90
        L7f:
            wl.t r8 = r7.d()
            androidx.fragment.app.j0 r8 = r8.e()
            if (r8 != 0) goto L8a
            goto L8d
        L8a:
            nl.n0.d(r8)
        L8d:
            r7.a(r1, r3)
        L90:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "cbt"
            r0.putString(r3, r8)
            boolean r8 = com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()
            if (r8 == 0) goto La4
            r1 = r2
        La4:
            java.lang.String r8 = "ies"
            r0.putString(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.g0.m(wl.q):android.os.Bundle");
    }

    public abstract xk.h n();

    public final void o(q request, Bundle bundle, FacebookException facebookException) {
        String message;
        String str;
        s f10;
        Intrinsics.checkNotNullParameter(request, "request");
        t d10 = d();
        this.f39189c = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f39189c = bundle.getString("e2e");
            }
            try {
                xk.a d11 = ll.a.d(request.f39246b, bundle, n(), request.f39248d);
                xk.i f11 = ll.a.f(bundle, request.f39259o);
                Parcelable.Creator<s> creator = s.CREATOR;
                f10 = new s(d10.f39282g, r.SUCCESS, d11, f11, null, null);
                if (d10.e() != null) {
                    try {
                        CookieSyncManager.createInstance(d10.e()).sync();
                    } catch (Exception unused) {
                    }
                    if (d11 != null) {
                        String str2 = d11.f40316e;
                        Context e10 = d().e();
                        if (e10 == null) {
                            e10 = FacebookSdk.getApplicationContext();
                        }
                        e10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str2).apply();
                    }
                }
            } catch (FacebookException e11) {
                Parcelable.Creator<s> creator2 = s.CREATOR;
                f10 = ll.e.f(d10.f39282g, null, e11.getMessage(), null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            Parcelable.Creator<s> creator3 = s.CREATOR;
            f10 = new s(d10.f39282g, r.CANCEL, null, "User canceled log in.", null);
        } else {
            this.f39189c = null;
            if (facebookException == null) {
                message = null;
            } else {
                message = facebookException.getMessage();
            }
            if (facebookException instanceof FacebookServiceException) {
                xk.q qVar = ((FacebookServiceException) facebookException).f10881b;
                str = String.valueOf(qVar.f40459b);
                message = qVar.toString();
            } else {
                str = null;
            }
            Parcelable.Creator<s> creator4 = s.CREATOR;
            f10 = ll.e.f(d10.f39282g, null, message, str);
        }
        if (!n0.A(this.f39189c)) {
            h(this.f39189c);
        }
        d10.d(f10);
    }
}
