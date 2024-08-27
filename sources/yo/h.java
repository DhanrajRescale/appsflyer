package yo;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class h implements x7.f {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f41760a;

    /* renamed from: b, reason: collision with root package name */
    public int f41761b;

    /* renamed from: c, reason: collision with root package name */
    public int f41762c;

    public h(TabLayout tabLayout) {
        this.f41760a = new WeakReference(tabLayout);
    }

    @Override // x7.f
    public final void a(int i10) {
        this.f41761b = this.f41762c;
        this.f41762c = i10;
        TabLayout tabLayout = (TabLayout) this.f41760a.get();
        if (tabLayout != null) {
            tabLayout.f11464o0 = this.f41762c;
        }
    }

    @Override // x7.f
    public final void b(int i10) {
        boolean z10;
        TabLayout tabLayout = (TabLayout) this.f41760a.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
            int i11 = this.f41762c;
            if (i11 != 0 && (i11 != 2 || this.f41761b != 0)) {
                z10 = false;
            } else {
                z10 = true;
            }
            tabLayout.m(tabLayout.i(i10), z10);
        }
    }

    @Override // x7.f
    public final void c(int i10, float f10) {
        boolean z10;
        boolean z11;
        TabLayout tabLayout = (TabLayout) this.f41760a.get();
        if (tabLayout != null) {
            int i11 = this.f41762c;
            if (i11 == 2 && this.f41761b != 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (i11 == 2 && this.f41761b == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            tabLayout.o(i10, f10, z10, z11, false);
        }
    }
}
