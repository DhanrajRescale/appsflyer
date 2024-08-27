package zo;

import android.text.Editable;
import mo.b0;

/* loaded from: classes2.dex */
public final class j extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f42612a;

    public j(l lVar) {
        this.f42612a = lVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f42612a.b().a();
    }

    @Override // mo.b0, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f42612a.b().b();
    }
}
