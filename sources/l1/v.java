package l1;

import java.util.Arrays;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final v f23928a = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        t tVar = (t) obj;
        t tVar2 = (t) obj2;
        if (tVar != null) {
            if (tVar2 != null) {
                int i10 = 0;
                if (androidx.compose.ui.focus.a.t(tVar) && androidx.compose.ui.focus.a.t(tVar2)) {
                    androidx.compose.ui.node.a y10 = c2.g.y(tVar);
                    androidx.compose.ui.node.a y11 = c2.g.y(tVar2);
                    if (Intrinsics.a(y10, y11)) {
                        return 0;
                    }
                    Object[] objArr = new androidx.compose.ui.node.a[16];
                    int i11 = 0;
                    while (y10 != null) {
                        int i12 = i11 + 1;
                        if (objArr.length < i12) {
                            objArr = Arrays.copyOf(objArr, Math.max(i12, objArr.length * 2));
                            Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
                        }
                        if (i11 != 0) {
                            vt.t.f(objArr, 0 + 1, objArr, 0, i11);
                        }
                        objArr[0] = y10;
                        i11++;
                        y10 = y10.q();
                    }
                    Object[] objArr2 = new androidx.compose.ui.node.a[16];
                    int i13 = 0;
                    while (y11 != null) {
                        int i14 = i13 + 1;
                        if (objArr2.length < i14) {
                            objArr2 = Arrays.copyOf(objArr2, Math.max(i14, objArr2.length * 2));
                            Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(this, newSize)");
                        }
                        if (i13 != 0) {
                            vt.t.f(objArr2, 0 + 1, objArr2, 0, i13);
                        }
                        objArr2[0] = y11;
                        i13++;
                        y11 = y11.q();
                    }
                    int min = Math.min(i11 - 1, i13 - 1);
                    if (min >= 0) {
                        while (Intrinsics.a(objArr[i10], objArr2[i10])) {
                            if (i10 != min) {
                                i10++;
                            }
                        }
                        return Intrinsics.f(((androidx.compose.ui.node.a) objArr[i10]).s(), ((androidx.compose.ui.node.a) objArr2[i10]).s());
                    }
                    throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                }
                if (androidx.compose.ui.focus.a.t(tVar)) {
                    return -1;
                }
                if (!androidx.compose.ui.focus.a.t(tVar2)) {
                    return 0;
                }
                return 1;
            }
            throw new IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        throw new IllegalArgumentException("compare requires non-null focus targets".toString());
    }
}
