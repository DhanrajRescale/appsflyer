package yg;

import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.remote.response.UnlockPortfolioData;
import ij.h;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f41627b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f41628c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f41629d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f41630e = new c(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41631a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f41631a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f41631a) {
            case 0:
                return Unit.f23355a;
            case 1:
                UnlockPortfolioData it = (UnlockPortfolioData) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f23355a;
            case 2:
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
            default:
                return h.m(h.f20067a, ((WalletBalanceResponseDto) obj).getTotal());
        }
    }
}
