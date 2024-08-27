package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g5 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26206c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26210g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26211h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h5 f26212i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a2.o0 f26213j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(int i10, int i11, a2.a1 a1Var, a2.a1 a1Var2, a2.a1 a1Var3, a2.a1 a1Var4, a2.a1 a1Var5, a2.a1 a1Var6, h5 h5Var, a2.o0 o0Var) {
        super(1);
        this.f26204a = i10;
        this.f26205b = i11;
        this.f26206c = a1Var;
        this.f26207d = a1Var2;
        this.f26208e = a1Var3;
        this.f26209f = a1Var4;
        this.f26210g = a1Var5;
        this.f26211h = a1Var6;
        this.f26212i = h5Var;
        this.f26213j = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        float e10;
        a2.z0 z0Var = (a2.z0) obj;
        h5 h5Var = this.f26212i;
        float f10 = h5Var.f26243c;
        a2.o0 o0Var = this.f26213j;
        float b10 = o0Var.b();
        w2.k layoutDirection = o0Var.getLayoutDirection();
        float f11 = f5.f26167a;
        b0.h1 h1Var = h5Var.f26244d;
        int b11 = ku.c.b(h1Var.c() * b10);
        int b12 = ku.c.b(androidx.compose.foundation.layout.a.h(h1Var, layoutDirection) * b10);
        float f12 = m8.f26507c * b10;
        int i12 = this.f26204a;
        a2.a1 a1Var = this.f26206c;
        if (a1Var != null) {
            a2.z0.g(z0Var, a1Var, 0, Math.round((1 + s0.g.f34069a) * ((i12 - a1Var.f30b) / 2.0f)));
        }
        a2.a1 a1Var2 = this.f26207d;
        if (a1Var2 != null) {
            a2.z0.g(z0Var, a1Var2, this.f26205b - a1Var2.f29a, Math.round((1 + s0.g.f34069a) * ((i12 - a1Var2.f30b) / 2.0f)));
        }
        boolean z10 = h5Var.f26242b;
        a2.a1 a1Var3 = this.f26209f;
        if (a1Var3 != null) {
            if (z10) {
                i11 = Math.round((1 + s0.g.f34069a) * ((i12 - a1Var3.f30b) / 2.0f));
            } else {
                i11 = b11;
            }
            int A0 = hl.f.A0(i11, f10, -(a1Var3.f30b / 2));
            if (a1Var == null) {
                e10 = 0.0f;
            } else {
                e10 = (1 - f10) * (m8.e(a1Var) - f12);
            }
            a2.z0.g(z0Var, a1Var3, ku.c.b(e10) + b12, A0);
        }
        a2.a1 a1Var4 = this.f26208e;
        if (z10) {
            i10 = Math.round((1 + s0.g.f34069a) * ((i12 - a1Var4.f30b) / 2.0f));
        } else {
            i10 = b11;
        }
        a2.z0.g(z0Var, a1Var4, m8.e(a1Var), Math.max(i10, m8.d(a1Var3) / 2));
        a2.a1 a1Var5 = this.f26210g;
        if (a1Var5 != null) {
            if (z10) {
                b11 = Math.round((1 + s0.g.f34069a) * ((i12 - a1Var5.f30b) / 2.0f));
            }
            a2.z0.g(z0Var, a1Var5, m8.e(a1Var), Math.max(b11, m8.d(a1Var3) / 2));
        }
        a2.z0.e(this.f26211h, w2.h.f38791b, s0.g.f34069a);
        return Unit.f23355a;
    }
}
