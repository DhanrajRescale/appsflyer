package xb;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kp.j;
import t0.n;
import t0.t;
import yk.o;

/* loaded from: classes.dex */
public final class d extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f40158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40159c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, int i10, int i11) {
        super(2);
        this.f40157a = i11;
        this.f40158b = gVar;
        this.f40159c = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f40159c;
        g gVar = this.f40158b;
        int i11 = this.f40157a;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        j.i(gVar, nVar, t.H0(i10 | 1));
                        break;
                    default:
                        o.j(gVar, nVar, t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
            default:
                n nVar2 = (n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        j.i(gVar, nVar2, t.H0(i10 | 1));
                        break;
                    default:
                        o.j(gVar, nVar2, t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
        }
    }
}
