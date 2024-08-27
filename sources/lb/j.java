package lb;

import c0.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f24458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f24459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(List list, Function1 function1, int i10) {
        super(1);
        this.f24457a = i10;
        this.f24459c = list;
        this.f24458b = function1;
    }

    public final Object a(int i10) {
        int i11 = this.f24457a;
        Function1 function1 = this.f24458b;
        List list = this.f24459c;
        switch (i11) {
            case 0:
                return function1.invoke(list.get(i10));
            case 1:
                return function1.invoke(list.get(i10));
            case 2:
                return function1.invoke(list.get(i10));
            case 3:
                return function1.invoke(list.get(i10));
            case 4:
                return function1.invoke(list.get(i10));
            case 5:
                return function1.invoke(list.get(i10));
            case 6:
                return function1.invoke(list.get(i10));
            case 7:
                return function1.invoke(list.get(i10));
            case 8:
            default:
                return function1.invoke(list.get(i10));
            case 9:
                return function1.invoke(list.get(i10));
            case 10:
                return function1.invoke(list.get(i10));
            case 11:
                return function1.invoke(list.get(i10));
            case 12:
                return function1.invoke(list.get(i10));
            case 13:
                return function1.invoke(list.get(i10));
            case 14:
                return function1.invoke(list.get(i10));
            case 15:
                return function1.invoke(list.get(i10));
            case 16:
                return function1.invoke(list.get(i10));
            case 17:
                return function1.invoke(list.get(i10));
        }
    }

    public final void d(d0 LazyRow) {
        int i10 = this.f24457a;
        Function1 function1 = this.f24458b;
        int i11 = 7;
        int i12 = 1;
        List list = this.f24459c;
        switch (i10) {
            case 8:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                if (list != null) {
                    pd.h hVar = pd.h.f30898j;
                    int size = list.size();
                    j jVar = new j(hVar, list, i11);
                    rb.e eVar = new rb.e(list, function1, i12);
                    Object obj = b1.d.f3079a;
                    ((c0.j) LazyRow).a0(size, null, jVar, new b1.c(eVar, true, -632812321));
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                vh.c cVar = vh.c.f38061a;
                int size2 = list.size();
                kd.b bVar = new kd.b(1, list, cVar);
                v.c cVar2 = new v.c(22, list);
                ob.j jVar2 = new ob.j(i11, list, list, function1);
                Object obj2 = b1.d.f3079a;
                ((c0.j) LazyRow).a0(size2, bVar, cVar2, new b1.c(jVar2, true, -1091073711));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f24457a) {
            case 0:
                return a(((Number) obj).intValue());
            case 1:
                return a(((Number) obj).intValue());
            case 2:
                return a(((Number) obj).intValue());
            case 3:
                return a(((Number) obj).intValue());
            case 4:
                return a(((Number) obj).intValue());
            case 5:
                return a(((Number) obj).intValue());
            case 6:
                return a(((Number) obj).intValue());
            case 7:
                return a(((Number) obj).intValue());
            case 8:
                d((d0) obj);
                return Unit.f23355a;
            case 9:
                return a(((Number) obj).intValue());
            case 10:
                return a(((Number) obj).intValue());
            case 11:
                return a(((Number) obj).intValue());
            case 12:
                return a(((Number) obj).intValue());
            case 13:
                return a(((Number) obj).intValue());
            case 14:
                return a(((Number) obj).intValue());
            case 15:
                return a(((Number) obj).intValue());
            case 16:
                return a(((Number) obj).intValue());
            case 17:
                return a(((Number) obj).intValue());
            case 18:
                return a(((Number) obj).intValue());
            default:
                d((d0) obj);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Function1 function1, List list, int i10) {
        super(1);
        this.f24457a = i10;
        this.f24458b = function1;
        this.f24459c = list;
    }
}
