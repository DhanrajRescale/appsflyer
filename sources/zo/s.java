package zo;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes2.dex */
public final class s extends m {

    /* renamed from: e, reason: collision with root package name */
    public final int f42683e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f42684f;

    /* renamed from: g, reason: collision with root package name */
    public final ph.a f42685g;

    public s(l lVar, int i10) {
        super(lVar);
        this.f42683e = R.drawable.design_password_eye;
        this.f42685g = new ph.a(this, 27);
        if (i10 != 0) {
            this.f42683e = i10;
        }
    }

    @Override // zo.m
    public final void b() {
        q();
    }

    @Override // zo.m
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // zo.m
    public final int d() {
        return this.f42683e;
    }

    @Override // zo.m
    public final View.OnClickListener f() {
        return this.f42685g;
    }

    @Override // zo.m
    public final boolean k() {
        return true;
    }

    @Override // zo.m
    public final boolean l() {
        boolean z10;
        EditText editText = this.f42684f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    @Override // zo.m
    public final void m(EditText editText) {
        this.f42684f = editText;
        q();
    }

    @Override // zo.m
    public final void r() {
        EditText editText = this.f42684f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f42684f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // zo.m
    public final void s() {
        EditText editText = this.f42684f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
