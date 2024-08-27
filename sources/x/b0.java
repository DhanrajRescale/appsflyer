package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f39501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1.p f39502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f39503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f39504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f39505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f39506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f39507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p1.m f39508h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z10, n1.p pVar, long j10, float f10, float f11, long j11, long j12, p1.m mVar) {
        super(1);
        this.f39501a = z10;
        this.f39502b = pVar;
        this.f39503c = j10;
        this.f39504d = f10;
        this.f39505e = f11;
        this.f39506f = j11;
        this.f39507g = j12;
        this.f39508h = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c2.j0 j0Var = (c2.j0) ((p1.e) obj);
        j0Var.a();
        if (this.f39501a) {
            p1.h.h(j0Var, this.f39502b, 0L, 0L, this.f39503c, null, 246);
        } else {
            long j10 = this.f39503c;
            float b10 = m1.a.b(j10);
            float f10 = this.f39504d;
            if (b10 < f10) {
                float f11 = this.f39505e;
                p1.c cVar = j0Var.f7740a;
                float e10 = m1.f.e(cVar.d());
                float f12 = this.f39505e;
                float f13 = e10 - f12;
                float c10 = m1.f.c(cVar.d()) - f12;
                n1.p pVar = this.f39502b;
                long j11 = this.f39503c;
                p1.b bVar = cVar.f30501b;
                long b11 = bVar.b();
                bVar.a().h();
                bVar.f30498a.f30504a.a().q(f11, f11, f13, c10, 0);
                p1.h.h(j0Var, pVar, 0L, 0L, j11, null, 246);
                bVar.a().s();
                bVar.c(b11);
            } else {
                p1.h.h(j0Var, this.f39502b, this.f39506f, this.f39507g, androidx.compose.foundation.a.q(j10, f10), this.f39508h, 208);
            }
        }
        return Unit.f23355a;
    }
}
