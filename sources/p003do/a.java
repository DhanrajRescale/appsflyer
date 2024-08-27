package p003do;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k7.f1;
import s0.g;

/* loaded from: classes2.dex */
public final class a extends f1 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f14424a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14425b;

    public a() {
        Paint paint = new Paint();
        this.f14424a = paint;
        this.f14425b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // k7.f1
    public final void i(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f14424a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (b bVar : this.f14425b) {
            bVar.getClass();
            ThreadLocal threadLocal = u3.a.f36702a;
            float f10 = 1.0f - g.f34069a;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * g.f34069a) + (Color.alpha(-65281) * f10)), (int) ((Color.red(-16776961) * g.f34069a) + (Color.red(-65281) * f10)), (int) ((Color.green(-16776961) * g.f34069a) + (Color.green(-65281) * f10)), (int) ((Color.blue(-16776961) * g.f34069a) + (Color.blue(-65281) * f10))));
            bVar.getClass();
            float G = ((CarouselLayoutManager) recyclerView.getLayoutManager()).G();
            bVar.getClass();
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
            canvas.drawLine(g.f34069a, G, g.f34069a, carouselLayoutManager.f22418o - carouselLayoutManager.D(), paint);
        }
    }
}
