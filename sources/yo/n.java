package yo;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import g7.d3;
import k7.z0;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final TabLayout f41782a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f41783b;

    /* renamed from: c, reason: collision with root package name */
    public final k f41784c;

    /* renamed from: d, reason: collision with root package name */
    public z0 f41785d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41786e;

    public n(TabLayout tabLayout, ViewPager2 viewPager2, k kVar) {
        this.f41782a = tabLayout;
        this.f41783b = viewPager2;
        this.f41784c = kVar;
    }

    public final void a() {
        if (!this.f41786e) {
            ViewPager2 viewPager2 = this.f41783b;
            z0 adapter = viewPager2.getAdapter();
            this.f41785d = adapter;
            if (adapter != null) {
                this.f41786e = true;
                TabLayout tabLayout = this.f41782a;
                viewPager2.a(new l(tabLayout));
                tabLayout.a(new m(viewPager2, true));
                this.f41785d.o(new d3(this, 3));
                b();
                tabLayout.o(viewPager2.getCurrentItem(), s0.g.f34069a, true, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public final void b() {
        TabLayout tabLayout = this.f41782a;
        tabLayout.l();
        z0 z0Var = this.f41785d;
        if (z0Var != null) {
            int a10 = z0Var.a();
            for (int i10 = 0; i10 < a10; i10++) {
                g j10 = tabLayout.j();
                this.f41784c.j(j10, i10);
                tabLayout.c(j10, false);
            }
            if (a10 > 0) {
                int min = Math.min(this.f41783b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (min != tabLayout.getSelectedTabPosition()) {
                    tabLayout.m(tabLayout.i(min), true);
                }
            }
        }
    }
}
