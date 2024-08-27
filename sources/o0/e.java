package o0;

import h2.r;
import h2.t;
import h2.u;
import h2.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f29343b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f29344c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f29345d = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f29346a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f29346a) {
            case 0:
                return Unit.f23355a;
            case 1:
                ou.g[] gVarArr = t.f17908a;
                u uVar = r.f17899s;
                Unit unit = Unit.f23355a;
                ((h2.j) ((v) obj)).h(uVar, unit);
                return unit;
            default:
                return Unit.f23355a;
        }
    }
}
