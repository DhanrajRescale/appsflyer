package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import t0.g1;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f22847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f22851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f22853g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f22854h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1 f22855i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, g1 g1Var6, g1 g1Var7, g1 g1Var8, g1 g1Var9, yt.a aVar) {
        super(2, aVar);
        this.f22847a = g1Var;
        this.f22848b = g1Var2;
        this.f22849c = g1Var3;
        this.f22850d = g1Var4;
        this.f22851e = g1Var5;
        this.f22852f = g1Var6;
        this.f22853g = g1Var7;
        this.f22854h = g1Var8;
        this.f22855i = g1Var9;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n(this.f22847a, this.f22848b, this.f22849c, this.f22850d, this.f22851e, this.f22852f, this.f22853g, this.f22854h, this.f22855i, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        if (!((Boolean) this.f22853g.getValue()).booleanValue()) {
            this.f22847a.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f22848b.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f22849c.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f22850d.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f22851e.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f22852f.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            Boolean bool = Boolean.FALSE;
            this.f22854h.setValue(bool);
            this.f22855i.setValue(bool);
        }
        return Unit.f23355a;
    }
}
