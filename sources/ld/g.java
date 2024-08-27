package ld;

import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f24558b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f24559c = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24560a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(2);
        this.f24560a = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24560a) {
            case 0:
                ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter((String) obj2, "<anonymous parameter 1>");
                return Unit.f23355a;
            default:
                t0.n nVar = (t0.n) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                b9.b(hl.f.c1(R.string.reason_rationaile_body, nVar), null, w0.e(R.color.deepGrey, nVar), yk.j.e1(10), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1575936, 0, 130994);
                return Unit.f23355a;
        }
    }
}
