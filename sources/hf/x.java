package hf;

import com.assetgro.stockgro.data.model.homedata.Analytics;
import com.assetgro.stockgro.ui.home.homepage.domain.HomeSocialTradeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeSocialTradeView.TradeContent f18434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f18436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Analytics f18437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f18438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18439f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18440g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(HomeSocialTradeView.TradeContent tradeContent, String str, Integer num, Analytics analytics, Function2 function2, int i10, int i11) {
        super(2);
        this.f18434a = tradeContent;
        this.f18435b = str;
        this.f18436c = num;
        this.f18437d = analytics;
        this.f18438e = function2;
        this.f18439f = i10;
        this.f18440g = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        z.p(this.f18434a, this.f18435b, this.f18436c, this.f18437d, this.f18438e, (t0.n) obj, t0.t.H0(this.f18439f | 1), this.f18440g);
        return Unit.f23355a;
    }
}
