package ri;

import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements et.d, et.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f33782b;

    public /* synthetic */ m(int i10, Function1 function1) {
        this.f33781a = i10;
        this.f33782b = function1;
    }

    @Override // et.d
    public final Object apply(Object obj) {
        int i10 = this.f33781a;
        Function1 function1 = this.f33782b;
        switch (i10) {
            case 0:
                return (StockSellSelectOrderResponseDto) a3.a.c(function1, "$tmp0", obj, "p0", obj);
            case 6:
                return (StockDetailDto) a3.a.c(function1, "$tmp0", obj, "p0", obj);
            case 12:
                return (StockModifyInfoDto) a3.a.c(function1, "$tmp0", obj, "p0", obj);
            case 18:
                return (StockDetailDto) a3.a.c(function1, "$tmp0", obj, "p0", obj);
            default:
                return (Portfolio) a3.a.c(function1, "$tmp0", obj, "p0", obj);
        }
    }

    @Override // et.c
    public final void b(Object obj) {
        int i10 = this.f33781a;
        Function1 tmp0 = this.f33782b;
        switch (i10) {
            case 1:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 4:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 6:
            case 12:
            case 18:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 7:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 8:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 9:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 10:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 11:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 13:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 14:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 15:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 16:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 17:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 19:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 20:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 21:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 22:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 23:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 25:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 26:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 27:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 28:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
        }
    }
}
