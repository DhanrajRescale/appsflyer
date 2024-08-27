package og;

import android.content.Intent;
import android.os.Bundle;
import ba.oh;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioFnoHoldingResponseDtoKt;
import com.assetgro.stockgro.feature_market.presentation.fno.OptionDetailHostActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f30048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i10) {
        super(1);
        this.f30047a = i10;
        this.f30048b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f30047a;
        int i11 = 1;
        j jVar = this.f30048b;
        switch (i10) {
            case 0:
                OptionValue optionValue = (OptionValue) obj;
                Intrinsics.checkNotNullParameter(optionValue, "optionValue");
                Intent intent = new Intent(jVar.requireContext(), (Class<?>) OptionDetailHostActivity.class);
                intent.putExtra("DATA", PortfolioFnoHoldingResponseDtoKt.toFnoOption(optionValue));
                intent.putExtra("CALL_FROM_PORTFOLIO", true);
                Bundle arguments = jVar.getArguments();
                if (arguments != null) {
                    intent.putExtras(arguments);
                }
                jVar.startActivity(intent);
                return Unit.f23355a;
            default:
                oh ohVar = (oh) jVar.q();
                h hVar = new h(jVar, (FnoPortfolioHolding) obj, i11);
                Object obj2 = b1.d.f3079a;
                ohVar.f5666s.setContent(new b1.c(hVar, true, 497514677));
                return Unit.f23355a;
        }
    }
}
