package ia;

import android.os.Bundle;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.o;
import ja.i;
import kotlin.jvm.internal.Intrinsics;
import z7.e;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f19750m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d1 fragmentManager, o lifecycle, Bundle bundle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f19750m = bundle;
    }

    @Override // k7.z0
    public final int a() {
        return 1;
    }

    @Override // z7.e
    public final g0 r(int i10) {
        int i11 = i.f21269i;
        Bundle bundle = this.f19750m;
        bundle.putString("EQUITY_OPTION_TYPE", "stocks");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        i iVar = new i();
        Bundle bundle2 = new Bundle(0);
        bundle2.putAll(bundle);
        iVar.setArguments(bundle2);
        return iVar;
    }
}
