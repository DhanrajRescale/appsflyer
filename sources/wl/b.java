package wl;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookSdk;
import com.google.android.gms.common.Scopes;
import in.juspay.hyper.constants.Labels;
import in.juspay.hypersdk.core.PaymentConstants;
import java.math.BigInteger;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b extends g0 {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new zi.j(9);

    /* renamed from: i, reason: collision with root package name */
    public static boolean f39150i;

    /* renamed from: d, reason: collision with root package name */
    public String f39151d;

    /* renamed from: e, reason: collision with root package name */
    public final String f39152e;

    /* renamed from: f, reason: collision with root package name */
    public final String f39153f;

    /* renamed from: g, reason: collision with root package name */
    public final String f39154g;

    /* renamed from: h, reason: collision with root package name */
    public final xk.h f39155h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f39154g = Labels.SDK.CUSTOM_TAB;
        this.f39155h = xk.h.CHROME_CUSTOM_TAB;
        this.f39152e = source.readString();
        this.f39153f = nl.l.e(super.f());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // wl.c0
    public final String e() {
        return this.f39154g;
    }

    @Override // wl.c0
    public final String f() {
        return this.f39153f;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    @Override // wl.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r7, int r8, android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.b.i(int, int, android.content.Intent):boolean");
    }

    @Override // wl.c0
    public final void k(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
        param.put("7_challenge", this.f39152e);
    }

    @Override // wl.c0
    public final int l(q request) {
        String name;
        String str;
        Intrinsics.checkNotNullParameter(request, "request");
        t d10 = d();
        if (this.f39153f.length() == 0) {
            return 0;
        }
        Bundle parameters = m(request);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(request, "request");
        parameters.putString("redirect_uri", this.f39153f);
        boolean a10 = request.a();
        String str2 = request.f39248d;
        if (a10) {
            parameters.putString("app_id", str2);
        } else {
            parameters.putString(PaymentConstants.CLIENT_ID, str2);
        }
        parameters.putString("e2e", ll.f.k());
        if (request.a()) {
            parameters.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.f39246b.contains(Scopes.OPEN_ID)) {
                parameters.putString("nonce", request.f39259o);
            }
            parameters.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        parameters.putString("code_challenge", request.f39261q);
        a aVar = request.f39262r;
        if (aVar == null) {
            name = null;
        } else {
            name = aVar.name();
        }
        parameters.putString("code_challenge_method", name);
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.f39252h);
        parameters.putString("login_behavior", request.f39245a.name());
        parameters.putString(PaymentConstants.Category.SDK, Intrinsics.i(FacebookSdk.getSdkVersion(), "android-"));
        parameters.putString("sso", "chrome_custom_tab");
        String str3 = "0";
        if (FacebookSdk.hasCustomTabsPrefetching) {
            str = "1";
        } else {
            str = "0";
        }
        parameters.putString("cct_prefetching", str);
        boolean z10 = request.f39257m;
        e0 e0Var = request.f39256l;
        if (z10) {
            parameters.putString("fx_app", e0Var.f39176a);
        }
        if (request.f39258n) {
            parameters.putString("skip_dedupe", "true");
        }
        String str4 = request.f39254j;
        if (str4 != null) {
            parameters.putString("messenger_page_id", str4);
            if (request.f39255k) {
                str3 = "1";
            }
            parameters.putString("reset_messenger_state", str3);
        }
        if (f39150i) {
            parameters.putString("cct_over_app_switch", "1");
        }
        if (FacebookSdk.hasCustomTabsPrefetching) {
            if (request.a()) {
                com.google.firebase.messaging.t tVar = c.f39158b;
                ll.e.m(nl.c0.f28844c.j(parameters, "oauth"));
            } else {
                com.google.firebase.messaging.t tVar2 = c.f39158b;
                ll.e.m(nl.k.f28873b.n(parameters, "oauth"));
            }
        }
        androidx.fragment.app.j0 e10 = d10.e();
        if (e10 == null) {
            return 0;
        }
        Intent intent = new Intent(e10, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f10866c, "oauth");
        intent.putExtra(CustomTabMainActivity.f10867d, parameters);
        String str5 = CustomTabMainActivity.f10868e;
        String str6 = this.f39151d;
        if (str6 == null) {
            str6 = nl.l.a();
            this.f39151d = str6;
        }
        intent.putExtra(str5, str6);
        intent.putExtra(CustomTabMainActivity.f10870g, e0Var.f39176a);
        androidx.fragment.app.g0 g0Var = d10.f39278c;
        if (g0Var != null) {
            g0Var.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // wl.g0
    public final xk.h n() {
        return this.f39155h;
    }

    @Override // wl.c0, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f39152e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f39154g = Labels.SDK.CUSTOM_TAB;
        this.f39155h = xk.h.CHROME_CUSTOM_TAB;
        String bigInteger = new BigInteger(100, new Random()).toString(32);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "BigInteger(length * 5, r).toString(32)");
        this.f39152e = bigInteger;
        f39150i = false;
        this.f39153f = nl.l.e(super.f());
    }
}
