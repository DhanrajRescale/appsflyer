package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h0 extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f40746b = new h0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f40747c = new h0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f40748d = new h0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final h0 f40749e = new h0(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40750a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i10) {
        super(1);
        this.f40750a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f40750a;
        switch (i10) {
            case 0:
                long j10 = ((m1.c) obj).f27237a;
                return Unit.f23355a;
            case 1:
                x1.t tVar = (x1.t) obj;
                switch (i10) {
                    case 1:
                        return Boolean.TRUE;
                    default:
                        return Boolean.valueOf(!x1.r.b(tVar.f39917i, 2));
                }
            case 2:
                x1.t tVar2 = (x1.t) obj;
                switch (i10) {
                    case 1:
                        return Boolean.TRUE;
                    default:
                        return Boolean.valueOf(!x1.r.b(tVar2.f39917i, 2));
                }
            default:
                ((Number) obj).floatValue();
                return Unit.f23355a;
        }
    }
}
