package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d0 extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f32359b = new d0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f32360c = new d0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f32361d = new d0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f32362e = new d0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f32363f = new d0(4);

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f32364g = new d0(5);

    /* renamed from: h, reason: collision with root package name */
    public static final d0 f32365h = new d0(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32366a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i10) {
        super(1);
        this.f32366a = i10;
    }

    public final void a(h2.v vVar) {
        switch (this.f32366a) {
            case 0:
                h2.t.f(vVar, 0);
                return;
            case 1:
                ou.g[] gVarArr = h2.t.f17908a;
                ((h2.j) vVar).h(h2.r.f17899s, Unit.f23355a);
                return;
            case 2:
            case 5:
                return;
            case 3:
            case 4:
            default:
                h2.t.d(vVar);
                return;
        }
    }

    public final void d(w.v0 v0Var) {
        Float valueOf = Float.valueOf(290.0f);
        Float valueOf2 = Float.valueOf(s0.g.f34069a);
        switch (this.f32366a) {
            case 3:
                v0Var.f38725a = 1332;
                v0Var.a(0, valueOf2).f38681b = h2.f32433c;
                v0Var.a(666, valueOf);
                return;
            default:
                v0Var.f38725a = 1332;
                v0Var.a(666, valueOf2).f38681b = h2.f32433c;
                v0Var.a(v0Var.f38725a, valueOf);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32366a) {
            case 0:
                a((h2.v) obj);
                return Unit.f23355a;
            case 1:
                a((h2.v) obj);
                return Unit.f23355a;
            case 2:
                a((h2.v) obj);
                return Unit.f23355a;
            case 3:
                d((w.v0) obj);
                return Unit.f23355a;
            case 4:
                d((w.v0) obj);
                return Unit.f23355a;
            case 5:
                a((h2.v) obj);
                return Unit.f23355a;
            case 6:
                return Boolean.TRUE;
            default:
                a((h2.v) obj);
                return Unit.f23355a;
        }
    }
}
