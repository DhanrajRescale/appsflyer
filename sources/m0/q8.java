package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q8 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26688c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26692g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26693h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26694i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r8 f26695j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f26696k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f26697l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a2.o0 f26698m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(a2.a1 a1Var, int i10, int i11, int i12, int i13, a2.a1 a1Var2, a2.a1 a1Var3, a2.a1 a1Var4, a2.a1 a1Var5, r8 r8Var, int i14, int i15, a2.o0 o0Var) {
        super(1);
        this.f26686a = a1Var;
        this.f26687b = i10;
        this.f26688c = i11;
        this.f26689d = i12;
        this.f26690e = i13;
        this.f26691f = a1Var2;
        this.f26692g = a1Var3;
        this.f26693h = a1Var4;
        this.f26694i = a1Var5;
        this.f26695j = r8Var;
        this.f26696k = i14;
        this.f26697l = i15;
        this.f26698m = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int b10;
        a2.z0 z0Var = (a2.z0) obj;
        a2.a1 a1Var = this.f26691f;
        a2.o0 o0Var = this.f26698m;
        a2.a1 a1Var2 = this.f26694i;
        a2.a1 a1Var3 = this.f26693h;
        a2.a1 a1Var4 = this.f26692g;
        int i11 = this.f26690e;
        int i12 = this.f26689d;
        r8 r8Var = this.f26695j;
        a2.a1 a1Var5 = this.f26686a;
        if (a1Var5 != null) {
            int i13 = this.f26687b - this.f26688c;
            if (i13 < 0) {
                i13 = 0;
            }
            boolean z10 = r8Var.f26748a;
            int i14 = this.f26696k + this.f26697l;
            float b11 = o0Var.b();
            float f10 = p8.f26655a;
            if (a1Var3 != null) {
                a2.z0.g(z0Var, a1Var3, 0, Math.round((1 + s0.g.f34069a) * ((i11 - a1Var3.f30b) / 2.0f)));
            }
            if (a1Var2 != null) {
                a2.z0.g(z0Var, a1Var2, i12 - a1Var2.f29a, Math.round((1 + s0.g.f34069a) * ((i11 - a1Var2.f30b) / 2.0f)));
            }
            if (z10) {
                b10 = Math.round((1 + s0.g.f34069a) * ((i11 - a1Var5.f30b) / 2.0f));
            } else {
                b10 = ku.c.b(m8.f26506b * b11);
            }
            a2.z0.g(z0Var, a1Var5, m8.e(a1Var3), b10 - ku.c.b((b10 - i13) * r8Var.f26749b));
            a2.z0.g(z0Var, a1Var, m8.e(a1Var3), i14);
            if (a1Var4 != null) {
                a2.z0.g(z0Var, a1Var4, m8.e(a1Var3), i14);
            }
        } else {
            boolean z11 = r8Var.f26748a;
            float b12 = o0Var.b();
            float f11 = p8.f26655a;
            int b13 = ku.c.b(r8Var.f26750c.c() * b12);
            if (a1Var3 != null) {
                a2.z0.g(z0Var, a1Var3, 0, Math.round((1 + s0.g.f34069a) * ((i11 - a1Var3.f30b) / 2.0f)));
            }
            if (a1Var2 != null) {
                a2.z0.g(z0Var, a1Var2, i12 - a1Var2.f29a, Math.round((1 + s0.g.f34069a) * ((i11 - a1Var2.f30b) / 2.0f)));
            }
            if (z11) {
                i10 = Math.round((1 + s0.g.f34069a) * ((i11 - a1Var.f30b) / 2.0f));
            } else {
                i10 = b13;
            }
            a2.z0.g(z0Var, a1Var, m8.e(a1Var3), i10);
            if (a1Var4 != null) {
                if (z11) {
                    b13 = Math.round((1 + s0.g.f34069a) * ((i11 - a1Var4.f30b) / 2.0f));
                }
                a2.z0.g(z0Var, a1Var4, m8.e(a1Var3), b13);
            }
        }
        return Unit.f23355a;
    }
}
