package o8;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.r0;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f29803a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f29805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, yt.a aVar) {
        super(2, aVar);
        this.f29805c = nVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        j jVar = new j(this.f29805c, aVar);
        jVar.f29804b = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((y8.j) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        z8.f fVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f29803a;
        q1.b bVar = null;
        if (i10 != 0) {
            if (i10 == 1) {
                nVar = (n) this.f29804b;
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            y8.j jVar = (y8.j) this.f29804b;
            n nVar2 = this.f29805c;
            n8.i iVar = (n8.i) nVar2.f29827s.getValue();
            y8.h a10 = y8.j.a(jVar);
            a10.f41339d = new l(nVar2);
            a10.M = null;
            a10.N = null;
            a10.O = null;
            y8.d dVar = jVar.L;
            if (dVar.f41317b == null) {
                a10.K = new l(nVar2);
                a10.M = null;
                a10.N = null;
                a10.O = null;
            }
            if (dVar.f41318c == null) {
                a2.l lVar = nVar2.f29822n;
                z8.e eVar = a0.f29785b;
                if (!Intrinsics.a(lVar, a2.k.f97b) && !Intrinsics.a(lVar, a2.k.f99d)) {
                    fVar = z8.f.f42183a;
                } else {
                    fVar = z8.f.f42184b;
                }
                a10.L = fVar;
            }
            if (dVar.f41324i != z8.d.f42178a) {
                a10.f41345j = z8.d.f42179b;
            }
            y8.j a11 = a10.a();
            this.f29804b = nVar2;
            this.f29803a = 1;
            n8.o oVar = (n8.o) iVar;
            oVar.getClass();
            xu.e eVar2 = r0.f32255a;
            obj = yk.g.e0(((ru.d) vu.u.f38408a).f34006f, new n8.k(oVar, a11, null), this);
            if (obj == aVar) {
                return aVar;
            }
            nVar = nVar2;
        }
        y8.k kVar = (y8.k) obj;
        nVar.getClass();
        if (kVar instanceof y8.p) {
            y8.p pVar = (y8.p) kVar;
            return new h(nVar.j(pVar.f41406a), pVar);
        }
        if (kVar instanceof y8.e) {
            y8.e eVar3 = (y8.e) kVar;
            Drawable drawable = eVar3.f41331a;
            if (drawable != null) {
                bVar = nVar.j(drawable);
            }
            return new f(bVar, eVar3);
        }
        throw new NoWhenBranchMatchedException();
    }
}
