package a8;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f270b;

    public /* synthetic */ e(ViewPager2 viewPager2, int i10) {
        this.f269a = i10;
        this.f270b = viewPager2;
    }

    @Override // a8.i
    public final void a(int i10) {
        switch (this.f269a) {
            case 0:
                if (i10 == 0) {
                    this.f270b.e();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // a8.i
    public final void c(int i10) {
        int i11 = this.f269a;
        ViewPager2 viewPager2 = this.f270b;
        switch (i11) {
            case 0:
                if (viewPager2.f2512d != i10) {
                    viewPager2.f2512d = i10;
                    viewPager2.f2528t.o();
                    return;
                }
                return;
            default:
                viewPager2.clearFocus();
                if (viewPager2.hasFocus()) {
                    viewPager2.f2518j.requestFocus(2);
                    return;
                }
                return;
        }
    }
}
