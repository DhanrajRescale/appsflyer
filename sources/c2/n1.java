package c2;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n1 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f7799a = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) obj2;
        int f10 = Intrinsics.f(aVar2.f1410k, aVar.f1410k);
        if (f10 == 0) {
            return Intrinsics.f(aVar.hashCode(), aVar2.hashCode());
        }
        return f10;
    }
}
