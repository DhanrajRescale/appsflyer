package androidx.fragment.app;

import android.view.View;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f1723a;

    /* renamed from: b, reason: collision with root package name */
    public final y3.g f1724b;

    public j(f2 operation, y3.g signal) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        this.f1723a = operation;
        this.f1724b = signal;
    }

    public final void a() {
        f2 f2Var = this.f1723a;
        f2Var.getClass();
        y3.g signal = this.f1724b;
        Intrinsics.checkNotNullParameter(signal, "signal");
        LinkedHashSet linkedHashSet = f2Var.f1700e;
        if (linkedHashSet.remove(signal) && linkedHashSet.isEmpty()) {
            f2Var.b();
        }
    }

    public final boolean b() {
        e2 e2Var;
        f2 f2Var = this.f1723a;
        View view = f2Var.f1698c.mView;
        Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
        e2 r10 = el.l.r(view);
        e2 e2Var2 = f2Var.f1696a;
        if (r10 != e2Var2 && (r10 == (e2Var = e2.f1679b) || e2Var2 == e2Var)) {
            return false;
        }
        return true;
    }
}
