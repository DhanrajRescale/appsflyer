package d2;

import android.view.ActionMode;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public static final f3 f13415a = new Object();

    public final void a(@NotNull ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(@NotNull View view, @NotNull ActionMode.Callback callback, int i10) {
        return view.startActionMode(callback, i10);
    }
}
