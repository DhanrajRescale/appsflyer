package z2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f41907b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f41908c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f41909d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f41910e = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final b f41911f = new b(4);

    /* renamed from: g, reason: collision with root package name */
    public static final b f41912g = new b(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41913a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f41913a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f41913a;
        switch (i10) {
            case 0:
                h2.v vVar = (h2.v) obj;
                switch (i10) {
                    case 0:
                        ou.g[] gVarArr = h2.t.f17908a;
                        ((h2.j) vVar).h(h2.r.f17900t, Unit.f23355a);
                        break;
                    default:
                        ou.g[] gVarArr2 = h2.t.f17908a;
                        ((h2.j) vVar).h(h2.r.f17899s, Unit.f23355a);
                        break;
                }
                return Unit.f23355a;
            case 1:
                ((Number) obj).longValue();
                return Unit.f23355a;
            case 2:
                return Unit.f23355a;
            case 3:
                h2.v vVar2 = (h2.v) obj;
                switch (i10) {
                    case 0:
                        ou.g[] gVarArr3 = h2.t.f17908a;
                        ((h2.j) vVar2).h(h2.r.f17900t, Unit.f23355a);
                        break;
                    default:
                        ou.g[] gVarArr4 = h2.t.f17908a;
                        ((h2.j) vVar2).h(h2.r.f17899s, Unit.f23355a);
                        break;
                }
                return Unit.f23355a;
            case 4:
                return Unit.f23355a;
            default:
                r rVar = (r) obj;
                if (rVar.isAttachedToWindow()) {
                    rVar.m();
                }
                return Unit.f23355a;
        }
    }
}
