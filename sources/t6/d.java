package t6;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import t0.s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final s f35393c = new s(21);

    /* renamed from: a, reason: collision with root package name */
    public final d5.b f35394a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35395b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z10, int i12, int i13) {
        boolean z11;
        int i14;
        if (z10) {
            i14 = i12;
            z11 = true;
        } else {
            z11 = false;
            i14 = -16777216;
        }
        this.f35394a = new d5.b(spannableStringBuilder, alignment, null, null, f10, 0, i10, f11, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z11, i14, Integer.MIN_VALUE, s0.g.f34069a);
        this.f35395b = i13;
    }
}
