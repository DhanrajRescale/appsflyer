package os;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/* loaded from: classes2.dex */
public final class a0 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final View f30290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f30291b;

    public a0(b0 b0Var, View view) {
        this.f30291b = b0Var;
        this.f30290a = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f30291b.d(this.f30290a);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
