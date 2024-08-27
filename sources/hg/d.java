package hg;

import c0.d0;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.j;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f18447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list) {
        super(1);
        this.f18447a = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d0 LazyColumn = (d0) obj;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        b bVar = b.f18444a;
        List list = this.f18447a;
        int size = list.size();
        j jVar = new j(bVar, list, 12);
        c cVar = new c(list, (char) 8226);
        Object obj2 = b1.d.f3079a;
        ((c0.j) LazyColumn).a0(size, null, jVar, new b1.c(cVar, true, -632812321));
        return Unit.f23355a;
    }
}
