package p2;

import android.view.inputmethod.CursorAnchorInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class c {
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull j2.e0 e0Var, @NotNull m1.d dVar) {
        int g10;
        int g11;
        if (dVar.f27239a < dVar.f27241c) {
            float f10 = dVar.f27240b;
            float f11 = dVar.f27242d;
            if (f10 < f11 && (g10 = e0Var.g(f10)) <= (g11 = e0Var.g(f11))) {
                while (true) {
                    builder.addVisibleLineBounds(e0Var.h(g10), e0Var.k(g10), e0Var.i(g10), e0Var.d(g10));
                    if (g10 == g11) {
                        break;
                    }
                    g10++;
                }
            }
        }
        return builder;
    }
}
