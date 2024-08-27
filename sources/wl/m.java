package wl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m extends c0 {

    @NotNull
    public static final Parcelable.Creator<m> CREATOR = new zi.j(12);

    /* renamed from: c, reason: collision with root package name */
    public k f39232c;

    /* renamed from: d, reason: collision with root package name */
    public final String f39233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f39233d = "get_token";
    }

    @Override // wl.c0
    public final void b() {
        k kVar = this.f39232c;
        if (kVar != null) {
            kVar.f39222d = false;
            kVar.f39221c = null;
            this.f39232c = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // wl.c0
    public final String e() {
        return this.f39233d;
    }

    @Override // wl.c0
    public final int l(q request) {
        boolean z10;
        Intrinsics.checkNotNullParameter(request, "request");
        Context e10 = d().e();
        if (e10 == null) {
            e10 = FacebookSdk.getApplicationContext();
        }
        k kVar = new k(e10, request);
        this.f39232c = kVar;
        synchronized (kVar) {
            if (!kVar.f39222d) {
                nl.h0 h0Var = nl.h0.f28857a;
                int i10 = kVar.f39227i;
                if (!sl.a.b(nl.h0.class)) {
                    try {
                        if (nl.h0.f28857a.g(nl.h0.f28858b, new int[]{i10}).f2637a == -1) {
                        }
                    } catch (Throwable th2) {
                        sl.a.a(nl.h0.class, th2);
                    }
                }
                nl.h0 h0Var2 = nl.h0.f28857a;
                Intent d10 = nl.h0.d(kVar.f39219a);
                if (d10 == null) {
                    z10 = false;
                } else {
                    kVar.f39222d = true;
                    kVar.f39219a.bindService(d10, kVar, 1);
                    z10 = true;
                }
            }
            z10 = false;
        }
        if (Intrinsics.a(Boolean.valueOf(z10), Boolean.FALSE)) {
            return 0;
        }
        v vVar = d().f39280e;
        if (vVar != null) {
            View view = vVar.f39291a.f39297e;
            if (view != null) {
                view.setVisibility(0);
            } else {
                Intrinsics.k("progressBar");
                throw null;
            }
        }
        androidx.fragment.app.g gVar = new androidx.fragment.app.g(28, this, request);
        k kVar2 = this.f39232c;
        if (kVar2 != null) {
            kVar2.f39221c = gVar;
        }
        return 1;
    }

    public final void m(Bundle bundle, q request) {
        s f10;
        xk.a b10;
        String str;
        String string;
        xk.i iVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(bundle, "result");
        try {
            b10 = ll.a.b(bundle, request.f39248d);
            str = request.f39259o;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
        } catch (FacebookException e10) {
            Parcelable.Creator<s> creator = s.CREATOR;
            f10 = ll.e.f(d().f39282g, null, e10.getMessage(), null);
        }
        if (string != null && string.length() != 0 && str != null && str.length() != 0) {
            try {
                iVar = new xk.i(string, str);
                Parcelable.Creator<s> creator2 = s.CREATOR;
                f10 = new s(request, r.SUCCESS, b10, iVar, null, null);
                d().d(f10);
            } catch (Exception e11) {
                throw new FacebookException(e11.getMessage());
            }
        }
        iVar = null;
        Parcelable.Creator<s> creator22 = s.CREATOR;
        f10 = new s(request, r.SUCCESS, b10, iVar, null, null);
        d().d(f10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f39233d = "get_token";
    }
}
