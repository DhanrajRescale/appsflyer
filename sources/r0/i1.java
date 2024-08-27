package r0;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class i1 {
    @NotNull
    public static final OnBackInvokedCallback a(@NotNull Function0<Unit> function0) {
        return new androidx.activity.s(function0, 1);
    }

    public static final void b(@NotNull View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
        }
    }

    public static final void c(@NotNull View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }
}
