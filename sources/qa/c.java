package qa;

import android.os.Bundle;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.o;
import kotlin.jvm.internal.Intrinsics;
import sa.l;
import ta.h;
import z7.e;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f31882m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d1 fragmentManager, o lifecycle, Bundle bundle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f31882m = bundle;
    }

    @Override // k7.z0
    public final int a() {
        return 2;
    }

    @Override // z7.e
    public final g0 r(int i10) {
        Bundle bundle = this.f31882m;
        if (i10 == 0) {
            int i11 = h.f35649j;
            Bundle bundle2 = new Bundle();
            bundle2.putAll(bundle);
            h hVar = new h();
            hVar.setArguments(bundle2);
            return hVar;
        }
        int i12 = l.f34421j;
        Bundle bundle3 = new Bundle();
        bundle3.putAll(bundle);
        l lVar = new l();
        lVar.setArguments(bundle3);
        return lVar;
    }
}
