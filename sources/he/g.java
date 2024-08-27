package he;

import android.os.Bundle;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends z7.e {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f18312m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18313n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18314o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18315p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d1 fragmentManager, o lifecycle, Bundle bundle) {
        super(fragmentManager, lifecycle);
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (bundle != null) {
            z10 = bundle.getBoolean("IS_HOME_FEED_ENABLED", false);
        } else {
            z10 = false;
        }
        this.f18312m = z10;
        if (bundle != null) {
            z11 = bundle.getBoolean("IS_MAINTENANCE_ON", false);
        } else {
            z11 = false;
        }
        this.f18313n = z11;
        if (bundle != null) {
            z12 = bundle.getBoolean("IS_FEED_MAINTENANCE_ON", false);
        } else {
            z12 = false;
        }
        this.f18314o = z12;
        this.f18315p = bundle != null ? bundle.getBoolean("IS_CHAT_MAINTENANCE_ON", false) : false;
    }

    @Override // k7.z0
    public final int a() {
        return this.f18312m ? 3 : 2;
    }

    @Override // z7.e, k7.z0
    public final long b(int i10) {
        return i10;
    }

    @Override // z7.e
    public final g0 r(int i10) {
        qf.c m10;
        boolean z10 = this.f18312m;
        if (i10 != 0) {
            if (i10 != 1) {
                if (!this.f18313n && !this.f18315p) {
                    int i11 = id.g.f19854k;
                    Bundle bundle = new Bundle();
                    id.g gVar = new id.g();
                    gVar.setArguments(bundle);
                    return gVar;
                }
                int i12 = qf.c.f31944h;
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("DATA", qf.b.f31929d);
                return de.d.m(bundle2);
            }
            if (z10) {
                if (!this.f18313n && !this.f18315p) {
                    int i13 = be.c.f6956j;
                    Bundle bundle3 = new Bundle();
                    be.c cVar = new be.c();
                    cVar.setArguments(bundle3);
                    return cVar;
                }
                int i14 = qf.c.f31944h;
                Bundle bundle4 = new Bundle();
                bundle4.putSerializable("DATA", qf.b.f31929d);
                m10 = de.d.m(bundle4);
            } else {
                if (!this.f18313n && !this.f18315p) {
                    int i15 = id.g.f19854k;
                    Bundle bundle5 = new Bundle();
                    id.g gVar2 = new id.g();
                    gVar2.setArguments(bundle5);
                    return gVar2;
                }
                int i16 = qf.c.f31944h;
                Bundle bundle6 = new Bundle();
                bundle6.putSerializable("DATA", qf.b.f31929d);
                m10 = de.d.m(bundle6);
            }
        } else if (z10) {
            if (!this.f18313n && !this.f18314o) {
                int i17 = nb.a.f28563g;
                Bundle bundle7 = new Bundle();
                nb.a aVar = new nb.a();
                aVar.setArguments(bundle7);
                return aVar;
            }
            int i18 = qf.c.f31944h;
            Bundle bundle8 = new Bundle();
            bundle8.putSerializable("DATA", qf.b.f31929d);
            m10 = de.d.m(bundle8);
        } else {
            if (!this.f18313n && !this.f18315p) {
                int i19 = be.c.f6956j;
                Bundle bundle9 = new Bundle();
                be.c cVar2 = new be.c();
                cVar2.setArguments(bundle9);
                return cVar2;
            }
            int i20 = qf.c.f31944h;
            Bundle bundle10 = new Bundle();
            bundle10.putSerializable("DATA", qf.b.f31929d);
            m10 = de.d.m(bundle10);
        }
        return m10;
    }
}
