package r4;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import mt.p;

/* loaded from: classes.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f33053a;

    /* renamed from: b, reason: collision with root package name */
    public final i f33054b;

    /* JADX WARN: Type inference failed for: r1v1, types: [android.text.Editable$Factory, r4.c] */
    public a(EditText editText) {
        this.f33053a = editText;
        i iVar = new i(editText);
        this.f33054b = iVar;
        editText.addTextChangedListener(iVar);
        if (c.f33060b == null) {
            synchronized (c.f33059a) {
                try {
                    if (c.f33060b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            c.f33061c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c.f33060b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(c.f33060b);
    }

    @Override // mt.p
    public final InputConnection B(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection instanceof d) {
            return inputConnection;
        }
        return new d(this.f33053a, inputConnection);
    }

    @Override // mt.p
    public final void D(boolean z10) {
        i iVar = this.f33054b;
        if (iVar.f33073c != z10) {
            iVar.getClass();
            iVar.f33073c = z10;
            if (z10) {
                q4.a.a();
                throw null;
            }
        }
    }

    @Override // mt.p
    public final KeyListener x(KeyListener keyListener) {
        if (keyListener instanceof f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new f(keyListener);
    }
}
