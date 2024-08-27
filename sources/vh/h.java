package vh;

import au.i;
import ka.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.i0;
import t0.g1;
import ut.n;
import x1.z;
import y.d0;
import y.h0;
import y.k0;
import y.m0;

/* loaded from: classes.dex */
public final class h extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f38079a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f38081c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f38082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z10, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f38081c = z10;
        this.f38082d = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        h hVar = new h(this.f38081c, this.f38082d, aVar);
        hVar.f38080b = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f38079a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            z zVar = (z) this.f38080b;
            if (this.f38081c) {
                a1 a1Var = new a1(this.f38082d, 4);
                this.f38079a = 1;
                d0 d0Var = m0.f40854a;
                Object h10 = i0.h(zVar, new k0(h0.f40746b, a1Var, y.i0.f40765c, y.i0.f40764b, null), this);
                if (h10 != obj2) {
                    h10 = Unit.f23355a;
                }
                if (h10 == obj2) {
                    return obj2;
                }
            }
        }
        return Unit.f23355a;
    }
}
