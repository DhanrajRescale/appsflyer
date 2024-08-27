package me.relex.circleindicator;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import m.f2;
import x7.f;
import zu.a;
import zu.c;

/* loaded from: classes2.dex */
public class CircleIndicator extends c {

    /* renamed from: k, reason: collision with root package name */
    public ViewPager f27723k;

    /* renamed from: l, reason: collision with root package name */
    public final jf.c f27724l;

    /* renamed from: m, reason: collision with root package name */
    public final f2 f27725m;

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27724l = new jf.c(this, 2);
        this.f27725m = new f2(this, 4);
    }

    public DataSetObserver getDataSetObserver() {
        return this.f27725m;
    }

    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(a aVar) {
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        ViewPager viewPager = this.f27723k;
        if (viewPager != null) {
            ArrayList arrayList = viewPager.f2491l0;
            if (arrayList != null) {
                arrayList.remove(fVar);
            }
            this.f27723k.b(fVar);
            return;
        }
        throw new NullPointerException("can not find Viewpager , setViewPager first");
    }

    public void setViewPager(ViewPager viewPager) {
        int c10;
        this.f27723k = viewPager;
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.f42842j = -1;
            x7.a adapter = this.f27723k.getAdapter();
            if (adapter == null) {
                c10 = 0;
            } else {
                c10 = adapter.c();
            }
            b(c10, this.f27723k.getCurrentItem());
            ArrayList arrayList = this.f27723k.f2491l0;
            jf.c cVar = this.f27724l;
            if (arrayList != null) {
                arrayList.remove(cVar);
            }
            this.f27723k.b(cVar);
            cVar.b(this.f27723k.getCurrentItem());
        }
    }
}
