package m;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import me.relex.circleindicator.CircleIndicator;

/* loaded from: classes.dex */
public final class f2 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25524b;

    public /* synthetic */ f2(Object obj, int i10) {
        this.f25523a = i10;
        this.f25524b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i10;
        int i11 = this.f25523a;
        Object obj = this.f25524b;
        switch (i11) {
            case 0:
                i2 i2Var = (i2) obj;
                if (i2Var.f25583z.isShowing()) {
                    i2Var.f();
                    return;
                }
                return;
            case 1:
                i4.a aVar = (i4.a) obj;
                aVar.f19334a = true;
                aVar.notifyDataSetChanged();
                return;
            case 2:
                ((ViewPager) obj).f();
                return;
            case 3:
                ((TabLayout) obj).k();
                return;
            default:
                super.onChanged();
                CircleIndicator circleIndicator = (CircleIndicator) obj;
                ViewPager viewPager = circleIndicator.f27723k;
                if (viewPager != null) {
                    x7.a adapter = viewPager.getAdapter();
                    int i12 = 0;
                    if (adapter != null) {
                        i10 = adapter.c();
                    } else {
                        i10 = 0;
                    }
                    if (i10 != circleIndicator.getChildCount()) {
                        if (circleIndicator.f42842j < i10) {
                            circleIndicator.f42842j = circleIndicator.f27723k.getCurrentItem();
                        } else {
                            circleIndicator.f42842j = -1;
                        }
                        x7.a adapter2 = circleIndicator.f27723k.getAdapter();
                        if (adapter2 != null) {
                            i12 = adapter2.c();
                        }
                        circleIndicator.b(i12, circleIndicator.f27723k.getCurrentItem());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i10 = this.f25523a;
        Object obj = this.f25524b;
        switch (i10) {
            case 0:
                ((i2) obj).dismiss();
                return;
            case 1:
                i4.a aVar = (i4.a) obj;
                aVar.f19334a = false;
                aVar.notifyDataSetInvalidated();
                return;
            case 2:
                ((ViewPager) obj).f();
                return;
            case 3:
                ((TabLayout) obj).k();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
