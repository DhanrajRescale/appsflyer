package q3;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public d0 f31611a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f31612b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f31613c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31614d = false;

    public void a(Bundle bundle) {
        if (this.f31614d) {
            bundle.putCharSequence("android.summaryText", this.f31613c);
        }
        CharSequence charSequence = this.f31612b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c10 = c();
        if (c10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
        }
    }

    public abstract void b(r0 r0Var);

    public abstract String c();
}
