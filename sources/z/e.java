package z;

import e0.e0;
import e0.j0;
import e0.z;
import iu.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qu.f0;
import w.b0;
import w.o;
import y.q1;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public w f41856a;

    /* renamed from: b, reason: collision with root package name */
    public int f41857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f41858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f41859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f41860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q1 f41861f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(float f10, q1 q1Var, h hVar, yt.a aVar, Function1 function1) {
        super(2, aVar);
        this.f41858c = hVar;
        this.f41859d = f10;
        this.f41860e = function1;
        this.f41861f = q1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        h hVar = this.f41858c;
        return new e(this.f41859d, this.f41861f, hVar, aVar, this.f41860e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [iu.w, java.lang.Object] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        float signum;
        float signum2;
        Function1 function1;
        e eVar;
        Object b10;
        w wVar;
        zt.a aVar = zt.a.f42823a;
        int i11 = this.f41857b;
        Function1 function12 = this.f41860e;
        h hVar = this.f41858c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ut.n.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w wVar2 = this.f41856a;
            ut.n.b(obj);
            wVar = wVar2;
            eVar = this;
            function1 = function12;
            b10 = obj;
        } else {
            ut.n.b(obj);
            b bVar = hVar.f41868a;
            j0 j0Var = bVar.f41845a;
            int k10 = ((z) j0Var.f14730p.getValue()).f14822c + j0Var.k();
            b0 b0Var = bVar.f41847c;
            float f10 = this.f41859d;
            float k11 = w.e.k(b0Var, f10);
            if (f10 < s0.g.f34069a) {
                i10 = j0Var.f14719e + 1;
            } else {
                i10 = j0Var.f14719e;
            }
            int f11 = kotlin.ranges.d.f(((int) (k11 / k10)) + i10, 0, j0Var.j());
            j0Var.k();
            int i12 = ((z) j0Var.f14730p.getValue()).f14822c;
            long j10 = i10;
            long j11 = ((e0) bVar.f41848d).f14658a;
            int b11 = (int) kotlin.ranges.d.b(j10 - j11);
            long j12 = j10 + j11;
            if (j12 > 2147483647L) {
                j12 = 2147483647L;
            }
            int abs = Math.abs((kotlin.ranges.d.f(kotlin.ranges.d.f(f11, b11, (int) j12), 0, j0Var.j()) - i10) * k10) - k10;
            if (abs < 0) {
                abs = 0;
            }
            if (abs == 0) {
                signum = abs;
            } else {
                signum = abs * Math.signum(f10);
            }
            if (Float.isNaN(signum)) {
                b bVar2 = hVar.f41868a;
                float a10 = bVar2.a(Float.POSITIVE_INFINITY);
                float a11 = bVar2.a(Float.NEGATIVE_INFINITY);
                if (h.d(a10) && h.d(a11)) {
                    a11 = a10 - a11;
                } else if (h.d(a10)) {
                    a11 = a10;
                } else if (!h.d(a11)) {
                    a11 = s0.g.f34069a;
                }
                signum2 = kotlin.ranges.d.a(Math.abs(w.e.k(hVar.f41869b, f10)) - a11, s0.g.f34069a);
                if (signum2 != s0.g.f34069a) {
                    signum2 *= Math.signum(f10);
                }
            } else {
                signum2 = Math.signum(f10) * Math.abs(signum);
            }
            ?? obj2 = new Object();
            obj2.f20557a = signum2;
            function1 = function12;
            function1.invoke(new Float(signum2));
            eVar = this;
            h hVar2 = eVar.f41858c;
            q1 q1Var = eVar.f41861f;
            float f12 = obj2.f20557a;
            float f13 = eVar.f41859d;
            d dVar = new d(obj2, function1, 1);
            eVar.f41856a = obj2;
            eVar.f41857b = 1;
            b10 = h.b(hVar2, q1Var, f12, f13, dVar, this);
            wVar = obj2;
            if (b10 == aVar) {
                return aVar;
            }
        }
        o oVar = (o) b10;
        float a12 = hVar.f41868a.a(((Number) oVar.b()).floatValue());
        wVar.f20557a = a12;
        q1 q1Var2 = eVar.f41861f;
        o m10 = w.e.m(oVar, s0.g.f34069a, s0.g.f34069a, 30);
        w.n nVar = hVar.f41870c;
        d dVar2 = new d(wVar, function1, 0);
        eVar.f41856a = null;
        eVar.f41857b = 2;
        Object b12 = l.b(q1Var2, a12, a12, m10, nVar, dVar2, this);
        if (b12 == aVar) {
            return aVar;
        }
        return b12;
    }
}
