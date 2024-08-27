package k7;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f22538a;

    /* renamed from: b, reason: collision with root package name */
    public int f22539b;

    /* renamed from: c, reason: collision with root package name */
    public Set f22540c;

    public final o1 a(int i10) {
        SparseArray sparseArray = this.f22538a;
        o1 o1Var = (o1) sparseArray.get(i10);
        if (o1Var == null) {
            o1 o1Var2 = new o1();
            sparseArray.put(i10, o1Var2);
            return o1Var2;
        }
        return o1Var;
    }
}
