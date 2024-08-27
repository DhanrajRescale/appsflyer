package nc;

import android.os.Bundle;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.o;
import kotlin.jvm.internal.Intrinsics;
import oc.j;
import sc.i;

/* loaded from: classes.dex */
public final class e extends z7.e {

    /* renamed from: m, reason: collision with root package name */
    public boolean f28618m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d1 fragmentManager, o lifecycle, Bundle bundle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f28618m = bundle != null ? bundle.getBoolean("IS_MAINTENANCE_ON", false) : false;
    }

    @Override // k7.z0
    public final int a() {
        return 2;
    }

    @Override // z7.e
    public final g0 r(int i10) {
        g0 jVar;
        if (i10 == 0) {
            if (this.f28618m) {
                int i11 = qf.c.f31944h;
                Bundle bundle = new Bundle();
                bundle.putSerializable("DATA", qf.b.f31928c);
                return de.d.m(bundle);
            }
            boolean z10 = i.f34563j;
            Bundle bundle2 = new Bundle();
            jVar = new i();
            jVar.setArguments(bundle2);
        } else {
            if (this.f28618m) {
                int i12 = qf.c.f31944h;
                Bundle bundle3 = new Bundle();
                bundle3.putSerializable("DATA", qf.b.f31928c);
                return de.d.m(bundle3);
            }
            boolean z11 = j.f29952h;
            Bundle bundle4 = new Bundle();
            jVar = new j();
            jVar.setArguments(bundle4);
        }
        return jVar;
    }
}
