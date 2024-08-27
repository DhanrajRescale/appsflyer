package a8;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f268b;

    public d(Object obj, int i10) {
        this.f267a = i10;
        this.f268b = obj;
    }

    @Override // k7.b1
    public final void a() {
        int i10 = this.f267a;
        Object obj = this.f268b;
        switch (i10) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                viewPager2.f2513e = true;
                viewPager2.f2520l.f265l = true;
                return;
            default:
                ((j) obj).o();
                return;
        }
    }
}
