package zo;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f42613a;

    public k(l lVar) {
        this.f42613a = lVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        l lVar = this.f42613a;
        if (lVar.f42633s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = lVar.f42633s;
        j jVar = lVar.f42636v;
        if (editText != null) {
            editText.removeTextChangedListener(jVar);
            if (lVar.f42633s.getOnFocusChangeListener() == lVar.b().e()) {
                lVar.f42633s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        lVar.f42633s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(jVar);
        }
        lVar.b().m(lVar.f42633s);
        lVar.i(lVar.b());
    }
}
