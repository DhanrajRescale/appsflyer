package n9;

import a2.f1;
import android.graphics.Canvas;
import android.graphics.Matrix;
import j9.g0;
import j9.y;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j9.i f28472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.l f28473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.d f28474c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f28475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f28476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f28477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f28478g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Map f28479h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f28480i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f28481j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f28482k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f28483l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function0 f28484m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g1 f28485n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j9.i iVar, a2.l lVar, g1.d dVar, Matrix matrix, y yVar, boolean z10, g0 g0Var, Map map, boolean z11, boolean z12, boolean z13, boolean z14, Function0 function0, g1 g1Var) {
        super(1);
        this.f28472a = iVar;
        this.f28473b = lVar;
        this.f28474c = dVar;
        this.f28475d = matrix;
        this.f28476e = yVar;
        this.f28477f = z10;
        this.f28478g = g0Var;
        this.f28479h = map;
        this.f28480i = z11;
        this.f28481j = z12;
        this.f28482k = z13;
        this.f28483l = z14;
        this.f28484m = function0;
        this.f28485n = g1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p1.h Canvas = (p1.h) obj;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        n1.r a10 = Canvas.f0().a();
        j9.i iVar = this.f28472a;
        long j10 = t0.t.j(iVar.f21175j.width(), iVar.f21175j.height());
        long k10 = hl.f.k(ku.c.b(m1.f.e(Canvas.d())), ku.c.b(m1.f.c(Canvas.d())));
        long b10 = this.f28473b.b(j10, Canvas.d());
        long a11 = ((g1.g) this.f28474c).a(hl.f.k((int) (f1.a(b10) * m1.f.e(j10)), (int) (f1.b(b10) * m1.f.c(j10))), k10, Canvas.getLayoutDirection());
        Matrix matrix = this.f28475d;
        matrix.reset();
        int i10 = w2.h.f38792c;
        matrix.preTranslate((int) (a11 >> 32), (int) (a11 & 4294967295L));
        matrix.preScale(f1.a(b10), f1.b(b10));
        y yVar = this.f28476e;
        boolean z10 = yVar.f21235l;
        boolean z11 = this.f28477f;
        if (z10 != z11) {
            yVar.f21235l = z11;
            if (yVar.f21224a != null) {
                yVar.c();
            }
        }
        yVar.f21243t = this.f28478g;
        yVar.e();
        yVar.m(iVar);
        Map map = yVar.f21233j;
        Map map2 = this.f28479h;
        if (map2 != map) {
            yVar.f21233j = map2;
            yVar.invalidateSelf();
        }
        a3.a.u(this.f28485n.getValue());
        boolean z12 = yVar.f21241r;
        boolean z13 = this.f28480i;
        if (z12 != z13) {
            yVar.f21241r = z13;
            s9.c cVar = yVar.f21238o;
            if (cVar != null) {
                cVar.r(z13);
            }
        }
        yVar.f21242s = this.f28481j;
        yVar.f21236m = this.f28482k;
        boolean z14 = yVar.f21237n;
        boolean z15 = this.f28483l;
        if (z15 != z14) {
            yVar.f21237n = z15;
            s9.c cVar2 = yVar.f21238o;
            if (cVar2 != null) {
                cVar2.H = z15;
            }
            yVar.invalidateSelf();
        }
        yVar.x(((Number) this.f28484m.mo2invoke()).floatValue());
        yVar.setBounds(0, 0, iVar.f21175j.width(), iVar.f21175j.height());
        Canvas a12 = n1.d.a(a10);
        s9.c cVar3 = yVar.f21238o;
        j9.i iVar2 = yVar.f21224a;
        if (cVar3 != null && iVar2 != null) {
            if (yVar.f21244u) {
                a12.save();
                a12.concat(matrix);
                yVar.k(a12, cVar3);
                a12.restore();
            } else {
                cVar3.h(a12, matrix, yVar.f21239p);
            }
            yVar.H = false;
        }
        return Unit.f23355a;
    }
}
