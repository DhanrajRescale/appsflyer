package k2;

import android.text.StaticLayout;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class n {
    public static final boolean a(@NotNull StaticLayout staticLayout) {
        return m.e(staticLayout);
    }

    public static final void b(@NotNull StaticLayout.Builder builder, int i10, int i11) {
        m.d(builder, androidx.activity.n.h(androidx.activity.n.x(androidx.activity.n.g(m.b(), i10), i11)));
    }
}
