package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j7 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f26343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f26344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.l f26346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f26347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f26348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hu.c f26349h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26350i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f26351j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(boolean z10, Function0 function0, g1.o oVar, boolean z11, a0.l lVar, long j10, long j11, hu.c cVar, int i10, int i11) {
        super(2);
        this.f26342a = z10;
        this.f26343b = function0;
        this.f26344c = oVar;
        this.f26345d = z11;
        this.f26346e = lVar;
        this.f26347f = j10;
        this.f26348g = j11;
        this.f26349h = cVar;
        this.f26350i = i10;
        this.f26351j = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        m7.b(this.f26342a, this.f26343b, this.f26344c, this.f26345d, this.f26346e, this.f26347f, this.f26348g, this.f26349h, (t0.n) obj, t0.t.H0(this.f26350i | 1), this.f26351j);
        return Unit.f23355a;
    }
}
