package m3;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27455a;

    public p(Context context) {
        super(context);
        this.f27455a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f27455a = z10;
    }

    public void setGuidelineBegin(int i10) {
        d dVar = (d) getLayoutParams();
        if (this.f27455a && dVar.f27306a == i10) {
            return;
        }
        dVar.f27306a = i10;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i10) {
        d dVar = (d) getLayoutParams();
        if (this.f27455a && dVar.f27308b == i10) {
            return;
        }
        dVar.f27308b = i10;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f10) {
        d dVar = (d) getLayoutParams();
        if (this.f27455a && dVar.f27310c == f10) {
            return;
        }
        dVar.f27310c = f10;
        setLayoutParams(dVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
