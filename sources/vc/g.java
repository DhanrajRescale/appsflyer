package vc;

import android.os.Bundle;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.o;
import kotlin.jvm.internal.Intrinsics;
import zc.i;

/* loaded from: classes.dex */
public final class g extends z7.e {

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f37957m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d1 fragmentManager, o lifecycle, Bundle bundle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f37957m = bundle;
    }

    @Override // k7.z0
    public final int a() {
        return 2;
    }

    @Override // z7.e
    public final g0 r(int i10) {
        Bundle bundle = this.f37957m;
        if (i10 == 0) {
            int i11 = d.f37937j;
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            d dVar = new d();
            dVar.setArguments(bundle2);
            return dVar;
        }
        int i12 = i.f42383n;
        Bundle bundle3 = new Bundle();
        if (bundle != null) {
            bundle3.putAll(bundle);
        }
        i iVar = new i();
        iVar.setArguments(bundle3);
        return iVar;
    }
}
