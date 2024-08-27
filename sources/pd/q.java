package pd;

import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class q extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f30942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1.s f30943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupCreateViewModel f30944c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f30945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f30946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g1 g1Var, e1.s sVar, GroupCreateViewModel groupCreateViewModel, g1 g1Var2, g1 g1Var3) {
        super(3);
        this.f30942a = g1Var;
        this.f30943b = sVar;
        this.f30944c = groupCreateViewModel;
        this.f30945d = g1Var2;
        this.f30946e = g1Var3;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        v.r AnimatedVisibility = (v.r) obj;
        t0.n nVar = (t0.n) obj2;
        ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        pp.b.j(androidx.compose.foundation.layout.d.f1286c, null, 0L, 0L, null, s0.g.f34069a, b1.d.c(-699895839, new m0.z(this.f30942a, this.f30943b, this.f30944c, this.f30945d, this.f30946e, 4), nVar), nVar, 1572870, 62);
        return Unit.f23355a;
    }
}
