package pd;

import g7.w0;
import g7.y0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class i0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h7.b f30906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h7.b f30907b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f30908c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f30909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iu.v f30910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f30911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iu.v f30912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f30913h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1.o f30914i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f30915j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h7.b bVar, h7.b bVar2, List list, Function2 function2, iu.v vVar, g1 g1Var, iu.v vVar2, g1 g1Var2, g1.o oVar, String str) {
        super(1);
        this.f30906a = bVar;
        this.f30907b = bVar2;
        this.f30908c = list;
        this.f30909d = function2;
        this.f30910e = vVar;
        this.f30911f = g1Var;
        this.f30912g = vVar2;
        this.f30913h = g1Var2;
        this.f30914i = oVar;
        this.f30915j = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c0.d0 LazyColumn = (c0.d0) obj;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        h7.b bVar = this.f30906a;
        if (bVar.b() > 0) {
            c0.d0.a(LazyColumn, c.f30859b);
            int b10 = bVar.b();
            lb.k kVar = new lb.k(this.f30906a, this.f30908c, this.f30909d, this.f30910e, this.f30911f, this.f30912g);
            Object obj2 = b1.d.f3079a;
            ((c0.j) LazyColumn).a0(b10, null, c0.y.f7619c, new b1.c(kVar, true, -1400516178));
        }
        h7.b bVar2 = this.f30907b;
        if (bVar2.b() > 0) {
            c0.d0.a(LazyColumn, c.f30860c);
            int b11 = bVar2.b();
            wc.b bVar3 = new wc.b(this.f30907b, this.f30908c, this.f30909d, this.f30912g, this.f30913h);
            Object obj3 = b1.d.f3079a;
            ((c0.j) LazyColumn).a0(b11, null, c0.y.f7619c, new b1.c(bVar3, true, -1442479209));
            c0.d0.a(LazyColumn, c.f30861d);
        }
        boolean z10 = bVar2.c().f16682a instanceof y0;
        String str = this.f30915j;
        g1.o oVar = this.f30914i;
        if (z10 && bVar2.c().f16684c.f17152a && bVar2.b() < 1) {
            h0 h0Var = new h0(oVar, str, 0);
            Object obj4 = b1.d.f3079a;
            c0.d0.a(LazyColumn, new b1.c(h0Var, true, -1903307937));
        }
        if (bVar2.c().f16682a instanceof w0) {
            h0 h0Var2 = new h0(oVar, str, 1);
            Object obj5 = b1.d.f3079a;
            c0.d0.a(LazyColumn, new b1.c(h0Var2, true, -23781314));
        }
        return Unit.f23355a;
    }
}
