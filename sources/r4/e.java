package r4;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class e implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f33064a;

    public e(TextView textView) {
        this.f33064a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f33064a.isInEditMode()) {
            return charSequence;
        }
        q4.a.a();
        throw null;
    }
}
