package ka;

import com.assetgro.stockgro.feature_market.data.remote.PortfolioReviewResponse;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OptionContract f22939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionOverview f22940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PortfolioReviewResponse f22941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f22944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.c f22945g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22946h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22947i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(OptionContract optionContract, OptionOverview optionOverview, PortfolioReviewResponse portfolioReviewResponse, boolean z10, boolean z11, Function1 function1, hu.c cVar, int i10, int i11) {
        super(2);
        this.f22939a = optionContract;
        this.f22940b = optionOverview;
        this.f22941c = portfolioReviewResponse;
        this.f22942d = z10;
        this.f22943e = z11;
        this.f22944f = function1;
        this.f22945g = cVar;
        this.f22946h = i10;
        this.f22947i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yk.o.s(this.f22939a, this.f22940b, this.f22941c, this.f22942d, this.f22943e, this.f22944f, this.f22945g, (t0.n) obj, t0.t.H0(this.f22946h | 1), this.f22947i);
        return Unit.f23355a;
    }
}
