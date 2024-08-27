package d2;

import java.util.Comparator;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13364b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f13363a = i10;
        this.f13364b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f13363a;
        Object obj3 = this.f13364b;
        switch (i10) {
            case 0:
                return ((Number) ((Function2) obj3).invoke(obj, obj2)).intValue();
            case 1:
                o5.t tVar = (o5.t) obj3;
                Pattern pattern = o5.u.f29679a;
                return tVar.g(obj2) - tVar.g(obj);
            default:
                Function1[] selectors = (Function1[]) obj3;
                Intrinsics.checkNotNullParameter(selectors, "$selectors");
                for (Function1 function1 : selectors) {
                    int a10 = xt.a.a((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (a10 != 0) {
                        return a10;
                    }
                }
                return 0;
        }
    }
}
