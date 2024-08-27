package ob;

import c0.d0;
import c0.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.i0;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nb.b f29912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f29913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f29914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nb.b f29915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f29916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f29917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f29918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f29919h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f29920i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(nb.b bVar, List list, List list2, nb.b bVar2, Function1 function1, int i10, Function0 function0, Function1 function12, Function1 function13) {
        super(1);
        this.f29912a = bVar;
        this.f29913b = list;
        this.f29914c = list2;
        this.f29915d = bVar2;
        this.f29916e = function1;
        this.f29917f = i10;
        this.f29918g = function0;
        this.f29919h = function12;
        this.f29920i = function13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d0 LazyColumn = (d0) obj;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        i0 i0Var = new i0(2, this.f29914c, this.f29915d, this.f29916e);
        Object obj2 = b1.d.f3079a;
        d0.a(LazyColumn, new b1.c(i0Var, true, -1195263126));
        int i10 = this.f29917f;
        Function0 function0 = this.f29918g;
        nb.b bVar = this.f29912a;
        d0.a(LazyColumn, new b1.c(new h(bVar, i10, function0), true, 796254177));
        d0.a(LazyColumn, c.f29882a);
        if (bVar != null) {
            ((c0.j) LazyColumn).a0(5, null, y.f7619c, c.f29883b);
        } else {
            i iVar = i.f29907a;
            List list = this.f29913b;
            ((c0.j) LazyColumn).a0(list.size(), null, new lb.j(iVar, list, 2), new b1.c(new j(0, this.f29920i, list, this.f29919h), true, -632812321));
        }
        d0.a(LazyColumn, c.f29884c);
        return Unit.f23355a;
    }
}
