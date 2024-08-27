package bj;

import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.ui.stock.v2.presentation.analysis.StockAnalysisViewModel;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class m extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockAnalysisViewModel f7024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(StockAnalysisViewModel stockAnalysisViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f7024b = stockAnalysisViewModel;
        this.f7025c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new m(this.f7024b, this.f7025c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f7023a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            StockAnalysisViewModel stockAnalysisViewModel = this.f7024b;
            StockRepository stockRepository = stockAnalysisViewModel.f10455n;
            String str = stockAnalysisViewModel.f10458q[1];
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            this.f7023a = 1;
            obj = stockRepository.getStockAnalysisDataBvps(lowerCase, this.f7025c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
