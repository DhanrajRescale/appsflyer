package vb;

import j2.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import t0.g1;
import t0.t;

/* loaded from: classes.dex */
public final class l extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f37913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.j f37914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37915c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f37916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f37917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f37918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f37919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e0 e0Var, w2.j jVar, int i10, g1 g1Var, String str, g1 g1Var2, g1 g1Var3, yt.a aVar) {
        super(2, aVar);
        this.f37913a = e0Var;
        this.f37914b = jVar;
        this.f37915c = i10;
        this.f37916d = g1Var;
        this.f37917e = str;
        this.f37918f = g1Var2;
        this.f37919g = g1Var3;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new l(this.f37913a, this.f37914b, this.f37915c, this.f37916d, this.f37917e, this.f37918f, this.f37919g, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        w2.j jVar;
        m1.c cVar;
        int i10;
        m1.c cVar2;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        e0 e0Var = this.f37913a;
        if (e0Var != null && (jVar = this.f37914b) != null) {
            boolean booleanValue = ((Boolean) this.f37918f.getValue()).booleanValue();
            boolean z10 = true;
            j2.l lVar = e0Var.f20704b;
            long j10 = e0Var.f20705c;
            long j11 = jVar.f38798a;
            g1 g1Var = this.f37916d;
            if (!booleanValue) {
                int i11 = this.f37915c;
                int i12 = i11 - 1;
                if (i11 == lVar.f20735f && e0Var.p(i12)) {
                    int e10 = e0Var.e(i12, true) + 1;
                    while (true) {
                        i10 = e10 - 1;
                        if (e0Var.c(i10).f27239a <= ((int) (j10 >> 32)) - ((int) (j11 >> 32))) {
                            break;
                        }
                        e10 = i10;
                    }
                    m1.d c10 = e0Var.c(i10);
                    float f10 = c10.f27241c;
                    if (((int) (j11 >> 32)) + f10 > ((int) (j10 >> 32))) {
                        z10 = false;
                    }
                    float f11 = c10.f27242d;
                    if (z10) {
                        cVar2 = new m1.c(t.g(f10, f11 - ((int) (4294967295L & j11))));
                    } else {
                        cVar2 = new m1.c(t.g(s0.g.f34069a, f11));
                    }
                    g1Var.setValue(cVar2);
                    String substring = this.f37917e.substring(0, i10);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    this.f37919g.setValue(substring);
                }
            } else {
                m1.d c11 = e0Var.c(e0Var.e(lVar.f20735f - 1, true));
                float f12 = c11.f27241c;
                if (((int) (j11 >> 32)) + f12 > ((int) (j10 >> 32))) {
                    z10 = false;
                }
                float f13 = c11.f27242d;
                if (z10) {
                    cVar = new m1.c(t.g(f12, f13 - ((int) (4294967295L & j11))));
                } else {
                    cVar = new m1.c(t.g(s0.g.f34069a, f13));
                }
                g1Var.setValue(cVar);
            }
        }
        return Unit.f23355a;
    }
}
