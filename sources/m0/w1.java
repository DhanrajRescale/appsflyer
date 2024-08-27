package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w1 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f27004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f27005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f27006c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f27007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f27009f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(g1.o oVar, long j10, float f10, float f11, int i10, int i11) {
        super(2);
        this.f27004a = oVar;
        this.f27005b = j10;
        this.f27006c = f10;
        this.f27007d = f11;
        this.f27008e = i10;
        this.f27009f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        pp.b.c(this.f27004a, this.f27005b, this.f27006c, this.f27007d, (t0.n) obj, t0.t.H0(this.f27008e | 1), this.f27009f);
        return Unit.f23355a;
    }
}
