package ac;

import el.l;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.t;

/* loaded from: classes.dex */
public final class i extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f339c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, int i11, List list, Function1 function1) {
        super(2);
        this.f337a = i11;
        this.f338b = list;
        this.f339c = function1;
        this.f340d = i10;
    }

    public final void a(n nVar, int i10) {
        int i11 = this.f337a;
        Function1 function1 = this.f339c;
        List list = this.f338b;
        int i12 = this.f340d;
        switch (i11) {
            case 0:
                yk.j.i0(t.H0(i12 | 1), nVar, list, function1);
                return;
            case 1:
                dp.b.U(t.H0(i12 | 1), nVar, list, function1);
                return;
            case 2:
                dp.b.V(t.H0(i12 | 1), nVar, list, function1);
                return;
            default:
                l.i(t.H0(i12 | 1), nVar, list, function1);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f337a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Function1 function1, List list, int i10) {
        super(2);
        this.f337a = 0;
        this.f339c = function1;
        this.f338b = list;
        this.f340d = i10;
    }
}
