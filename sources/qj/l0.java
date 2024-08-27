package qj;

import ba.mh;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ScrollableRulerViewStopOnLine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public ScrollableRulerViewStopOnLine f32034a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f32035b;

    /* renamed from: c, reason: collision with root package name */
    public int f32036c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ScrollableRulerViewStopOnLine f32037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f32038e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ScrollableRulerViewStopOnLine scrollableRulerViewStopOnLine, g0 g0Var, yt.a aVar) {
        super(2, aVar);
        this.f32037d = scrollableRulerViewStopOnLine;
        this.f32038e = g0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new l0(this.f32037d, this.f32038e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        ScrollableRulerViewStopOnLine scrollableRulerViewStopOnLine;
        g0 g0Var;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f32036c;
        if (i10 != 0) {
            if (i10 == 1) {
                g0Var = this.f32035b;
                scrollableRulerViewStopOnLine = this.f32034a;
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            scrollableRulerViewStopOnLine = this.f32037d;
            scrollableRulerViewStopOnLine.getRulerValue();
            long j10 = scrollableRulerViewStopOnLine.f10725u;
            this.f32034a = scrollableRulerViewStopOnLine;
            g0 g0Var2 = this.f32038e;
            this.f32035b = g0Var2;
            this.f32036c = 1;
            if (kp.j.K(j10, this) == aVar) {
                return aVar;
            }
            g0Var = g0Var2;
        }
        int rulerValue = scrollableRulerViewStopOnLine.getRulerValue();
        OptionDetailFragment optionDetailFragment = ((ha.k) g0Var).f18090a;
        OptionDetailViewModel optionDetailViewModel = (OptionDetailViewModel) optionDetailFragment.r();
        OptionOverview optionOverview = (OptionOverview) optionDetailViewModel.f8596q.getValue();
        if (optionOverview != null) {
            OptionContract optionContract = optionOverview.getStrikes().get(rulerValue);
            String str = "Current Selected, Strike price: " + optionContract.getStrikePrice() + " premium: " + optionContract.getPremium();
            Object[] objArr = new Object[0];
            Intrinsics.checkNotNullParameter("OptionDetailViewModel", "tag");
            com.google.android.gms.internal.p002firebaseauthapi.a.g(str, "s", objArr, "params", "OptionDetailViewModel").getClass();
            ek.u.k(objArr);
            optionDetailViewModel.D.setValue(optionContract);
            optionDetailViewModel.n(optionContract);
        }
        optionDetailViewModel.j();
        optionDetailViewModel.m();
        ((mh) optionDetailFragment.q()).C.setText("--");
        ((mh) optionDetailFragment.q()).C.setTextColor(r3.k.getColor(optionDetailFragment.requireContext(), R.color.black_1A1A1A_40));
        return Unit.f23355a;
    }
}
