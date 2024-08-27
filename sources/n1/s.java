package n1;

import android.graphics.Canvas;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f28161a = new Object();

    public final void a(@NotNull Canvas canvas, boolean z10) {
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
