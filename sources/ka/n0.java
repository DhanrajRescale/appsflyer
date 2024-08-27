package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import t0.g1;

/* loaded from: classes.dex */
public final class n0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f22856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f22860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22861f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f22862g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f22863h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1 f22864i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, g1 g1Var6, g1 g1Var7, g1 g1Var8, g1 g1Var9, yt.a aVar) {
        super(2, aVar);
        this.f22856a = g1Var;
        this.f22857b = g1Var2;
        this.f22858c = g1Var3;
        this.f22859d = g1Var4;
        this.f22860e = g1Var5;
        this.f22861f = g1Var6;
        this.f22862g = g1Var7;
        this.f22863h = g1Var8;
        this.f22864i = g1Var9;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n0(this.f22856a, this.f22857b, this.f22858c, this.f22859d, this.f22860e, this.f22861f, this.f22862g, this.f22863h, this.f22864i, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        if (!((Boolean) this.f22862g.getValue()).booleanValue()) {
            this.f22856a.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f22857b.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f22858c.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f22859d.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f22860e.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f22861f.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            Boolean bool = Boolean.FALSE;
            this.f22863h.setValue(bool);
            this.f22864i.setValue(bool);
        }
        return Unit.f23355a;
    }
}
