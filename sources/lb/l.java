package lb;

import android.content.Context;
import c0.d0;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioFnoHistoryViewModel;
import d0.x;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;
import t0.l3;
import vt.i0;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24467a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f24468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24469c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24472f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f24473g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f24474h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, kb.a aVar, Function1 function1, Function1 function12, String str, Function1 function13, Function1 function14) {
        super(1);
        this.f24468b = list;
        this.f24469c = aVar;
        this.f24470d = function1;
        this.f24471e = function12;
        this.f24474h = str;
        this.f24472f = function13;
        this.f24473g = function14;
    }

    public final void a(d0 LazyColumn) {
        int i10 = this.f24467a;
        int i11 = 0;
        List list = this.f24468b;
        Object obj = this.f24473g;
        Object obj2 = this.f24474h;
        Object obj3 = this.f24470d;
        Object obj4 = this.f24472f;
        int i12 = 1;
        Object obj5 = this.f24471e;
        Object obj6 = this.f24469c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                d0.a(LazyColumn, r.f24505a);
                a aVar = a.f24397o;
                String str = (String) obj2;
                Function1 function1 = (Function1) obj4;
                Function1 function12 = (Function1) obj;
                a aVar2 = a.f24398p;
                int size = list.size();
                j jVar = new j(aVar, list, 0);
                j jVar2 = new j(aVar2, list, 1);
                k kVar = new k(list, (Function1) obj3, (Function1) obj5, str, function1, function12);
                Object obj7 = b1.d.f3079a;
                c0.j jVar3 = (c0.j) LazyColumn;
                jVar3.a0(size, jVar, jVar2, new b1.c(kVar, true, -632812321));
                d0.a(jVar3, r.f24506b);
                if (((kb.a) obj6) == kb.a.f23020a) {
                    d0.a(jVar3, r.f24507c);
                }
                d0.a(jVar3, r.f24508d);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                x xVar = new x(this.f24468b, (Function0) obj6, (g1) obj3, (g1) obj5, 5);
                Object obj8 = b1.d.f3079a;
                d0.a(LazyColumn, new b1.c(xVar, true, 1726807752));
                l3 l3Var = (l3) obj4;
                List list2 = (List) l3Var.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    List list3 = (List) l3Var.getValue();
                    if (list3 == null) {
                        list3 = i0.f38321a;
                    }
                    c0.j jVar4 = (c0.j) LazyColumn;
                    jVar4.a0(list3.size(), new j(mg.f.f27755b, list3, 13), new j(mg.f.f27756c, list3, 14), new b1.c(new ne.c(i12, list3, (PortfolioFnoHistoryViewModel) obj2), true, -632812321));
                    return;
                }
                d0.a(LazyColumn, new b1.c(new mg.e((Context) obj, i11), true, -2051805939));
                return;
            default:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                m0.i0 i0Var = new m0.i0(9, list, (g1) obj6, (g1) obj5);
                Object obj9 = b1.d.f3079a;
                d0.a(LazyColumn, new b1.c(i0Var, true, 346618796));
                l3 l3Var2 = (l3) obj4;
                List list4 = (List) l3Var2.getValue();
                if (list4 != null && !list4.isEmpty()) {
                    List list5 = (List) l3Var2.getValue();
                    if (list5 == null) {
                        list5 = i0.f38321a;
                    }
                    List list6 = list5;
                    ug.i iVar = ug.i.f37183b;
                    ug.i iVar2 = ug.i.f37184c;
                    ((c0.j) LazyColumn).a0(list6.size(), new j(iVar, list6, 17), new j(iVar2, list6, 18), new b1.c(new lf.u(list6, (Function1) obj3, (Function2) obj2, l3Var2, 5), true, -632812321));
                } else {
                    d0.a(LazyColumn, new b1.c(new mg.e((Context) obj, i12), true, 1402555143));
                }
                d0.a(LazyColumn, ug.b.f37163a);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f24467a) {
            case 0:
                a((d0) obj);
                return Unit.f23355a;
            case 1:
                a((d0) obj);
                return Unit.f23355a;
            default:
                a((d0) obj);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, Function0 function0, g1 g1Var, g1 g1Var2, g1 g1Var3, Context context, PortfolioFnoHistoryViewModel portfolioFnoHistoryViewModel) {
        super(1);
        this.f24468b = list;
        this.f24469c = function0;
        this.f24470d = g1Var;
        this.f24471e = g1Var2;
        this.f24472f = g1Var3;
        this.f24473g = context;
        this.f24474h = portfolioFnoHistoryViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, g1 g1Var, g1 g1Var2, g1 g1Var3, Context context, Function1 function1, Function2 function2) {
        super(1);
        this.f24468b = list;
        this.f24469c = g1Var;
        this.f24471e = g1Var2;
        this.f24472f = g1Var3;
        this.f24473g = context;
        this.f24470d = function1;
        this.f24474h = function2;
    }
}
