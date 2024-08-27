package e0;

import a2.c1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y.q1;

/* loaded from: classes.dex */
public final class i0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f14709b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f14710c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, float f10, int i10, yt.a aVar) {
        super(2, aVar);
        this.f14709b = j0Var;
        this.f14710c = f10;
        this.f14711d = i10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i0(this.f14709b, this.f14710c, this.f14711d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((q1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f14708a;
        j0 j0Var = this.f14709b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f14708a = 1;
            Object d10 = j0Var.f14737w.d(this);
            if (d10 != aVar) {
                d10 = Unit.f23355a;
            }
            if (d10 == aVar) {
                return aVar;
            }
        }
        float f10 = this.f14710c;
        double d11 = f10;
        if (-0.5d <= d11 && d11 <= 0.5d) {
            int h10 = j0Var.h(this.f14711d);
            c0 c0Var = j0Var.f14718d;
            c0Var.f14650b.j(h10);
            c0Var.f14654f.b(h10);
            c0Var.f14651c.j(f10);
            c0Var.f14653e = null;
            c1 c1Var = (c1) j0Var.f14738x.getValue();
            if (c1Var != null) {
                ((androidx.compose.ui.node.a) c1Var).j();
            }
            return Unit.f23355a;
        }
        throw new IllegalArgumentException(jr.h.m("pageOffsetFraction ", f10, " is not within the range -0.5 to 0.5").toString());
    }
}
