package wl;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f0 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final xk.h f39183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(t loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f39183c = xk.h.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    @Override // wl.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r9, int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.f0.i(int, int, android.content.Intent):boolean");
    }

    public final void m(s sVar) {
        if (sVar != null) {
            d().d(sVar);
        } else {
            d().k();
        }
    }

    public xk.h n() {
        return this.f39183c;
    }

    public final void o(q qVar, String str, String str2, String str3) {
        if (str != null && Intrinsics.a(str, "logged_out")) {
            b.f39150i = true;
            m(null);
        } else if (vt.g0.q(vt.y.g("service_disabled", "AndroidAuthKillSwitchException"), str)) {
            m(null);
        } else if (vt.g0.q(vt.y.g("access_denied", "OAuthAccessDeniedException"), str)) {
            Parcelable.Creator<s> creator = s.CREATOR;
            m(new s(qVar, r.CANCEL, null, null, null));
        } else {
            Parcelable.Creator<s> creator2 = s.CREATOR;
            m(ll.e.f(qVar, str, str2, str3));
        }
    }

    public final void p(Bundle extras, q request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            xk.a d10 = ll.a.d(request.f39246b, extras, n(), request.f39248d);
            xk.i f10 = ll.a.f(extras, request.f39259o);
            Parcelable.Creator<s> creator = s.CREATOR;
            m(new s(request, r.SUCCESS, d10, f10, null, null));
        } catch (FacebookException e10) {
            Parcelable.Creator<s> creator2 = s.CREATOR;
            m(ll.e.f(request, null, e10.getMessage(), null));
        }
    }

    public final boolean q(Intent intent) {
        w wVar;
        if (intent != null) {
            Intrinsics.checkNotNullExpressionValue(FacebookSdk.getApplicationContext().getPackageManager().queryIntentActivities(intent, 65536), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            if (!r1.isEmpty()) {
                androidx.fragment.app.g0 g0Var = d().f39278c;
                Unit unit = null;
                if (g0Var instanceof w) {
                    wVar = (w) g0Var;
                } else {
                    wVar = null;
                }
                if (wVar != null) {
                    e.c cVar = wVar.f39296d;
                    if (cVar != null) {
                        cVar.a(intent);
                        unit = Unit.f23355a;
                    } else {
                        Intrinsics.k("launcher");
                        throw null;
                    }
                }
                if (unit == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f39183c = xk.h.FACEBOOK_APPLICATION_WEB;
    }
}
