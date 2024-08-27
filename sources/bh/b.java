package bh;

import android.os.Bundle;
import androidx.fragment.app.g0;
import androidx.fragment.app.m1;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends m1 {

    /* renamed from: j, reason: collision with root package name */
    public List f6973j;

    @Override // x7.a
    public final int c() {
        return this.f6973j.size();
    }

    @Override // androidx.fragment.app.m1
    public final g0 j(int i10) {
        int i11 = c.f6974g;
        Portfolio portfolio = (Portfolio) this.f6973j.get(i10);
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATA", portfolio);
        c cVar = new c();
        cVar.setArguments(bundle);
        return cVar;
    }
}
