package km;

import android.util.Patterns;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.textfield.TextInputLayout;
import l.d;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout);
        this.f23263d = i10;
        if (i10 != 1) {
            this.f23560b = textInputLayout.getResources().getString(R.string.fui_invalid_email_address);
            this.f23561c = ((TextInputLayout) this.f23559a).getResources().getString(R.string.fui_missing_email_address);
            return;
        }
        super(textInputLayout);
    }

    @Override // l.d
    public final boolean j(CharSequence charSequence) {
        switch (this.f23263d) {
            case 0:
                return Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
            case 1:
                return true;
            default:
                if (charSequence != null && charSequence.length() > 0) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TextInputLayout textInputLayout, String str) {
        super(textInputLayout);
        this.f23263d = 2;
        this.f23560b = str;
    }
}
