package zb;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f42298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f42299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f42300c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f42301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f42302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f42303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1.o f42304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f42305h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f42306i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f42307j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f42308k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(float f10, boolean z10, float f11, float f12, String str, e eVar, g1.o oVar, boolean z11, Function2 function2, int i10, int i11) {
        super(2);
        this.f42298a = f10;
        this.f42299b = z10;
        this.f42300c = f11;
        this.f42301d = f12;
        this.f42302e = str;
        this.f42303f = eVar;
        this.f42304g = oVar;
        this.f42305h = z11;
        this.f42306i = function2;
        this.f42307j = i10;
        this.f42308k = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yk.j.s(this.f42298a, this.f42299b, this.f42300c, this.f42301d, this.f42302e, this.f42303f, this.f42304g, this.f42305h, this.f42306i, (t0.n) obj, t0.t.H0(this.f42307j | 1), this.f42308k);
        return Unit.f23355a;
    }
}
