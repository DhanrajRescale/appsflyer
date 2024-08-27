package p2;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class b {
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull m1.d dVar) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = androidx.activity.n.m().setEditorBounds(androidx.compose.ui.graphics.a.x(dVar));
        handwritingBounds = editorBounds.setHandwritingBounds(androidx.compose.ui.graphics.a.x(dVar));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
