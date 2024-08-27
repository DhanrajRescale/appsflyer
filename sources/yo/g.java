package yo;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f41752a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f41753b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f41754c;

    /* renamed from: d, reason: collision with root package name */
    public int f41755d;

    /* renamed from: e, reason: collision with root package name */
    public View f41756e;

    /* renamed from: f, reason: collision with root package name */
    public TabLayout f41757f;

    /* renamed from: g, reason: collision with root package name */
    public j f41758g;

    /* renamed from: h, reason: collision with root package name */
    public int f41759h;

    public final void a() {
        TabLayout tabLayout = this.f41757f;
        if (tabLayout != null) {
            tabLayout.m(this, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.f41754c) && !TextUtils.isEmpty(charSequence)) {
            this.f41758g.setContentDescription(charSequence);
        }
        this.f41753b = charSequence;
        c();
    }

    public final void c() {
        j jVar = this.f41758g;
        if (jVar != null) {
            jVar.d();
        }
    }
}
