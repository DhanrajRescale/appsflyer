package z2;

import android.graphics.Rect;
import android.view.View;
import vt.y;

/* loaded from: classes.dex */
public final class s extends mt.p {
    @Override // mt.p
    public final void E(View view, int i10, int i11) {
        view.setSystemGestureExclusionRects(y.h(new Rect(0, 0, i10, i11)));
    }
}
