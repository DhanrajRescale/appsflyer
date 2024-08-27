package r4;

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f33062a;

    /* renamed from: b, reason: collision with root package name */
    public final x2.c f33063b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [x2.c, java.lang.Object] */
    public d(EditText editText, InputConnection inputConnection) {
        super(inputConnection, false);
        ?? obj = new Object();
        this.f33062a = editText;
        this.f33063b = obj;
        Object obj2 = q4.a.f31656a;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f33062a.getEditableText();
        this.f33063b.getClass();
        if (!x2.c.p(this, editableText, i10, i11, false) && !super.deleteSurroundingText(i10, i11)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f33062a.getEditableText();
        this.f33063b.getClass();
        if (x2.c.p(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11)) {
            return true;
        }
        return false;
    }
}
