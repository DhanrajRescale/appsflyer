package tm;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class h extends RelativeLayout implements d {

    /* renamed from: a, reason: collision with root package name */
    public cn.d f36221a;

    /* renamed from: b, reason: collision with root package name */
    public final cn.d f36222b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f36223c;

    /* JADX WARN: Type inference failed for: r1v1, types: [cn.e, cn.d] */
    /* JADX WARN: Type inference failed for: r1v2, types: [cn.e, cn.d] */
    public h(Context context, int i10) {
        super(context);
        this.f36221a = new cn.e();
        this.f36222b = new cn.e();
        setupLayoutResource(i10);
    }

    private void setupLayoutResource(int i10) {
        View inflate = LayoutInflater.from(getContext()).inflate(i10, this);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    public void a(Canvas canvas, float f10, float f11) {
        cn.d offset = getOffset();
        float f12 = offset.f8247b;
        cn.d dVar = this.f36222b;
        dVar.f8247b = f12;
        dVar.f8248c = offset.f8248c;
        sm.b chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        float f13 = dVar.f8247b;
        if (f10 + f13 < s0.g.f34069a) {
            dVar.f8247b = -f10;
        } else if (chartView != null && f10 + width + f13 > chartView.getWidth()) {
            dVar.f8247b = (chartView.getWidth() - f10) - width;
        }
        float f14 = dVar.f8248c;
        if (f11 + f14 < s0.g.f34069a) {
            dVar.f8248c = -f11;
        } else if (chartView != null && f11 + height + f14 > chartView.getHeight()) {
            dVar.f8248c = (chartView.getHeight() - f11) - height;
        }
        int save = canvas.save();
        canvas.translate(f10 + dVar.f8247b, f11 + dVar.f8248c);
        draw(canvas);
        canvas.restoreToCount(save);
    }

    public sm.b getChartView() {
        WeakReference weakReference = this.f36223c;
        if (weakReference == null) {
            return null;
        }
        return (sm.b) weakReference.get();
    }

    public cn.d getOffset() {
        return this.f36221a;
    }

    public void setChartView(sm.b bVar) {
        this.f36223c = new WeakReference(bVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cn.e, cn.d] */
    public void setOffset(cn.d dVar) {
        this.f36221a = dVar;
        if (dVar == null) {
            this.f36221a = new cn.e();
        }
    }
}
