package m;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f25476a;

    /* renamed from: b, reason: collision with root package name */
    public final hr.c f25477b;

    public a0(TextView textView) {
        this.f25476a = textView;
        this.f25477b = new hr.c(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((mt.p) this.f25477b.f18690b).v(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f25476a.getContext().obtainStyledAttributes(attributeSet, g.a.f16357i, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z10) {
        ((mt.p) this.f25477b.f18690b).C(z10);
    }

    public final void d(boolean z10) {
        ((mt.p) this.f25477b.f18690b).D(z10);
    }
}
