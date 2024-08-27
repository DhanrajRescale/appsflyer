package m2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import k2.s;
import k2.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i15)) == layout.getLineCount() - 1) {
            s sVar = u.f21976a;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float h02 = hl.f.h0(layout, lineForOffset, paint) + hl.f.g0(layout, lineForOffset, paint);
                if (h02 != s0.g.f34069a) {
                    Intrinsics.c(canvas);
                    canvas.translate(h02, s0.g.f34069a);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}
