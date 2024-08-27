package d2;

import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static final j4 f13470a = new Object();

    public final void a(@NotNull a0 a0Var) {
        ViewParent parent = a0Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(a0Var, a0Var);
        }
    }
}
