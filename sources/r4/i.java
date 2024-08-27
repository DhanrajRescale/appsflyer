package r4;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f33071a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33072b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33073c = true;

    public i(EditText editText) {
        this.f33071a = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.f33071a.isInEditMode() && this.f33073c) {
            if (!this.f33072b) {
                Object obj = q4.a.f31656a;
            } else if (i11 <= i12 && (charSequence instanceof Spannable)) {
                q4.a.a();
                throw null;
            }
        }
    }
}
