package k7;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l4.d f22401b = new l4.d(1);

    /* renamed from: c, reason: collision with root package name */
    public static final l4.d f22402c = new l4.d(2);

    /* renamed from: a, reason: collision with root package name */
    public int f22403a;

    public static void a(y1 y1Var) {
        View view = y1Var.f22629a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = d4.n1.f13788a;
            d4.b1.s(view, floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(s0.g.f34069a);
        view.setTranslationY(s0.g.f34069a);
    }

    public static int c(int i10, int i11) {
        int i12;
        int i13 = i10 & 789516;
        if (i13 == 0) {
            return i10;
        }
        int i14 = i10 & (~i13);
        if (i11 == 0) {
            i12 = i13 << 2;
        } else {
            int i15 = i13 << 1;
            i14 |= (-789517) & i15;
            i12 = (i15 & 789516) << 2;
        }
        return i14 | i12;
    }

    public abstract int b(int i10, int i11);

    public abstract int d(RecyclerView recyclerView, y1 y1Var);

    public final int e(RecyclerView recyclerView, int i10, int i11, long j10) {
        if (this.f22403a == -1) {
            this.f22403a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int i12 = this.f22403a;
        int abs = Math.abs(i11);
        int signum = (int) Math.signum(i11);
        float f10 = 1.0f;
        int interpolation = (int) (f22402c.getInterpolation(Math.min(1.0f, (abs * 1.0f) / i10)) * signum * i12);
        if (j10 <= 2000) {
            f10 = ((float) j10) / 2000.0f;
        }
        int interpolation2 = (int) (f22401b.getInterpolation(f10) * interpolation);
        if (interpolation2 == 0) {
            if (i11 <= 0) {
                return -1;
            }
            return 1;
        }
        return interpolation2;
    }

    public abstract void f(Canvas canvas, RecyclerView recyclerView, y1 y1Var, float f10, float f11, int i10, boolean z10);
}
