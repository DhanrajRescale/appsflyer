package wl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookSdk;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import nl.w0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j0 extends g0 {

    @NotNull
    public static final Parcelable.Creator<j0> CREATOR = new zi.j(18);

    /* renamed from: d, reason: collision with root package name */
    public w0 f39215d;

    /* renamed from: e, reason: collision with root package name */
    public String f39216e;

    /* renamed from: f, reason: collision with root package name */
    public final String f39217f;

    /* renamed from: g, reason: collision with root package name */
    public final xk.h f39218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f39217f = "web_view";
        this.f39218g = xk.h.WEB_VIEW;
        this.f39216e = source.readString();
    }

    @Override // wl.c0
    public final void b() {
        w0 w0Var = this.f39215d;
        if (w0Var != null) {
            if (w0Var != null) {
                w0Var.cancel();
            }
            this.f39215d = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // wl.c0
    public final String e() {
        return this.f39217f;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [nl.q0, java.lang.Object, wl.h0] */
    @Override // wl.c0
    public final int l(q request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle parameters = m(request);
        i0 i0Var = new i0(this, request);
        String k10 = ll.f.k();
        this.f39216e = k10;
        a(k10, "e2e");
        androidx.fragment.app.j0 context = d().e();
        if (context == null) {
            return 0;
        }
        boolean x10 = n0.x(context);
        Intrinsics.checkNotNullParameter(this, "this$0");
        Intrinsics.checkNotNullParameter(context, "context");
        String applicationId = request.f39248d;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("oauth", LogCategory.ACTION);
        ?? obj = new Object();
        if (applicationId == null) {
            n0.K(context, LogCategory.CONTEXT);
            applicationId = FacebookSdk.getApplicationId();
        }
        n0.L(applicationId, "applicationId");
        obj.f28902b = applicationId;
        obj.f28901a = context;
        obj.f28904d = parameters;
        String str = "fbconnect://success";
        obj.f39191e = "fbconnect://success";
        obj.f39192f = p.NATIVE_WITH_FALLBACK;
        obj.f39193g = e0.FACEBOOK;
        String e2e = this.f39216e;
        if (e2e != null) {
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            Intrinsics.checkNotNullParameter(e2e, "<set-?>");
            obj.f39196j = e2e;
            if (x10) {
                str = "fbconnect://chrome_os_success";
            }
            obj.f39191e = str;
            String authType = request.f39252h;
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(authType, "<set-?>");
            obj.f39197k = authType;
            p loginBehavior = request.f39245a;
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            obj.f39192f = loginBehavior;
            e0 targetApp = request.f39256l;
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            obj.f39193g = targetApp;
            obj.f39194h = request.f39257m;
            obj.f39195i = request.f39258n;
            obj.f28903c = i0Var;
            this.f39215d = obj.a();
            nl.n nVar = new nl.n();
            nVar.setRetainInstance(true);
            nVar.f28882a = this.f39215d;
            nVar.show(context.getSupportFragmentManager(), "FacebookDialogFragment");
            return 1;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // wl.g0
    public final xk.h n() {
        return this.f39218g;
    }

    @Override // wl.c0, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f39216e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(t loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f39217f = "web_view";
        this.f39218g = xk.h.WEB_VIEW;
    }
}
