package pd;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f30999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f31000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h7.b f31001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h7.b f31002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h7.b f31003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f31004f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f31005g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f31006h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f31007i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g1.o oVar, String str, h7.b bVar, h7.b bVar2, h7.b bVar3, List list, Function2 function2, int i10, int i11) {
        super(2);
        this.f30999a = oVar;
        this.f31000b = str;
        this.f31001c = bVar;
        this.f31002d = bVar2;
        this.f31003e = bVar3;
        this.f31004f = list;
        this.f31005g = function2;
        this.f31006h = i10;
        this.f31007i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yk.j.F(this.f30999a, this.f31000b, this.f31001c, this.f31002d, this.f31003e, this.f31004f, this.f31005g, (t0.n) obj, t0.t.H0(this.f31006h | 1), this.f31007i);
        return Unit.f23355a;
    }
}
