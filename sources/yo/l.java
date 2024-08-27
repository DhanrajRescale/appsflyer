package yo;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class l extends a8.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f41777a;

    /* renamed from: c, reason: collision with root package name */
    public int f41779c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f41778b = 0;

    public l(TabLayout tabLayout) {
        this.f41777a = new WeakReference(tabLayout);
    }

    @Override // a8.i
    public final void a(int i10) {
        this.f41778b = this.f41779c;
        this.f41779c = i10;
        TabLayout tabLayout = (TabLayout) this.f41777a.get();
        if (tabLayout != null) {
            tabLayout.f11464o0 = this.f41779c;
        }
    }

    @Override // a8.i
    public final void b(int i10, float f10, int i11) {
        boolean z10;
        boolean z11;
        TabLayout tabLayout = (TabLayout) this.f41777a.get();
        if (tabLayout != null) {
            int i12 = this.f41779c;
            if (i12 == 2 && this.f41778b != 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (i12 == 2 && this.f41778b == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            tabLayout.o(i10, f10, z10, z11, false);
        }
    }

    @Override // a8.i
    public final void c(int i10) {
        boolean z10;
        TabLayout tabLayout = (TabLayout) this.f41777a.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
            int i11 = this.f41779c;
            if (i11 != 0 && (i11 != 2 || this.f41778b != 0)) {
                z10 = false;
            } else {
                z10 = true;
            }
            tabLayout.m(tabLayout.i(i10), z10);
        }
    }
}
