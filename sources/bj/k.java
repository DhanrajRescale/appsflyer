package bj;

import com.assetgro.stockgro.ui.stock.v2.presentation.analysis.StockAnalysisItemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockAnalysisItemViewModel f7016b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(StockAnalysisItemViewModel stockAnalysisItemViewModel, int i10) {
        super(1);
        this.f7015a = i10;
        this.f7016b = stockAnalysisItemViewModel;
    }

    public final void a(Float f10) {
        int i10 = this.f7015a;
        StockAnalysisItemViewModel stockAnalysisItemViewModel = this.f7016b;
        switch (i10) {
            case 0:
                Intrinsics.c(f10);
                stockAnalysisItemViewModel.f10452s = f10.floatValue();
                stockAnalysisItemViewModel.e();
                return;
            case 1:
                Intrinsics.c(f10);
                stockAnalysisItemViewModel.f10453t = f10.floatValue();
                stockAnalysisItemViewModel.e();
                return;
            default:
                Intrinsics.c(f10);
                stockAnalysisItemViewModel.f10454u = f10.floatValue();
                stockAnalysisItemViewModel.e();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f7015a) {
            case 0:
                a((Float) obj);
                return Unit.f23355a;
            case 1:
                a((Float) obj);
                return Unit.f23355a;
            default:
                a((Float) obj);
                return Unit.f23355a;
        }
    }
}
