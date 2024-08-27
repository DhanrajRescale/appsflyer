package d2;

import android.graphics.Matrix;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q0 extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f13571b = new q0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f13572c = new q0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f13573d = new q0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f13574e = new q0(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i10) {
        super(2);
        this.f13575a = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13575a) {
            case 0:
                h2.j jVar = ((h2.o) obj).f17862d;
                h2.u uVar = h2.r.f17896p;
                return Integer.valueOf(Float.compare(((Number) jVar.g(uVar, m0.f13521c)).floatValue(), ((Number) ((h2.o) obj2).f17862d.g(uVar, m0.f13522d)).floatValue()));
            case 1:
                t0.n nVar = (t0.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                    }
                }
                return Unit.f23355a;
            case 2:
                ((v1) obj).K((Matrix) obj2);
                return Unit.f23355a;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                return Unit.f23355a;
        }
    }
}
