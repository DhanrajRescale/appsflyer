package g7;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements tu.g, iu.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17019b;

    public /* synthetic */ q1(Object obj, int i10) {
        this.f17018a = i10;
        this.f17019b = obj;
    }

    @Override // tu.g
    public final Object a(Object obj, yt.a aVar) {
        int i10 = this.f17018a;
        Object obj2 = this.f17019b;
        switch (i10) {
            case 0:
                Object h10 = ((j4) obj2).f16853a.h((c3) obj, aVar);
                if (h10 != zt.a.f42823a) {
                    return Unit.f23355a;
                }
                return h10;
            default:
                ((o8.n) obj2).k((o8.i) obj);
                Unit unit = Unit.f23355a;
                zt.a aVar2 = zt.a.f42823a;
                return unit;
        }
    }

    @Override // iu.f
    public final ut.d b() {
        int i10 = this.f17018a;
        Object obj = this.f17019b;
        switch (i10) {
            case 0:
                return new iu.h(2, (j4) obj, j4.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            default:
                return new iu.a((o8.n) obj, o8.n.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f17018a) {
            case 0:
                if (!(obj instanceof tu.g) || !(obj instanceof iu.f)) {
                    return false;
                }
                return Intrinsics.a(b(), ((iu.f) obj).b());
            default:
                if (!(obj instanceof tu.g) || !(obj instanceof iu.f)) {
                    return false;
                }
                return Intrinsics.a(b(), ((iu.f) obj).b());
        }
    }

    public final int hashCode() {
        switch (this.f17018a) {
            case 0:
                return b().hashCode();
            default:
                return b().hashCode();
        }
    }
}
