package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class s1 extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40941a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ float f40942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40943c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(int i10, Object obj, yt.a aVar) {
        super(3, aVar);
        this.f40941a = i10;
        this.f40943c = obj;
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f40941a) {
            case 0:
                return i(((Number) obj2).floatValue(), (yt.a) obj3);
            default:
                return i(((Number) obj2).floatValue(), (yt.a) obj3);
        }
    }

    public final Object i(float f10, yt.a aVar) {
        int i10 = this.f40941a;
        Object obj = this.f40943c;
        switch (i10) {
            case 0:
                s1 s1Var = new s1(0, (t1) obj, aVar);
                s1Var.f40942b = f10;
                return s1Var.invokeSuspend(Unit.f23355a);
            default:
                s1 s1Var2 = new s1(1, (Function1) obj, aVar);
                s1Var2.f40942b = f10;
                return s1Var2.invokeSuspend(Unit.f23355a);
        }
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f40941a;
        Object obj2 = this.f40943c;
        switch (i10) {
            case 0:
                zt.a aVar = zt.a.f42823a;
                ut.n.b(obj);
                t1 t1Var = (t1) obj2;
                yk.g.H(t1Var.f40959q.c(), null, null, new r1(t1Var, this.f40942b, null), 3);
                return Unit.f23355a;
            default:
                zt.a aVar2 = zt.a.f42823a;
                ut.n.b(obj);
                ((Function1) obj2).invoke(new Float(this.f40942b));
                return Unit.f23355a;
        }
    }
}
