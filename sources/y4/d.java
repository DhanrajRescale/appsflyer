package y4;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import iu.a0;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

/* loaded from: classes.dex */
public final class d implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final f[] f41151a;

    public d(f... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.f41151a = initializers;
    }

    @Override // androidx.lifecycle.d1
    public final a1 c(Class modelClass, e extras) {
        a1 a1Var;
        f fVar;
        Function1 function1;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        iu.e modelClass2 = a0.a(modelClass);
        f[] fVarArr = this.f41151a;
        f[] initializers = (f[]) Arrays.copyOf(fVarArr, fVarArr.length);
        Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        int length = initializers.length;
        int i10 = 0;
        while (true) {
            a1Var = null;
            if (i10 < length) {
                fVar = initializers[i10];
                if (Intrinsics.a(fVar.f41152a, modelClass2)) {
                    break;
                }
                i10++;
            } else {
                fVar = null;
                break;
            }
        }
        if (fVar != null && (function1 = fVar.f41153b) != null) {
            a1Var = (a1) function1.invoke(extras);
        }
        if (a1Var != null) {
            return a1Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + i0.s(modelClass2)).toString());
    }
}
