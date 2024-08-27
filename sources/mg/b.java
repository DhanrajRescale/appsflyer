package mg;

import g1.o;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.s;
import t0.n;
import t0.t;

/* loaded from: classes.dex */
public final class b extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f27738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27740c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f27743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f27744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27745h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o oVar, String str, long j10, long j11, int i10, s sVar, int i11, int i12) {
        super(2);
        this.f27738a = oVar;
        this.f27739b = str;
        this.f27740c = j10;
        this.f27741d = j11;
        this.f27742e = i10;
        this.f27743f = sVar;
        this.f27744g = i11;
        this.f27745h = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        zq.f.c(this.f27738a, this.f27739b, this.f27740c, this.f27741d, this.f27742e, this.f27743f, (n) obj, t.H0(this.f27744g | 1), this.f27745h);
        return Unit.f23355a;
    }
}
