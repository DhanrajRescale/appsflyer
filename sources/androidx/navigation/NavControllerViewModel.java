package androidx.navigation;

import androidx.lifecycle.a1;
import androidx.lifecycle.h1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavControllerViewModel;", "Landroidx/lifecycle/a1;", "Landroidx/navigation/t0;", "<init>", "()V", "mt/p", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NavControllerViewModel extends a1 implements t0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f2146c = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2147b = new LinkedHashMap();

    @Override // androidx.lifecycle.a1
    public final void d() {
        LinkedHashMap linkedHashMap = this.f2147b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((h1) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f2147b.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
