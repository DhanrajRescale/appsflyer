package d2;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13365a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f13367c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, yt.a aVar) {
        super(2, aVar);
        this.f13367c = c1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        b1 b1Var = new b1(this.f13367c, aVar);
        b1Var.f13366b = obj;
        return b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((b1) create((c2) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
        return zt.a.f42823a;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f13365a;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            c2 c2Var = (c2) this.f13366b;
            this.f13366b = c2Var;
            c1 c1Var = this.f13367c;
            this.f13365a = 1;
            qu.i iVar = new qu.i(1, zt.f.b(this));
            iVar.s();
            p2.d0 d0Var = c1Var.f13381b;
            p2.x xVar = d0Var.f30532a;
            xVar.c();
            d0Var.f30533b.set(new p2.i0(d0Var, xVar));
            iVar.u(new y0(i11, c2Var, c1Var));
            Object p10 = iVar.p();
            if (p10 == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (p10 == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
