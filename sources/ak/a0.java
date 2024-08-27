package ak;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a0 implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final Appendable f444a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f445b = true;

    public a0(Appendable appendable) {
        this.f444a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        boolean z10 = this.f445b;
        Appendable appendable = this.f444a;
        if (z10) {
            this.f445b = false;
            appendable.append("  ");
        }
        this.f445b = c10 == '\n';
        appendable.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        boolean z10 = this.f445b;
        Appendable appendable = this.f444a;
        boolean z11 = false;
        if (z10) {
            this.f445b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
            z11 = true;
        }
        this.f445b = z11;
        appendable.append(charSequence, i10, i11);
        return this;
    }
}
