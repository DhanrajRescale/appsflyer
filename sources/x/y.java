package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final y f39777b = new y(0);

    /* renamed from: c, reason: collision with root package name */
    public static final y f39778c = new y(1);

    /* renamed from: d, reason: collision with root package name */
    public static final y f39779d = new y(2);

    /* renamed from: e, reason: collision with root package name */
    public static final y f39780e = new y(3);

    /* renamed from: f, reason: collision with root package name */
    public static final y f39781f = new y(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39782a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10) {
        super(1);
        this.f39782a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39782a) {
            case 0:
                ((c2.j0) ((p1.e) obj)).a();
                return Unit.f23355a;
            case 1:
                return Unit.f23355a;
            case 2:
                ((Number) obj).longValue();
                return Unit.f23355a;
            case 3:
                h2.f fVar = h2.f.f17817c;
                ou.g[] gVarArr = h2.t.f17908a;
                h2.u uVar = h2.r.f17884d;
                ou.g gVar = h2.t.f17908a[1];
                uVar.a((h2.v) obj, fVar);
                return Unit.f23355a;
            default:
                return new o2(((Number) obj).intValue());
        }
    }
}
