package li;

import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.o;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends z7.e {

    /* renamed from: m, reason: collision with root package name */
    public final String f24865m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d1 fragmentManager, o lifecycle, String stockName) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        this.f24865m = stockName;
    }

    @Override // k7.z0
    public final int a() {
        byte[] bArr = kj.a.f23206a;
        if (kj.a.f23207b) {
            return 2;
        }
        return 3;
    }

    @Override // z7.e
    public final g0 r(int i10) {
        String stockName = this.f24865m;
        if (i10 != 0) {
            if (i10 != 1) {
                int i11 = bj.f.f7006h;
                Intrinsics.checkNotNullParameter(stockName, "stockName");
                bj.f fVar = new bj.f();
                fVar.setArguments(hl.f.y(new Pair("STOCK_NAME", stockName)));
                return fVar;
            }
            int i12 = cj.g.f8170h;
            Intrinsics.checkNotNullParameter(stockName, "stockName");
            cj.g gVar = new cj.g();
            gVar.setArguments(hl.f.y(new Pair("STOCK_NAME", stockName)));
            return gVar;
        }
        int i13 = dj.g.f14397h;
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        dj.g gVar2 = new dj.g();
        gVar2.setArguments(hl.f.y(new Pair("STOCK_NAME", stockName)));
        return gVar2;
    }
}
