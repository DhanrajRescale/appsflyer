package ka;

import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import com.assetgro.stockgro.feature_market.data.remote.PositionItem;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class t0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OptionContract f22954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22956c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(OptionContract optionContract, boolean z10, g1 g1Var, g1 g1Var2, yt.a aVar) {
        super(2, aVar);
        this.f22954a = optionContract;
        this.f22955b = z10;
        this.f22956c = g1Var;
        this.f22957d = g1Var2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t0(this.f22954a, this.f22955b, this.f22956c, this.f22957d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        g1 g1Var = this.f22956c;
        Map<String, PositionItem> openPositions = ((FnoPortfolio) g1Var.getValue()).getOpenPositions();
        OptionContract optionContract = this.f22954a;
        boolean containsKey = openPositions.containsKey(optionContract.getIdentifier());
        g1 g1Var2 = this.f22957d;
        String str2 = null;
        if (containsKey) {
            PositionItem positionItem = ((FnoPortfolio) g1Var.getValue()).getOpenPositions().get(optionContract.getIdentifier());
            boolean z10 = this.f22955b;
            if (!z10) {
                if (positionItem != null) {
                    str = positionItem.getType();
                } else {
                    str = null;
                }
                if (Intrinsics.a(str, "sell")) {
                    g1Var2.setValue(positionItem);
                }
            }
            if (z10) {
                if (positionItem != null) {
                    str2 = positionItem.getType();
                }
                if (Intrinsics.a(str2, "buy")) {
                    g1Var2.setValue(positionItem);
                }
            }
        } else {
            g1Var2.setValue(null);
        }
        return Unit.f23355a;
    }
}
