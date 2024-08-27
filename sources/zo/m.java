package zo;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f42637a;

    /* renamed from: b, reason: collision with root package name */
    public final l f42638b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f42639c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f42640d;

    public m(l lVar) {
        this.f42637a = lVar.f42615a;
        this.f42638b = lVar;
        this.f42639c = lVar.getContext();
        this.f42640d = lVar.f42621g;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public e4.d h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof i;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(e4.m mVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }

    public final void q() {
        this.f42638b.e(false);
    }

    public abstract void r();

    public void s() {
    }
}
