package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f7667b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(0);
        this.f7666a = i10;
        this.f7667b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        d dVar = this.f7667b;
        int i10 = this.f7666a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        dVar.S0();
                        break;
                    default:
                        g1.m mVar = dVar.f7668n;
                        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                        ((b2.d) mVar).f(dVar);
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        dVar.S0();
                        break;
                    default:
                        g1.m mVar2 = dVar.f7668n;
                        Intrinsics.d(mVar2, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                        ((b2.d) mVar2).f(dVar);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
