package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26813a;

    /* renamed from: b, reason: collision with root package name */
    public int f26814b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26815c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f26816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(y.w0 w0Var, Function2 function2, yt.a aVar, int i10) {
        super(3, aVar);
        this.f26813a = i10;
        this.f26816d = w0Var;
        this.f26815c = function2;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f26813a) {
            case 0:
                return new t((v) this.f26816d, (Function2) this.f26815c, (yt.a) obj3, 0).invokeSuspend(Unit.f23355a);
            case 1:
                return new t((r0.q) this.f26816d, (Function2) this.f26815c, (yt.a) obj3, 1).invokeSuspend(Unit.f23355a);
            default:
                t tVar = new t((yt.a) obj3);
                tVar.f26816d = (g7.d1) obj;
                tVar.f26815c = (g7.d1) obj2;
                return tVar.invokeSuspend(Unit.f23355a);
        }
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26813a) {
            case 0:
                zt.a aVar = zt.a.f42823a;
                int i10 = this.f26814b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ut.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ut.n.b(obj);
                    u uVar = ((v) this.f26816d).f26916a;
                    Function2 function2 = (Function2) this.f26815c;
                    this.f26814b = 1;
                    if (function2.invoke(uVar, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f23355a;
            case 1:
                zt.a aVar2 = zt.a.f42823a;
                int i11 = this.f26814b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ut.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ut.n.b(obj);
                    u uVar2 = ((r0.q) this.f26816d).f32673a;
                    Function2 function22 = (Function2) this.f26815c;
                    this.f26814b = 1;
                    if (function22.invoke(uVar2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f23355a;
            default:
                zt.a aVar3 = zt.a.f42823a;
                int i12 = this.f26814b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        g7.d1 d1Var = (g7.d1) this.f26816d;
                        ut.n.b(obj);
                        return d1Var;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.n.b(obj);
                g7.d1 d1Var2 = (g7.d1) this.f26816d;
                g7.d1 d1Var3 = (g7.d1) this.f26815c;
                this.f26816d = d1Var3;
                this.f26814b = 1;
                ((qu.o1) d1Var2.f16707b.f31453e).a(null);
                if (Unit.f23355a != aVar3) {
                    return d1Var3;
                }
                return aVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(yt.a aVar) {
        super(3, aVar);
        this.f26813a = 2;
    }
}
