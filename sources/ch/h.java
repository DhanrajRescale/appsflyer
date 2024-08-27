package ch;

import android.os.Bundle;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.o;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends z7.e {

    /* renamed from: m, reason: collision with root package name */
    public final String f8147m;

    /* renamed from: n, reason: collision with root package name */
    public final String f8148n;

    /* renamed from: o, reason: collision with root package name */
    public final String f8149o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8150p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8151q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d1 fragmentManager, o lifecycle, String userId, String str, String str2, Bundle bundle) {
        super(fragmentManager, lifecycle);
        boolean z10;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f8147m = userId;
        this.f8148n = str;
        this.f8149o = str2;
        if (bundle != null) {
            z10 = bundle.getBoolean("IS_MAINTENANCE_ON", false);
        } else {
            z10 = false;
        }
        this.f8150p = z10;
        this.f8151q = bundle != null ? bundle.getBoolean("IS_PORTFOLIO_MAINTENANCE_ON", false) : false;
    }

    @Override // k7.z0
    public final int a() {
        return 3;
    }

    @Override // z7.e
    public final g0 r(int i10) {
        String str = this.f8148n;
        String userId = this.f8147m;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (this.f8150p) {
                        int i11 = qf.c.f31944h;
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("DATA", qf.b.f31929d);
                        return de.d.m(bundle);
                    }
                    int i12 = mh.a.f27758g;
                    Intrinsics.checkNotNullParameter(userId, "userId");
                    mh.a aVar = new mh.a();
                    aVar.setArguments(hl.f.y(new Pair("USER_IDENTIFIER", userId)));
                    return aVar;
                }
                if (this.f8151q) {
                    int i13 = qf.c.f31944h;
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("DATA", qf.b.f31941p);
                    return de.d.m(bundle2);
                }
                int i14 = gh.e.f17430j;
                Intrinsics.checkNotNullParameter(userId, "userId");
                gh.e eVar = new gh.e();
                eVar.setArguments(hl.f.y(new Pair("USER_IDENTIFIER", userId), new Pair("IS_FROM_PROFILE", Boolean.TRUE)));
                return eVar;
            }
            if (this.f8150p) {
                int i15 = qf.c.f31944h;
                Bundle bundle3 = new Bundle();
                bundle3.putSerializable("DATA", qf.b.f31929d);
                return de.d.m(bundle3);
            }
            int i16 = fh.b.f16100j;
            Intrinsics.checkNotNullParameter(userId, "userId");
            fh.b bVar = new fh.b();
            bVar.setArguments(hl.f.y(new Pair("USER_IDENTIFIER", userId), new Pair("USER_NAME", str)));
            return bVar;
        }
        int i17 = kh.g.f23134i;
        Intrinsics.checkNotNullParameter(userId, "userId");
        kh.g gVar = new kh.g();
        gVar.setArguments(hl.f.y(new Pair("USER_IDENTIFIER", userId), new Pair("USER_NAME", str), new Pair("USER_PROFILE_PHOTO", this.f8149o)));
        return gVar;
    }
}
