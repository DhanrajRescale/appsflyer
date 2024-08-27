package wl;

import android.content.Context;
import android.os.Bundle;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.jvm.internal.Intrinsics;
import nl.q0;
import nl.r0;
import nl.w0;

/* loaded from: classes.dex */
public final class h0 extends q0 {

    /* renamed from: e, reason: collision with root package name */
    public String f39191e;

    /* renamed from: f, reason: collision with root package name */
    public p f39192f;

    /* renamed from: g, reason: collision with root package name */
    public e0 f39193g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f39194h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f39195i;

    /* renamed from: j, reason: collision with root package name */
    public String f39196j;

    /* renamed from: k, reason: collision with root package name */
    public String f39197k;

    public final w0 a() {
        String str;
        Bundle bundle = this.f28904d;
        if (bundle != null) {
            bundle.putString("redirect_uri", this.f39191e);
            bundle.putString(PaymentConstants.CLIENT_ID, this.f28902b);
            String str2 = this.f39196j;
            if (str2 != null) {
                bundle.putString("e2e", str2);
                if (this.f39193g == e0.INSTAGRAM) {
                    str = "token,signed_request,graph_domain,granted_scopes";
                } else {
                    str = "token,signed_request,graph_domain";
                }
                bundle.putString("response_type", str);
                bundle.putString("return_scopes", "true");
                String str3 = this.f39197k;
                if (str3 != null) {
                    bundle.putString("auth_type", str3);
                    bundle.putString("login_behavior", this.f39192f.name());
                    if (this.f39194h) {
                        bundle.putString("fx_app", this.f39193g.f39176a);
                    }
                    if (this.f39195i) {
                        bundle.putString("skip_dedupe", "true");
                    }
                    int i10 = w0.f28951m;
                    Context context = this.f28901a;
                    if (context != null) {
                        e0 targetApp = this.f39193g;
                        r0 r0Var = this.f28903c;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(targetApp, "targetApp");
                        w0.b(context);
                        return new w0(context, "oauth", bundle, targetApp, r0Var);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
                }
                Intrinsics.k("authType");
                throw null;
            }
            Intrinsics.k("e2e");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
    }
}
