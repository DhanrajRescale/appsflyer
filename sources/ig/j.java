package ig;

import android.os.Bundle;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.o;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import gd.m;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lg.k;

/* loaded from: classes.dex */
public final class j extends z7.e {

    /* renamed from: m, reason: collision with root package name */
    public final Portfolio f19984m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d1 fragmentManager, o lifecycle, Portfolio portfolio) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        this.f19984m = portfolio;
    }

    public static m w(int i10, Bundle bundle) {
        if (i10 != 0) {
            if (i10 != 1) {
                int i11 = k.f24839h;
                Bundle bundle2 = new Bundle();
                bundle2.putAll(bundle);
                k kVar = new k();
                kVar.setArguments(bundle2);
                return kVar;
            }
            int i12 = tg.o.f36067i;
            Bundle bundle3 = new Bundle();
            bundle3.putAll(bundle);
            tg.o oVar = new tg.o();
            oVar.setArguments(bundle3);
            return oVar;
        }
        int i13 = og.o.f30062j;
        Bundle bundle4 = new Bundle();
        bundle4.putAll(bundle);
        og.o oVar2 = new og.o();
        oVar2.setArguments(bundle4);
        return oVar2;
    }

    @Override // k7.z0
    public final int a() {
        return 3;
    }

    @Override // z7.e
    public final g0 r(int i10) {
        g0 jVar;
        Portfolio portfolio = this.f19984m;
        Bundle y10 = hl.f.y(new Pair("PORTFOLIO", portfolio));
        String assetClass = portfolio.getAssetClass();
        if (Intrinsics.a(assetClass, "EQUITY")) {
            return w(i10, y10);
        }
        if (Intrinsics.a(assetClass, "OPTIONS")) {
            if (i10 != 0) {
                if (i10 != 1) {
                    int i11 = lg.g.f24832h;
                    Bundle bundle = new Bundle();
                    bundle.putAll(y10);
                    jVar = new lg.g();
                    jVar.setArguments(bundle);
                } else {
                    int i12 = tg.h.f36055g;
                    Bundle bundle2 = new Bundle();
                    bundle2.putAll(y10);
                    jVar = new tg.h();
                    jVar.setArguments(bundle2);
                }
            } else {
                int i13 = og.j.f30049h;
                Bundle bundle3 = new Bundle();
                bundle3.putAll(y10);
                jVar = new og.j();
                jVar.setArguments(bundle3);
            }
            return jVar;
        }
        return w(i10, y10);
    }
}
