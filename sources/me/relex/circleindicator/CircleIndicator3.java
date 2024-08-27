package me.relex.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager2.widget.ViewPager2;
import g7.d3;
import java.util.List;
import k7.b1;
import k7.z0;
import zu.a;
import zu.c;

/* loaded from: classes2.dex */
public class CircleIndicator3 extends c {

    /* renamed from: k, reason: collision with root package name */
    public ViewPager2 f27730k;

    /* renamed from: l, reason: collision with root package name */
    public final z7.c f27731l;

    /* renamed from: m, reason: collision with root package name */
    public final d3 f27732m;

    public CircleIndicator3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27731l = new z7.c(this, 5);
        this.f27732m = new d3(this, 5);
    }

    public b1 getAdapterDataObserver() {
        return this.f27732m;
    }

    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(a aVar) {
    }

    public void setViewPager(ViewPager2 viewPager2) {
        int a10;
        this.f27730k = viewPager2;
        if (viewPager2 != null && viewPager2.getAdapter() != null) {
            this.f42842j = -1;
            z0 adapter = this.f27730k.getAdapter();
            if (adapter == null) {
                a10 = 0;
            } else {
                a10 = adapter.a();
            }
            b(a10, this.f27730k.getCurrentItem());
            List list = (List) this.f27730k.f2511c.f42158b;
            z7.c cVar = this.f27731l;
            list.remove(cVar);
            this.f27730k.a(cVar);
            cVar.c(this.f27730k.getCurrentItem());
        }
    }
}
