package hf;

import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.ui.home.homepage.data.MarketCategory;
import e0.j0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import qu.f0;

/* loaded from: classes.dex */
public final class r extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f18398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18399c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f18400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f18401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(j0 j0Var, int i10, List list, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f18398b = j0Var;
        this.f18399c = i10;
        this.f18400d = list;
        this.f18401e = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new r(this.f18398b, this.f18399c, this.f18400d, this.f18401e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18397a;
        int i11 = this.f18399c;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f18397a = 1;
            if (this.f18398b.f(i11, s0.g.f34069a, w.e.v(s0.g.f34069a, null, 7), this) == aVar) {
                return aVar;
            }
        }
        this.f18401e.invoke(HttpUrl.FRAGMENT_ENCODE_SET, new AnalyticEvent("app_home_card_tapped", dp.b.b1(null, new Integer(i11), null, ((MarketCategory) this.f18400d.get(i11)).getTitle(), 16)));
        return Unit.f23355a;
    }
}
