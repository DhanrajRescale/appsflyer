package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l f26429b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f26430c = new l(1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f26431d = new l(2);

    /* renamed from: e, reason: collision with root package name */
    public static final l f26432e = new l(3);

    /* renamed from: f, reason: collision with root package name */
    public static final l f26433f = new l(4);

    /* renamed from: g, reason: collision with root package name */
    public static final l f26434g = new l(5);

    /* renamed from: h, reason: collision with root package name */
    public static final l f26435h = new l(6);

    /* renamed from: i, reason: collision with root package name */
    public static final l f26436i = new l(7);

    /* renamed from: j, reason: collision with root package name */
    public static final l f26437j = new l(8);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26438a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10) {
        super(1);
        this.f26438a = i10;
    }

    public final void a(h2.v vVar) {
        switch (this.f26438a) {
            case 1:
                h2.t.f(vVar, 0);
                return;
            case 2:
                return;
            case 3:
                h2.t.f(vVar, 0);
                return;
            case 4:
                return;
            default:
                h2.t.d(vVar);
                return;
        }
    }

    public final void d(w.v0 v0Var) {
        Float valueOf = Float.valueOf(290.0f);
        Float valueOf2 = Float.valueOf(s0.g.f34069a);
        switch (this.f26438a) {
            case 5:
                v0Var.f38725a = 1332;
                v0Var.a(0, valueOf2).f38681b = l5.f26452b;
                v0Var.a(666, valueOf);
                return;
            default:
                v0Var.f38725a = 1332;
                v0Var.a(666, valueOf2).f38681b = l5.f26452b;
                v0Var.a(v0Var.f38725a, valueOf);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f26438a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                a((h2.v) obj);
                return Unit.f23355a;
            case 2:
                a((h2.v) obj);
                return Unit.f23355a;
            case 3:
                a((h2.v) obj);
                return Unit.f23355a;
            case 4:
                a((h2.v) obj);
                return Unit.f23355a;
            case 5:
                d((w.v0) obj);
                return Unit.f23355a;
            case 6:
                d((w.v0) obj);
                return Unit.f23355a;
            case 7:
                a((h2.v) obj);
                return Unit.f23355a;
            default:
                return Float.valueOf(((Number) obj).floatValue() * 0.7f);
        }
    }
}
