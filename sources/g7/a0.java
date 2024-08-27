package g7;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class a0 extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i10, Object obj, yt.a aVar) {
        super(3, aVar);
        this.f16643a = i10;
        this.f16644b = obj;
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f16643a) {
            case 0:
                return i((yt.a) obj3);
            default:
                return i((yt.a) obj3);
        }
    }

    public final Unit i(yt.a aVar) {
        int i10 = this.f16643a;
        Object obj = this.f16644b;
        switch (i10) {
            case 0:
                a3.a.u(obj);
                return (Unit) new a0(0, null, aVar).invokeSuspend(Unit.f23355a);
            default:
                return (Unit) new a0(1, (d1) obj, aVar).invokeSuspend(Unit.f23355a);
        }
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f16643a;
        Object obj2 = this.f16644b;
        switch (i10) {
            case 0:
                zt.a aVar = zt.a.f42823a;
                ut.n.b(obj);
                a3.a.u(obj2);
                return Unit.f23355a;
            default:
                zt.a aVar2 = zt.a.f42823a;
                ut.n.b(obj);
                ((d1) obj2).getClass();
                return Unit.f23355a;
        }
    }
}
