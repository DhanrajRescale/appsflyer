package e0;

import kotlin.jvm.functions.Function1;
import y.g1;

/* loaded from: classes.dex */
public final class x extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0.z f14799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f14801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f14803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1.b f14804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1.c f14805h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f14806i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14807j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(d0.z zVar, long j10, w wVar, long j11, g1 g1Var, g1.b bVar, g1.c cVar, boolean z10, int i10, int i11) {
        super(1);
        this.f14798a = i11;
        this.f14799b = zVar;
        this.f14800c = j10;
        this.f14801d = wVar;
        this.f14802e = j11;
        this.f14803f = g1Var;
        this.f14804g = bVar;
        this.f14805h = cVar;
        this.f14806i = z10;
        this.f14807j = i10;
    }

    public final k a(int i10) {
        switch (this.f14798a) {
            case 0:
                d0.z zVar = this.f14799b;
                return al.d.m0(zVar, i10, this.f14800c, this.f14801d, this.f14802e, this.f14803f, this.f14804g, this.f14805h, ((d0.a0) zVar).f13136b.getLayoutDirection(), this.f14806i, this.f14807j);
            default:
                d0.z zVar2 = this.f14799b;
                return al.d.m0(zVar2, i10, this.f14800c, this.f14801d, this.f14802e, this.f14803f, this.f14804g, this.f14805h, ((d0.a0) zVar2).f13136b.getLayoutDirection(), this.f14806i, this.f14807j);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f14798a) {
            case 0:
                return a(((Number) obj).intValue());
            default:
                return a(((Number) obj).intValue());
        }
    }
}
