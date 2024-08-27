package y;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class o0 extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40872a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i10, yt.a aVar) {
        super(3, aVar);
        this.f40872a = i10;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10 = 0;
        int i11 = 2;
        int i12 = this.f40872a;
        switch (i12) {
            case 0:
                long j10 = ((m1.c) obj2).f27237a;
                yt.a aVar = (yt.a) obj3;
                switch (i12) {
                    case 0:
                        return new o0(i10, aVar).invokeSuspend(Unit.f23355a);
                    default:
                        return new o0(i11, aVar).invokeSuspend(Unit.f23355a);
                }
            case 1:
                ((Number) obj2).floatValue();
                return new o0(1, (yt.a) obj3).invokeSuspend(Unit.f23355a);
            case 2:
                long j11 = ((m1.c) obj2).f27237a;
                yt.a aVar2 = (yt.a) obj3;
                switch (i12) {
                    case 0:
                        return new o0(i10, aVar2).invokeSuspend(Unit.f23355a);
                    default:
                        return new o0(i11, aVar2).invokeSuspend(Unit.f23355a);
                }
            case 3:
                long j12 = ((m1.c) obj2).f27237a;
                return new o0(3, (yt.a) obj3).invokeSuspend(Unit.f23355a);
            default:
                ((Number) obj).intValue();
                return new o0(4, (yt.a) obj3).invokeSuspend(Unit.f23355a);
        }
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f40872a) {
            case 0:
                zt.a aVar = zt.a.f42823a;
                ut.n.b(obj);
                return Unit.f23355a;
            case 1:
                zt.a aVar2 = zt.a.f42823a;
                ut.n.b(obj);
                return Unit.f23355a;
            case 2:
                zt.a aVar3 = zt.a.f42823a;
                ut.n.b(obj);
                return Unit.f23355a;
            case 3:
                zt.a aVar4 = zt.a.f42823a;
                ut.n.b(obj);
                return Unit.f23355a;
            default:
                zt.a aVar5 = zt.a.f42823a;
                ut.n.b(obj);
                return Boolean.FALSE;
        }
    }
}
