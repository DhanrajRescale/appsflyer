package ds;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;

/* loaded from: classes2.dex */
public final class c extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final c f14493a = new Editable.Factory();

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Selection.setSelection(spannableStringBuilder, 0);
        return spannableStringBuilder;
    }
}
