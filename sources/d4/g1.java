package d4;

import android.view.View;
import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class g1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(@NonNull View view, @NonNull l1 l1Var) {
        t.j0 j0Var = (t.j0) view.getTag(R.id.tag_unhandled_key_listeners);
        t.j0 j0Var2 = j0Var;
        if (j0Var == null) {
            t.j0 j0Var3 = new t.j0();
            view.setTag(R.id.tag_unhandled_key_listeners, j0Var3);
            j0Var2 = j0Var3;
        }
        Objects.requireNonNull(l1Var);
        ?? obj = new Object();
        j0Var2.put(l1Var, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(@NonNull View view, @NonNull l1 l1Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        t.j0 j0Var = (t.j0) view.getTag(R.id.tag_unhandled_key_listeners);
        if (j0Var != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) j0Var.get(l1Var)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i10) {
        return (T) view.requireViewById(i10);
    }

    public static void g(View view, boolean z10) {
        view.setAccessibilityHeading(z10);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AutofillId autofillId) {
        view.setAutofillId(autofillId);
    }

    public static void j(View view, boolean z10) {
        view.setScreenReaderFocusable(z10);
    }
}
