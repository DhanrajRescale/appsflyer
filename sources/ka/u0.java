package ka;

import com.assetgro.stockgro.feature_market.data.remote.PositionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class u0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f22958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(g1 g1Var, g1 g1Var2, yt.a aVar, boolean z10) {
        super(2, aVar);
        this.f22958a = g1Var;
        this.f22959b = z10;
        this.f22960c = g1Var2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        boolean z10 = this.f22959b;
        return new u0(this.f22958a, this.f22960c, aVar, z10);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        PositionItem positionItem = (PositionItem) this.f22958a.getValue();
        if (positionItem != null && positionItem.getLots() > 0) {
            boolean z10 = this.f22959b;
            g1 g1Var = this.f22960c;
            if (z10) {
                g1Var.setValue(new Integer(1));
            } else {
                g1Var.setValue(new Integer(positionItem.getLots()));
            }
        }
        return Unit.f23355a;
    }
}
