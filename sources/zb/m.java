package zb;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f42292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f42293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f42294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f42295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f42296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42297f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, boolean z11, float f10, float f11, float f12, int i10) {
        super(2);
        this.f42292a = z10;
        this.f42293b = z11;
        this.f42294c = f10;
        this.f42295d = f11;
        this.f42296e = f12;
        this.f42297f = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yk.j.q(this.f42292a, this.f42293b, this.f42294c, this.f42295d, this.f42296e, (t0.n) obj, t0.t.H0(this.f42297f | 1));
        return Unit.f23355a;
    }
}
