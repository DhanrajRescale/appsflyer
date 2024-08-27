package y;

import android.os.Bundle;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionChain;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40911c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f40912d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, Object obj2, boolean z10, int i10) {
        super(1);
        this.f40909a = i10;
        this.f40911c = obj;
        this.f40912d = obj2;
        this.f40910b = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FnoOption identifierInfo;
        boolean z10;
        boolean z11 = this.f40910b;
        int i10 = this.f40909a;
        Object obj2 = this.f40912d;
        Object obj3 = this.f40911c;
        switch (i10) {
            case 0:
                x1.t tVar = (x1.t) obj;
                vl.b.c((y1.d) obj3, tVar);
                if (!t0.t.A(tVar)) {
                    long p02 = t0.t.p0(tVar, false);
                    tVar.a();
                    su.p pVar = (su.p) obj2;
                    if (z11) {
                        p02 = m1.c.i(p02, -1.0f);
                    }
                    pVar.o(new a0(p02));
                }
                return Unit.f23355a;
            case 3:
                return new r0.z2(z11, (w2.b) obj3, (r0.a3) obj, (Function1) obj2, false);
            default:
                OptionContract optionContract = (OptionContract) obj;
                Intrinsics.checkNotNullParameter(optionContract, "it");
                AnalyticEvent analyticEvent = new AnalyticEvent("app_market_fno_optlist_click", null, 2, null);
                OptionChainFragment optionChainFragment = (OptionChainFragment) obj3;
                optionChainFragment.z(analyticEvent);
                optionChainFragment.B(analyticEvent);
                androidx.navigation.t h10 = q6.l.h(optionChainFragment);
                OptionChain optionChain = (OptionChain) ((OptionChainViewModel) optionChainFragment.r()).f8586p.getValue();
                if (optionChain == null || (identifierInfo = optionChain.getIdentifierInfo()) == null) {
                    identifierInfo = (FnoOption) obj2;
                }
                Bundle arguments = optionChainFragment.getArguments();
                if (arguments != null) {
                    z10 = arguments.getBoolean("IS_MODEL");
                } else {
                    z10 = true;
                }
                Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
                Intrinsics.checkNotNullParameter(optionContract, "optionContract");
                h10.o(new ga.e(identifierInfo, optionContract, z10, z11));
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(w2.b bVar, Function1 function1, boolean z10) {
        super(1);
        this.f40909a = 3;
        this.f40910b = z10;
        this.f40911c = bVar;
        this.f40912d = function1;
    }
}
