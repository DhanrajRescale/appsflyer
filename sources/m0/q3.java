package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q3 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26671c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26675g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(long j10, j2.g0 g0Var, Float f10, Function2 function2, int i10, int i11) {
        super(2);
        this.f26669a = 2;
        this.f26673e = j10;
        this.f26670b = g0Var;
        this.f26671c = f10;
        this.f26672d = function2;
        this.f26674f = i10;
        this.f26675g = i11;
    }

    public final void a(t0.n nVar, int i10) {
        Object obj = this.f26671c;
        int i11 = this.f26669a;
        int i12 = this.f26674f;
        Object obj2 = this.f26672d;
        Object obj3 = this.f26670b;
        switch (i11) {
            case 0:
                s3.a((q1.b) obj3, (String) obj, (g1.o) obj2, this.f26673e, nVar, t0.t.H0(i12 | 1), this.f26675g);
                return;
            case 1:
                r0.a1.a((q1.b) obj3, (String) obj, (g1.o) obj2, this.f26673e, nVar, t0.t.H0(i12 | 1), this.f26675g);
                return;
            default:
                m8.b(this.f26673e, (j2.g0) obj3, (Float) obj, (Function2) obj2, nVar, t0.t.H0(i12 | 1), this.f26675g);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26669a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(q1.b bVar, String str, g1.o oVar, long j10, int i10, int i11, int i12) {
        super(2);
        this.f26669a = i12;
        this.f26670b = bVar;
        this.f26671c = str;
        this.f26672d = oVar;
        this.f26673e = j10;
        this.f26674f = i10;
        this.f26675g = i11;
    }
}
