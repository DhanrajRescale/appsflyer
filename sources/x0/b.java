package x0;

import android.view.View;
import d4.b1;
import d4.n1;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vt.g0;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f39797b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Collection collection) {
        super(1);
        this.f39796a = i10;
        this.f39797b = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f39796a;
        Collection<?> collection = this.f39797b;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(collection.contains(obj));
                    default:
                        return Boolean.valueOf(collection.contains(obj));
                }
            case 1:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(collection.contains(obj));
                    default:
                        return Boolean.valueOf(collection.contains(obj));
                }
            case 2:
                return Boolean.valueOf(((List) obj).retainAll(collection));
            default:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = n1.f13788a;
                return Boolean.valueOf(g0.q(collection, b1.k(view)));
        }
    }
}
