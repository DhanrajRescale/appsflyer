package bj;

import ba.qn;
import i5.c0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f7005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i10) {
        super(1);
        this.f7004a = i10;
        this.f7005b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f7004a;
        f fVar = this.f7005b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                qn qnVar = (qn) fVar.q();
                qn qnVar2 = (qn) fVar.q();
                new yo.n(qnVar.f5880s, qnVar2.f5881t, new c0(list)).a();
                a aVar = fVar.f7007g;
                if (aVar != null) {
                    aVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("stockAnalysisAdapter");
                throw null;
            default:
                zi.k it = (zi.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i11 = aj.c.f442c;
                ni.g.c(it).show(fVar.getChildFragmentManager(), "MarketSectionTermBottomSheetDialogFragment");
                return Unit.f23355a;
        }
    }
}
