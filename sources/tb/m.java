package tb;

import c0.d0;
import c0.m0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f35726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sb.c f35727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f35728c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f35729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f35730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f35731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f35732g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f35733h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m0 f35734i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hu.c f35735j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ hu.c f35736k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List list, sb.c cVar, boolean z10, String str, g1 g1Var, Function2 function2, Function1 function1, Function1 function12, m0 m0Var, hu.c cVar2, hu.c cVar3) {
        super(1);
        this.f35726a = list;
        this.f35727b = cVar;
        this.f35728c = z10;
        this.f35729d = str;
        this.f35730e = g1Var;
        this.f35731f = function2;
        this.f35732g = function1;
        this.f35733h = function12;
        this.f35734i = m0Var;
        this.f35735j = cVar2;
        this.f35736k = cVar3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d0 LazyColumn = (d0) obj;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        d0.a(LazyColumn, c.f35693a);
        b bVar = b.f35683e;
        String str = this.f35729d;
        sb.c cVar = this.f35727b;
        g1 g1Var = this.f35730e;
        Function2 function2 = this.f35731f;
        Function1 function1 = this.f35732g;
        Function1 function12 = this.f35733h;
        m0 m0Var = this.f35734i;
        hu.c cVar2 = this.f35735j;
        hu.c cVar3 = this.f35736k;
        b bVar2 = b.f35684f;
        List list = this.f35726a;
        int size = list.size();
        lb.j jVar = new lb.j(bVar, list, 4);
        lb.j jVar2 = new lb.j(bVar2, list, 5);
        l lVar = new l(list, str, cVar, g1Var, function2, function1, function12, m0Var, cVar2, cVar3);
        Object obj2 = b1.d.f3079a;
        c0.j jVar3 = (c0.j) LazyColumn;
        jVar3.a0(size, jVar, jVar2, new b1.c(lVar, true, -632812321));
        if (this.f35727b == sb.c.f34437a) {
            d0.a(jVar3, c.f35694b);
        } else if (this.f35728c) {
            d0.a(jVar3, c.f35695c);
        }
        d0.a(jVar3, c.f35696d);
        return Unit.f23355a;
    }
}
