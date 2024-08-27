package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f32817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f32818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f32819c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z2 z2Var, float f10, yt.a aVar) {
        super(2, aVar);
        this.f32818b = z2Var;
        this.f32819c = f10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new y1(this.f32818b, this.f32819c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object M;
        Object obj2 = zt.a.f42823a;
        int i10 = this.f32817a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f32817a = 1;
            t tVar = this.f32818b.f32833c;
            Object value = tVar.f32721f.getValue();
            float g10 = tVar.g();
            float f10 = this.f32819c;
            Object c10 = tVar.c(g10, f10, value);
            if (((Boolean) tVar.f32718c.invoke(c10)).booleanValue()) {
                M = al.d.M(tVar, c10, f10, this);
                if (M != obj2) {
                    M = Unit.f23355a;
                }
            } else {
                M = al.d.M(tVar, value, f10, this);
                if (M != obj2) {
                    M = Unit.f23355a;
                }
            }
            if (M != obj2) {
                M = Unit.f23355a;
            }
            if (M == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
