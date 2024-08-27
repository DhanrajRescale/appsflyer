package yb;

import com.assetgro.stockgro.ui.home.homepage.domain.HomeSocialTradeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f41427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zb.d f41428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeSocialTradeView.TradeContent f41429c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f41430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f41432f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g1.o oVar, zb.d dVar, HomeSocialTradeView.TradeContent tradeContent, Function0 function0, int i10, int i11) {
        super(2);
        this.f41427a = oVar;
        this.f41428b = dVar;
        this.f41429c = tradeContent;
        this.f41430d = function0;
        this.f41431e = i10;
        this.f41432f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        g.a(this.f41427a, this.f41428b, this.f41429c, this.f41430d, (t0.n) obj, t0.t.H0(this.f41431e | 1), this.f41432f);
        return Unit.f23355a;
    }
}
