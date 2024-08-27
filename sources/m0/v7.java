package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v7 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f26979c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f26982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.c f26983g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f26984h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f26985i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f26986j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f26987k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7(int i10, g1.o oVar, long j10, long j11, float f10, hu.c cVar, Function2 function2, Function2 function22, int i11, int i12, int i13) {
        super(2);
        this.f26977a = i13;
        this.f26978b = i10;
        this.f26979c = oVar;
        this.f26980d = j10;
        this.f26981e = j11;
        this.f26982f = f10;
        this.f26983g = cVar;
        this.f26984h = function2;
        this.f26985i = function22;
        this.f26986j = i11;
        this.f26987k = i12;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26977a;
        int i12 = this.f26986j;
        switch (i11) {
            case 0:
                z7.a(this.f26978b, this.f26979c, this.f26980d, this.f26981e, this.f26982f, this.f26983g, this.f26984h, this.f26985i, nVar, t0.t.H0(i12 | 1), this.f26987k);
                return;
            default:
                r0.k3.a(this.f26978b, this.f26979c, this.f26980d, this.f26981e, this.f26982f, this.f26983g, this.f26984h, this.f26985i, nVar, t0.t.H0(i12 | 1), this.f26987k);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26977a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
