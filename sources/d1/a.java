package d1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f13245a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function2 function2) {
        super(2);
        this.f13245a = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar;
        d dVar = (d) obj;
        List list = (List) this.f13245a.invoke(dVar, obj2);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj3 = list.get(i10);
            if (obj3 != null && (nVar = dVar.f13255b) != null && !nVar.a(obj3)) {
                throw new IllegalArgumentException("item can't be saved".toString());
            }
        }
        if (!list.isEmpty()) {
            return new ArrayList(list);
        }
        return null;
    }
}
