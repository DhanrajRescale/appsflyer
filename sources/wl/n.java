package wl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n extends f0 {

    @NotNull
    public static final Parcelable.Creator<n> CREATOR = new zi.j(13);

    /* renamed from: d, reason: collision with root package name */
    public final String f39234d;

    /* renamed from: e, reason: collision with root package name */
    public final xk.h f39235e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f39234d = "instagram_login";
        this.f39235e = xk.h.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // wl.c0
    public final String e() {
        return this.f39234d;
    }

    @Override // wl.c0
    public final int l(q request) {
        boolean z10;
        Object obj;
        String str;
        Intent intent;
        String str2;
        ResolveInfo resolveActivity;
        Intrinsics.checkNotNullParameter(request, "request");
        String e2e = ll.f.k();
        nl.h0 h0Var = nl.h0.f28857a;
        Context e10 = d().e();
        if (e10 == null) {
            e10 = FacebookSdk.getApplicationContext();
        }
        Context context = e10;
        String applicationId = request.f39248d;
        Set set = request.f39246b;
        Set permissions = set;
        Iterator it = set.iterator();
        while (true) {
            if (it.hasNext()) {
                String str3 = (String) it.next();
                ll.f fVar = LoginManager.f10882f;
                if (ll.f.p(str3)) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        d dVar = request.f39247c;
        if (dVar == null) {
            dVar = d.NONE;
        }
        d defaultAudience = dVar;
        String clientState = c(request.f39249e);
        String authType = request.f39252h;
        String str4 = request.f39254j;
        boolean z11 = request.f39255k;
        boolean z12 = request.f39257m;
        boolean z13 = request.f39258n;
        Intent intent2 = null;
        if (sl.a.b(nl.h0.class)) {
            str2 = "e2e";
            intent = null;
        } else {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                Intrinsics.checkNotNullParameter(e2e, "e2e");
                Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
                Intrinsics.checkNotNullParameter(clientState, "clientState");
                Intrinsics.checkNotNullParameter(authType, "authType");
                str = "e2e";
                try {
                    Intent c10 = nl.h0.f28857a.c(new nl.f0(1), applicationId, permissions, e2e, z10, defaultAudience, clientState, authType, false, str4, z11, e0.INSTAGRAM, z12, z13, HttpUrl.FRAGMENT_ENCODE_SET);
                    if (!sl.a.b(nl.h0.class)) {
                        try {
                            Intrinsics.checkNotNullParameter(context, "context");
                            if (c10 != null && (resolveActivity = context.getPackageManager().resolveActivity(c10, 0)) != null) {
                                HashSet hashSet = nl.q.f28900a;
                                String str5 = resolveActivity.activityInfo.packageName;
                                Intrinsics.checkNotNullExpressionValue(str5, "resolveInfo.activityInfo.packageName");
                                if (nl.q.a(context, str5)) {
                                    intent2 = c10;
                                }
                            }
                        } catch (Throwable th2) {
                            obj = nl.h0.class;
                            try {
                                sl.a.a(obj, th2);
                            } catch (Throwable th3) {
                                th = th3;
                                sl.a.a(obj, th);
                                intent = intent2;
                                str2 = str;
                                a(e2e, str2);
                                nl.i.Login.a();
                                return q(intent) ? 1 : 0;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = nl.h0.class;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = nl.h0.class;
                str = "e2e";
            }
            intent = intent2;
            str2 = str;
        }
        a(e2e, str2);
        nl.i.Login.a();
        return q(intent) ? 1 : 0;
    }

    @Override // wl.f0
    public final xk.h n() {
        return this.f39235e;
    }

    @Override // wl.c0, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f39234d = "instagram_login";
        this.f39235e = xk.h.INSTAGRAM_APPLICATION_WEB;
    }
}
